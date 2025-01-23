package com.establishment.api.domain.port;

import java.util.ArrayList;

import org.springframework.data.domain.Page;

import com.establishment.api.domain.model.Establishment;

public interface EstablishmentPersistencePort {
    String createAll(ArrayList<Establishment> establishments);
    Establishment findByCnes(Integer cnes);
    Page<Establishment> findAllByName(String name, int page, int size);
    Page<Establishment> findAllByNameAndStateAndTypeAndShift(String name, int state, int type, int shift, int page, int size);
}
