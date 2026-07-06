package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import java.security.SecureRandomSpi;

/* JADX INFO: loaded from: classes.dex */
public class DRBG$Default extends SecureRandomSpi {
    private static final SecureRandom a = DRBG.a(true);

    @Override // java.security.SecureRandomSpi
    protected byte[] engineGenerateSeed(int i) {
        return a.generateSeed(i);
    }

    @Override // java.security.SecureRandomSpi
    protected void engineNextBytes(byte[] bArr) {
        a.nextBytes(bArr);
    }

    @Override // java.security.SecureRandomSpi
    protected void engineSetSeed(byte[] bArr) {
        a.setSeed(bArr);
    }
}
