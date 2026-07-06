package org.bouncycastle.b.o;

/* JADX INFO: loaded from: classes.dex */
public class d$a {
    private int a = 1024;
    private int b = -1;
    private org.bouncycastle.a.z.a c = d.a;

    static /* synthetic */ int a(d$a d_a) {
        return d_a.a;
    }

    static /* synthetic */ org.bouncycastle.a.z.a b(d$a d_a) {
        return d_a.c;
    }

    static /* synthetic */ int c(d$a d_a) {
        return d_a.b;
    }

    public final d$a a() {
        this.a = 16384;
        return this;
    }

    public final d$a a(org.bouncycastle.a.z.a aVar) {
        this.c = aVar;
        return this;
    }

    public final d$a b() {
        this.b = 64;
        return this;
    }

    public final d c() {
        return new d(this, (byte) 0);
    }
}
