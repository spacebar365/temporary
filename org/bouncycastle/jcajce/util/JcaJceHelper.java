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
    /* JADX INFO: renamed from: a */
    Cipher mo4520a(String str);

    /* JADX INFO: renamed from: b */
    Mac mo4521b(String str);

    /* JADX INFO: renamed from: c */
    AlgorithmParameters mo4522c(String str);

    /* JADX INFO: renamed from: d */
    KeyFactory mo4523d(String str);

    /* JADX INFO: renamed from: e */
    SecretKeyFactory mo4524e(String str);

    /* JADX INFO: renamed from: f */
    Signature mo4525f(String str);

    /* JADX INFO: renamed from: g */
    CertificateFactory mo4526g(String str);

    /* JADX INFO: renamed from: h */
    SecureRandom mo4527h(String str);
}
