package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ak;
import org.bouncycastle.b.e.o;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* JADX INFO: loaded from: classes.dex */
public class DES$RFC3211 extends BaseWrapCipher {
    public DES$RFC3211() {
        super(new ak(new o()), 8);
    }
}
