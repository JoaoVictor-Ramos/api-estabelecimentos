package com.establishment.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.establishment.api.domain.port.EstablishmentPersistencePort;
import com.establishment.api.domain.port.EstablishmentServicePort;
import com.establishment.api.domain.service.EstablishmentService;
import com.establishment.api.driver.persistence.adapter.EstablishmentAdapter;
import com.establishment.api.driver.persistence.repository.EstablishmentRepository;

@Configuration
public class Config {
    private final EstablishmentRepository establishmentRepository;

    public Config(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }

    @Bean
    public EstablishmentPersistencePort establishmentPersistencePort() {
        return new EstablishmentAdapter(this.establishmentRepository);
    }

    @Bean
    public EstablishmentServicePort establishmentServicePort() {
        return new EstablishmentService(establishmentPersistencePort());
    }
}
