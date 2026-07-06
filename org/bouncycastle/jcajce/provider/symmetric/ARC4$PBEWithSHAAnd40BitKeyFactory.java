package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class ARC4$PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
    public ARC4$PBEWithSHAAnd40BitKeyFactory() {
        super("PBEWithSHAAnd128BitRC4", n.bD, true, 2, 1, 40, 0);
    }
}
