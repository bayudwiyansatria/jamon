package com.bayudwiyansatria.common;

import java.util.Locale;

/**
 * Utility
 *
 * @version 1.0.0
 */
public class Utils {

    /**
     * Convert Bytes Array into Hex
     *
     * @param bytes byteArray to Hex
     * @return String Hex
     * @since 1.0.0
     */
    public String byteToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString().toUpperCase(Locale.ROOT);
    }

}
