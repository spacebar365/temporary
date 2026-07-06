package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SEED$Poly1305KeyGen extends BaseKeyGenerator {
    public SEED$Poly1305KeyGen() {
        super("Poly1305-SEED", 256, new y());
    }
}
