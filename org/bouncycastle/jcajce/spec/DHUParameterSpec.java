package org.bouncycastle.jcajce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class DHUParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private final PublicKey f6237a;

    /* JADX INFO: renamed from: b */
    private final PrivateKey f6238b;

    /* JADX INFO: renamed from: c */
    private final PublicKey f6239c;

    /* JADX INFO: renamed from: d */
    private final byte[] f6240d;

    /* JADX INFO: renamed from: a */
    public final PrivateKey m4486a() {
        return this.f6238b;
    }

    /* JADX INFO: renamed from: b */
    public final PublicKey m4487b() {
        return this.f6237a;
    }

    /* JADX INFO: renamed from: c */
    public final PublicKey m4488c() {
        return this.f6239c;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m4489d() {
        return C1535a.m4086b(this.f6240d);
    }
}
