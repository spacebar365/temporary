package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ak;
import org.bouncycastle.b.e.j;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* JADX INFO: loaded from: classes.dex */
public class Camellia$RFC3211Wrap extends BaseWrapCipher {
    public Camellia$RFC3211Wrap() {
        super(new ak(new j()), 16);
    }
}
