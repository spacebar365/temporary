package p000a.p029g;

/* JADX INFO: renamed from: a.g.al */
/* JADX INFO: compiled from: SmbPipeInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0222al extends C0217ag {

    /* JADX INFO: renamed from: b */
    private C0220aj f1029b;

    C0222al(C0220aj c0220aj, C0235ay c0235ay) {
        super(c0220aj.m665b(), c0235ay);
        this.f1029b = c0220aj;
    }

    @Override // p000a.p029g.C0217ag
    /* JADX INFO: renamed from: a */
    protected final synchronized C0216af mo651a() {
        return this.f1029b.m669e();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    @Override // p000a.p029g.C0217ag, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int available() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0222al.available():int");
    }

    @Override // p000a.p029g.C0217ag, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
