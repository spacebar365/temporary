package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.be;
import org.bouncycastle.a.q;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.n.d;
import org.bouncycastle.b.r;
import org.bouncycastle.c.a.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends java.security.SignatureSpi implements n, aa {
    private r bO;
    private org.bouncycastle.b.n bP = new d();

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i * 2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[(i * 2) + 1] = (byte) (bArr[i] & 15);
        }
        return bArr2;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b bVarA = null;
        if ((privateKey instanceof BCDSTU4145PrivateKey) || (privateKey instanceof a)) {
            bVarA = ECUtil.a(privateKey);
            this.bO = new org.bouncycastle.b.b.d(a(org.bouncycastle.a.w.d.d()));
        }
        if (this.appRandom != null) {
            this.bP.a(true, new bf(bVarA, this.appRandom));
        } else {
            this.bP.a(true, bVarA);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        i iVarA;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            iVarA = ((BCDSTU4145PublicKey) publicKey).d();
            this.bO = new org.bouncycastle.b.b.d(a(((BCDSTU4145PublicKey) publicKey).b()));
        } else {
            iVarA = ECUtil.a(publicKey);
            this.bO = new org.bouncycastle.b.b.d(a(org.bouncycastle.a.w.d.d()));
        }
        this.bP.a(false, iVarA);
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
            byte[] byteArray = bigIntegerArrA[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrA[1].toByteArray();
            byte[] bArr2 = new byte[byteArray.length > byteArray2.length ? byteArray.length * 2 : byteArray2.length * 2];
            System.arraycopy(byteArray2, 0, bArr2, (bArr2.length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
            return new be(bArr2).k();
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
            byte[] bArrC = ((q) q.b(bArr)).c();
            byte[] bArr3 = new byte[bArrC.length / 2];
            byte[] bArr4 = new byte[bArrC.length / 2];
            System.arraycopy(bArrC, 0, bArr4, 0, bArrC.length / 2);
            System.arraycopy(bArrC, bArrC.length / 2, bArr3, 0, bArrC.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.bP.a(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
