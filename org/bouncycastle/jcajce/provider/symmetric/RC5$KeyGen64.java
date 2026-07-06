package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RC5$KeyGen64 extends BaseKeyGenerator {
    public RC5$KeyGen64() {
        super("RC5-64", 256, new h());
    }
}
