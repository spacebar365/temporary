package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class VMPC$KeyGen extends BaseKeyGenerator {
    public VMPC$KeyGen() {
        super("VMPC", 128, new h());
    }
}
