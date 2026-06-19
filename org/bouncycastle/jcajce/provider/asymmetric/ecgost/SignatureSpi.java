package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0827d;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p101n.C1148f;
import org.bouncycastle.p103c.p104a.InterfaceC1185a;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p104a.InterfaceC1191g;
import org.bouncycastle.p103c.p105b.C1200a;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends java.security.SignatureSpi implements InterfaceC0674n, InterfaceC0760aa {

    /* JADX INFO: renamed from: bO */
    private InterfaceC1175r f5755bO = new C0827d();

    /* JADX INFO: renamed from: bP */
    private InterfaceC1142n f5756bP = new C1148f();

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        C1075b c1075bM4328a = privateKey instanceof InterfaceC1185a ? ECUtil.m4328a(privateKey) : GOST3410Util.m4335a(privateKey);
        this.f5755bO.mo1931c();
        if (this.appRandom != null) {
            this.f5756bP.mo2715a(true, new C1081bf(c1075bM4328a, this.appRandom));
        } else {
            this.f5756bP.mo2715a(true, c1075bM4328a);
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
        byte[] bArr = new byte[this.f5755bO.mo1930b()];
        this.f5755bO.mo1926a(bArr, 0);
        try {
            byte[] bArr2 = new byte[64];
            BigInteger[] bigIntegerArrA = this.f5756bP.mo2717a(bArr);
            byte[] byteArray = bigIntegerArrA[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrA[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, 32 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, 64 - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, 64 - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5755bO.mo1928a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5755bO.mo1929a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f5755bO.mo1930b()];
        this.f5755bO.mo1926a(bArr2, 0);
        try {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            System.arraycopy(bArr, 32, bArr3, 0, 32);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.f5756bP.mo2716a(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        InterfaceC1003i interfaceC1003iM4329a;
        if (publicKey instanceof InterfaceC1187c) {
            interfaceC1003iM4329a = publicKey instanceof BCECGOST3410PublicKey ? ((BCECGOST3410PublicKey) publicKey).m4248b() : ECUtil.m4329a(publicKey);
        } else if (publicKey instanceof InterfaceC1191g) {
            interfaceC1003iM4329a = GOST3410Util.m4336a(publicKey);
        } else {
            try {
                interfaceC1003iM4329a = ECUtil.m4329a(C1200a.m2849a(C0780u.m1843a(publicKey.getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        this.f5755bO.mo1931c();
        this.f5756bP.mo2715a(false, interfaceC1003iM4329a);
    }
}
