package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    protected static boolean a(String str) {
        return str == null || str.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec a(Class cls);

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        return a(cls);
    }
}
