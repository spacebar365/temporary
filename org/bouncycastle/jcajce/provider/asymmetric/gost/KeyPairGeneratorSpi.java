package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.f.a;
import org.bouncycastle.b.b;
import org.bouncycastle.b.f.r;
import org.bouncycastle.b.k.aq;
import org.bouncycastle.b.k.as;
import org.bouncycastle.b.k.at;
import org.bouncycastle.b.k.au;
import org.bouncycastle.c.c.l;
import org.bouncycastle.c.c.n;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    aq a;
    r b;
    l c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.b = new r();
        this.d = 1024;
        this.e = null;
        this.f = false;
    }

    private void a(l lVar, SecureRandom secureRandom) {
        n nVarD = lVar.d();
        this.a = new aq(secureRandom, new as(nVarD.a(), nVarD.b(), nVarD.c()));
        this.b.a(this.a);
        this.f = true;
        this.c = lVar;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f) {
            a(new l(a.q.b()), org.bouncycastle.b.l.a());
        }
        b bVarA = this.b.a();
        return new KeyPair(new BCGOST3410PublicKey((au) bVarA.a(), this.c), new BCGOST3410PrivateKey((at) bVarA.b(), this.c));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.d = i;
        this.e = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof l)) {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        }
        a((l) algorithmParameterSpec, secureRandom);
    }
}
