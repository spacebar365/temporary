package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.a.be;
import org.bouncycastle.a.h.a;
import org.bouncycastle.a.l;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.v;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ag;
import org.bouncycastle.b.k.ah;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.o.c;
import org.bouncycastle.c.c.q;
import org.bouncycastle.c.c.r;
import org.bouncycastle.f.a.f;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    static final byte[] a = f.a("3042300506032b656f033900");
    static final byte[] b = f.a("302a300506032b656e032100");
    static final byte[] c = f.a("3043300506032b6571033a00");
    static final byte[] d = f.a("302a300506032b6570032100");
    String e;
    private final boolean f;
    private final int g;

    public KeyFactorySpi(String str, boolean z, int i) {
        this.e = str;
        this.f = z;
        this.g = i;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (this.f) {
            if ((this.g == 0 || this.g == 111) && pVarA.equals(a.c)) {
                return new BCXDHPrivateKey(pVar);
            }
            if ((this.g == 0 || this.g == 110) && pVarA.equals(a.b)) {
                return new BCXDHPrivateKey(pVar);
            }
        } else if (pVarA.equals(a.e) || pVarA.equals(a.d)) {
            if ((this.g == 0 || this.g == 113) && pVarA.equals(a.e)) {
                return new BCEdDSAPrivateKey(pVar);
            }
            if ((this.g == 0 || this.g == 112) && pVarA.equals(a.d)) {
                return new BCEdDSAPrivateKey(pVar);
            }
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (this.f) {
            if ((this.g == 0 || this.g == 111) && pVarA.equals(a.c)) {
                return new BCXDHPublicKey(uVar);
            }
            if ((this.g == 0 || this.g == 110) && pVarA.equals(a.b)) {
                return new BCXDHPublicKey(uVar);
            }
        } else if (pVarA.equals(a.e) || pVarA.equals(a.d)) {
            if ((this.g == 0 || this.g == 113) && pVarA.equals(a.e)) {
                return new BCEdDSAPublicKey(uVar);
            }
            if ((this.g == 0 || this.g == 112) && pVarA.equals(a.d)) {
                return new BCEdDSAPublicKey(uVar);
            }
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof q)) {
            return super.engineGeneratePrivate(keySpec);
        }
        b bVarA = org.bouncycastle.b.o.b.a(((q) keySpec).getEncoded());
        if (bVarA instanceof ag) {
            return new BCEdDSAPrivateKey((ag) bVarA);
        }
        throw new IllegalStateException("openssh private key not Ed25519 private key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            if (this.g == 0 || this.g == encoded[8]) {
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(b, encoded);
                    case 111:
                        return new BCXDHPublicKey(a, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(d, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(c, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof r) {
            b bVarA = c.a(((r) keySpec).getEncoded());
            if (bVarA instanceof ah) {
                return new BCEdDSAPublicKey(new byte[0], ((ah) bVarA).b());
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(q.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new q(org.bouncycastle.b.o.b.a(new ag(((be) new l(((be) v.a(key.getEncoded()).a(2)).c()).b()).c())));
            } catch (IOException e) {
                throw new InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        }
        if (!cls.isAssignableFrom(r.class) || !(key instanceof BCEdDSAPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        try {
            return new r(c.a(new ah(key.getEncoded(), d.length)));
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.getMessage(), e2.getCause());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }
}
