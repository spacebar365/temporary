package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.b.e.an;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi$SHA512_256withRSA extends PSSSignatureSpi {
    public PSSSignatureSpi$SHA512_256withRSA() {
        super(new an(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
    }
}
