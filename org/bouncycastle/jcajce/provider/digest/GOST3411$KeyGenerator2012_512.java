package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411$KeyGenerator2012_512 extends BaseKeyGenerator {
    public GOST3411$KeyGenerator2012_512() {
        super("HMACGOST3411", 512, new h());
    }
}
