package com.establishment.api.driver.controller;

import java.io.IOException;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.establishment.api.domain.model.Establishment;
import com.establishment.api.domain.port.EstablishmentServicePort;

@RestController
@RequestMapping("/sus/establishment")
@CrossOrigin(methods = {RequestMethod.POST, RequestMethod.GET})
public class EstablishmentController {

    private EstablishmentServicePort establishmentServicePort;

    public EstablishmentController(EstablishmentServicePort establishmentServicePort) {
        this.establishmentServicePort = establishmentServicePort;
    }

    @PostMapping(consumes = {"multipart/form-data"})
    public ResponseEntity<String> upload(@RequestPart("file") MultipartFile file) throws IOException {
        this.establishmentServicePort.importer(file);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully imported establishments");
    }

    @GetMapping("/findByCnes")
    public ResponseEntity<Object> findByCnes(@RequestParam("cnes") Integer cnes) {
        Establishment establishment = this.establishmentServicePort.findByCnes(cnes);
        return ResponseEntity.status(HttpStatus.OK).body(establishment);
    }

    /*
     * For search establishment
    */
    @GetMapping("/findAllByNameAndFilters")
    public ResponseEntity<Object> findAllByNameAndFilters(
        @RequestParam("name") String name,
        @RequestParam("state") String state,
        @RequestParam("type") String type,
        @RequestParam("shift") String shift,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "100") int size) {
        
        Page<Establishment> establishments = this.establishmentServicePort.findAllByNameAndFilters(name, state, type, shift, page, size);
        return ResponseEntity.status(HttpStatus.OK).body(establishments);
    }

    /*
     * For consultation
    */
    @GetMapping("/findAllByNameForConsultation")
    public ResponseEntity<Object> findAllByNameForConsultation(
        @RequestParam("name") String name,
        @RequestParam("state") String state,
        @RequestParam("type") String type,
        @RequestParam("shift") String shift,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "100") int size) {
        
        Page<Establishment> establishments = this.establishmentServicePort.findAllByNameForConsultation(name, state, type, shift, page, size);
        return ResponseEntity.status(HttpStatus.OK).body(establishments);
    }

    /*
     * For search establishment by geolocation
    */
    @GetMapping("/findByLatLonAndFilters")
    public ResponseEntity<Object> findByLatLonAndFilters(
        @RequestParam("minLatitude") Double minLatitude,
        @RequestParam("maxLatitude") Double maxLatitude,
        @RequestParam("minLongitude") Double minLongitude,
        @RequestParam("maxLongitude") Double maxLongitude,
        @RequestParam("type") String type,
        @RequestParam("shift") String shift,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "100") int size) {
            
        Page<Establishment> establishments = this.establishmentServicePort.findByLatLonAndFilters(minLatitude, maxLatitude, minLongitude, maxLongitude, type, shift, page, size);
        return ResponseEntity.status(HttpStatus.OK).body(establishments);
    }

    /*
     * For consultation by geolocation
    */
    @GetMapping("/findByLatLonForConsultation")
    public ResponseEntity<Object> findByLatLonForConsultation(
        @RequestParam("minLatitude") Double minLatitude,
        @RequestParam("maxLatitude") Double maxLatitude,
        @RequestParam("minLongitude") Double minLongitude,
        @RequestParam("maxLongitude") Double maxLongitude,
        @RequestParam("type") String type,
        @RequestParam("shift") String shift,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "100") int size) {
            
        Page<Establishment> establishments = this.establishmentServicePort.findByLatLonForConsultation(minLatitude, maxLatitude, minLongitude, maxLongitude, type, shift, page, size);
        return ResponseEntity.status(HttpStatus.OK).body(establishments);
    }
}
