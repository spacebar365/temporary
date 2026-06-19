package org.bouncycastle.jcajce.provider.asymmetric.edec;

import org.bouncycastle.p083b.p097k.C1056ah;
import org.bouncycastle.p083b.p097k.C1059ak;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1094bs;
import org.bouncycastle.p083b.p097k.C1097bv;
import org.bouncycastle.p142f.C1552c;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: loaded from: classes.dex */
class Utils {
    Utils() {
    }

    /* JADX INFO: renamed from: a */
    static boolean m4276a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !m4276a(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    /* JADX INFO: renamed from: a */
    static String m4275a(String str, String str2, C1075b c1075b) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        byte[] bArrM2648b = c1075b instanceof C1097bv ? ((C1097bv) c1075b).m2648b() : c1075b instanceof C1059ak ? ((C1059ak) c1075b).m2576b() : c1075b instanceof C1094bs ? ((C1094bs) c1075b).m2643b() : ((C1056ah) c1075b).m2571b();
        stringBuffer.append(str2).append(" ").append(str).append(" [").append(new C1552c(bArrM2648b).toString()).append("]").append(strM4158a).append("    public data: ").append(C1541f.m4105a(bArrM2648b)).append(strM4158a);
        return stringBuffer.toString();
    }
}
