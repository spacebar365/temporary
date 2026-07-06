package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.bc;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Twofish$PBEWithSHA extends BaseBlockCipher {
    public Twofish$PBEWithSHA() {
        super(new b(new bc()), 2, 1, 256, 16);
    }
}
