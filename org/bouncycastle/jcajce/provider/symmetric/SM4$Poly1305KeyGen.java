package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SM4$Poly1305KeyGen extends BaseKeyGenerator {
    public SM4$Poly1305KeyGen() {
        super("Poly1305-SM4", 256, new y());
    }
}
