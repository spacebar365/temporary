package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.b.f.p;
import org.bouncycastle.b.k.an;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom a;
    protected int b = 1024;
    private int c = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        p pVar = new p();
        if (this.a != null) {
            pVar.a(this.b, 20, this.a);
        } else {
            pVar.a(this.b, 20, l.a());
        }
        an anVarA = pVar.a();
        try {
            AlgorithmParameters algorithmParametersA = a("ElGamal");
            algorithmParametersA.init(new DHParameterSpec(anVarA.a(), anVarA.b(), this.c));
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
