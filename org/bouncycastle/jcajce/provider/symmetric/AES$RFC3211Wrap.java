package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.a;
import org.bouncycastle.b.e.ak;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* JADX INFO: loaded from: classes.dex */
public class AES$RFC3211Wrap extends BaseWrapCipher {
    public AES$RFC3211Wrap() {
        super(new ak(new a()), 16);
    }
}
