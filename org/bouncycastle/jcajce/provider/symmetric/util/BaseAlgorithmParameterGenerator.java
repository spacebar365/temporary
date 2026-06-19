package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {

    /* JADX INFO: renamed from: c */
    protected SecureRandom f6157c;

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f6156a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: d */
    protected int f6158d = 1024;

    /* JADX INFO: renamed from: a */
    protected final AlgorithmParameters m4448a(String str) {
        return this.f6156a.mo4522c(str);
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        this.f6158d = i;
        this.f6157c = secureRandom;
    }
}
