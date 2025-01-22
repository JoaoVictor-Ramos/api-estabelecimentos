package com.establishment.api.domain.enumerate;

public enum States {
    ACRE(12, "ACRE"),
    ALAGOAS(27, "ALAGOAS"),
    AMAPA(16, "AMAPÁ"),
    AMAZONAS(13, "AMAZONAS"),
    BAHIA(29, "BAHIA"),
    CEARA(23, "CEARÁ"),
    DISTRITO_FEDERAL(53, "DISTRITO FEDERAL"),
    ESPIRITO_SANTO(32, "ESPÍRITO SANTO"),
    GOIAS(52, "GOIÁS"),
    MARANHAO(21, "MARANHÃO"),
    MATO_GROSSO(51, "MATO GROSSO"),
    MATO_GROSSO_DO_SUL(50, "MATO GROSSO DO SUL"),
    MINAS_GERAIS(31, "MINAS GERAIS"),
    PARA(15, "PARÁ"),
    PARAIBA(25, "PARAÍBA"),
    PARANA(41, "PARANÁ"),
    PERNAMBUCO(26, "PERNAMBUCO"),
    PIAUI(22, "PIAUÍ"),
    RIO_GRANDE_DO_NORTE(24, "RIO GRANDE DO NORTE"),
    RIO_GRANDE_DO_SUL(43, "RIO GRANDE DO SUL"),
    RIO_DE_JANEIRO(33, "RIO DE JANEIRO"),
    RONDONIA(11, "RONDÔNIA"),
    RORAIMA(14, "RORAIMA"),
    SANTA_CATARINA(42, "SANTA CATARINA"),
    SAO_PAULO(35, "SÃO PAULO"),
    SERGIPE(28, "SERGIPE"),
    TOCANTIS(17, "TOCANTIS");
    
    private int cod;
    private String name;

    States(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }
}
