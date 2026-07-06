package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import javax.crypto.spec.OAEPParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class CipherSpi$OAEPPadding extends CipherSpi {
    public CipherSpi$OAEPPadding() {
        super(OAEPParameterSpec.DEFAULT);
    }
}
