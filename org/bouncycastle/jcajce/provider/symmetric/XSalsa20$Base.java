package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.bf;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* JADX INFO: loaded from: classes.dex */
public class XSalsa20$Base extends BaseStreamCipher {
    public XSalsa20$Base() {
        super(new bf(), 24);
    }
}
