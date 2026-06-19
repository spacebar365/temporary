package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0960g;
import org.bouncycastle.p083b.p097k.C1106i;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {

    /* JADX INFO: renamed from: a */
    protected SecureRandom f5591a;

    /* JADX INFO: renamed from: b */
    protected int f5592b = 2048;

    /* JADX INFO: renamed from: c */
    private int f5593c = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        C0960g c0960g = new C0960g();
        int iM4342a = PrimeCertaintyCalculator.m4342a(this.f5592b);
        if (this.f5591a != null) {
            c0960g.m2420a(this.f5592b, iM4342a, this.f5591a);
        } else {
            c0960g.m2420a(this.f5592b, iM4342a, C1124l.m2709a());
        }
        C1106i c1106iM2419a = c0960g.m2419a();
        try {
            AlgorithmParameters algorithmParametersA = m4303a("DH");
            algorithmParametersA.init(new DHParameterSpec(c1106iM2419a.m2664a(), c1106iM2419a.m2665b(), this.f5593c));
            return algorithmParametersA;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        this.f5592b = i;
        this.f5591a = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
        this.f5592b = dHGenParameterSpec.getPrimeSize();
        this.f5593c = dHGenParameterSpec.getExponentSize();
        this.f5591a = secureRandom;
    }
}
