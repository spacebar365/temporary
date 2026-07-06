package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class XTEA$KeyGen extends BaseKeyGenerator {
    public XTEA$KeyGen() {
        super("XTEA", 128, new h());
    }
}
