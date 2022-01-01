package com.bayudwiyansatria.common.security;

import com.bayudwiyansatria.common.security.key.ecc.ECKeyBuilder;
import com.bayudwiyansatria.common.security.key.rsa.RSAKeyBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateKey;

/**
 * RSA Builder Test
 *
 * @author Bayu Dwiyan Satria
 * @version 0.0.1
 */
public class KeyBuilderTest {

    @Test
    public void generateRSAKeyPair() {
        RSAKeyBuilder builder = new RSAKeyBuilder();
        KeyPair rsaKeyPair = builder.build();
        KeyPair rsaKeyPairFromExistingPrivateKey = builder.build((RSAPrivateKey) rsaKeyPair.getPrivate());

        Assert.assertEquals(rsaKeyPair.getPublic(), rsaKeyPairFromExistingPrivateKey.getPublic());
    }

    @Test
    public void generateECKeyPair() {
        ECKeyBuilder builder = new ECKeyBuilder();
        KeyPair ecKeyPair = builder.build();
        KeyPair ecKeyPairFromExistingPrivateKey = builder.build((ECPrivateKey) ecKeyPair.getPrivate());

        Assert.assertEquals(ecKeyPair.getPublic(), ecKeyPairFromExistingPrivateKey.getPublic());
    }
}
