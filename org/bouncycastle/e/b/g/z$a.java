package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public class z$a {
    private final x a;
    private byte[] b = null;
    private byte[] c = null;
    private byte[] d = null;

    public z$a(x xVar) {
        this.a = xVar;
    }

    static /* synthetic */ x a(z$a z_a) {
        return z_a.a;
    }

    static /* synthetic */ byte[] b(z$a z_a) {
        return z_a.d;
    }

    static /* synthetic */ byte[] c(z$a z_a) {
        return z_a.b;
    }

    static /* synthetic */ byte[] d(z$a z_a) {
        return z_a.c;
    }

    public final z$a a(byte[] bArr) {
        this.b = aa.a(bArr);
        return this;
    }

    public final z a() {
        return new z(this, (byte) 0);
    }

    public final z$a b(byte[] bArr) {
        this.c = aa.a(bArr);
        return this;
    }
}
