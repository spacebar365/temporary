package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD128$KeyGenerator extends BaseKeyGenerator {
    public RIPEMD128$KeyGenerator() {
        super("HMACRIPEMD128", 128, new h());
    }
}
