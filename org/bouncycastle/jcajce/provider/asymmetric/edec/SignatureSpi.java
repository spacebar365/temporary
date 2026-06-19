package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.p083b.C1038j;
import org.bouncycastle.p083b.InterfaceC0811ak;
import org.bouncycastle.p083b.p097k.C1058aj;
import org.bouncycastle.p083b.p097k.C1059ak;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p101n.C1151i;
import org.bouncycastle.p083b.p101n.C1152j;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends java.security.SignatureSpi {

    /* JADX INFO: renamed from: a */
    private static final byte[] f5811a = new byte[0];

    /* JADX INFO: renamed from: b */
    private final String f5812b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0811ak f5813c;

    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    SignatureSpi(String str) {
        this.f5812b = str;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0811ak m4274a(String str) throws InvalidKeyException {
        if (this.f5812b == null || str.equals(this.f5812b)) {
            return str.equals("Ed448") ? new C1152j(f5811a) : new C1151i();
        }
        throw new InvalidKeyException("inappropriate key for " + this.f5812b);
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
        C1075b c1075bM4266a = ((BCEdDSAPrivateKey) privateKey).m4266a();
        if (c1075bM4266a instanceof C1058aj) {
            this.f5813c = m4274a("Ed448");
        } else {
            this.f5813c = m4274a("Ed25519");
        }
        this.f5813c.mo1904a(true, c1075bM4266a);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCEdDSAPublicKey)) {
            throw new InvalidKeyException("cannot identify EdDSA public key");
        }
        C1075b c1075bM4267a = ((BCEdDSAPublicKey) publicKey).m4267a();
        if (c1075bM4267a instanceof C1059ak) {
            this.f5813c = m4274a("Ed448");
        } else {
            this.f5813c = m4274a("Ed25519");
        }
        this.f5813c.mo1904a(false, c1075bM4267a);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.f5813c.mo1907a();
        } catch (C1038j e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5813c.mo1903a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5813c.mo1905a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.f5813c.mo1906a(bArr);
    }
}
