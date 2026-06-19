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
public class DefaultJcaJceHelper implements JcaJceHelper {
    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: a */
    public final Cipher mo4520a(String str) {
        return Cipher.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: b */
    public final Mac mo4521b(String str) {
        return Mac.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: c */
    public final AlgorithmParameters mo4522c(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: d */
    public final KeyFactory mo4523d(String str) {
        return KeyFactory.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: e */
    public final SecretKeyFactory mo4524e(String str) {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: f */
    public final Signature mo4525f(String str) {
        return Signature.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: g */
    public final CertificateFactory mo4526g(String str) {
        return CertificateFactory.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    /* JADX INFO: renamed from: h */
    public final SecureRandom mo4527h(String str) {
        return SecureRandom.getInstance(str);
    }
}
