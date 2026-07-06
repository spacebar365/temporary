package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class RC2$PBEWithMD5KeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithMD5KeyFactory() {
        super("PBEwithMD5andRC2", n.x, true, 0, 0, 64, 64);
    }
}
