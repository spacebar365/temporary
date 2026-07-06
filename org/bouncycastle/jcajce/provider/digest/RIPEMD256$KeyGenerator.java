package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD256$KeyGenerator extends BaseKeyGenerator {
    public RIPEMD256$KeyGenerator() {
        super("HMACRIPEMD256", 256, new h());
    }
}
