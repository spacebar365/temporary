package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.b.f.g;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom a;
    protected int b = 2048;
    private int c = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        g gVar = new g();
        int iA = PrimeCertaintyCalculator.a(this.b);
        if (this.a != null) {
            gVar.a(this.b, iA, this.a);
        } else {
            gVar.a(this.b, iA, l.a());
        }
        i iVarA = gVar.a();
        try {
            AlgorithmParameters algorithmParametersA = a("DH");
            algorithmParametersA.init(new DHParameterSpec(iVarA.a(), iVarA.b(), this.c));
            return algorithmParametersA;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        this.b = i;
        this.a = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
        this.b = dHGenParameterSpec.getPrimeSize();
        this.c = dHGenParameterSpec.getExponentSize();
        this.a = secureRandom;
    }
}
