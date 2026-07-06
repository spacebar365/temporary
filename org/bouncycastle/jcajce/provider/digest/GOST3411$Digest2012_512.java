package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.g;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411$Digest2012_512 extends BCMessageDigest implements Cloneable {
    public GOST3411$Digest2012_512() {
        super(new g());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        GOST3411$Digest2012_512 gOST3411$Digest2012_512 = (GOST3411$Digest2012_512) super.clone();
        gOST3411$Digest2012_512.a = new g((g) this.a);
        return gOST3411$Digest2012_512;
    }
}
