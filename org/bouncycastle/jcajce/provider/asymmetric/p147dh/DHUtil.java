package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.math.BigInteger;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1552c;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
class DHUtil {
    DHUtil() {
    }

    /* JADX INFO: renamed from: a */
    static String m4198a(String str, BigInteger bigInteger, C1106i c1106i) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        BigInteger bigIntegerModPow = c1106i.m2665b().modPow(bigInteger, c1106i.m2664a());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(m4199a(bigIntegerModPow, c1106i)).append("]").append(strM4158a);
        stringBuffer.append("              Y: ").append(bigIntegerModPow.toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m4199a(BigInteger bigInteger, C1106i c1106i) {
        return new C1552c(C1535a.m4079a(bigInteger.toByteArray(), c1106i.m2664a().toByteArray(), c1106i.m2665b().toByteArray())).toString();
    }

    /* JADX INFO: renamed from: b */
    static String m4200b(String str, BigInteger bigInteger, C1106i c1106i) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(m4199a(bigInteger, c1106i)).append("]").append(strM4158a);
        stringBuffer.append("             Y: ").append(bigInteger.toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }
}
