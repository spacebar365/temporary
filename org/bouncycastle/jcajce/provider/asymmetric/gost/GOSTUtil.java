package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import org.bouncycastle.p083b.p097k.C1067as;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1552c;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
class GOSTUtil {
    GOSTUtil() {
    }

    /* JADX INFO: renamed from: a */
    static String m4283a(String str, BigInteger bigInteger, C1067as c1067as) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        BigInteger bigIntegerModPow = c1067as.m2588c().modPow(bigInteger, c1067as.m2586a());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(m4284a(bigIntegerModPow, c1067as)).append("]").append(strM4158a);
        stringBuffer.append("                  Y: ").append(bigIntegerModPow.toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m4284a(BigInteger bigInteger, C1067as c1067as) {
        return new C1552c(C1535a.m4079a(bigInteger.toByteArray(), c1067as.m2586a().toByteArray(), c1067as.m2588c().toByteArray())).toString();
    }

    /* JADX INFO: renamed from: b */
    static String m4285b(String str, BigInteger bigInteger, C1067as c1067as) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(m4284a(bigInteger, c1067as)).append("]").append(strM4158a);
        stringBuffer.append("                 Y: ").append(bigInteger.toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }
}
