package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p078w.C0744d;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0827d;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p101n.C1146d;
import org.bouncycastle.p103c.p104a.InterfaceC1185a;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends java.security.SignatureSpi implements InterfaceC0674n, InterfaceC0760aa {

    /* JADX INFO: renamed from: bO */
    private InterfaceC1175r f5673bO;

    /* JADX INFO: renamed from: bP */
    private InterfaceC1142n f5674bP = new C1146d();

    /* JADX INFO: renamed from: a */
    private static byte[] m4221a(byte[] bArr) {
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
        C1075b c1075bM4328a = null;
        if ((privateKey instanceof BCDSTU4145PrivateKey) || (privateKey instanceof InterfaceC1185a)) {
            c1075bM4328a = ECUtil.m4328a(privateKey);
            this.f5673bO = new C0827d(m4221a(C0744d.m1731d()));
        }
        if (this.appRandom != null) {
            this.f5674bP.mo2715a(true, new C1081bf(c1075bM4328a, this.appRandom));
        } else {
            this.f5674bP.mo2715a(true, c1075bM4328a);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        InterfaceC1003i interfaceC1003iM4329a;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            interfaceC1003iM4329a = ((BCDSTU4145PublicKey) publicKey).m4220d();
            this.f5673bO = new C0827d(m4221a(((BCDSTU4145PublicKey) publicKey).m4219b()));
        } else {
            interfaceC1003iM4329a = ECUtil.m4329a(publicKey);
            this.f5673bO = new C0827d(m4221a(C0744d.m1731d()));
        }
        this.f5674bP.mo2715a(false, interfaceC1003iM4329a);
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
        byte[] bArr = new byte[this.f5673bO.mo1930b()];
        this.f5673bO.mo1926a(bArr, 0);
        try {
            BigInteger[] bigIntegerArrA = this.f5674bP.mo2717a(bArr);
            byte[] byteArray = bigIntegerArrA[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrA[1].toByteArray();
            byte[] bArr2 = new byte[byteArray.length > byteArray2.length ? byteArray.length * 2 : byteArray2.length * 2];
            System.arraycopy(byteArray2, 0, bArr2, (bArr2.length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
            return new C0581be(bArr2).mo1578k();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5673bO.mo1928a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5673bO.mo1929a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f5673bO.mo1930b()];
        this.f5673bO.mo1926a(bArr2, 0);
        try {
            byte[] bArrMo1410c = ((AbstractC0655q) AbstractC0655q.m1692b(bArr)).mo1410c();
            byte[] bArr3 = new byte[bArrMo1410c.length / 2];
            byte[] bArr4 = new byte[bArrMo1410c.length / 2];
            System.arraycopy(bArrMo1410c, 0, bArr4, 0, bArrMo1410c.length / 2);
            System.arraycopy(bArrMo1410c, bArrMo1410c.length / 2, bArr3, 0, bArrMo1410c.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.f5674bP.mo2716a(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
