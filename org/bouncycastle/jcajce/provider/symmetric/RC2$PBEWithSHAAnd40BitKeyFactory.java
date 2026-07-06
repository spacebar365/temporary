package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class RC2$PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithSHAAnd40BitKeyFactory() {
        super("PBEwithSHAand40BitRC2-CBC", n.bI, true, 2, 1, 40, 64);
    }
}
