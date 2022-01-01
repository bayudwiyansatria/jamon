package com.bayudwiynasatria.common;

import com.bayudwiyansatria.common.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class UtilsTest {

    @Test
    public void byteToHex () {
        byte[] bytesOriginal = new byte[20];
        new Random().nextBytes(bytesOriginal);

        String hex = new Utils().byteToHex(bytesOriginal);
        Assert.assertNotNull(hex);
        System.out.println(hex);
    }
}
