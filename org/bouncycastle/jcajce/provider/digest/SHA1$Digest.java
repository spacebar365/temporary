package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.s;

/* JADX INFO: loaded from: classes.dex */
public class SHA1$Digest extends BCMessageDigest implements Cloneable {
    public SHA1$Digest() {
        super(new s());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SHA1$Digest sHA1$Digest = (SHA1$Digest) super.clone();
        sHA1$Digest.a = new s((s) this.a);
        return sHA1$Digest;
    }
}
