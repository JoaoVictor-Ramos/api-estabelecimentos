package com.establishment.api.domain.port;

import java.io.IOException;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.establishment.api.domain.model.Establishment;

public interface EstablishmentServicePort {
    String importer(MultipartFile file) throws IOException;
    Page<Establishment> findAllByName(String name, int page, int size);
}
