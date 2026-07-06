package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.b.f;
import org.bouncycastle.b.k.ab;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.n.g;
import org.bouncycastle.b.r;
import org.bouncycastle.c.a.a;
import org.bouncycastle.c.a.c;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes.dex */
public class ECGOST2012SignatureSpi256 extends SignatureSpi implements n, aa {
    private int bQ = 64;
    private int bR = this.bQ / 2;
    private r bO = new f();
    private org.bouncycastle.b.n bP = new g();

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof a)) {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
        }
        ab abVar = (ab) ECUtil.a(privateKey);
        if (abVar.b().c().bitLength() > 256) {
            throw new InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.bO.c();
        if (this.appRandom != null) {
            this.bP.a(true, new bf(abVar, this.appRandom));
        } else {
            this.bP.a(true, abVar);
        }
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
            byte[] bArr2 = new byte[this.bQ];
            BigInteger[] bigIntegerArrA = this.bP.a(bArr);
            byte[] byteArray = bigIntegerArrA[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrA[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.bR - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.bR - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.bQ - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.bQ - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
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
            byte[] bArr3 = new byte[this.bR];
            byte[] bArr4 = new byte[this.bR];
            System.arraycopy(bArr, 0, bArr4, 0, this.bR);
            System.arraycopy(bArr, this.bR, bArr3, 0, this.bR);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.bP.a(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        ab abVar;
        if (publicKey instanceof c) {
            abVar = (ab) (publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).b() : ECUtil.a(publicKey));
        } else {
            try {
                abVar = (ab) ECUtil.a(org.bouncycastle.c.b.a.a(u.a(publicKey.getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (abVar.b().c().bitLength() > 256) {
            throw new InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.bO.c();
        this.bP.a(false, abVar);
    }
}
