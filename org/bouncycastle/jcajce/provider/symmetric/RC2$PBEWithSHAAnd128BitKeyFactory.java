package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class RC2$PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithSHAAnd128BitKeyFactory() {
        super("PBEwithSHAand128BitRC2-CBC", n.bH, true, 2, 1, 128, 64);
    }
}
