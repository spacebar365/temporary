package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.d;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411$Digest extends BCMessageDigest implements Cloneable {
    public GOST3411$Digest() {
        super(new d());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        GOST3411$Digest gOST3411$Digest = (GOST3411$Digest) super.clone();
        gOST3411$Digest.a = new d((d) this.a);
        return gOST3411$Digest;
    }
}
