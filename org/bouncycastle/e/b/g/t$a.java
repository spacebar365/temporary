package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public class t$a {
    private final r a;
    private byte[] b = null;
    private byte[] c = null;
    private byte[] d = null;

    public t$a(r rVar) {
        this.a = rVar;
    }

    static /* synthetic */ r a(t$a t_a) {
        return t_a.a;
    }

    static /* synthetic */ byte[] b(t$a t_a) {
        return t_a.d;
    }

    static /* synthetic */ byte[] c(t$a t_a) {
        return t_a.b;
    }

    static /* synthetic */ byte[] d(t$a t_a) {
        return t_a.c;
    }

    public final t$a a(byte[] bArr) {
        this.b = aa.a(bArr);
        return this;
    }

    public final t a() {
        return new t(this, (byte) 0);
    }

    public final t$a b(byte[] bArr) {
        this.c = aa.a(bArr);
        return this;
    }
}
