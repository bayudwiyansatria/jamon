package com.bayudwiyansatria.common.security;

import org.junit.Assert;
import org.junit.Test;

public class SignatureAlgorithmTest {

    @Test
    public void SignatureAlgorithm() {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RS512;
        Assert.assertNotNull(signatureAlgorithm.getValue());
        Assert.assertNotNull(signatureAlgorithm.getJcaName());
        Assert.assertNotNull(signatureAlgorithm.getDescription());
        Assert.assertNotNull(signatureAlgorithm.getFamilyName());

    }
}
