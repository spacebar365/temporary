package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.p;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DESede$PBEWithSHAAndDES3Key extends BaseBlockCipher {
    public DESede$PBEWithSHAAndDES3Key() {
        super(new b(new p()), 2, 1, 192, 8);
    }
}
