package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f.y;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Poly1305$KeyGen extends BaseKeyGenerator {
    public Poly1305$KeyGen() {
        super("Poly1305", 256, new y());
    }
}
