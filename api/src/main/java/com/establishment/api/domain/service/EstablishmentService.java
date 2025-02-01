package com.establishment.api.domain.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.establishment.api.domain.exception.EstablishmentNotFoundException;
import com.establishment.api.domain.exception.InvalidEstablishmentAttribute;
import com.establishment.api.domain.logic.EstablishmentLogic;
import com.establishment.api.domain.model.Establishment;
import com.establishment.api.domain.port.EstablishmentPersistencePort;
import com.establishment.api.domain.port.EstablishmentServicePort;

public class EstablishmentService implements EstablishmentServicePort {

    private EstablishmentLogic establishmentLogic;

    public EstablishmentPersistencePort establishmentPersistencePort;

    public EstablishmentService(EstablishmentPersistencePort establishmentPersistencePort) {
        this.establishmentLogic = new EstablishmentLogic();
        this.establishmentPersistencePort = establishmentPersistencePort;
    }

    @Override
    public String importer(MultipartFile file) throws IOException {
        String line = null;
        ArrayList<Establishment> establishments = new ArrayList<>();
        ArrayList<Establishment> establishmentsOut = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream(), StandardCharsets.ISO_8859_1), ';');
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] column = line.split(";");

            establishmentsOut = this.establishmentLogic.filterColumns(column, establishments);
        }
        
        String message = this.establishmentPersistencePort.createAll(establishmentsOut);
        return message;
    }

    @Override
    public Establishment findByCnes(Integer cnes) {
        if (!this.establishmentLogic.isCnes(cnes)) {
            throw new InvalidEstablishmentAttribute("Invalid CNES: " + cnes);
        }

        Establishment establishmentOut = this.establishmentPersistencePort.findByCnes(cnes);
        if (establishmentOut == null) {
            throw new EstablishmentNotFoundException("Establishment not found with this CNES: " + cnes);
        }
        return establishmentOut;
    }

    @Override
    public Page<Establishment> findAllByNameAndFilteringAndType(String name, String state, String type, String shift, int page, int size) {
        int nState = state.trim() != "" ? Integer.valueOf(state) : -1;
        int nType = type.trim() != "" ? Integer.valueOf(type) : -1;
        int nShift = shift.trim() != "" ? Integer.valueOf(shift) : -1;

        if (name.trim() == "") {
            throw new InvalidEstablishmentAttribute("Name cannot be NULL or EMPTY");
        }

        Page<Establishment> establishments = this.establishmentPersistencePort.findAllByNameAndFilteringAndType(name, nState, nType, nShift, page, size);
        if (establishments == null) {
            throw new EstablishmentNotFoundException("Establishment not found");
        }
        return establishments;
    }

    @Override
    public Page<Establishment> findAllByNameAndStateAndTypeAndShift(String name, String state, String type, String shift, int page, int size) {
        int nState = state.trim() != "" ? Integer.valueOf(state) : -1;
        int nType = type.trim() != "" ? Integer.valueOf(type) : -1;
        int nShift = shift.trim() != "" ? Integer.valueOf(shift) : -1;

        if (name.trim() == "") {
            throw new InvalidEstablishmentAttribute("Name cannot be NULL or EMPTY");
        }

        Page<Establishment> establishments = this.establishmentPersistencePort.findAllByNameAndStateAndTypeAndShift(name, nState, nType, nShift, page, size);
        if (establishments == null) {
            throw new EstablishmentNotFoundException("Establishment not found");
        }
        return establishments;
    }

    /*
     * Não utilizado
    */
    @Override
    public Page<Establishment> findByLocalCoordinates(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, int page, int size) {
        if (minLatitude == null || maxLatitude == null || minLongitude == null || maxLongitude == null) {
            throw new InvalidEstablishmentAttribute("Maximum and minimum latitude and longitude cannot be NULL");
        }
        Page<Establishment> establishmentOut = this.establishmentPersistencePort.findByLocalCoordinates(minLatitude, maxLatitude, minLongitude, maxLongitude, page, size);
        if (establishmentOut == null || establishmentOut.isEmpty()) {
            throw new EstablishmentNotFoundException("Establishments not found");
        }
        return establishmentOut;
    }

    @Override
    public Page<Establishment> findByLocalCoordinatesAndFiltering(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, String type, String shift, int page, int size) {
        int nType = type.trim() != "" ? Integer.valueOf(type) : -1;
        int nShift = shift.trim() != "" ? Integer.valueOf(shift) : -1;

        if (minLatitude == null || maxLatitude == null || minLongitude == null || maxLongitude == null) {
            throw new InvalidEstablishmentAttribute("Maximum and minimum latitude and longitude cannot be NULL");
        }
        Page<Establishment> establishmentOut = this.establishmentPersistencePort.findByLocalCoordinatesAndFiltering(minLatitude, maxLatitude, minLongitude, maxLongitude, nType, nShift, page, size);
        if (establishmentOut == null || establishmentOut.isEmpty()) {
            throw new EstablishmentNotFoundException("Establishments not found");
        }
        return establishmentOut;
    }

    @Override
    public Page<Establishment> findByLocalCoordinatesAndFilteringAndType(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, String type, String shift, int page, int size) {
        int nType = type.trim() != "" ? Integer.valueOf(type) : -1;
        int nShift = shift.trim() != "" ? Integer.valueOf(shift) : -1;

        if (minLatitude == null || maxLatitude == null || minLongitude == null || maxLongitude == null) {
            throw new InvalidEstablishmentAttribute("Maximum and minimum latitude and longitude cannot be NULL");
        }
        Page<Establishment> establishmentOut = this.establishmentPersistencePort.findByLocalCoordinatesAndFilteringAndType(minLatitude, maxLatitude, minLongitude, maxLongitude, nType, nShift, page, size);
        if (establishmentOut == null || establishmentOut.isEmpty()) {
            throw new EstablishmentNotFoundException("Establishments not found");
        }
        return establishmentOut;
    }
}
