package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.b.a.i;
import org.bouncycastle.b.a.j;
import org.bouncycastle.b.a.k;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bu;
import org.bouncycastle.b.k.bw;
import org.bouncycastle.b.k.bx;
import org.bouncycastle.b.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private ai d;
    private DHUParameterSpec e;
    private byte[] f;

    KeyAgreementSpi(String str) {
        super(str, null);
    }

    KeyAgreementSpi(String str, p pVar) {
        super(str, pVar);
    }

    private ai a(String str) throws InvalidKeyException {
        if (this.a.equals("XDH") || this.a.startsWith(str)) {
            return this.a.indexOf(85) > 0 ? str.startsWith("X448") ? new k(new j()) : new k(new i()) : str.startsWith("X448") ? new j() : new i();
        }
        throw new InvalidKeyException("inappropriate key for " + this.a);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected final byte[] a() {
        return this.f;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.d == null) {
            throw new IllegalStateException(this.a + " not initialised.");
        }
        if (!z) {
            throw new IllegalStateException(this.a + " can only be between two parties.");
        }
        if (!(key instanceof BCXDHPublicKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        b bVarA = ((BCXDHPublicKey) key).a();
        this.f = new byte[this.d.a()];
        if (this.e != null) {
            this.d.a(new bx(bVarA, ((BCXDHPublicKey) this.e.c()).a()), this.f, 0);
            return null;
        }
        this.d.a(bVarA, this.f, 0);
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof BCXDHPrivateKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        b bVarA = ((BCXDHPrivateKey) key).a();
        if (bVarA instanceof bu) {
            this.d = a("X448");
        } else {
            this.d = a("X25519");
        }
        this.d.a(bVarA);
        if (this.b != null) {
            this.c = new byte[0];
        } else {
            this.c = null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof BCXDHPrivateKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        b bVarA = ((BCXDHPrivateKey) key).a();
        if (bVarA instanceof bu) {
            this.d = a("X448");
        } else {
            this.d = a("X25519");
        }
        this.c = null;
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            this.d.a(bVarA);
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.b == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.c = ((UserKeyingMaterialSpec) algorithmParameterSpec).a();
        } else {
            if (this.a.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.e = (DHUParameterSpec) algorithmParameterSpec;
            this.c = this.e.d();
            this.d.a(new bw(bVarA, ((BCXDHPrivateKey) this.e.a()).a(), ((BCXDHPublicKey) this.e.b()).a()));
        }
        if (this.b == null || this.c != null) {
            return;
        }
        this.c = new byte[0];
    }
}
