package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.j;
import org.bouncycastle.b.a;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public class DigestSignatureSpi extends SignatureSpi {
    private r a;
    private a b;
    private org.bouncycastle.a.z.a c;

    protected DigestSignatureSpi(p pVar, r rVar, a aVar) {
        this.a = rVar;
        this.b = aVar;
        this.c = new org.bouncycastle.a.z.a(pVar, bc.a);
    }

    protected DigestSignatureSpi(r rVar, a aVar) {
        this.a = rVar;
        this.b = aVar;
        this.c = null;
    }

    private static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    private byte[] a(byte[] bArr) {
        return this.c == null ? bArr : new j(this.c, bArr).a("DER");
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key (" + a(privateKey) + ") is not a RSAPrivateKey instance");
        }
        bm bmVarA = RSAUtil.a((RSAPrivateKey) privateKey);
        this.a.c();
        this.b.a(true, bmVarA);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key (" + a(publicKey) + ") is not a RSAPublicKey instance");
        }
        bm bmVarA = RSAUtil.a((RSAPublicKey) publicKey);
        this.a.c();
        this.b.a(false, bmVarA);
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
        byte[] bArr = new byte[this.a.b()];
        this.a.a(bArr, 0);
        try {
            byte[] bArrA = a(bArr);
            return this.b.a(bArrA, 0, bArrA.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e2) {
            throw new SignatureException(e2.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.a.a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.a.b()];
        this.a.a(bArr2, 0);
        try {
            byte[] bArrA = this.b.a(bArr, 0, bArr.length);
            byte[] bArrA2 = a(bArr2);
            if (bArrA.length == bArrA2.length) {
                return org.bouncycastle.f.a.b(bArrA, bArrA2);
            }
            if (bArrA.length != bArrA2.length - 2) {
                return false;
            }
            bArrA2[1] = (byte) (bArrA2[1] - 2);
            bArrA2[3] = (byte) (bArrA2[3] - 2);
            int i = bArrA2[3] + 4;
            int i2 = i + 2;
            int i3 = 0;
            for (int i4 = 0; i4 < bArrA2.length - i2; i4++) {
                i3 |= bArrA[i + i4] ^ bArrA2[i2 + i4];
            }
            for (int i5 = 0; i5 < i; i5++) {
                i3 |= bArrA[i5] ^ bArrA2[i5];
            }
            return i3 == 0;
        } catch (Exception e) {
            return false;
        }
    }
}
