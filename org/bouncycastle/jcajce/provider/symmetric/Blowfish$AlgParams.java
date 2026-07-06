package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public class Blowfish$AlgParams extends IvAlgorithmParameters {
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Blowfish IV";
    }
}
