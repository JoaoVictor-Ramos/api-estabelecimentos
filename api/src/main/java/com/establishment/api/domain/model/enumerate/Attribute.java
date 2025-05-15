package com.establishment.api.domain.model.enumerate;

public enum Attribute {
    CO_ATIVIDADE(0),
    CO_CEP(1),
    CO_CNES(2),
    CO_IBGE(3),
    CO_NATUREZA_JUR(4),
    CO_TURNO_ATENDIMENTO(5),
    CO_UF(6),
    ST_ATEND_AMBULATORIAL(7),
    ST_ATEND_HOSPITALAR(8),
    ST_CENTRO_CIRURGICO(9),
    ST_CENTRO_NEONATAL(10),
    ST_CENTRO_OBSTETRICO(11),
    ST_SERVICO_APOIO(12),
    TIPO_UNIDADE(13),
    CO_AMBULATORIAL_SUS(14),
    COD_ESFERA_ADMINISTRATIVA(15),
    COD_MOTIVO_DESAB(16),
    COD_NATUREZA_ORGANIZACAO(17),
    COD_NIVEL_HIERARQUIA(18),
    COD_UNIDADE(19),
    DESCRICAO_ESFERA_ADMINISTRATIVA(20),
    DESCRICAO_NATUREZA_ORGANIZACAO(21),
    DESCRICAO_NIVEL_HIERARQUIA(22),
    DESCRICAO_TURNO_ATENDIMENTO(23),
    NOME_BAIRRO(24),
    NOME_EMAIL(25),
    NOME_FANTASIA(26),
    NOME_LOGRADOURO(27),
    NOME_RAZAO_SOCIAL(28),
    NUM_CNPJ(29),
    NUM_CNPJ_MANTENEDORA(30),
    NUM_ENDERECO(31),
    NUM_LATITUDE(32),
    NUM_LONGITUDE(33),
    NUM_TELEFONE(34),
    TIPO_GESTAO(35);

    private int pos;

    Attribute(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
}
