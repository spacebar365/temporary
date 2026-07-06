package org.bouncycastle.jcajce.util;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public interface JcaJceHelper {
    Cipher a(String str);

    Mac b(String str);

    AlgorithmParameters c(String str);

    KeyFactory d(String str);

    SecretKeyFactory e(String str);

    Signature f(String str);

    CertificateFactory g(String str);

    SecureRandom h(String str);
}
