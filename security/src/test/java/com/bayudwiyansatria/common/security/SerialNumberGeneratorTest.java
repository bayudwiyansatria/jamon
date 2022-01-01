package com.bayudwiyansatria.common.security;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SerialNumberGeneratorTest {

    @Test
    public void SerialNumberGeneratorTest(){
        assertNotNull(new SerialNumberGenerator().generateRandomSerialNumber());
    }
}
