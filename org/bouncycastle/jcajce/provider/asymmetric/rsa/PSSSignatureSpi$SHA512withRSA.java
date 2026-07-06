package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.b.e.an;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi$SHA512withRSA extends PSSSignatureSpi {
    public PSSSignatureSpi$SHA512withRSA() {
        super(new an(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
    }
}
