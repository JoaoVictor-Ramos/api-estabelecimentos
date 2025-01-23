package com.establishment.api.domain.logic;

import java.util.ArrayList;

import com.establishment.api.domain.model.Establishment;
import com.establishment.api.domain.model.enumerate.Attribute;

public class EstablishmentLogic {
    private static EstablishmentLogic instance;

    public EstablishmentLogic() {}
    public static EstablishmentLogic getInstance() {
        if (instance == null) {
            instance = new EstablishmentLogic();
        }
        return instance;
    }

    public ArrayList<Establishment> filterColumns(String[] column, ArrayList<Establishment> establishments) {
        Establishment establishment = new Establishment(
                column[Attribute.CO_CNES.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_CNES.getPos()]) : null, 
                column[Attribute.CO_UNIDADE.getPos()].trim() != "" ? column[Attribute.CO_UNIDADE.getPos()].trim() : null, 
                column[Attribute.CO_UF.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_UF.getPos()]) : null,
                column[Attribute.CO_IBGE.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_IBGE.getPos()]) : null, 
                column[Attribute.NU_CNPJ_MANTENEDORA.getPos()].trim() != "" ? column[Attribute.NU_CNPJ_MANTENEDORA.getPos()].trim() : null, 
                column[Attribute.NO_RAZAO_SOCIAL.getPos()].trim() != "" ? column[Attribute.NO_RAZAO_SOCIAL.getPos()].trim() : null, 
                column[Attribute.NO_FANTASIA.getPos()].trim() != "" ? column[Attribute.NO_FANTASIA.getPos()].trim() : null, 
                column[Attribute.CO_NATUREZA_ORGANIZACAO.getPos()].trim() != "" ? column[Attribute.CO_NATUREZA_ORGANIZACAO.getPos()].trim() : null, 
                column[Attribute.DS_NATUREZA_ORGANIZACAO.getPos()].trim() != "" ? column[Attribute.DS_NATUREZA_ORGANIZACAO.getPos()].trim() : null, 
                column[Attribute.TP_GESTAO.getPos()].trim() != "" ? column[Attribute.TP_GESTAO.getPos()].trim() : null,
                column[Attribute.CO_NIVEL_HIERARQUIA.getPos()].trim() != "" ? column[Attribute.CO_NIVEL_HIERARQUIA.getPos()].trim() : null, 
                column[Attribute.DS_NIVEL_HIERARQUIA.getPos()].trim() != "" ? column[Attribute.DS_NIVEL_HIERARQUIA.getPos()].trim() : null, 
                column[Attribute.CO_ESFERA_ADMINISTRATIVA.getPos()].trim() != "" ? column[Attribute.CO_ESFERA_ADMINISTRATIVA.getPos()].trim() : null, 
                column[Attribute.DS_ESFERA_ADMINISTRATIVA.getPos()].trim() != "" ? column[Attribute.DS_ESFERA_ADMINISTRATIVA.getPos()].trim() : null,
                column[Attribute.CO_ATIVIDADE.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_ATIVIDADE.getPos()]) : null, 
                column[Attribute.TP_UNIDADE.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.TP_UNIDADE.getPos()]) : null, 
                column[Attribute.CO_CEP.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_CEP.getPos()]) : null, 
                column[Attribute.NO_LOGRADOURO.getPos()].trim() != "" ? column[Attribute.NO_LOGRADOURO.getPos()].trim() : null, 
                column[Attribute.NU_ENDERECO.getPos()].trim() != "" ? column[Attribute.NU_ENDERECO.getPos()].trim() : null, 
                column[Attribute.NO_BAIRRO.getPos()].trim() != "" ? column[Attribute.NO_BAIRRO.getPos()].trim() : null,
                column[Attribute.NU_TELEFONE.getPos()].trim() != "" ? column[Attribute.NU_TELEFONE.getPos()].trim() : null, 
                column[Attribute.NU_LATITUDE.getPos()].trim() != "" ? column[Attribute.NU_LATITUDE.getPos()].trim() : null, 
                column[Attribute.NU_LONGITUDE.getPos()].trim() != "" ? column[Attribute.NU_LONGITUDE.getPos()].trim() : null, 
                column[Attribute.CO_TURNO_ATENDIMENTO.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_TURNO_ATENDIMENTO.getPos()]) : null, 
                column[Attribute.DS_TURNO_ATENDIMENTO.getPos()].trim() != "" ? column[Attribute.DS_TURNO_ATENDIMENTO.getPos()].trim() : null, 
                column[Attribute.NU_CNPJ.getPos()].trim() != "" ? column[Attribute.NU_CNPJ.getPos()].trim() : null, 
                column[Attribute.NO_EMAIL.getPos()].trim() != "" ? column[Attribute.NO_EMAIL.getPos()].trim() : null, 
                column[Attribute.CO_NATUREZA_JUR.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.CO_NATUREZA_JUR.getPos()]) : null, 
                column[Attribute.ST_CENTRO_CIRURGICO.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.ST_CENTRO_CIRURGICO.getPos()]) : null, 
                column[Attribute.ST_CENTRO_OBSTETRICO.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.ST_CENTRO_OBSTETRICO.getPos()]) : null, 
                column[Attribute.ST_CENTRO_NEONATAL.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.ST_CENTRO_NEONATAL.getPos()]) : null, 
                column[Attribute.ST_ATEND_HOSPITALAR.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.ST_ATEND_HOSPITALAR.getPos()]) : null, 
                column[Attribute.ST_SERVICO_APOIO.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.ST_SERVICO_APOIO.getPos()]) : null,
                column[Attribute.ST_ATEND_AMBULATORIAL.getPos()].trim() != "" ? Integer.parseInt(column[Attribute.ST_ATEND_AMBULATORIAL.getPos()]) : null, 
                column[Attribute.CO_MOTIVO_DESAB.getPos()].trim() != "" ? column[Attribute.CO_MOTIVO_DESAB.getPos()].trim() : null, 
                column[Attribute.CO_AMBULATORIAL_SUS.getPos()].trim() != "" ? column[Attribute.CO_AMBULATORIAL_SUS.getPos()].trim() : null
                );

            establishments.add(establishment);
            return establishments;
    }

    public Boolean isCnes(Integer cnes) {
        return cnes != null ? true : false;
    }
}
