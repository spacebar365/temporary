package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.PSSParameterSpec;
import org.bouncycastle.b.e.an;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi$SHA1withRSA extends PSSSignatureSpi {
    public PSSSignatureSpi$SHA1withRSA() {
        super(new an(), PSSParameterSpec.DEFAULT);
    }
}
