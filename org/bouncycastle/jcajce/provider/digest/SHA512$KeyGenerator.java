package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA512$KeyGenerator extends BaseKeyGenerator {
    public SHA512$KeyGenerator() {
        super("HMACSHA512", 512, new h());
    }
}
