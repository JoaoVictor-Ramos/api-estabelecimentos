package com.establishment.api.driver.persistence.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.establishment.api.domain.model.Establishment;
import com.establishment.api.domain.port.EstablishmentPersistencePort;
import com.establishment.api.driver.persistence.entity.EstablishmentEntity;
import com.establishment.api.driver.persistence.mapper.EstablishmentEntityMapper;
import com.establishment.api.driver.persistence.repository.EstablishmentRepository;

public class EstablishmentAdapter implements EstablishmentPersistencePort{

    private EstablishmentRepository establishmentRepository;

    public EstablishmentAdapter(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }

    @Override
    public String createAll(ArrayList<Establishment> establishments) {
        ArrayList<EstablishmentEntity> entities = new ArrayList<>();
        for (Establishment e : establishments) {
            EstablishmentEntity entity = EstablishmentEntityMapper.getInstance().dataToEntity(e);
            entities.add(entity);
        }
        this.establishmentRepository.saveAll(entities);
        return "Establishment saved";
    }

    @Override
    public Page<Establishment> findAllByName(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<EstablishmentEntity> entities = this.establishmentRepository.findAllByNomeFantasia(name, pageable);
        if (entities.isEmpty()) {
            return null;
        }

        List<Establishment> entitiesOut = new ArrayList<>();
        for (EstablishmentEntity e : entities) {
            Establishment data = EstablishmentEntityMapper.getInstance().entityToData(e);
            entitiesOut.add(data);
        }
        Page<Establishment> pageableOut = new PageImpl<>(entitiesOut.subList(0, entitiesOut.size()), pageable, entities.getTotalElements());
        return pageableOut;
    }
    
}
