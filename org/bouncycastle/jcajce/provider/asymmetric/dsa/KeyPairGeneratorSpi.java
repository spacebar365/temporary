package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.b.b;
import org.bouncycastle.b.b.u;
import org.bouncycastle.b.f.i;
import org.bouncycastle.b.f.j;
import org.bouncycastle.b.k.o;
import org.bouncycastle.b.k.q;
import org.bouncycastle.b.k.r;
import org.bouncycastle.b.k.s;
import org.bouncycastle.b.k.t;
import org.bouncycastle.b.l;
import org.bouncycastle.c.b.a;
import org.bouncycastle.f.h;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Hashtable f = new Hashtable();
    private static Object g = new Object();
    o a;
    i b;
    int c;
    SecureRandom d;
    boolean e;

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.b = new i();
        this.c = 2048;
        this.d = l.a();
        this.e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSAParameterSpecB = a.a.b(i);
        if (dSAParameterSpecB != null) {
            this.a = new o(secureRandom, new r(dSAParameterSpecB.getP(), dSAParameterSpecB.getQ(), dSAParameterSpecB.getG()));
            this.b.a(this.a);
            this.e = true;
        } else {
            this.c = i;
            this.d = secureRandom;
            this.e = false;
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        this.a = new o(secureRandom, new r(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.b.a(this.a);
        this.e = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        j jVar;
        if (!this.e) {
            Integer numValueOf = Integer.valueOf(this.c);
            if (f.containsKey(numValueOf)) {
                this.a = (o) f.get(numValueOf);
            } else {
                synchronized (g) {
                    if (f.containsKey(numValueOf)) {
                        this.a = (o) f.get(numValueOf);
                    } else {
                        int iA = PrimeCertaintyCalculator.a(this.c);
                        if (this.c == 1024) {
                            jVar = new j();
                            if (h.a("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                jVar.a(this.c, iA, this.d);
                            } else {
                                jVar.a(new q(1024, 160, iA, this.d));
                            }
                        } else if (this.c > 1024) {
                            q qVar = new q(this.c, 256, iA, this.d);
                            jVar = new j(new u());
                            jVar.a(qVar);
                        } else {
                            jVar = new j();
                            jVar.a(this.c, iA, this.d);
                        }
                        this.a = new o(this.d, jVar.a());
                        f.put(numValueOf, this.a);
                    }
                }
            }
            this.b.a(this.a);
            this.e = true;
        }
        b bVarA = this.b.a();
        return new KeyPair(new BCDSAPublicKey((t) bVarA.a()), new BCDSAPrivateKey((s) bVarA.b()));
    }
}
