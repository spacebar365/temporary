package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ak;
import org.bouncycastle.b.e.p;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* JADX INFO: loaded from: classes.dex */
public class DESede$RFC3211 extends BaseWrapCipher {
    public DESede$RFC3211() {
        super(new ak(new p()), 8);
    }
}
