package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.m;

/* JADX INFO: loaded from: classes.dex */
public class MD5$Digest extends BCMessageDigest implements Cloneable {
    public MD5$Digest() {
        super(new m());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        MD5$Digest mD5$Digest = (MD5$Digest) super.clone();
        mD5$Digest.a = new m((m) this.a);
        return mD5$Digest;
    }
}
