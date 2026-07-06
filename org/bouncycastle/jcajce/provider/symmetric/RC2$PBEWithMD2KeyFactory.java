package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class RC2$PBEWithMD2KeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithMD2KeyFactory() {
        super("PBEwithMD2andRC2", n.v, true, 0, 5, 64, 64);
    }
}
