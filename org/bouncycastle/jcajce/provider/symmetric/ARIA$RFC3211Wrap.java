package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ak;
import org.bouncycastle.b.e.d;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* JADX INFO: loaded from: classes.dex */
public class ARIA$RFC3211Wrap extends BaseWrapCipher {
    public ARIA$RFC3211Wrap() {
        super(new ak(new d()), 16);
    }
}
