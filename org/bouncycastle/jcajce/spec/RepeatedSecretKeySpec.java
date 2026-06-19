package org.bouncycastle.jcajce.spec;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public class RepeatedSecretKeySpec implements SecretKey {

    /* JADX INFO: renamed from: a */
    private String f6259a;

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f6259a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }
}
