package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.b.m;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.h.g;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.z;
import org.bouncycastle.f.a;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public class TLSKDF {
    static /* synthetic */ void a(z zVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        b(zVar, bArr, bArr2, bArr3);
    }

    private static void b(z zVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        zVar.a(new ba(bArr));
        int iB = zVar.b();
        int length = ((bArr3.length + iB) - 1) / iB;
        byte[] bArr4 = new byte[zVar.b()];
        byte[] bArr5 = new byte[zVar.b()];
        int i = 0;
        byte[] bArr6 = bArr2;
        while (i < length) {
            zVar.a(bArr6, 0, bArr6.length);
            zVar.a(bArr4, 0);
            zVar.a(bArr4, 0, bArr4.length);
            zVar.a(bArr2, 0, bArr2.length);
            zVar.a(bArr5, 0);
            System.arraycopy(bArr5, 0, bArr3, iB * i, Math.min(iB, bArr3.length - (iB * i)));
            i++;
            bArr6 = bArr4;
        }
    }

    static /* synthetic */ byte[] a(TLSKeyMaterialSpec tLSKeyMaterialSpec) {
        g gVar = new g(new m());
        g gVar2 = new g(new s());
        byte[] bArrD = a.d(k.d(tLSKeyMaterialSpec.a()), tLSKeyMaterialSpec.d());
        byte[] bArrC = tLSKeyMaterialSpec.c();
        int length = (bArrC.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrC, 0, bArr, 0, length);
        System.arraycopy(bArrC, bArrC.length - length, bArr2, 0, length);
        int iB = tLSKeyMaterialSpec.b();
        byte[] bArr3 = new byte[iB];
        byte[] bArr4 = new byte[iB];
        b(gVar, bArr, bArrD, bArr3);
        b(gVar2, bArr2, bArrD, bArr4);
        for (int i = 0; i < iB; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr4[i]);
        }
        return bArr3;
    }
}
