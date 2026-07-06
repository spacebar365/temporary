package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class CAST6$Poly1305KeyGen extends BaseKeyGenerator {
    public CAST6$Poly1305KeyGen() {
        super("Poly1305-CAST6", 256, new y());
    }
}
