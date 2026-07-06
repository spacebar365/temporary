package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.b.n.a;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class DSABase extends SignatureSpi implements n, aa {
    protected r bO;
    protected org.bouncycastle.b.n bP;
    protected a bQ;

    protected DSABase(r rVar, org.bouncycastle.b.n nVar, a aVar) {
        this.bO = rVar;
        this.bP = nVar;
        this.bQ = aVar;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.bO.b()];
        this.bO.a(bArr, 0);
        try {
            BigInteger[] bigIntegerArrA = this.bP.a(bArr);
            return this.bQ.a(this.bP.a(), bigIntegerArrA[0], bigIntegerArrA[1]);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.bO.a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.bO.a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.bO.b()];
        this.bO.a(bArr2, 0);
        try {
            BigInteger[] bigIntegerArrA = this.bQ.a(this.bP.a(), bArr);
            return this.bP.a(bArr2, bigIntegerArrA[0], bigIntegerArrA[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
