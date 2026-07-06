package org.bouncycastle.jcajce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public class MQVParameterSpec implements AlgorithmParameterSpec {
    private final PublicKey a;
    private final PrivateKey b;
    private final PublicKey c;
    private final byte[] d;

    public final PrivateKey a() {
        return this.b;
    }

    public final PublicKey b() {
        return this.a;
    }

    public final PublicKey c() {
        return this.c;
    }

    public final byte[] d() {
        return a.b(this.d);
    }
}
