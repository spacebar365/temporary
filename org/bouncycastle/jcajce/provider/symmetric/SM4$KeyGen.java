package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SM4$KeyGen extends BaseKeyGenerator {
    public SM4$KeyGen() {
        super("SM4", 128, new h());
    }
}
