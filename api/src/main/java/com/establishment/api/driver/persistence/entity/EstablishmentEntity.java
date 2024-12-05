package com.establishment.api.driver.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "establishment")
@Entity(name = "establishment")
@NoArgsConstructor
@AllArgsConstructor
public class EstablishmentEntity {
    @Id
    private Integer codCnes;

    private String codUnidade;

    private Integer codUf;

    private Integer codIbge;

    private String numCnpjMantenedora;

    private String nomeRazaoSocial;

    private String nomeFantasia;

    private String codNaturezaOrganizacao;

    private String descricaoNaturezaOrganizacao;

    private String tipoGestao;

    private String codNivelHierarquia;

    private String descricaoNivelHierarquia;

    private String codEsferaAdministrativa;

    private String descricaoEsferaAdministrativa;

    private Integer codAtividade;

    private Integer tipoUnidade;

    private Integer codCep;

    private String nomeLogradouro;

    private String numEndereco;

    private String nomeBairro;

    private String numTelefone;

    private String numLatitude;

    private String numLongitude;

    private Integer codTurnAtendimento;

    private String descricaoTurnoAtendimento;

    private String numCnpj;

    private String nomeEmail;

    private Integer codNaturezaJur;

    private Integer stCentroCirurgico;

    private Integer stCentroObstetrico;

    private Integer stCentroNeonatal;

    private Integer stAtendHospitalar;

    private Integer stServicoApoio;

    private Integer stAtendAmbulatorial;

    private String codMotivoDesab;

    private String coAmbulatorialSus;
}
