package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5907a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: a */
    protected final AlgorithmParameters m4303a(String str) {
        return this.f5907a.mo4522c(str);
    }
}
