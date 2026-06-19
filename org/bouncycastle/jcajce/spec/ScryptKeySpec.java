package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class ScryptKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a */
    private final char[] f6261a;

    /* JADX INFO: renamed from: b */
    private final byte[] f6262b;

    /* JADX INFO: renamed from: c */
    private final int f6263c;

    /* JADX INFO: renamed from: d */
    private final int f6264d;

    /* JADX INFO: renamed from: e */
    private final int f6265e;

    /* JADX INFO: renamed from: f */
    private final int f6266f;

    /* JADX INFO: renamed from: a */
    public final char[] m4506a() {
        return this.f6261a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4507b() {
        return C1535a.m4086b(this.f6262b);
    }

    /* JADX INFO: renamed from: c */
    public final int m4508c() {
        return this.f6263c;
    }

    /* JADX INFO: renamed from: d */
    public final int m4509d() {
        return this.f6264d;
    }

    /* JADX INFO: renamed from: e */
    public final int m4510e() {
        return this.f6265e;
    }

    /* JADX INFO: renamed from: f */
    public final int m4511f() {
        return this.f6266f;
    }
}
