package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA1$KeyGenerator extends BaseKeyGenerator {
    public SHA1$KeyGenerator() {
        super("HMACSHA1", 160, new h());
    }
}
