package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.a.s.n;
import org.bouncycastle.b.a;
import org.bouncycastle.b.i;
import org.bouncycastle.b.j;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.n.o;
import org.bouncycastle.b.r;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi extends SignatureSpi {
    private final JcaJceHelper a;
    private AlgorithmParameters b;
    private PSSParameterSpec c;
    private PSSParameterSpec d;
    private a e;
    private r f;
    private r g;
    private int h;
    private byte i;
    private boolean j;
    private bm k;
    private o l;
    private boolean m;

    protected PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec) {
        this(aVar, pSSParameterSpec, false);
    }

    protected PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.a = new BCJcaJceHelper();
        this.m = true;
        this.e = aVar;
        this.d = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.c = PSSParameterSpec.DEFAULT;
        } else {
            this.c = pSSParameterSpec;
        }
        this.g = DigestFactory.a(this.c.getDigestAlgorithm());
        this.h = this.c.getSaltLength();
        this.i = a(this.c.getTrailerField());
        this.j = z;
        a();
    }

    private static byte a(int i) {
        if (i == 1) {
            return (byte) -68;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void a() {
        if (this.j) {
            this.f = new PSSSignatureSpi$NullPssDigest(this, this.g);
        } else {
            this.f = this.g;
        }
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.b == null && this.c != null) {
            try {
                this.b = this.a.c("PSS");
                this.b.init(this.c);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.b;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.k = RSAUtil.a((RSAPrivateKey) privateKey);
        this.l = new o(this.e, this.f, this.g, this.h, this.i);
        this.l.a(true, (i) this.k);
        this.m = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.k = RSAUtil.a((RSAPrivateKey) privateKey);
        this.l = new o(this.e, this.f, this.g, this.h, this.i);
        this.l.a(true, (i) new bf(this.k, secureRandom));
        this.m = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        }
        this.k = RSAUtil.a((RSAPublicKey) publicKey);
        this.l = new o(this.e, this.f, this.g, this.h, this.i);
        this.l.a(false, (i) this.k);
        this.m = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec2;
        if (algorithmParameterSpec != null) {
            algorithmParameterSpec2 = algorithmParameterSpec;
        } else if (this.d == null) {
            return;
        } else {
            algorithmParameterSpec2 = this.d;
        }
        if (!this.m) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec2 instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec2;
        if (this.d != null && !DigestFactory.a(this.d.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + this.d.getDigestAlgorithm());
        }
        if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !pSSParameterSpec.getMGFAlgorithm().equals(n.j_.b())) {
            throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
        }
        if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown MGF parameters");
        }
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
        if (!DigestFactory.a(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
        }
        r rVarA = DigestFactory.a(mGF1ParameterSpec.getDigestAlgorithm());
        if (rVarA == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.b = null;
        this.c = pSSParameterSpec;
        this.g = rVarA;
        this.h = this.c.getSaltLength();
        this.i = a(this.c.getTrailerField());
        a();
        if (this.k != null) {
            this.l = new o(this.e, this.f, this.g, this.h, this.i);
            if (this.k.a()) {
                this.l.a(true, (i) this.k);
            } else {
                this.l.a(false, (i) this.k);
            }
        }
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        this.m = true;
        try {
            return this.l.a();
        } catch (j e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.l.a(b);
        this.m = false;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.l.a(bArr, i, i2);
        this.m = false;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        this.m = true;
        return this.l.a(bArr);
    }
}
