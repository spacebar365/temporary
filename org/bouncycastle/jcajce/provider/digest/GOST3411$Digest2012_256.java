package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.f;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411$Digest2012_256 extends BCMessageDigest implements Cloneable {
    public GOST3411$Digest2012_256() {
        super(new f());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        GOST3411$Digest2012_256 gOST3411$Digest2012_256 = (GOST3411$Digest2012_256) super.clone();
        gOST3411$Digest2012_256.a = new f((f) this.a);
        return gOST3411$Digest2012_256;
    }
}
