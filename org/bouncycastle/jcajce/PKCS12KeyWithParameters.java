package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    private final byte[] a;
    private final int b;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.b;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.a;
    }
}
