package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RC5$KeyGen32 extends BaseKeyGenerator {
    public RC5$KeyGen32() {
        super("RC5", 128, new h());
    }
}
