package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.b.b.u;
import org.bouncycastle.b.f.j;
import org.bouncycastle.b.k.q;
import org.bouncycastle.b.k.r;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom a;
    protected int b = 2048;
    protected q c;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        j jVar = this.b <= 1024 ? new j() : new j(new u());
        if (this.a == null) {
            this.a = l.a();
        }
        int iA = PrimeCertaintyCalculator.a(this.b);
        if (this.b == 1024) {
            this.c = new q(1024, 160, iA, this.a);
            jVar.a(this.c);
        } else if (this.b > 1024) {
            this.c = new q(this.b, 256, iA, this.a);
            jVar.a(this.c);
        } else {
            jVar.a(this.b, iA, this.a);
        }
        r rVarA = jVar.a();
        try {
            AlgorithmParameters algorithmParametersA = a("DSA");
            algorithmParametersA.init(new DSAParameterSpec(rVarA.a(), rVarA.b(), rVarA.c()));
            return algorithmParametersA;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        }
        if (i <= 1024 && i % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        }
        if (i > 1024 && i % 1024 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
        this.b = i;
        this.a = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
