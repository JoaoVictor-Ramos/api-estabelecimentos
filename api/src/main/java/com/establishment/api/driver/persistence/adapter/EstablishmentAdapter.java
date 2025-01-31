package com.establishment.api.driver.persistence.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Establishment findByCnes(Integer cnes) {
        Optional<EstablishmentEntity> entity = this.establishmentRepository.findByCodCnes(cnes);
        if (entity.isEmpty()) {
            return null;
        }
        
        return EstablishmentEntityMapper.getInstance().entityToData(entity.get());
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

    @Override
    public Page<Establishment> findAllByNameAndFilteringAndType(String name, int state, int type, int shift, int page, int size) {
        String sState = state == -1 ? null : String.valueOf(state);
        String sType  = type == -1 ? null : String.valueOf(type);
        String sShift = shift == -1 ? null : String.valueOf(shift);

        Pageable pageable = PageRequest.of(page, size);
        Page<EstablishmentEntity> entities = this.establishmentRepository.findAllByNameAndFiltroAndTipoUnidade(name, sState, sType, sShift, pageable);
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

    @Override
    public Page<Establishment> findAllByNameAndStateAndTypeAndShift(String name, int state, int type, int shift, int page, int size) {
        String sState = state == -1 ? null : String.valueOf(state);
        String sType  = type == -1 ? null : String.valueOf(type);
        String sShift = shift == -1 ? null : String.valueOf(shift);

        Pageable pageable = PageRequest.of(page, size);
        Page<EstablishmentEntity> entities = this.establishmentRepository.findAllByNomeFantasiaAndCodUfAndTipoUnidadeAndCodTurnAtendimento(name, sState, sType, sShift, pageable);
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

    @Override
    public Page<Establishment> findByLocalCoordinates(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<EstablishmentEntity> entities = this.establishmentRepository.findByLocalCoordinates(minLatitude, maxLatitude, minLongitude, maxLongitude, pageable);
        if (entities.isEmpty()) {
            return null;
        }

        List<Establishment> entitiesOut = new ArrayList<>();
        for (EstablishmentEntity e: entities) {
            Establishment data = EstablishmentEntityMapper.getInstance().entityToData(e);
            entitiesOut.add(data);
        }
        Page<Establishment> pageableOut = new PageImpl<>(entitiesOut.subList(0, entitiesOut.size()), pageable, entities.getTotalElements());
        return pageableOut;
    }
}
