package com.bayudwiyansatria.common.security;

import com.bayudwiyansatria.common.Utils;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MessageDigestTest {

    final Utils utils = new Utils();
    final List<Digest> digest = new ArrayList<>() {
        {
            add(Digest.SHA256);
            add(Digest.SHA512);
        }
    };
    private final KeyPair keyPair;

    public MessageDigestTest() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(
            Encryption.RSA.getEncryption());
        this.keyPair = keyPairGenerator.generateKeyPair();
    }

    @Test
    public void getMessageDigest() {
        for (Digest digest : digest) {
            try {
                MessageDigest messageDigest =
                    MessageDigest.getInstance(digest.getDigest());
                messageDigest.update(keyPair.getPublic().getEncoded());
                System.out.println(utils.byteToHex(messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }
}
