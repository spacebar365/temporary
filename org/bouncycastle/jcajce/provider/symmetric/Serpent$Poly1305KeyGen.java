package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$Poly1305KeyGen extends BaseKeyGenerator {
    public Serpent$Poly1305KeyGen() {
        super("Poly1305-Serpent", 256, new y());
    }
}
