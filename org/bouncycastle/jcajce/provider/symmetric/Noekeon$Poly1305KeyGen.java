package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Noekeon$Poly1305KeyGen extends BaseKeyGenerator {
    public Noekeon$Poly1305KeyGen() {
        super("Poly1305-Noekeon", 256, new y());
    }
}
