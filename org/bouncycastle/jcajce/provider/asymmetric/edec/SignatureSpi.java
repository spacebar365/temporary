package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.b.ak;
import org.bouncycastle.b.k.aj;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.n.i;
import org.bouncycastle.b.n.j;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] a = new byte[0];
    private final String b;
    private ak c;

    SignatureSpi(String str) {
        this.b = str;
    }

    private ak a(String str) throws InvalidKeyException {
        if (this.b == null || str.equals(this.b)) {
            return str.equals("Ed448") ? new j(a) : new i();
        }
        throw new InvalidKeyException("inappropriate key for " + this.b);
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCEdDSAPrivateKey)) {
            throw new InvalidKeyException("cannot identify EdDSA public key");
        }
        b bVarA = ((BCEdDSAPrivateKey) privateKey).a();
        if (bVarA instanceof aj) {
            this.c = a("Ed448");
        } else {
            this.c = a("Ed25519");
        }
        this.c.a(true, bVarA);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCEdDSAPublicKey)) {
            throw new InvalidKeyException("cannot identify EdDSA public key");
        }
        b bVarA = ((BCEdDSAPublicKey) publicKey).a();
        if (bVarA instanceof org.bouncycastle.b.k.ak) {
            this.c = a("Ed448");
        } else {
            this.c = a("Ed25519");
        }
        this.c.a(false, bVarA);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.c.a();
        } catch (org.bouncycastle.b.j e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.c.a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.c.a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.c.a(bArr);
    }
}
