package com.bayudwiyansatria.common.security;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Serial Number Generator
 *
 * @author Bayu Dwiyan Satria
 * @version 1.0.0
 */
public class SerialNumberGenerator {

    private static final int DEFAULT_SERIAL_LENGTH = 128;
    private final SecureRandom random;
    private final int length;

    /**
     * Serial Number Generator Constructor
     *
     * @since 1.0.0
     */
    public SerialNumberGenerator() {
        this(new SecureRandom(), DEFAULT_SERIAL_LENGTH);
    }

    /**
     * Serial Number Generator Constructor
     *
     * @param random Secure Random
     * @param length Secure Random Length
     * @since 1.0.0
     */
    SerialNumberGenerator(final SecureRandom random, final int length) {
        this.random = random;
        this.length = length;
    }

    /**
     * Generate Random Serial Number
     *
     * @return Serial Number
     * @since 1.0.0
     */
    public BigInteger generateRandomSerialNumber() {
        return new BigInteger(length, random);
    }

}
