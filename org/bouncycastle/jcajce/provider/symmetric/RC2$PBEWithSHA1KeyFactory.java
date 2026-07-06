package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class RC2$PBEWithSHA1KeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithSHA1KeyFactory() {
        super("PBEwithSHA1andRC2", n.z, true, 0, 1, 64, 64);
    }
}
