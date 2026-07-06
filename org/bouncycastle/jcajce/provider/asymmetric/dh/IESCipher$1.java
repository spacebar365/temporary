package org.bouncycastle.jcajce.provider.asymmetric.dh;

import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.f;
import org.bouncycastle.b.k.k;
import org.bouncycastle.b.w;

/* JADX INFO: loaded from: classes.dex */
class IESCipher$1 implements w {
    final /* synthetic */ IESCipher a;

    IESCipher$1(IESCipher iESCipher) {
        this.a = iESCipher;
    }

    @Override // org.bouncycastle.b.w
    public final byte[] a(b bVar) {
        byte[] bArr = new byte[(((f) bVar).b().a().bitLength() + 7) / 8];
        byte[] bArrA = org.bouncycastle.f.b.a(((k) bVar).c());
        if (bArrA.length > bArr.length) {
            throw new IllegalArgumentException("Senders's public key longer than expected.");
        }
        System.arraycopy(bArrA, 0, bArr, bArr.length - bArrA.length, bArrA.length);
        return bArr;
    }
}
