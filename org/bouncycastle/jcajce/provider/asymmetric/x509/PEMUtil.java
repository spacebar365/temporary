package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.a.v;
import org.bouncycastle.f.a.a;

/* JADX INFO: loaded from: classes.dex */
class PEMUtil {
    private final String a;
    private final String b;
    private final String d;
    private final String e;
    private final String c = "-----BEGIN PKCS7-----";
    private final String f = "-----END PKCS7-----";

    PEMUtil(String str) {
        this.a = "-----BEGIN " + str + "-----";
        this.b = "-----BEGIN X509 " + str + "-----";
        this.d = "-----END " + str + "-----";
        this.e = "-----END X509 " + str + "-----";
    }

    private static String b(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i != 13 && i != 10 && i >= 0) {
                stringBuffer.append((char) i);
            } else if (i < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (i == 13) {
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == 10) {
                inputStream.mark(1);
            }
            if (i2 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    final v a(InputStream inputStream) throws IOException {
        String strB;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            strB = b(inputStream);
            if (strB == null || strB.startsWith(this.a) || strB.startsWith(this.b)) {
                break;
            }
        } while (!strB.startsWith(this.c));
        while (true) {
            String strB2 = b(inputStream);
            if (strB2 == null || strB2.startsWith(this.d) || strB2.startsWith(this.e) || strB2.startsWith(this.f)) {
                break;
            }
            stringBuffer.append(strB2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return v.a(a.a(stringBuffer.toString()));
        } catch (Exception e) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
