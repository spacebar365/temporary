package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.security.SignatureException;
import org.bouncycastle.a.be;
import org.bouncycastle.a.q;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpiLe extends SignatureSpi {
    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        byte[] bArrC = q.a(super.engineSign()).c();
        a(bArrC);
        try {
            return new be(bArrC).k();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] bArrC = ((q) q.b(bArr)).c();
            a(bArrC);
            try {
                return super.engineVerify(new be(bArrC).k());
            } catch (SignatureException e) {
                throw e;
            } catch (Exception e2) {
                throw new SignatureException(e2.toString());
            }
        } catch (IOException e3) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
