package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1055ag;
import org.bouncycastle.p083b.p097k.C1056ah;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p102o.C1165b;
import org.bouncycastle.p083b.p102o.C1166c;
import org.bouncycastle.p103c.p106c.C1220q;
import org.bouncycastle.p103c.p106c.C1221r;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {

    /* JADX INFO: renamed from: a */
    static final byte[] f5800a = C1541f.m4106a("3042300506032b656f033900");

    /* JADX INFO: renamed from: b */
    static final byte[] f5801b = C1541f.m4106a("302a300506032b656e032100");

    /* JADX INFO: renamed from: c */
    static final byte[] f5802c = C1541f.m4106a("3043300506032b6571033a00");

    /* JADX INFO: renamed from: d */
    static final byte[] f5803d = C1541f.m4106a("302a300506032b6570032100");

    /* JADX INFO: renamed from: e */
    String f5804e;

    /* JADX INFO: renamed from: f */
    private final boolean f5805f;

    /* JADX INFO: renamed from: g */
    private final int f5806g;

    public static class ED25519 extends KeyFactorySpi {
        public ED25519() {
            super("Ed25519", false, 112);
        }
    }

    public static class ED448 extends KeyFactorySpi {
        public ED448() {
            super("Ed448", false, 113);
        }
    }

    public static class EDDSA extends KeyFactorySpi {
        public EDDSA() {
            super("EdDSA", false, 0);
        }
    }

    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z, int i) {
        this.f5804e = str;
        this.f5805f = z;
        this.f5806g = i;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (this.f5805f) {
            if ((this.f5806g == 0 || this.f5806g == 111) && c0653pM1783a.equals(InterfaceC0628a.f2266c)) {
                return new BCXDHPrivateKey(c0676p);
            }
            if ((this.f5806g == 0 || this.f5806g == 110) && c0653pM1783a.equals(InterfaceC0628a.f2265b)) {
                return new BCXDHPrivateKey(c0676p);
            }
        } else if (c0653pM1783a.equals(InterfaceC0628a.f2268e) || c0653pM1783a.equals(InterfaceC0628a.f2267d)) {
            if ((this.f5806g == 0 || this.f5806g == 113) && c0653pM1783a.equals(InterfaceC0628a.f2268e)) {
                return new BCEdDSAPrivateKey(c0676p);
            }
            if ((this.f5806g == 0 || this.f5806g == 112) && c0653pM1783a.equals(InterfaceC0628a.f2267d)) {
                return new BCEdDSAPrivateKey(c0676p);
            }
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) throws IOException {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        if (this.f5805f) {
            if ((this.f5806g == 0 || this.f5806g == 111) && c0653pM1783a.equals(InterfaceC0628a.f2266c)) {
                return new BCXDHPublicKey(c0780u);
            }
            if ((this.f5806g == 0 || this.f5806g == 110) && c0653pM1783a.equals(InterfaceC0628a.f2265b)) {
                return new BCXDHPublicKey(c0780u);
            }
        } else if (c0653pM1783a.equals(InterfaceC0628a.f2268e) || c0653pM1783a.equals(InterfaceC0628a.f2267d)) {
            if ((this.f5806g == 0 || this.f5806g == 113) && c0653pM1783a.equals(InterfaceC0628a.f2268e)) {
                return new BCEdDSAPublicKey(c0780u);
            }
            if ((this.f5806g == 0 || this.f5806g == 112) && c0653pM1783a.equals(InterfaceC0628a.f2267d)) {
                return new BCEdDSAPublicKey(c0780u);
            }
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof C1220q)) {
            return super.engineGeneratePrivate(keySpec);
        }
        C1075b c1075bM2788a = C1165b.m2788a(((C1220q) keySpec).getEncoded());
        if (c1075bM2788a instanceof C1055ag) {
            return new BCEdDSAPrivateKey((C1055ag) c1075bM2788a);
        }
        throw new IllegalStateException("openssh private key not Ed25519 private key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            if (this.f5806g == 0 || this.f5806g == encoded[8]) {
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(f5801b, encoded);
                    case 111:
                        return new BCXDHPublicKey(f5800a, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(f5803d, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(f5802c, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof C1221r) {
            C1075b c1075bM2791a = C1166c.m2791a(((C1221r) keySpec).getEncoded());
            if (c1075bM2791a instanceof C1056ah) {
                return new BCEdDSAPublicKey(new byte[0], ((C1056ah) c1075bM2791a).m2571b());
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(C1220q.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new C1220q(C1165b.m2790a(new C1055ag(((C0581be) new C0638l(((C0581be) AbstractC0723v.m1708a(key.getEncoded()).mo1482a(2)).mo1410c()).m1560b()).mo1410c())));
            } catch (IOException e) {
                throw new InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        }
        if (!cls.isAssignableFrom(C1221r.class) || !(key instanceof BCEdDSAPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        try {
            return new C1221r(C1166c.m2792a(new C1056ah(key.getEncoded(), f5803d.length)));
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.getMessage(), e2.getCause());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }
}
