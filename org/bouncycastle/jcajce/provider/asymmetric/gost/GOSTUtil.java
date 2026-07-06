package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import org.bouncycastle.b.k.as;
import org.bouncycastle.f.a;
import org.bouncycastle.f.c;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
class GOSTUtil {
    GOSTUtil() {
    }

    static String a(String str, BigInteger bigInteger, as asVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        BigInteger bigIntegerModPow = asVar.c().modPow(bigInteger, asVar.a());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(a(bigIntegerModPow, asVar)).append("]").append(strA);
        stringBuffer.append("                  Y: ").append(bigIntegerModPow.toString(16)).append(strA);
        return stringBuffer.toString();
    }

    private static String a(BigInteger bigInteger, as asVar) {
        return new c(a.a(bigInteger.toByteArray(), asVar.a().toByteArray(), asVar.c().toByteArray())).toString();
    }

    static String b(String str, BigInteger bigInteger, as asVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(a(bigInteger, asVar)).append("]").append(strA);
        stringBuffer.append("                 Y: ").append(bigInteger.toString(16)).append(strA);
        return stringBuffer.toString();
    }
}
