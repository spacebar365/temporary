package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.a.b;
import org.bouncycastle.b.d;
import org.bouncycastle.b.k.g;
import org.bouncycastle.b.k.h;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.j;
import org.bouncycastle.b.k.k;
import org.bouncycastle.b.k.l;
import org.bouncycastle.b.k.m;
import org.bouncycastle.b.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger d = BigInteger.valueOf(1);
    private static final BigInteger e = BigInteger.valueOf(2);
    private final b f;
    private final d g;
    private DHUParameterSpec h;
    private MQVParameterSpec i;
    private BigInteger j;
    private BigInteger k;
    private BigInteger l;
    private byte[] m;

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    public KeyAgreementSpi(String str, b bVar, p pVar) {
        super(str, pVar);
        this.f = bVar;
        this.g = null;
    }

    public KeyAgreementSpi(String str, d dVar, p pVar) {
        super(str, pVar);
        this.f = null;
        this.g = dVar;
    }

    public KeyAgreementSpi(String str, p pVar) {
        super(str, pVar);
        this.f = null;
        this.g = null;
    }

    private static j a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("private key not a DHPrivateKey");
        }
        if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).a();
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        DHParameterSpec params = dHPrivateKey.getParams();
        return new j(dHPrivateKey.getX(), new i(params.getP(), params.getG(), params.getL()));
    }

    private static k a(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("public key not a DHPublicKey");
        }
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).a();
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        DHParameterSpec params = dHPublicKey.getParams();
        return params instanceof DHDomainParameterSpec ? new k(dHPublicKey.getY(), ((DHDomainParameterSpec) params).b()) : new k(dHPublicKey.getY(), new i(params.getP(), params.getG(), params.getL()));
    }

    private byte[] a(BigInteger bigInteger) {
        int iBitLength = (this.k.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == iBitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == iBitLength + 1) {
            byte[] bArr = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
            return bArr;
        }
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(byteArray, 0, bArr2, iBitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected final byte[] a() {
        return this.m;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey)) {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.l) || !dHPublicKey.getParams().getP().equals(this.k)) {
            throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        BigInteger y = ((DHPublicKey) key).getY();
        if (y == null || y.compareTo(e) < 0 || y.compareTo(this.k.subtract(d)) >= 0) {
            throw new InvalidKeyException("Invalid DH PublicKey");
        }
        if (this.f != null) {
            if (!z) {
                throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
            }
            this.m = this.f.b(new m(a((PublicKey) key), a(this.h.c())));
            return null;
        }
        if (this.g != null) {
            if (!z) {
                throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
            }
            this.m = a(this.g.b(new h(a((PublicKey) key), a(this.i.c()))));
            return null;
        }
        BigInteger bigIntegerModPow = y.modPow(this.j, this.k);
        if (bigIntegerModPow.compareTo(d) == 0) {
            throw new InvalidKeyException("Shared key can't be 1");
        }
        this.m = a(bigIntegerModPow);
        if (z) {
            return null;
        }
        return new BCDHPublicKey(bigIntegerModPow, dHPublicKey.getParams());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) {
        if (this.j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return super.engineGenerateSecret(bArr, i);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) {
        if (this.j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return str.equals("TlsPremasterSecret") ? new SecretKeySpec(a(this.m), str) : super.engineGenerateSecret(str);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        if (this.j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return super.engineGenerateSecret();
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.k = dHPrivateKey.getParams().getP();
        this.l = dHPrivateKey.getParams().getG();
        this.j = dHPrivateKey.getX();
        this.m = a(this.j);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.k = dHPrivateKey.getParams().getP();
            this.l = dHPrivateKey.getParams().getG();
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.k = dHParameterSpec.getP();
            this.l = dHParameterSpec.getG();
            this.h = null;
            this.c = null;
        } else if (algorithmParameterSpec instanceof DHUParameterSpec) {
            if (this.f == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.k = dHPrivateKey.getParams().getP();
            this.l = dHPrivateKey.getParams().getG();
            this.h = (DHUParameterSpec) algorithmParameterSpec;
            this.c = ((DHUParameterSpec) algorithmParameterSpec).d();
            if (this.h.b() != null) {
                this.f.a(new l(a(dHPrivateKey), a(this.h.a()), a(this.h.b())));
            } else {
                this.f.a(new l(a(dHPrivateKey), a(this.h.a())));
            }
        } else if (algorithmParameterSpec instanceof MQVParameterSpec) {
            if (this.g == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
            }
            this.k = dHPrivateKey.getParams().getP();
            this.l = dHPrivateKey.getParams().getG();
            this.i = (MQVParameterSpec) algorithmParameterSpec;
            this.c = ((MQVParameterSpec) algorithmParameterSpec).d();
            if (this.i.b() != null) {
                this.g.a(new g(a(dHPrivateKey), a(this.i.a()), a(this.i.b())));
            } else {
                this.g.a(new g(a(dHPrivateKey), a(this.i.a())));
            }
        } else {
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            if (this.b == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.k = dHPrivateKey.getParams().getP();
            this.l = dHPrivateKey.getParams().getG();
            this.h = null;
            this.c = ((UserKeyingMaterialSpec) algorithmParameterSpec).a();
        }
        this.j = dHPrivateKey.getX();
        this.m = a(this.j);
    }
}
