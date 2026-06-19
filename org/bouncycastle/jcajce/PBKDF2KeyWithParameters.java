package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF2KeyWithParameters extends PBKDF2Key implements PBEKey {

    /* JADX INFO: renamed from: a */
    private final byte[] f5556a;

    /* JADX INFO: renamed from: b */
    private final int f5557b;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f5557b;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f5556a;
    }
}
