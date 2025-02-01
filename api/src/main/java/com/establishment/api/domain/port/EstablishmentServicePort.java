package com.establishment.api.domain.port;

import java.io.IOException;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.establishment.api.domain.model.Establishment;

public interface EstablishmentServicePort {
    String importer(MultipartFile file) throws IOException;
    Establishment findByCnes(Integer cnes);
    Page<Establishment> findAllByNameAndFilteringAndType(String name, String state, String type, String shift, int page, int size);
    Page<Establishment> findAllByNameAndStateAndTypeAndShift(String name, String state, String type, String shift, int page, int size);
    Page<Establishment> findByLocalCoordinates(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, int page, int size); // Não utilizado
    Page<Establishment> findByLocalCoordinatesAndFiltering(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, String type, String shift, int page, int size);
    Page<Establishment> findByLocalCoordinatesAndFilteringAndType(Double minLatitude, Double maxLatitude, Double minLongitude, Double maxLongitude, String type, String shift, int page, int size);

}
