package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0829f;
import org.bouncycastle.p083b.p097k.C1050ab;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p101n.C1149g;
import org.bouncycastle.p103c.p104a.InterfaceC1185a;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p105b.C1200a;

/* JADX INFO: loaded from: classes.dex */
public class ECGOST2012SignatureSpi256 extends SignatureSpi implements InterfaceC0674n, InterfaceC0760aa {

    /* JADX INFO: renamed from: bQ */
    private int f5769bQ = 64;

    /* JADX INFO: renamed from: bR */
    private int f5770bR = this.f5769bQ / 2;

    /* JADX INFO: renamed from: bO */
    private InterfaceC1175r f5767bO = new C0829f();

    /* JADX INFO: renamed from: bP */
    private InterfaceC1142n f5768bP = new C1149g();

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof InterfaceC1185a)) {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
        }
        C1050ab c1050ab = (C1050ab) ECUtil.m4328a(privateKey);
        if (c1050ab.m2563b().m2701c().bitLength() > 256) {
            throw new InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.f5767bO.mo1931c();
        if (this.appRandom != null) {
            this.f5768bP.mo2715a(true, new C1081bf(c1050ab, this.appRandom));
        } else {
            this.f5768bP.mo2715a(true, c1050ab);
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
        byte[] bArr = new byte[this.f5767bO.mo1930b()];
        this.f5767bO.mo1926a(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.f5769bQ];
            BigInteger[] bigIntegerArrA = this.f5768bP.mo2717a(bArr);
            byte[] byteArray = bigIntegerArrA[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrA[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.f5770bR - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.f5770bR - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.f5769bQ - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.f5769bQ - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5767bO.mo1928a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5767bO.mo1929a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f5767bO.mo1930b()];
        this.f5767bO.mo1926a(bArr2, 0);
        try {
            byte[] bArr3 = new byte[this.f5770bR];
            byte[] bArr4 = new byte[this.f5770bR];
            System.arraycopy(bArr, 0, bArr4, 0, this.f5770bR);
            System.arraycopy(bArr, this.f5770bR, bArr3, 0, this.f5770bR);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.f5768bP.mo2716a(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        C1050ab c1050ab;
        if (publicKey instanceof InterfaceC1187c) {
            c1050ab = (C1050ab) (publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).m4260b() : ECUtil.m4329a(publicKey));
        } else {
            try {
                c1050ab = (C1050ab) ECUtil.m4329a(C1200a.m2849a(C0780u.m1843a(publicKey.getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (c1050ab.m2563b().m2701c().bitLength() > 256) {
            throw new InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.f5767bO.mo1931c();
        this.f5768bP.mo2715a(false, c1050ab);
    }
}
