package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.b.b;
import org.bouncycastle.b.f.d;
import org.bouncycastle.b.f.g;
import org.bouncycastle.b.k.e;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.j;
import org.bouncycastle.b.k.k;
import org.bouncycastle.b.l;
import org.bouncycastle.c.b.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Hashtable f = new Hashtable();
    private static Object g = new Object();
    e a;
    d b;
    int c;
    SecureRandom d;
    boolean e;

    public KeyPairGeneratorSpi() {
        super("DH");
        this.b = new d();
        this.c = 2048;
        this.d = l.a();
        this.e = false;
    }

    private static e a(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof DHDomainParameterSpec ? new e(secureRandom, ((DHDomainParameterSpec) dHParameterSpec).b()) : new e(secureRandom, new i(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.c = i;
        this.d = secureRandom;
        this.e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            this.a = a(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.b.a(this.a);
            this.e = true;
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e);
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.e) {
            Integer numValueOf = Integer.valueOf(this.c);
            if (f.containsKey(numValueOf)) {
                this.a = (e) f.get(numValueOf);
            } else {
                DHParameterSpec dHParameterSpecA = a.a.a(this.c);
                if (dHParameterSpecA != null) {
                    this.a = a(this.d, dHParameterSpecA);
                } else {
                    synchronized (g) {
                        if (f.containsKey(numValueOf)) {
                            this.a = (e) f.get(numValueOf);
                        } else {
                            g gVar = new g();
                            gVar.a(this.c, PrimeCertaintyCalculator.a(this.c), this.d);
                            this.a = new e(this.d, gVar.a());
                            f.put(numValueOf, this.a);
                        }
                    }
                }
            }
            this.b.a(this.a);
            this.e = true;
        }
        b bVarA = this.b.a();
        return new KeyPair(new BCDHPublicKey((k) bVarA.a()), new BCDHPrivateKey((j) bVarA.b()));
    }
}
