package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class MD2$KeyGenerator extends BaseKeyGenerator {
    public MD2$KeyGenerator() {
        super("HMACMD2", 128, new h());
    }
}
