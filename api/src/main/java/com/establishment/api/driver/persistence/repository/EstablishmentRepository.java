package com.establishment.api.driver.persistence.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.establishment.api.driver.persistence.entity.EstablishmentEntity;

public interface EstablishmentRepository extends CrudRepository<EstablishmentEntity, Integer>{
    Optional<EstablishmentEntity> findByCodCnes(Integer cnes);

    @Query("SELECT u FROM establishment u WHERE u.nomeFantasia LIKE %:name% ORDER BY u.nomeFantasia")
    Page<EstablishmentEntity> findAllByNomeFantasia(@Param("name") String name, Pageable pageable);

    @Query(value = """
            SELECT * FROM establishment e
            WHERE
                (:minLatitude <= TRY_CONVERT(float, e.num_latitude)
            AND
                TRY_CONVERT(float, e.num_latitude) <= :maxLatitude)
            AND
                (:minLongitude <= TRY_CONVERT(float, e.num_longitude)
            AND
                TRY_CONVERT(float, e.num_longitude) <= :maxLongitude)
            """, nativeQuery = true)
    Page<EstablishmentEntity> findByLocalCoordinates(@Param("minLatitude") Double minLatitude, @Param("maxLatitude") Double maxLatitude, @Param("minLongitude") Double minLongitude, @Param("maxLongitude") Double maxLongitude, Pageable pageable);
    
    @Query(value = """
        SELECT DISTINCT u FROM establishment u
        WHERE 
            (:name IS NULL OR u.nomeFantasia LIKE %:name%) 
        AND
            (:codUf IS NULL OR u.codUf = :codUf) 
        AND
            (:tipoUnidade IS NULL OR u.tipoUnidade = :tipoUnidade) 
        AND
            (:codTurnAtendimento IS NULL OR u.codTurnAtendimento = :codTurnAtendimento)
        ORDER BY u.nomeFantasia
            """, nativeQuery = false)
    Page<EstablishmentEntity> findAllByNomeFantasiaAndCodUfAndTipoUnidadeAndCodTurnAtendimento(@Param("name") String name, @Param("codUf") String codUf, @Param("tipoUnidade") String tipoUnidade, @Param("codTurnAtendimento") String codTurnAtendimento, Pageable pageable);

    @Query(value = """
        SELECT DISTINCT u FROM establishment u
        WHERE
            (u.tipoUnidade IN (1,2,70,71))
        AND
            (:name IS NULL OR u.nomeFantasia LIKE %:name%) 
        AND
            (:codUf IS NULL OR u.codUf = :codUf) 
        AND
            (:tipoUnidade IS NULL OR u.tipoUnidade = :tipoUnidade) 
        AND
            (:codTurnAtendimento IS NULL OR u.codTurnAtendimento = :codTurnAtendimento)
        ORDER BY u.nomeFantasia
            """, nativeQuery = false)
    Page<EstablishmentEntity> findAllByNameAndFiltroAndTipoUnidade(@Param("name") String name, @Param("codUf") String codUf, @Param("tipoUnidade") String tipoUnidade, @Param("codTurnAtendimento") String codTurnAtendimento, Pageable pageable);
}
