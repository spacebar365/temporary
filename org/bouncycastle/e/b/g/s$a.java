package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public class s$a {
    private final r a;
    private long b = 0;
    private byte[] c = null;
    private byte[] d = null;
    private byte[] e = null;
    private byte[] f = null;
    private b g = null;
    private byte[] h = null;
    private x i = null;

    public s$a(r rVar) {
        this.a = rVar;
    }

    static /* synthetic */ r a(s$a s_a) {
        return s_a.a;
    }

    static /* synthetic */ byte[] b(s$a s_a) {
        return s_a.h;
    }

    static /* synthetic */ x c(s$a s_a) {
        return s_a.i;
    }

    static /* synthetic */ long d(s$a s_a) {
        return s_a.b;
    }

    static /* synthetic */ byte[] e(s$a s_a) {
        return s_a.c;
    }

    static /* synthetic */ byte[] f(s$a s_a) {
        return s_a.d;
    }

    static /* synthetic */ byte[] g(s$a s_a) {
        return s_a.e;
    }

    static /* synthetic */ byte[] h(s$a s_a) {
        return s_a.f;
    }

    static /* synthetic */ b i(s$a s_a) {
        return s_a.g;
    }

    public final s$a a(long j) {
        this.b = j;
        return this;
    }

    public final s$a a(b bVar) {
        this.g = bVar;
        return this;
    }

    public final s$a a(byte[] bArr) {
        this.c = aa.a(bArr);
        return this;
    }

    public final s a() {
        return new s(this, (byte) 0);
    }

    public final s$a b(byte[] bArr) {
        this.d = aa.a(bArr);
        return this;
    }

    public final s$a c(byte[] bArr) {
        this.e = aa.a(bArr);
        return this;
    }

    public final s$a d(byte[] bArr) {
        this.f = aa.a(bArr);
        return this;
    }
}
