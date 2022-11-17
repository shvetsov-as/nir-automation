package com.niimto.automation.model.service.sequencegen;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidGen {
    public UUID getId() {
        return UUID.randomUUID();
    }
}
