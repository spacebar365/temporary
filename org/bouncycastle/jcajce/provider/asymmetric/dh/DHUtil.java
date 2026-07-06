package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import org.bouncycastle.b.k.i;
import org.bouncycastle.f.a;
import org.bouncycastle.f.c;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
class DHUtil {
    DHUtil() {
    }

    static String a(String str, BigInteger bigInteger, i iVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        BigInteger bigIntegerModPow = iVar.b().modPow(bigInteger, iVar.a());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(a(bigIntegerModPow, iVar)).append("]").append(strA);
        stringBuffer.append("              Y: ").append(bigIntegerModPow.toString(16)).append(strA);
        return stringBuffer.toString();
    }

    private static String a(BigInteger bigInteger, i iVar) {
        return new c(a.a(bigInteger.toByteArray(), iVar.a().toByteArray(), iVar.b().toByteArray())).toString();
    }

    static String b(String str, BigInteger bigInteger, i iVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(a(bigInteger, iVar)).append("]").append(strA);
        stringBuffer.append("             Y: ").append(bigInteger.toString(16)).append(strA);
        return stringBuffer.toString();
    }
}
