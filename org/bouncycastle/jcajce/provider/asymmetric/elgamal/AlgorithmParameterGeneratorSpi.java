package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0969p;
import org.bouncycastle.p083b.p097k.C1062an;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {

    /* JADX INFO: renamed from: a */
    protected SecureRandom f5814a;

    /* JADX INFO: renamed from: b */
    protected int f5815b = 1024;

    /* JADX INFO: renamed from: c */
    private int f5816c = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        C0969p c0969p = new C0969p();
        if (this.f5814a != null) {
            c0969p.m2434a(this.f5815b, 20, this.f5814a);
        } else {
            c0969p.m2434a(this.f5815b, 20, C1124l.m2709a());
        }
        C1062an c1062anM2433a = c0969p.m2433a();
        try {
            AlgorithmParameters algorithmParametersA = m4303a("ElGamal");
            algorithmParametersA.init(new DHParameterSpec(c1062anM2433a.m2579a(), c1062anM2433a.m2580b(), this.f5816c));
            return algorithmParametersA;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        this.f5815b = i;
        this.f5814a = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
        this.f5815b = dHGenParameterSpec.getPrimeSize();
        this.f5816c = dHGenParameterSpec.getExponentSize();
        this.f5814a = secureRandom;
    }
}
