package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RC2$AlgParamGen extends BaseAlgorithmParameterGenerator {
    RC2ParameterSpec a = null;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        if (this.a != null) {
            try {
                AlgorithmParameters algorithmParametersA = a("RC2");
                algorithmParametersA.init(this.a);
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        byte[] bArr = new byte[8];
        if (this.c == null) {
            this.c = l.a();
        }
        this.c.nextBytes(bArr);
        try {
            AlgorithmParameters algorithmParametersA2 = a("RC2");
            algorithmParametersA2.init(new IvParameterSpec(bArr));
            return algorithmParametersA2;
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
        }
        this.a = (RC2ParameterSpec) algorithmParameterSpec;
    }
}
