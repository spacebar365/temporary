package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class XSalsa20$KeyGen extends BaseKeyGenerator {
    public XSalsa20$KeyGen() {
        super("XSalsa20", 256, new h());
    }
}
