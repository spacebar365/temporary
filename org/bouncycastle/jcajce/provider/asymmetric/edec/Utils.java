package org.bouncycastle.jcajce.provider.asymmetric.edec;

import org.bouncycastle.b.k.ah;
import org.bouncycastle.b.k.ak;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bs;
import org.bouncycastle.b.k.bv;
import org.bouncycastle.f.a.f;
import org.bouncycastle.f.c;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
class Utils {
    Utils() {
    }

    static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !a(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    static String a(String str, String str2, b bVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        byte[] bArrB = bVar instanceof bv ? ((bv) bVar).b() : bVar instanceof ak ? ((ak) bVar).b() : bVar instanceof bs ? ((bs) bVar).b() : ((ah) bVar).b();
        stringBuffer.append(str2).append(" ").append(str).append(" [").append(new c(bArrB).toString()).append("]").append(strA).append("    public data: ").append(f.a(bArrB)).append(strA);
        return stringBuffer.toString();
    }
}
