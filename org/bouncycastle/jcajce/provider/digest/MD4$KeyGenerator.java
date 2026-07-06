package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class MD4$KeyGenerator extends BaseKeyGenerator {
    public MD4$KeyGenerator() {
        super("HMACMD4", 128, new h());
    }
}
