package com.establishment.api.domain.port;

import java.io.IOException;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.establishment.api.domain.model.Establishment;

public interface EstablishmentServicePort {
    String importer(MultipartFile file) throws IOException;
    Establishment findByCnes(Integer cnes);
    Page<Establishment> findAllByNameAndFilters(String name, String state, String type, String shift, int page, int size);
    Page<Establishment> findAllByNameForConsultation(String name, String state, String type, String shift, int page, int size);
    Page<Establishment> findByLatLonAndFilters(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, String type, String shift, int page, int size);
    Page<Establishment> findByLatLonForConsultation(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, String type, String shift, int page, int size);

}
