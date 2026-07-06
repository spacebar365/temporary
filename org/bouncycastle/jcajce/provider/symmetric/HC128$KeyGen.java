package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class HC128$KeyGen extends BaseKeyGenerator {
    public HC128$KeyGen() {
        super("HC128", 128, new h());
    }
}
