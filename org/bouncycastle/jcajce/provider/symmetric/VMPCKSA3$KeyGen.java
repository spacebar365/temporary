package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class VMPCKSA3$KeyGen extends BaseKeyGenerator {
    public VMPCKSA3$KeyGen() {
        super("VMPC-KSA3", 128, new h());
    }
}
