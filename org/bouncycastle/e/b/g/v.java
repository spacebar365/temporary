package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class v {
    static u a(k kVar, n nVar, i iVar) {
        i iVar2;
        if (nVar == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (iVar == null) {
            throw new NullPointerException("address == null");
        }
        int iD = kVar.a().d();
        byte[][] bArrA = nVar.a();
        u[] uVarArr = new u[bArrA.length];
        for (int i = 0; i < bArrA.length; i++) {
            uVarArr[i] = new u(0, bArrA[i]);
        }
        i iVar3 = (i) new i$a().d(iVar.e()).a(iVar.f()).a(iVar.b()).b(0).c(iVar.d()).e(iVar.g()).a();
        int i2 = iD;
        while (i2 > 1) {
            int i3 = 0;
            while (true) {
                iVar2 = iVar3;
                if (i3 >= i2 / 2) {
                    break;
                }
                iVar3 = (i) new i$a().d(iVar2.e()).a(iVar2.f()).a(iVar2.b()).b(iVar2.c()).c(i3).e(iVar2.g()).a();
                uVarArr[i3] = a(kVar, uVarArr[i3 * 2], uVarArr[(i3 * 2) + 1], iVar3);
                i3++;
            }
            if (i2 % 2 == 1) {
                uVarArr[i2 / 2] = uVarArr[i2 - 1];
            }
            int iCeil = (int) Math.ceil(((double) i2) / 2.0d);
            iVar3 = (i) new i$a().d(iVar2.e()).a(iVar2.f()).a(iVar2.b()).b(iVar2.c() + 1).c(iVar2.d()).e(iVar2.g()).a();
            i2 = iCeil;
        }
        return uVarArr[0];
    }

    static u a(k kVar, u uVar, u uVar2, o oVar) {
        o oVar2;
        if (uVar == null) {
            throw new NullPointerException("left == null");
        }
        if (uVar2 == null) {
            throw new NullPointerException("right == null");
        }
        if (uVar.a() != uVar2.a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (oVar == null) {
            throw new NullPointerException("address == null");
        }
        byte[] bArrC = kVar.c();
        if (oVar instanceof i) {
            i iVar = (i) oVar;
            oVar2 = (i) new i$a().d(iVar.e()).a(iVar.f()).a(iVar.b()).b(iVar.c()).c(iVar.d()).e(0).a();
        } else if (oVar instanceof g) {
            g gVar = (g) oVar;
            oVar2 = (g) new g$a().d(gVar.e()).a(gVar.f()).a(gVar.b()).b(gVar.c()).e(0).a();
        } else {
            oVar2 = oVar;
        }
        byte[] bArrC2 = kVar.b().c(bArrC, oVar2.a());
        if (oVar2 instanceof i) {
            i iVar2 = (i) oVar2;
            oVar2 = (i) new i$a().d(iVar2.e()).a(iVar2.f()).a(iVar2.b()).b(iVar2.c()).c(iVar2.d()).e(1).a();
        } else if (oVar2 instanceof g) {
            g gVar2 = (g) oVar2;
            oVar2 = (g) new g$a().d(gVar2.e()).a(gVar2.f()).a(gVar2.b()).b(gVar2.c()).e(1).a();
        }
        byte[] bArrC3 = kVar.b().c(bArrC, oVar2.a());
        if (oVar2 instanceof i) {
            i iVar3 = (i) oVar2;
            oVar2 = (i) new i$a().d(iVar3.e()).a(iVar3.f()).a(iVar3.b()).b(iVar3.c()).c(iVar3.d()).e(2).a();
        } else if (oVar2 instanceof g) {
            g gVar3 = (g) oVar2;
            oVar2 = (g) new g$a().d(gVar3.e()).a(gVar3.f()).a(gVar3.b()).b(gVar3.c()).e(2).a();
        }
        byte[] bArrC4 = kVar.b().c(bArrC, oVar2.a());
        int iB = kVar.a().b();
        byte[] bArr = new byte[iB * 2];
        for (int i = 0; i < iB; i++) {
            bArr[i] = (byte) (uVar.b()[i] ^ bArrC3[i]);
        }
        for (int i2 = 0; i2 < iB; i2++) {
            bArr[i2 + iB] = (byte) (uVar2.b()[i2] ^ bArrC4[i2]);
        }
        return new u(uVar.a(), kVar.b().b(bArrC2, bArr));
    }
}
