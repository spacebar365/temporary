package p000a.p029g;

/* JADX INFO: renamed from: a.g.am */
/* JADX INFO: compiled from: SmbPipeOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0223am extends C0218ah {

    /* JADX INFO: renamed from: a */
    private C0220aj f1030a;

    C0223am(C0220aj c0220aj, C0235ay c0235ay) {
        super(c0220aj.m665b(), c0235ay);
        this.f1030a = c0220aj;
    }

    @Override // p000a.p029g.C0218ah
    /* JADX INFO: renamed from: a */
    public final boolean mo654a() {
        return this.f1030a.m668d();
    }

    @Override // p000a.p029g.C0218ah
    /* JADX INFO: renamed from: b */
    protected final synchronized C0216af mo655b() {
        return this.f1030a.m669e();
    }

    @Override // p000a.p029g.C0218ah, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
