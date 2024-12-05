package com.establishment.api.driver.persistence.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.establishment.api.driver.persistence.entity.EstablishmentEntity;

public interface EstablishmentRepository extends CrudRepository<EstablishmentEntity, Integer>{
    @Query("SELECT u FROM establishment u WHERE u.nomeFantasia LIKE :name% ORDER BY u.nomeFantasia")
    Page<EstablishmentEntity> findAllByNomeFantasia(@Param("name") String name, Pageable pageable);
}
