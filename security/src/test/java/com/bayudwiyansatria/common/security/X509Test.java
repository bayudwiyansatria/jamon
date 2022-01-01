package com.bayudwiyansatria.common.security;

import com.bayudwiyansatria.common.security.x509.ExtendedKeyUsageType;
import com.bayudwiyansatria.common.security.x509.KeyUsages;
import org.junit.Assert;
import org.junit.Test;


public class X509Test {

    @Test
    public void ExtendedKeyUsageTest(){
        ExtendedKeyUsageType extendedKeyUsageType= ExtendedKeyUsageType.ANY_EXTENDED_KEY_USAGE;
        Assert.assertNotNull(extendedKeyUsageType);
        Assert.assertNotNull(extendedKeyUsageType.getJcaName());
        Assert.assertNotNull(extendedKeyUsageType.getOid());
    }

    @Test
    public void KeyUsageTest(){
        KeyUsages keyUsages= KeyUsages.KEY_AGREEMENT;
        Assert.assertNotNull(keyUsages);
        Assert.assertNotNull(keyUsages.getJcaName());
        Assert.assertNotNull(keyUsages.getDescription());
    }
}
