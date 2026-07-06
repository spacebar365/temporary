package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Threefish$KeyGen_256 extends BaseKeyGenerator {
    public Threefish$KeyGen_256() {
        super("Threefish-256", 256, new h());
    }
}
