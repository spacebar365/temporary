package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class MD5$KeyGenerator extends BaseKeyGenerator {
    public MD5$KeyGenerator() {
        super("HMACMD5", 128, new h());
    }
}
