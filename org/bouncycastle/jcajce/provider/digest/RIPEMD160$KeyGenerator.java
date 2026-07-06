package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD160$KeyGenerator extends BaseKeyGenerator {
    public RIPEMD160$KeyGenerator() {
        super("HMACRIPEMD160", 160, new h());
    }
}
