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

    @Query(value = """
        SELECT u FROM establishment u
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
        SELECT u FROM establishment u
        WHERE
            (u.tipoUnidade IN (1,2,70,71,72,73,85))
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

    @Query(value = """
            SELECT * FROM establishment e
            WHERE
                (:minLatitude >= e.num_latitude
            AND
                e.num_latitude >= :maxLatitude)
            AND
                (:minLongitude >= e.num_longitude
            AND
                e.num_longitude >= :maxLongitude)
            AND
                (:tipoUnidade IS NULL OR CAST(e.tipo_unidade AS text) = :tipoUnidade) 
            AND
                (:codTurnAtendimento IS NULL OR CAST(e.cod_turn_atendimento AS text) = :codTurnAtendimento)
            ORDER BY e.nome_fantasia
            """, nativeQuery = true)
    Page<EstablishmentEntity> findByLatLonAndFilters(@Param("minLatitude") String minLatitude, @Param("maxLatitude") String maxLatitude, @Param("minLongitude") String minLongitude, @Param("maxLongitude") String maxLongitude, @Param("tipoUnidade") String tipoUnidade, @Param("codTurnAtendimento") String codTurnAtendimento, Pageable pageable);
    
    @Query(value = """
            SELECT * FROM establishment e
            WHERE
                (e.tipo_unidade IN (1,2,70,71,72,73,85))
            AND
                (:minLatitude >= e.num_latitude
            AND
                e.num_latitude >= :maxLatitude)
            AND
                (:minLongitude >= e.num_longitude
            AND
                e.num_longitude >= :maxLongitude)
            AND
                (:tipoUnidade IS NULL OR e.tipo_unidade = :tipoUnidade) 
            AND
                (:codTurnAtendimento IS NULL OR e.cod_turn_atendimento = :codTurnAtendimento)
            ORDER BY e.nome_fantasia
            """, nativeQuery = true)
    Page<EstablishmentEntity> findByLatLonForConsultation(@Param("minLatitude") String minLatitude, @Param("maxLatitude") String maxLatitude, @Param("minLongitude") String minLongitude, @Param("maxLongitude") String maxLongitude, @Param("tipoUnidade") Integer tipoUnidade, @Param("codTurnAtendimento") Integer codTurnAtendimento, Pageable pageable);
}
