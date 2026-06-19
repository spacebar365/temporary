package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p090f.C0962i;
import org.bouncycastle.p083b.p090f.C0963j;
import org.bouncycastle.p083b.p097k.C1112o;
import org.bouncycastle.p083b.p097k.C1114q;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p083b.p097k.C1117t;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p142f.C1557h;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: f */
    private static Hashtable f5651f = new Hashtable();

    /* JADX INFO: renamed from: g */
    private static Object f5652g = new Object();

    /* JADX INFO: renamed from: a */
    C1112o f5653a;

    /* JADX INFO: renamed from: b */
    C0962i f5654b;

    /* JADX INFO: renamed from: c */
    int f5655c;

    /* JADX INFO: renamed from: d */
    SecureRandom f5656d;

    /* JADX INFO: renamed from: e */
    boolean f5657e;

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.f5654b = new C0962i();
        this.f5655c = 2048;
        this.f5656d = C1124l.m2709a();
        this.f5657e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSAParameterSpecMo2860b = C1200a.f4677a.mo2860b(i);
        if (dSAParameterSpecMo2860b != null) {
            this.f5653a = new C1112o(secureRandom, new C1115r(dSAParameterSpecMo2860b.getP(), dSAParameterSpecMo2860b.getQ(), dSAParameterSpecMo2860b.getG()));
            this.f5654b.mo2109a(this.f5653a);
            this.f5657e = true;
        } else {
            this.f5655c = i;
            this.f5656d = secureRandom;
            this.f5657e = false;
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        this.f5653a = new C1112o(secureRandom, new C1115r(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.f5654b.mo2109a(this.f5653a);
        this.f5657e = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        C0963j c0963j;
        if (!this.f5657e) {
            Integer numValueOf = Integer.valueOf(this.f5655c);
            if (f5651f.containsKey(numValueOf)) {
                this.f5653a = (C1112o) f5651f.get(numValueOf);
            } else {
                synchronized (f5652g) {
                    if (f5651f.containsKey(numValueOf)) {
                        this.f5653a = (C1112o) f5651f.get(numValueOf);
                    } else {
                        int iM4342a = PrimeCertaintyCalculator.m4342a(this.f5655c);
                        if (this.f5655c == 1024) {
                            c0963j = new C0963j();
                            if (C1557h.m4155a("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                c0963j.m2431a(this.f5655c, iM4342a, this.f5656d);
                            } else {
                                c0963j.m2432a(new C1114q(1024, 160, iM4342a, this.f5656d));
                            }
                        } else if (this.f5655c > 1024) {
                            C1114q c1114q = new C1114q(this.f5655c, 256, iM4342a, this.f5656d);
                            c0963j = new C0963j(new C0844u());
                            c0963j.m2432a(c1114q);
                        } else {
                            c0963j = new C0963j();
                            c0963j.m2431a(this.f5655c, iM4342a, this.f5656d);
                        }
                        this.f5653a = new C1112o(this.f5656d, c0963j.m2430a());
                        f5651f.put(numValueOf, this.f5653a);
                    }
                }
            }
            this.f5654b.mo2109a(this.f5653a);
            this.f5657e = true;
        }
        C0818b c0818bMo2108a = this.f5654b.mo2108a();
        return new KeyPair(new BCDSAPublicKey((C1117t) c0818bMo2108a.m1919a()), new BCDSAPrivateKey((C1116s) c0818bMo2108a.m1920b()));
    }
}
