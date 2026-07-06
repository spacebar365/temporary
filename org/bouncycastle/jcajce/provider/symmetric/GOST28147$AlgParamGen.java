package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.b.e.u;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147$AlgParamGen extends BaseAlgorithmParameterGenerator {
    byte[] a = new byte[8];
    byte[] b = u.a("E-A");

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        if (this.c == null) {
            this.c = l.a();
        }
        this.c.nextBytes(this.a);
        try {
            AlgorithmParameters algorithmParametersA = a("GOST28147");
            algorithmParametersA.init(new GOST28147ParameterSpec(this.b, this.a));
            return algorithmParametersA;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter spec not supported");
        }
        this.b = ((GOST28147ParameterSpec) algorithmParameterSpec).b();
    }
}
