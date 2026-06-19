package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p090f.C0963j;
import org.bouncycastle.p083b.p097k.C1114q;
import org.bouncycastle.p083b.p097k.C1115r;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {

    /* JADX INFO: renamed from: a */
    protected SecureRandom f5633a;

    /* JADX INFO: renamed from: b */
    protected int f5634b = 2048;

    /* JADX INFO: renamed from: c */
    protected C1114q f5635c;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        C0963j c0963j = this.f5634b <= 1024 ? new C0963j() : new C0963j(new C0844u());
        if (this.f5633a == null) {
            this.f5633a = C1124l.m2709a();
        }
        int iM4342a = PrimeCertaintyCalculator.m4342a(this.f5634b);
        if (this.f5634b == 1024) {
            this.f5635c = new C1114q(1024, 160, iM4342a, this.f5633a);
            c0963j.m2432a(this.f5635c);
        } else if (this.f5634b > 1024) {
            this.f5635c = new C1114q(this.f5634b, 256, iM4342a, this.f5633a);
            c0963j.m2432a(this.f5635c);
        } else {
            c0963j.m2431a(this.f5634b, iM4342a, this.f5633a);
        }
        C1115r c1115rM2430a = c0963j.m2430a();
        try {
            AlgorithmParameters algorithmParametersA = m4303a("DSA");
            algorithmParametersA.init(new DSAParameterSpec(c1115rM2430a.m2686a(), c1115rM2430a.m2687b(), c1115rM2430a.m2688c()));
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
        this.f5634b = i;
        this.f5633a = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
