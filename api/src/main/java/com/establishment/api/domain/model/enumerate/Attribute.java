package com.establishment.api.domain.model.enumerate;

public enum Attribute {
    CO_CNES(0),
    CO_UNIDADE(1),
    CO_UF(2),
    CO_IBGE(3),
    NU_CNPJ_MANTENEDORA(4),
    NO_RAZAO_SOCIAL(5),
    NO_FANTASIA(6),
    CO_NATUREZA_ORGANIZACAO(7),
    DS_NATUREZA_ORGANIZACAO(8),
    TP_GESTAO(9),
    CO_NIVEL_HIERARQUIA(10),
    DS_NIVEL_HIERARQUIA(11),
    CO_ESFERA_ADMINISTRATIVA(12),
    DS_ESFERA_ADMINISTRATIVA(13),
    CO_ATIVIDADE(14),
    TP_UNIDADE(15),
    CO_CEP(16),
    NO_LOGRADOURO(17),
    NU_ENDERECO(18),
    NO_BAIRRO(19),
    NU_TELEFONE(20),
    NU_LATITUDE(21),
    NU_LONGITUDE(22),
    CO_TURNO_ATENDIMENTO(23),
    DS_TURNO_ATENDIMENTO(24),
    NU_CNPJ(25),
    NO_EMAIL(26),
    CO_NATUREZA_JUR(27),
    ST_CENTRO_CIRURGICO(28),
    ST_CENTRO_OBSTETRICO(29),
    ST_CENTRO_NEONATAL(30),
    ST_ATEND_HOSPITALAR(31),
    ST_SERVICO_APOIO(32),
    ST_ATEND_AMBULATORIAL(33),
    CO_MOTIVO_DESAB(34),
    CO_AMBULATORIAL_SUS(35);

    private int pos;

    Attribute(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
}
