package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.b.e.an;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi$SHA224withRSA extends PSSSignatureSpi {
    public PSSSignatureSpi$SHA224withRSA() {
        super(new an(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
    }
}
