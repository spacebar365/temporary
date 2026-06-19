package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0957d;
import org.bouncycastle.p083b.p090f.C0960g;
import org.bouncycastle.p083b.p097k.C1102e;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1108k;
import org.bouncycastle.p103c.p105b.C1200a;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: f */
    private static Hashtable f5626f = new Hashtable();

    /* JADX INFO: renamed from: g */
    private static Object f5627g = new Object();

    /* JADX INFO: renamed from: a */
    C1102e f5628a;

    /* JADX INFO: renamed from: b */
    C0957d f5629b;

    /* JADX INFO: renamed from: c */
    int f5630c;

    /* JADX INFO: renamed from: d */
    SecureRandom f5631d;

    /* JADX INFO: renamed from: e */
    boolean f5632e;

    public KeyPairGeneratorSpi() {
        super("DH");
        this.f5629b = new C0957d();
        this.f5630c = 2048;
        this.f5631d = C1124l.m2709a();
        this.f5632e = false;
    }

    /* JADX INFO: renamed from: a */
    private static C1102e m4205a(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof DHDomainParameterSpec ? new C1102e(secureRandom, ((DHDomainParameterSpec) dHParameterSpec).m4485b()) : new C1102e(secureRandom, new C1106i(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5630c = i;
        this.f5631d = secureRandom;
        this.f5632e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            this.f5628a = m4205a(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.f5629b.mo2109a(this.f5628a);
            this.f5632e = true;
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e);
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f5632e) {
            Integer numValueOf = Integer.valueOf(this.f5630c);
            if (f5626f.containsKey(numValueOf)) {
                this.f5628a = (C1102e) f5626f.get(numValueOf);
            } else {
                DHParameterSpec dHParameterSpecMo2858a = C1200a.f4677a.mo2858a(this.f5630c);
                if (dHParameterSpecMo2858a != null) {
                    this.f5628a = m4205a(this.f5631d, dHParameterSpecMo2858a);
                } else {
                    synchronized (f5627g) {
                        if (f5626f.containsKey(numValueOf)) {
                            this.f5628a = (C1102e) f5626f.get(numValueOf);
                        } else {
                            C0960g c0960g = new C0960g();
                            c0960g.m2420a(this.f5630c, PrimeCertaintyCalculator.m4342a(this.f5630c), this.f5631d);
                            this.f5628a = new C1102e(this.f5631d, c0960g.m2419a());
                            f5626f.put(numValueOf, this.f5628a);
                        }
                    }
                }
            }
            this.f5629b.mo2109a(this.f5628a);
            this.f5632e = true;
        }
        C0818b c0818bMo2108a = this.f5629b.mo2108a();
        return new KeyPair(new BCDHPublicKey((C1108k) c0818bMo2108a.m1919a()), new BCDHPrivateKey((C1107j) c0818bMo2108a.m1920b()));
    }
}
