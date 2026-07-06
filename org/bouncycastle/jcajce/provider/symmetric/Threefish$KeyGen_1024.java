package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Threefish$KeyGen_1024 extends BaseKeyGenerator {
    public Threefish$KeyGen_1024() {
        super("Threefish-1024", 1024, new h());
    }
}
