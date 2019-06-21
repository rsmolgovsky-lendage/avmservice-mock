package com.lendage.api.avmservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    private Address address=new Address();

    @BeforeEach
    void setUp(){
        this.address.setCity("San Mateo");
    }

    @Test
    void getCity() {
        assertEquals("San Mateo", this.address.getCity());
    }
}
