package org.bouncycastle.e.b.f;

import java.io.IOException;
import org.bouncycastle.a.be;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.x;
import org.bouncycastle.e.a.h;
import org.bouncycastle.e.a.i;
import org.bouncycastle.e.a.j;
import org.bouncycastle.e.a.k;
import org.bouncycastle.e.a.m;
import org.bouncycastle.e.b.g.aa;
import org.bouncycastle.e.b.g.s;
import org.bouncycastle.e.b.g.y;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static p a(org.bouncycastle.b.k.b bVar, x xVar) throws IOException {
        if (bVar instanceof org.bouncycastle.e.b.c.a) {
            org.bouncycastle.e.b.c.a aVar = (org.bouncycastle.e.b.c.a) bVar;
            return new p(e.a(aVar.b()), new be(aVar.c()), xVar);
        }
        if (bVar instanceof org.bouncycastle.e.b.e.b) {
            org.bouncycastle.e.b.e.b bVar2 = (org.bouncycastle.e.b.e.b) bVar;
            return new p(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.r, new h(e.a(bVar2.b()))), new be(bVar2.c()));
        }
        if (bVar instanceof org.bouncycastle.e.b.b.a) {
            org.bouncycastle.a.z.a aVar2 = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.v);
            short[] sArrB = ((org.bouncycastle.e.b.b.a) bVar).b();
            byte[] bArr = new byte[sArrB.length * 2];
            for (int i = 0; i != sArrB.length; i++) {
                short s = sArrB[i];
                int i2 = i * 2;
                bArr[i2] = (byte) s;
                bArr[i2 + 1] = (byte) (s >>> 8);
            }
            return new p(aVar2, new be(bArr));
        }
        if (bVar instanceof y) {
            y yVar = (y) bVar;
            org.bouncycastle.a.z.a aVar3 = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.w, new i(yVar.d().d(), e.b(yVar.b())));
            byte[] bArrC = yVar.c();
            int iB = yVar.d().b();
            int iD = yVar.d().d();
            int iA = (int) aa.a(bArrC, 4);
            if (!aa.a(iD, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] bArrA = aa.a(bArrC, 4, iB);
            int i3 = iB + 4;
            byte[] bArrA2 = aa.a(bArrC, i3, iB);
            int i4 = i3 + iB;
            byte[] bArrA3 = aa.a(bArrC, i4, iB);
            int i5 = i4 + iB;
            byte[] bArrA4 = aa.a(bArrC, i5, iB);
            int i6 = iB + i5;
            return new p(aVar3, new m(iA, bArrA, bArrA2, bArrA3, bArrA4, aa.a(bArrC, i6, bArrC.length - i6)));
        }
        if (!(bVar instanceof s)) {
            throw new IOException("key parameters not recognized");
        }
        s sVar = (s) bVar;
        org.bouncycastle.a.z.a aVar4 = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.F, new j(sVar.d().a(), sVar.d().b(), e.b(sVar.b())));
        byte[] bArrC2 = sVar.c();
        int iE = sVar.d().e();
        int iA2 = sVar.d().a();
        int i7 = (iA2 + 7) / 8;
        int iA3 = (int) aa.a(bArrC2, i7);
        if (!aa.a(iA2, iA3)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        int i8 = i7 + 0;
        byte[] bArrA5 = aa.a(bArrC2, i8, iE);
        int i9 = i8 + iE;
        byte[] bArrA6 = aa.a(bArrC2, i9, iE);
        int i10 = i9 + iE;
        byte[] bArrA7 = aa.a(bArrC2, i10, iE);
        int i11 = i10 + iE;
        byte[] bArrA8 = aa.a(bArrC2, i11, iE);
        int i12 = iE + i11;
        return new p(aVar4, new k(iA3, bArrA5, bArrA6, bArrA7, bArrA8, aa.a(bArrC2, i12, bArrC2.length - i12)));
    }
}
