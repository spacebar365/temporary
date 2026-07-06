package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.a;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHA1AESCBC128 extends BaseBlockCipher {
    public AES$PBEWithSHA1AESCBC128() {
        super(new b(new a()), 2, 1, 128, 16);
    }
}
