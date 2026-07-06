package a.g;

/* JADX INFO: compiled from: SmbPipeOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class am extends ah {
    private aj a;

    am(aj ajVar, ay ayVar) {
        super(ajVar.b(), ayVar);
        this.a = ajVar;
    }

    @Override // a.g.ah
    public final boolean a() {
        return this.a.d();
    }

    @Override // a.g.ah
    protected final synchronized af b() {
        return this.a.e();
    }

    @Override // a.g.ah, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
