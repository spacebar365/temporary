package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD320$KeyGenerator extends BaseKeyGenerator {
    public RIPEMD320$KeyGenerator() {
        super("HMACRIPEMD320", 320, new h());
    }
}
