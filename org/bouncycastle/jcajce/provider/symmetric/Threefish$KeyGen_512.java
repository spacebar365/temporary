package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Threefish$KeyGen_512 extends BaseKeyGenerator {
    public Threefish$KeyGen_512() {
        super("Threefish-512", 512, new h());
    }
}
