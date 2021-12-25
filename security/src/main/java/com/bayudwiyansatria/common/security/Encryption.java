package com.bayudwiyansatria.common.security;

/**
 * Encryption
 *
 * @author Bayu Dwiyan Satria
 * @version 1.0.0
 */
public enum Encryption {
    
    RSA("RSA"),

    EC("EC");

    private final String encryption;

    /**
     * Encryption
     *
     * @param encryption Encryption
     */
    Encryption(String encryption) {
        this.encryption = encryption;
    }

    /**
     * Get Encryption
     *
     * @return encryption
     */
    public String getEncryption() {
        return encryption;
    }
}
