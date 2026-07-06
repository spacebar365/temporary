package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.b.e.an;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi$SHA3_384withRSA extends PSSSignatureSpi {
    public PSSSignatureSpi$SHA3_384withRSA() {
        super(new an(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
    }
}
