package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {

    /* JADX INFO: renamed from: a */
    private final byte[] f5560a;

    /* JADX INFO: renamed from: b */
    private final int f5561b;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f5561b;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f5560a;
    }
}
