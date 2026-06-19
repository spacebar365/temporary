package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.security.SignatureException;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.C0581be;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpiLe extends SignatureSpi {
    /* JADX INFO: renamed from: a */
    private static void m4222a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        byte[] bArrMo1410c = AbstractC0655q.m1596a(super.engineSign()).mo1410c();
        m4222a(bArrMo1410c);
        try {
            return new C0581be(bArrMo1410c).mo1578k();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] bArrMo1410c = ((AbstractC0655q) AbstractC0655q.m1692b(bArr)).mo1410c();
            m4222a(bArrMo1410c);
            try {
                return super.engineVerify(new C0581be(bArrMo1410c).mo1578k());
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
