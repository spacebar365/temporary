package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.d.a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;

/* JADX INFO: loaded from: classes.dex */
public class AES$AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        byte[] bArr = new byte[12];
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        this.c.nextBytes(bArr);
        try {
            AlgorithmParameters algorithmParametersA = a("CCM");
            algorithmParametersA.init(new a(bArr, 12).k());
            return algorithmParametersA;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
    }
}
