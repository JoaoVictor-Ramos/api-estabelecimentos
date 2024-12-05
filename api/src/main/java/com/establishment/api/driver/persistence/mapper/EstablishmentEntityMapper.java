package com.establishment.api.driver.persistence.mapper;

import com.establishment.api.domain.model.Establishment;
import com.establishment.api.driver.persistence.entity.EstablishmentEntity;

public class EstablishmentEntityMapper {
    private static EstablishmentEntityMapper instance;

    public EstablishmentEntityMapper() {}
    public static EstablishmentEntityMapper getInstance() {
        if (EstablishmentEntityMapper.instance == null) {
            EstablishmentEntityMapper.instance = new EstablishmentEntityMapper();
        }
        return EstablishmentEntityMapper.instance;
    }

    public EstablishmentEntity dataToEntity(Establishment data) {
        if (data == null) {
            return null;
        }
        return new EstablishmentEntity(data.getCodCnes(), data.getCodUnidade(), data.getCodUf(), data.getCodIbge(), data.getNumCnpjMantenedora(), data.getNomeRazaoSocial(), data.getNomeFantasia(), data.getCodNaturezaOrganizacao(), data.getDescricaoNaturezaOrganizacao(), data.getTipoGestao(), data.getCodNivelHierarquia(), data.getDescricaoNivelHierarquia(), data.getCodEsferaAdministrativa(), data.getDescricaoEsferaAdministrativa(), data.getCodAtividade(), data.getTipoUnidade(), data.getCodCep(), data.getNomeLogradouro(), data.getNumEndereco(), data.getNomeBairro(), data.getNumTelefone(), data.getNumLatitude(), data.getNumLongitude(), data.getCodTurnoAtendimento(), data.getDescricaoTurnoAtendimento(), data.getNumCnpj(), data.getNomeEmail(), data.getCodNaturezaJur(), data.getStCentroCirurgico(), data.getStCentroObstetrico(), data.getStCentroNeonatal(), data.getStAtendHospitalar(), data.getStServicoApoio(), data.getStAtendAmbulatorial(), data.getCodMotivoDesab(), data.getCoAmbulatorialSus());
    }

    public Establishment entityToData(EstablishmentEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Establishment(entity.getCodCnes(), entity.getCodUnidade(), entity.getCodUf(), entity.getCodIbge(), entity.getNumCnpjMantenedora(), entity.getNomeRazaoSocial(), entity.getNomeFantasia(), entity.getCodNaturezaOrganizacao(), entity.getDescricaoNaturezaOrganizacao(), entity.getTipoGestao(), entity.getCodNivelHierarquia(), entity.getDescricaoNivelHierarquia(), entity.getCodEsferaAdministrativa(), entity.getDescricaoEsferaAdministrativa(), entity.getCodAtividade(), entity.getTipoUnidade(), entity.getCodCep(), entity.getNomeLogradouro(), entity.getNumEndereco(), entity.getNomeBairro(), entity.getNumTelefone(), entity.getNumLatitude(), entity.getNumLongitude(), entity.getCodTurnAtendimento(), entity.getDescricaoTurnoAtendimento(), entity.getNumCnpj(), entity.getNomeEmail(), entity.getCodNaturezaJur(), entity.getStCentroCirurgico(), entity.getStCentroObstetrico(), entity.getStCentroNeonatal(), entity.getStAtendHospitalar(), entity.getStServicoApoio(), entity.getStAtendAmbulatorial(), entity.getCodMotivoDesab(), entity.getCoAmbulatorialSus());
    }
}
