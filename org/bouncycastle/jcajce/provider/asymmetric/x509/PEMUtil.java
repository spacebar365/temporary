package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p142f.p143a.C1536a;

/* JADX INFO: loaded from: classes.dex */
class PEMUtil {

    /* JADX INFO: renamed from: a */
    private final String f5935a;

    /* JADX INFO: renamed from: b */
    private final String f5936b;

    /* JADX INFO: renamed from: d */
    private final String f5938d;

    /* JADX INFO: renamed from: e */
    private final String f5939e;

    /* JADX INFO: renamed from: c */
    private final String f5937c = "-----BEGIN PKCS7-----";

    /* JADX INFO: renamed from: f */
    private final String f5940f = "-----END PKCS7-----";

    PEMUtil(String str) {
        this.f5935a = "-----BEGIN " + str + "-----";
        this.f5936b = "-----BEGIN X509 " + str + "-----";
        this.f5938d = "-----END " + str + "-----";
        this.f5939e = "-----END X509 " + str + "-----";
    }

    /* JADX INFO: renamed from: b */
    private static String m4348b(InputStream inputStream) throws IOException {
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

    /* JADX INFO: renamed from: a */
    final AbstractC0723v m4349a(InputStream inputStream) throws IOException {
        String strM4348b;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            strM4348b = m4348b(inputStream);
            if (strM4348b == null || strM4348b.startsWith(this.f5935a) || strM4348b.startsWith(this.f5936b)) {
                break;
            }
        } while (!strM4348b.startsWith(this.f5937c));
        while (true) {
            String strM4348b2 = m4348b(inputStream);
            if (strM4348b2 == null || strM4348b2.startsWith(this.f5938d) || strM4348b2.startsWith(this.f5939e) || strM4348b2.startsWith(this.f5940f)) {
                break;
            }
            stringBuffer.append(strM4348b2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return AbstractC0723v.m1708a(C1536a.m4097a(stringBuffer.toString()));
        } catch (Exception e) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
