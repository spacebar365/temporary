package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: loaded from: classes.dex */
public class PBESecretKeyFactory extends BaseSecretKeyFactory implements PBE {

    /* JADX INFO: renamed from: c */
    private boolean f6211c;

    /* JADX INFO: renamed from: d */
    private int f6212d;

    /* JADX INFO: renamed from: e */
    private int f6213e;

    /* JADX INFO: renamed from: f */
    private int f6214f;

    /* JADX INFO: renamed from: g */
    private int f6215g;

    public PBESecretKeyFactory(String str, C0653p c0653p, boolean z, int i, int i2, int i3, int i4) {
        super(str, c0653p);
        this.f6211c = z;
        this.f6212d = i;
        this.f6213e = i2;
        this.f6214f = i3;
        this.f6215g = i4;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new BCPBEKey(this.f6188a, this.f6189b, this.f6212d, this.f6213e, this.f6214f, this.f6215g, pBEKeySpec, null);
        }
        return new BCPBEKey(this.f6188a, this.f6189b, this.f6212d, this.f6213e, this.f6214f, this.f6215g, pBEKeySpec, this.f6211c ? PBE.Util.m4470a(pBEKeySpec, this.f6212d, this.f6213e, this.f6214f, this.f6215g) : PBE.Util.m4469a(pBEKeySpec, this.f6212d, this.f6213e, this.f6214f));
    }
}
