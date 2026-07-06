package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.ad;
import org.bouncycastle.b.h.g;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes.dex */
public class Tiger$PBEWithHashMac extends BaseMac {
    public Tiger$PBEWithHashMac() {
        super(new g(new ad()), 3, 192);
    }
}
