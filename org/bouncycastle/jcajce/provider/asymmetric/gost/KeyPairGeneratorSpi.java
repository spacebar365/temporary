package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0971r;
import org.bouncycastle.p083b.p097k.C1065aq;
import org.bouncycastle.p083b.p097k.C1067as;
import org.bouncycastle.p083b.p097k.C1068at;
import org.bouncycastle.p083b.p097k.C1069au;
import org.bouncycastle.p103c.p106c.C1215l;
import org.bouncycastle.p103c.p106c.C1217n;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a */
    C1065aq f5840a;

    /* JADX INFO: renamed from: b */
    C0971r f5841b;

    /* JADX INFO: renamed from: c */
    C1215l f5842c;

    /* JADX INFO: renamed from: d */
    int f5843d;

    /* JADX INFO: renamed from: e */
    SecureRandom f5844e;

    /* JADX INFO: renamed from: f */
    boolean f5845f;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.f5841b = new C0971r();
        this.f5843d = 1024;
        this.f5844e = null;
        this.f5845f = false;
    }

    /* JADX INFO: renamed from: a */
    private void m4286a(C1215l c1215l, SecureRandom secureRandom) {
        C1217n c1217nMo2835d = c1215l.mo2835d();
        this.f5840a = new C1065aq(secureRandom, new C1067as(c1217nMo2835d.m2886a(), c1217nMo2835d.m2887b(), c1217nMo2835d.m2888c()));
        this.f5841b.mo2109a(this.f5840a);
        this.f5845f = true;
        this.f5842c = c1215l;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f5845f) {
            m4286a(new C1215l(InterfaceC0619a.f2209q.m1593b()), C1124l.m2709a());
        }
        C0818b c0818bMo2108a = this.f5841b.mo2108a();
        return new KeyPair(new BCGOST3410PublicKey((C1069au) c0818bMo2108a.m1919a(), this.f5842c), new BCGOST3410PrivateKey((C1068at) c0818bMo2108a.m1920b(), this.f5842c));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5843d = i;
        this.f5844e = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof C1215l)) {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        }
        m4286a((C1215l) algorithmParameterSpec, secureRandom);
    }
}
