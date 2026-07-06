package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.n.a;
import org.bouncycastle.b.n.s;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public class DSASigner extends SignatureSpi implements n, aa {
    private r bO;
    private org.bouncycastle.b.n bP;
    private a bQ = s.a;
    private SecureRandom bR;

    protected DSASigner(r rVar, org.bouncycastle.b.n nVar) {
        this.bO = rVar;
        this.bP = nVar;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b bVarA = DSAUtil.a(privateKey);
        i bfVar = this.bR != null ? new bf(bVarA, this.bR) : bVarA;
        this.bO.c();
        this.bP.a(true, bfVar);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.bR = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        b bVarA = DSAUtil.a(publicKey);
        this.bO.c();
        this.bP.a(false, bVarA);
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
