package com.establishment.api.domain.model;

public class Establishment {
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

    private Integer codTurnoAtendimento;

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

    public Establishment() {}

    public Establishment(Integer codCnes, String codUnidade, Integer codUf, Integer codIbge, String numCnpjMantenedora,
            String nomeRazaoSocial, String nomeFantasia, String codNaturezaOrganizacao,
            String descricaoNaturezaOrganizacao, String tipoGestao, String codNivelHierarquia,
            String descricaoNivelHierarquia, String codEsferaAdministrativa, String descricaoEsferaAdministrativa,
            Integer codAtividade, Integer tipoUnidade, Integer codCep, String nomeLogradouro, String numEndereco,
            String nomeBairro, String numTelefone, String numLatitude, String numLongitude, Integer codTurnoAtendimento,
            String descricaoTurnoAtendimento, String numCnpj, String nomeEmail, Integer codNaturezaJur,
            Integer stCentroCirurgico, Integer stCentroObstetrico, Integer stCentroNeonatal, Integer stAtendHospitalar,
            Integer stServicoApoio, Integer stAtendAmbulatorial, String codMotivoDesab, String coAmbulatorialSus) {
        this.codCnes = codCnes;
        this.codUnidade = codUnidade;
        this.codUf = codUf;
        this.codIbge = codIbge;
        this.numCnpjMantenedora = numCnpjMantenedora;
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.codNaturezaOrganizacao = codNaturezaOrganizacao;
        this.descricaoNaturezaOrganizacao = descricaoNaturezaOrganizacao;
        this.tipoGestao = tipoGestao;
        this.codNivelHierarquia = codNivelHierarquia;
        this.descricaoNivelHierarquia = descricaoNivelHierarquia;
        this.codEsferaAdministrativa = codEsferaAdministrativa;
        this.descricaoEsferaAdministrativa = descricaoEsferaAdministrativa;
        this.codAtividade = codAtividade;
        this.tipoUnidade = tipoUnidade;
        this.codCep = codCep;
        this.nomeLogradouro = nomeLogradouro;
        this.numEndereco = numEndereco;
        this.nomeBairro = nomeBairro;
        this.numTelefone = numTelefone;
        this.numLatitude = numLatitude;
        this.numLongitude = numLongitude;
        this.codTurnoAtendimento = codTurnoAtendimento;
        this.descricaoTurnoAtendimento = descricaoTurnoAtendimento;
        this.numCnpj = numCnpj;
        this.nomeEmail = nomeEmail;
        this.codNaturezaJur = codNaturezaJur;
        this.stCentroCirurgico = stCentroCirurgico;
        this.stCentroObstetrico = stCentroObstetrico;
        this.stCentroNeonatal = stCentroNeonatal;
        this.stAtendHospitalar = stAtendHospitalar;
        this.stServicoApoio = stServicoApoio;
        this.stAtendAmbulatorial = stAtendAmbulatorial;
        this.codMotivoDesab = codMotivoDesab;
        this.coAmbulatorialSus = coAmbulatorialSus;
    }

    public Integer getCodCnes() {
        return codCnes;
    }

    public void setCodCnes(Integer codCnes) {
        this.codCnes = codCnes;
    }

    public String getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(String codUnidade) {
        this.codUnidade = codUnidade;
    }

    public Integer getCodUf() {
        return codUf;
    }

    public void setCodUf(Integer codUf) {
        this.codUf = codUf;
    }

    public Integer getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(Integer codIbge) {
        this.codIbge = codIbge;
    }

    public String getNumCnpjMantenedora() {
        return numCnpjMantenedora;
    }

    public void setNumCnpjMantenedora(String numCnpjMantenedora) {
        this.numCnpjMantenedora = numCnpjMantenedora;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCodNaturezaOrganizacao() {
        return codNaturezaOrganizacao;
    }

    public void setCodNaturezaOrganizacao(String codNaturezaOrganizacao) {
        this.codNaturezaOrganizacao = codNaturezaOrganizacao;
    }

    public String getDescricaoNaturezaOrganizacao() {
        return descricaoNaturezaOrganizacao;
    }

    public void setDescricaoNaturezaOrganizacao(String descricaoNaturezaOrganizacao) {
        this.descricaoNaturezaOrganizacao = descricaoNaturezaOrganizacao;
    }

    public String getTipoGestao() {
        return tipoGestao;
    }

    public void setTipoGestao(String tipoGestao) {
        this.tipoGestao = tipoGestao;
    }

    public String getCodNivelHierarquia() {
        return codNivelHierarquia;
    }

    public void setCodNivelHierarquia(String codNivelHierarquia) {
        this.codNivelHierarquia = codNivelHierarquia;
    }

    public String getDescricaoNivelHierarquia() {
        return descricaoNivelHierarquia;
    }

    public void setDescricaoNivelHierarquia(String descricaoNivelHierarquia) {
        this.descricaoNivelHierarquia = descricaoNivelHierarquia;
    }

    public String getCodEsferaAdministrativa() {
        return codEsferaAdministrativa;
    }

    public void setCodEsferaAdministrativa(String codEsferaAdministrativa) {
        this.codEsferaAdministrativa = codEsferaAdministrativa;
    }

    public String getDescricaoEsferaAdministrativa() {
        return descricaoEsferaAdministrativa;
    }

    public void setDescricaoEsferaAdministrativa(String descricaoEsferaAdministrativa) {
        this.descricaoEsferaAdministrativa = descricaoEsferaAdministrativa;
    }

    public Integer getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(Integer codAtividade) {
        this.codAtividade = codAtividade;
    }

    public Integer getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(Integer tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public Integer getCodCep() {
        return codCep;
    }

    public void setCodCep(Integer codCep) {
        this.codCep = codCep;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(String numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getNumLatitude() {
        return numLatitude;
    }

    public void setNumLatitude(String numLatitude) {
        this.numLatitude = numLatitude;
    }

    public String getNumLongitude() {
        return numLongitude;
    }

    public void setNumLongitude(String numLongitude) {
        this.numLongitude = numLongitude;
    }

    public Integer getCodTurnoAtendimento() {
        return codTurnoAtendimento;
    }

    public void setCodTurnoAtendimento(Integer codTurnoAtendimento) {
        this.codTurnoAtendimento = codTurnoAtendimento;
    }

    public String getDescricaoTurnoAtendimento() {
        return descricaoTurnoAtendimento;
    }

    public void setDescricaoTurnoAtendimento(String descricaoTurnoAtendimento) {
        this.descricaoTurnoAtendimento = descricaoTurnoAtendimento;
    }

    public String getNumCnpj() {
        return numCnpj;
    }

    public void setNumCnpj(String numCnpj) {
        this.numCnpj = numCnpj;
    }

    public String getNomeEmail() {
        return nomeEmail;
    }

    public void setNomeEmail(String nomeEmail) {
        this.nomeEmail = nomeEmail;
    }

    public Integer getCodNaturezaJur() {
        return codNaturezaJur;
    }

    public void setCodNaturezaJur(Integer codNaturezaJur) {
        this.codNaturezaJur = codNaturezaJur;
    }

    public Integer getStCentroCirurgico() {
        return stCentroCirurgico;
    }

    public void setStCentroCirurgico(Integer stCentroCirurgico) {
        this.stCentroCirurgico = stCentroCirurgico;
    }

    public Integer getStCentroObstetrico() {
        return stCentroObstetrico;
    }

    public void setStCentroObstetrico(Integer stCentroObstetrico) {
        this.stCentroObstetrico = stCentroObstetrico;
    }

    public Integer getStCentroNeonatal() {
        return stCentroNeonatal;
    }

    public void setStCentroNeonatal(Integer stCentroNeonatal) {
        this.stCentroNeonatal = stCentroNeonatal;
    }

    public Integer getStAtendHospitalar() {
        return stAtendHospitalar;
    }

    public void setStAtendHospitalar(Integer stAtendHospitalar) {
        this.stAtendHospitalar = stAtendHospitalar;
    }

    public Integer getStServicoApoio() {
        return stServicoApoio;
    }

    public void setStServicoApoio(Integer stServicoApoio) {
        this.stServicoApoio = stServicoApoio;
    }

    public Integer getStAtendAmbulatorial() {
        return stAtendAmbulatorial;
    }

    public void setStAtendAmbulatorial(Integer stAtendAmbulatorial) {
        this.stAtendAmbulatorial = stAtendAmbulatorial;
    }

    public String getCodMotivoDesab() {
        return codMotivoDesab;
    }

    public void setCodMotivoDesab(String codMotivoDesab) {
        this.codMotivoDesab = codMotivoDesab;
    }

    public String getCoAmbulatorialSus() {
        return coAmbulatorialSus;
    }

    public void setCoAmbulatorialSus(String coAmbulatorialSus) {
        this.coAmbulatorialSus = coAmbulatorialSus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codCnes == null) ? 0 : codCnes.hashCode());
        result = prime * result + ((codUnidade == null) ? 0 : codUnidade.hashCode());
        result = prime * result + ((codUf == null) ? 0 : codUf.hashCode());
        result = prime * result + ((codIbge == null) ? 0 : codIbge.hashCode());
        result = prime * result + ((numCnpjMantenedora == null) ? 0 : numCnpjMantenedora.hashCode());
        result = prime * result + ((nomeRazaoSocial == null) ? 0 : nomeRazaoSocial.hashCode());
        result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
        result = prime * result + ((codNaturezaOrganizacao == null) ? 0 : codNaturezaOrganizacao.hashCode());
        result = prime * result
                + ((descricaoNaturezaOrganizacao == null) ? 0 : descricaoNaturezaOrganizacao.hashCode());
        result = prime * result + ((tipoGestao == null) ? 0 : tipoGestao.hashCode());
        result = prime * result + ((codNivelHierarquia == null) ? 0 : codNivelHierarquia.hashCode());
        result = prime * result + ((descricaoNivelHierarquia == null) ? 0 : descricaoNivelHierarquia.hashCode());
        result = prime * result + ((codEsferaAdministrativa == null) ? 0 : codEsferaAdministrativa.hashCode());
        result = prime * result
                + ((descricaoEsferaAdministrativa == null) ? 0 : descricaoEsferaAdministrativa.hashCode());
        result = prime * result + ((codAtividade == null) ? 0 : codAtividade.hashCode());
        result = prime * result + ((tipoUnidade == null) ? 0 : tipoUnidade.hashCode());
        result = prime * result + ((codCep == null) ? 0 : codCep.hashCode());
        result = prime * result + ((nomeLogradouro == null) ? 0 : nomeLogradouro.hashCode());
        result = prime * result + ((numEndereco == null) ? 0 : numEndereco.hashCode());
        result = prime * result + ((nomeBairro == null) ? 0 : nomeBairro.hashCode());
        result = prime * result + ((numTelefone == null) ? 0 : numTelefone.hashCode());
        result = prime * result + ((numLatitude == null) ? 0 : numLatitude.hashCode());
        result = prime * result + ((numLongitude == null) ? 0 : numLongitude.hashCode());
        result = prime * result + ((codTurnoAtendimento == null) ? 0 : codTurnoAtendimento.hashCode());
        result = prime * result + ((descricaoTurnoAtendimento == null) ? 0 : descricaoTurnoAtendimento.hashCode());
        result = prime * result + ((numCnpj == null) ? 0 : numCnpj.hashCode());
        result = prime * result + ((nomeEmail == null) ? 0 : nomeEmail.hashCode());
        result = prime * result + ((codNaturezaJur == null) ? 0 : codNaturezaJur.hashCode());
        result = prime * result + ((stCentroCirurgico == null) ? 0 : stCentroCirurgico.hashCode());
        result = prime * result + ((stCentroObstetrico == null) ? 0 : stCentroObstetrico.hashCode());
        result = prime * result + ((stCentroNeonatal == null) ? 0 : stCentroNeonatal.hashCode());
        result = prime * result + ((stAtendHospitalar == null) ? 0 : stAtendHospitalar.hashCode());
        result = prime * result + ((stServicoApoio == null) ? 0 : stServicoApoio.hashCode());
        result = prime * result + ((stAtendAmbulatorial == null) ? 0 : stAtendAmbulatorial.hashCode());
        result = prime * result + ((codMotivoDesab == null) ? 0 : codMotivoDesab.hashCode());
        result = prime * result + ((coAmbulatorialSus == null) ? 0 : coAmbulatorialSus.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Establishment other = (Establishment) obj;
        if (codCnes == null) {
            if (other.codCnes != null)
                return false;
        } else if (!codCnes.equals(other.codCnes))
            return false;
        if (codUnidade == null) {
            if (other.codUnidade != null)
                return false;
        } else if (!codUnidade.equals(other.codUnidade))
            return false;
        if (codUf == null) {
            if (other.codUf != null)
                return false;
        } else if (!codUf.equals(other.codUf))
            return false;
        if (codIbge == null) {
            if (other.codIbge != null)
                return false;
        } else if (!codIbge.equals(other.codIbge))
            return false;
        if (numCnpjMantenedora == null) {
            if (other.numCnpjMantenedora != null)
                return false;
        } else if (!numCnpjMantenedora.equals(other.numCnpjMantenedora))
            return false;
        if (nomeRazaoSocial == null) {
            if (other.nomeRazaoSocial != null)
                return false;
        } else if (!nomeRazaoSocial.equals(other.nomeRazaoSocial))
            return false;
        if (nomeFantasia == null) {
            if (other.nomeFantasia != null)
                return false;
        } else if (!nomeFantasia.equals(other.nomeFantasia))
            return false;
        if (codNaturezaOrganizacao == null) {
            if (other.codNaturezaOrganizacao != null)
                return false;
        } else if (!codNaturezaOrganizacao.equals(other.codNaturezaOrganizacao))
            return false;
        if (descricaoNaturezaOrganizacao == null) {
            if (other.descricaoNaturezaOrganizacao != null)
                return false;
        } else if (!descricaoNaturezaOrganizacao.equals(other.descricaoNaturezaOrganizacao))
            return false;
        if (tipoGestao == null) {
            if (other.tipoGestao != null)
                return false;
        } else if (!tipoGestao.equals(other.tipoGestao))
            return false;
        if (codNivelHierarquia == null) {
            if (other.codNivelHierarquia != null)
                return false;
        } else if (!codNivelHierarquia.equals(other.codNivelHierarquia))
            return false;
        if (descricaoNivelHierarquia == null) {
            if (other.descricaoNivelHierarquia != null)
                return false;
        } else if (!descricaoNivelHierarquia.equals(other.descricaoNivelHierarquia))
            return false;
        if (codEsferaAdministrativa == null) {
            if (other.codEsferaAdministrativa != null)
                return false;
        } else if (!codEsferaAdministrativa.equals(other.codEsferaAdministrativa))
            return false;
        if (descricaoEsferaAdministrativa == null) {
            if (other.descricaoEsferaAdministrativa != null)
                return false;
        } else if (!descricaoEsferaAdministrativa.equals(other.descricaoEsferaAdministrativa))
            return false;
        if (codAtividade == null) {
            if (other.codAtividade != null)
                return false;
        } else if (!codAtividade.equals(other.codAtividade))
            return false;
        if (tipoUnidade == null) {
            if (other.tipoUnidade != null)
                return false;
        } else if (!tipoUnidade.equals(other.tipoUnidade))
            return false;
        if (codCep == null) {
            if (other.codCep != null)
                return false;
        } else if (!codCep.equals(other.codCep))
            return false;
        if (nomeLogradouro == null) {
            if (other.nomeLogradouro != null)
                return false;
        } else if (!nomeLogradouro.equals(other.nomeLogradouro))
            return false;
        if (numEndereco == null) {
            if (other.numEndereco != null)
                return false;
        } else if (!numEndereco.equals(other.numEndereco))
            return false;
        if (nomeBairro == null) {
            if (other.nomeBairro != null)
                return false;
        } else if (!nomeBairro.equals(other.nomeBairro))
            return false;
        if (numTelefone == null) {
            if (other.numTelefone != null)
                return false;
        } else if (!numTelefone.equals(other.numTelefone))
            return false;
        if (numLatitude == null) {
            if (other.numLatitude != null)
                return false;
        } else if (!numLatitude.equals(other.numLatitude))
            return false;
        if (numLongitude == null) {
            if (other.numLongitude != null)
                return false;
        } else if (!numLongitude.equals(other.numLongitude))
            return false;
        if (codTurnoAtendimento == null) {
            if (other.codTurnoAtendimento != null)
                return false;
        } else if (!codTurnoAtendimento.equals(other.codTurnoAtendimento))
            return false;
        if (descricaoTurnoAtendimento == null) {
            if (other.descricaoTurnoAtendimento != null)
                return false;
        } else if (!descricaoTurnoAtendimento.equals(other.descricaoTurnoAtendimento))
            return false;
        if (numCnpj == null) {
            if (other.numCnpj != null)
                return false;
        } else if (!numCnpj.equals(other.numCnpj))
            return false;
        if (nomeEmail == null) {
            if (other.nomeEmail != null)
                return false;
        } else if (!nomeEmail.equals(other.nomeEmail))
            return false;
        if (codNaturezaJur == null) {
            if (other.codNaturezaJur != null)
                return false;
        } else if (!codNaturezaJur.equals(other.codNaturezaJur))
            return false;
        if (stCentroCirurgico == null) {
            if (other.stCentroCirurgico != null)
                return false;
        } else if (!stCentroCirurgico.equals(other.stCentroCirurgico))
            return false;
        if (stCentroObstetrico == null) {
            if (other.stCentroObstetrico != null)
                return false;
        } else if (!stCentroObstetrico.equals(other.stCentroObstetrico))
            return false;
        if (stCentroNeonatal == null) {
            if (other.stCentroNeonatal != null)
                return false;
        } else if (!stCentroNeonatal.equals(other.stCentroNeonatal))
            return false;
        if (stAtendHospitalar == null) {
            if (other.stAtendHospitalar != null)
                return false;
        } else if (!stAtendHospitalar.equals(other.stAtendHospitalar))
            return false;
        if (stServicoApoio == null) {
            if (other.stServicoApoio != null)
                return false;
        } else if (!stServicoApoio.equals(other.stServicoApoio))
            return false;
        if (stAtendAmbulatorial == null) {
            if (other.stAtendAmbulatorial != null)
                return false;
        } else if (!stAtendAmbulatorial.equals(other.stAtendAmbulatorial))
            return false;
        if (codMotivoDesab == null) {
            if (other.codMotivoDesab != null)
                return false;
        } else if (!codMotivoDesab.equals(other.codMotivoDesab))
            return false;
        if (coAmbulatorialSus == null) {
            if (other.coAmbulatorialSus != null)
                return false;
        } else if (!coAmbulatorialSus.equals(other.coAmbulatorialSus))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Establishment [codCnes=" + codCnes + ", codUnidade=" + codUnidade + ", codUf=" + codUf + ", codIbge="
                + codIbge + ", numCnpjMantenedora=" + numCnpjMantenedora + ", nomeRazaoSocial=" + nomeRazaoSocial
                + ", nomeFantasia=" + nomeFantasia + ", codNaturezaOrganizacao=" + codNaturezaOrganizacao
                + ", descricaoNaturezaOrganizacao=" + descricaoNaturezaOrganizacao + ", tipoGestao=" + tipoGestao
                + ", codNivelHierarquia=" + codNivelHierarquia + ", descricaoNivelHierarquia="
                + descricaoNivelHierarquia + ", codEsferaAdministrativa=" + codEsferaAdministrativa
                + ", descricaoEsferaAdministrativa=" + descricaoEsferaAdministrativa + ", codAtividade=" + codAtividade
                + ", tipoUnidade=" + tipoUnidade + ", codCep=" + codCep + ", nomeLogradouro=" + nomeLogradouro
                + ", numEndereco=" + numEndereco + ", nomeBairro=" + nomeBairro + ", numTelefone=" + numTelefone
                + ", numLatitude=" + numLatitude + ", numLongitude=" + numLongitude + ", codTurnoAtendimento="
                + codTurnoAtendimento + ", descricaoTurnoAtendimento=" + descricaoTurnoAtendimento + ", numCnpj="
                + numCnpj + ", nomeEmail=" + nomeEmail + ", codNaturezaJur=" + codNaturezaJur + ", stCentroCirurgico="
                + stCentroCirurgico + ", stCentroObstetrico=" + stCentroObstetrico + ", stCentroNeonatal="
                + stCentroNeonatal + ", stAtendHospitalar=" + stAtendHospitalar + ", stServicoApoio=" + stServicoApoio
                + ", stAtendAmbulatorial=" + stAtendAmbulatorial + ", codMotivoDesab=" + codMotivoDesab
                + ", coAmbulatorialSus=" + coAmbulatorialSus + "]";
    }
}
