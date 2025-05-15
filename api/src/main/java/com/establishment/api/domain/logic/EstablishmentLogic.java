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
                !column[Attribute.CO_CNES.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_CNES.getPos()]) : null, 
                !column[Attribute.COD_UNIDADE.getPos()].trim().equals("NULL") ? column[Attribute.COD_UNIDADE.getPos()].trim() : null, 
                !column[Attribute.CO_UF.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_UF.getPos()]) : null,
                !column[Attribute.CO_IBGE.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_IBGE.getPos()]) : null, 
                !column[Attribute.NUM_CNPJ_MANTENEDORA.getPos()].trim().equals("NULL") ? column[Attribute.NUM_CNPJ_MANTENEDORA.getPos()].trim() : null, 
                !column[Attribute.NOME_RAZAO_SOCIAL.getPos()].trim().equals("NULL") ? column[Attribute.NOME_RAZAO_SOCIAL.getPos()].trim() : null, 
                !column[Attribute.NOME_FANTASIA.getPos()].trim().equals("NULL") ? column[Attribute.NOME_FANTASIA.getPos()].trim() : null, 
                !column[Attribute.COD_NATUREZA_ORGANIZACAO.getPos()].trim().equals("NULL") ? column[Attribute.COD_NATUREZA_ORGANIZACAO.getPos()].trim() : null, 
                !column[Attribute.DESCRICAO_NATUREZA_ORGANIZACAO.getPos()].trim().equals("NULL") ? column[Attribute.DESCRICAO_NATUREZA_ORGANIZACAO.getPos()].trim() : null, 
                !column[Attribute.TIPO_GESTAO.getPos()].trim().equals("NULL") ? column[Attribute.TIPO_GESTAO.getPos()].trim() : null,
                !column[Attribute.COD_NIVEL_HIERARQUIA.getPos()].trim().equals("NULL") ? column[Attribute.COD_NIVEL_HIERARQUIA.getPos()].trim() : null, 
                !column[Attribute.DESCRICAO_NIVEL_HIERARQUIA.getPos()].trim().equals("NULL") ? column[Attribute.DESCRICAO_NIVEL_HIERARQUIA.getPos()].trim() : null, 
                !column[Attribute.COD_ESFERA_ADMINISTRATIVA.getPos()].trim().equals("NULL") ? column[Attribute.COD_ESFERA_ADMINISTRATIVA.getPos()].trim() : null, 
                !column[Attribute.DESCRICAO_ESFERA_ADMINISTRATIVA.getPos()].trim().equals("NULL") ? column[Attribute.DESCRICAO_ESFERA_ADMINISTRATIVA.getPos()].trim() : null,
                !column[Attribute.CO_ATIVIDADE.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_ATIVIDADE.getPos()]) : null, 
                !column[Attribute.TIPO_UNIDADE.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.TIPO_UNIDADE.getPos()]) : null, 
                !column[Attribute.CO_CEP.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_CEP.getPos()]) : null, 
                !column[Attribute.NOME_LOGRADOURO.getPos()].trim().equals("NULL") ? column[Attribute.NOME_LOGRADOURO.getPos()].trim() : null, 
                !column[Attribute.NUM_ENDERECO.getPos()].trim().equals("NULL") ? column[Attribute.NUM_ENDERECO.getPos()].trim() : null, 
                !column[Attribute.NOME_BAIRRO.getPos()].trim().equals("NULL") ? column[Attribute.NOME_BAIRRO.getPos()].trim() : null,
                !column[Attribute.NUM_TELEFONE.getPos()].trim().equals("NULL") ? column[Attribute.NUM_TELEFONE.getPos()].trim() : null, 
                !column[Attribute.NUM_LATITUDE.getPos()].trim().equals("NULL") ? column[Attribute.NUM_LATITUDE.getPos()].trim() : null, 
                !column[Attribute.NUM_LONGITUDE.getPos()].trim().equals("NULL") ? column[Attribute.NUM_LONGITUDE.getPos()].trim() : null, 
                !column[Attribute.CO_TURNO_ATENDIMENTO.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_TURNO_ATENDIMENTO.getPos()]) : null, 
                !column[Attribute.DESCRICAO_TURNO_ATENDIMENTO.getPos()].trim().equals("NULL") ? column[Attribute.DESCRICAO_TURNO_ATENDIMENTO.getPos()].trim() : null, 
                !column[Attribute.NUM_CNPJ.getPos()].trim().equals("NULL") ? column[Attribute.NUM_CNPJ.getPos()].trim() : null, 
                !column[Attribute.NOME_EMAIL.getPos()].trim().equals("NULL") ? column[Attribute.NOME_EMAIL.getPos()].trim() : null, 
                !column[Attribute.CO_NATUREZA_JUR.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.CO_NATUREZA_JUR.getPos()]) : null, 
                !column[Attribute.ST_CENTRO_CIRURGICO.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.ST_CENTRO_CIRURGICO.getPos()]) : null, 
                !column[Attribute.ST_CENTRO_OBSTETRICO.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.ST_CENTRO_OBSTETRICO.getPos()]) : null, 
                !column[Attribute.ST_CENTRO_NEONATAL.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.ST_CENTRO_NEONATAL.getPos()]) : null, 
                !column[Attribute.ST_ATEND_HOSPITALAR.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.ST_ATEND_HOSPITALAR.getPos()]) : null, 
                !column[Attribute.ST_SERVICO_APOIO.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.ST_SERVICO_APOIO.getPos()]) : null,
                !column[Attribute.ST_ATEND_AMBULATORIAL.getPos()].trim().equals("NULL") ? Integer.parseInt(column[Attribute.ST_ATEND_AMBULATORIAL.getPos()]) : null, 
                !column[Attribute.COD_MOTIVO_DESAB.getPos()].trim().equals("NULL") ? column[Attribute.COD_MOTIVO_DESAB.getPos()].trim() : null, 
                !column[Attribute.CO_AMBULATORIAL_SUS.getPos()].trim().equals("NULL") ? column[Attribute.CO_AMBULATORIAL_SUS.getPos()].trim() : null
                );
            establishments.add(establishment);
            return establishments;
    }

    public Boolean isCnes(Integer cnes) {
        return cnes != null ? true : false;
    }
}
