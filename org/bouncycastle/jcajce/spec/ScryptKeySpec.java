package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public class ScryptKeySpec implements KeySpec {
    private final char[] a;
    private final byte[] b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public final char[] a() {
        return this.a;
    }

    public final byte[] b() {
        return a.b(this.b);
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }
}
