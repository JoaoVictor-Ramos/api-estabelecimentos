package com.establishment.api.domain.enumerate;

public enum Shifts {
    TURNOS_INTERMITENTES(5),
    VINTE_QUATRO_HORAS(6),
    MANHA_TARDE_E_NOITE(4),
    SOMENTE_NOITE(7),
    SOMENTE_TARDE(2),
    SOMENTE_MANHÃ(1),
    MANHA_E_TARDE(3),
    INDEFINIDO(0),
    DESCONHECIDO(-1);

    private int codShift;

    Shifts(int codShift) {
        this.codShift = codShift;
    }

    public int getShift() {
        return codShift;
    }
}
