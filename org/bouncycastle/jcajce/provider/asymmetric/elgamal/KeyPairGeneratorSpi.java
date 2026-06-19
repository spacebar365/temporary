package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0968o;
import org.bouncycastle.p083b.p090f.C0969p;
import org.bouncycastle.p083b.p097k.C1060al;
import org.bouncycastle.p083b.p097k.C1062an;
import org.bouncycastle.p083b.p097k.C1063ao;
import org.bouncycastle.p083b.p097k.C1064ap;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1212i;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a */
    C1060al f5827a;

    /* JADX INFO: renamed from: b */
    C0968o f5828b;

    /* JADX INFO: renamed from: c */
    int f5829c;

    /* JADX INFO: renamed from: d */
    int f5830d;

    /* JADX INFO: renamed from: e */
    SecureRandom f5831e;

    /* JADX INFO: renamed from: f */
    boolean f5832f;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.f5828b = new C0968o();
        this.f5829c = 1024;
        this.f5830d = 20;
        this.f5831e = C1124l.m2709a();
        this.f5832f = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f5832f) {
            DHParameterSpec dHParameterSpecMo2858a = C1200a.f4677a.mo2858a(this.f5829c);
            if (dHParameterSpecMo2858a != null) {
                this.f5827a = new C1060al(this.f5831e, new C1062an(dHParameterSpecMo2858a.getP(), dHParameterSpecMo2858a.getG(), dHParameterSpecMo2858a.getL()));
            } else {
                C0969p c0969p = new C0969p();
                c0969p.m2434a(this.f5829c, this.f5830d, this.f5831e);
                this.f5827a = new C1060al(this.f5831e, c0969p.m2433a());
            }
            this.f5828b.mo2109a(this.f5827a);
            this.f5832f = true;
        }
        C0818b c0818bMo2108a = this.f5828b.mo2108a();
        return new KeyPair(new BCElGamalPublicKey((C1064ap) c0818bMo2108a.m1919a()), new BCElGamalPrivateKey((C1063ao) c0818bMo2108a.m1920b()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5829c = i;
        this.f5831e = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof C1212i) && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (algorithmParameterSpec instanceof C1212i) {
            C1212i c1212i = (C1212i) algorithmParameterSpec;
            this.f5827a = new C1060al(secureRandom, new C1062an(c1212i.m2877a(), c1212i.m2878b()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.f5827a = new C1060al(secureRandom, new C1062an(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        this.f5828b.mo2109a(this.f5827a);
        this.f5832f = true;
    }
}
