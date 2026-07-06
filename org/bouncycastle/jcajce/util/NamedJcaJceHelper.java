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
public class NamedJcaJceHelper implements JcaJceHelper {
    protected final String a;

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final Cipher a(String str) {
        return Cipher.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final Mac b(String str) {
        return Mac.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final AlgorithmParameters c(String str) {
        return AlgorithmParameters.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final KeyFactory d(String str) {
        return KeyFactory.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final SecretKeyFactory e(String str) {
        return SecretKeyFactory.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final Signature f(String str) {
        return Signature.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final CertificateFactory g(String str) {
        return CertificateFactory.getInstance(str, this.a);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public final SecureRandom h(String str) {
        return SecureRandom.getInstance(str, this.a);
    }
}
