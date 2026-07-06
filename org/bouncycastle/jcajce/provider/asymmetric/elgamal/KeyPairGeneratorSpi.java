package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.b.b;
import org.bouncycastle.b.f.o;
import org.bouncycastle.b.f.p;
import org.bouncycastle.b.k.al;
import org.bouncycastle.b.k.an;
import org.bouncycastle.b.k.ao;
import org.bouncycastle.b.k.ap;
import org.bouncycastle.b.l;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.i;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    al a;
    o b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.b = new o();
        this.c = 1024;
        this.d = 20;
        this.e = l.a();
        this.f = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f) {
            DHParameterSpec dHParameterSpecA = a.a.a(this.c);
            if (dHParameterSpecA != null) {
                this.a = new al(this.e, new an(dHParameterSpecA.getP(), dHParameterSpecA.getG(), dHParameterSpecA.getL()));
            } else {
                p pVar = new p();
                pVar.a(this.c, this.d, this.e);
                this.a = new al(this.e, pVar.a());
            }
            this.b.a(this.a);
            this.f = true;
        }
        b bVarA = this.b.a();
        return new KeyPair(new BCElGamalPublicKey((ap) bVarA.a()), new BCElGamalPrivateKey((ao) bVarA.b()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.c = i;
        this.e = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof i) && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (algorithmParameterSpec instanceof i) {
            i iVar = (i) algorithmParameterSpec;
            this.a = new al(secureRandom, new an(iVar.a(), iVar.b()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.a = new al(secureRandom, new an(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        this.b.a(this.a);
        this.f = true;
    }
}
