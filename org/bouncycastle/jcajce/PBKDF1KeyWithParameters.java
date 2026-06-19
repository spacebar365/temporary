package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {

    /* JADX INFO: renamed from: a */
    private final byte[] f5552a;

    /* JADX INFO: renamed from: b */
    private final int f5553b;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f5553b;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f5552a;
    }
}
