package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    /* JADX INFO: renamed from: a */
    protected static boolean m4449a(String str) {
        return str == null || str.equals("ASN.1");
    }

    /* JADX INFO: renamed from: a */
    protected abstract AlgorithmParameterSpec mo4277a(Class cls);

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        return mo4277a(cls);
    }
}
