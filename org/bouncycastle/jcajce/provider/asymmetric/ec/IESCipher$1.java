package org.bouncycastle.jcajce.provider.asymmetric.ec;

import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.w;

/* JADX INFO: loaded from: classes.dex */
class IESCipher$1 implements w {
    final /* synthetic */ boolean a;
    final /* synthetic */ IESCipher b;

    IESCipher$1(IESCipher iESCipher, boolean z) {
        this.b = iESCipher;
        this.a = z;
    }

    @Override // org.bouncycastle.b.w
    public final byte[] a(b bVar) {
        return ((ae) bVar).c().a(this.a);
    }
}
