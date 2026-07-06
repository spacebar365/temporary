package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RC6$Poly1305KeyGen extends BaseKeyGenerator {
    public RC6$Poly1305KeyGen() {
        super("Poly1305-RC6", 256, new y());
    }
}
