package org.bouncycastle.jcajce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class MQVParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private final PublicKey f6253a;

    /* JADX INFO: renamed from: b */
    private final PrivateKey f6254b;

    /* JADX INFO: renamed from: c */
    private final PublicKey f6255c;

    /* JADX INFO: renamed from: d */
    private final byte[] f6256d;

    /* JADX INFO: renamed from: a */
    public final PrivateKey m4500a() {
        return this.f6254b;
    }

    /* JADX INFO: renamed from: b */
    public final PublicKey m4501b() {
        return this.f6253a;
    }

    /* JADX INFO: renamed from: c */
    public final PublicKey m4502c() {
        return this.f6255c;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m4503d() {
        return C1535a.m4086b(this.f6256d);
    }
}
