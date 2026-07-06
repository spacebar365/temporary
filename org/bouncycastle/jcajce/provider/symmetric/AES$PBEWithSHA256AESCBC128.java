package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.a;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHA256AESCBC128 extends BaseBlockCipher {
    public AES$PBEWithSHA256AESCBC128() {
        super(new b(new a()), 2, 4, 128, 16);
    }
}
