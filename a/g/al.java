package a.g;

/* JADX INFO: compiled from: SmbPipeInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class al extends ag {
    private aj b;

    al(aj ajVar, ay ayVar) {
        super(ajVar.b(), ayVar);
        this.b = ajVar;
    }

    @Override // a.g.ag
    protected final synchronized af a() {
        return this.b.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    @Override // a.g.ag, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int available() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.al.available():int");
    }

    @Override // a.g.ag, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
