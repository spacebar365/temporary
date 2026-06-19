package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: loaded from: classes.dex */
public class BaseKeyGenerator extends KeyGeneratorSpi {

    /* JADX INFO: renamed from: a */
    protected String f6178a;

    /* JADX INFO: renamed from: b */
    protected int f6179b;

    /* JADX INFO: renamed from: c */
    protected int f6180c;

    /* JADX INFO: renamed from: d */
    protected C0987h f6181d;

    /* JADX INFO: renamed from: e */
    protected boolean f6182e = true;

    protected BaseKeyGenerator(String str, int i, C0987h c0987h) {
        this.f6178a = str;
        this.f6180c = i;
        this.f6179b = i;
        this.f6181d = c0987h;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
        if (this.f6182e) {
            this.f6181d.mo2415a(new C1181x(C1124l.m2709a(), this.f6180c));
            this.f6182e = false;
        }
        return new SecretKeySpec(this.f6181d.mo2416a(), this.f6178a);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = C1124l.m2709a();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.f6181d.mo2415a(new C1181x(secureRandom, i));
        this.f6182e = false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.f6181d.mo2415a(new C1181x(secureRandom, this.f6180c));
            this.f6182e = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
