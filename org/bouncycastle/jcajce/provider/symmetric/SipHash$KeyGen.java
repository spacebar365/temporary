package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SipHash$KeyGen extends BaseKeyGenerator {
    public SipHash$KeyGen() {
        super("SipHash", 128, new h());
    }
}
