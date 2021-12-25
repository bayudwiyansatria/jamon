package com.bayudwiyansatria.common.security;

/**
 * Message Digest
 *
 * @author Bayu Dwiyan Satria
 * @since 1.0.0
 */
public enum Digest {

    SHA256("SHA-256");

    private final String digest;

    Digest(String digest) {
        this.digest = digest;
    }

    public String getDigest() {
        return digest;
    }
}
