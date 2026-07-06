package a.h;

/* JADX INFO: compiled from: SpnegoToken.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private byte[] a;
    private byte[] b;

    protected abstract void a(byte[] bArr);

    public abstract byte[] b();

    public final byte[] d() {
        return this.a;
    }

    public final void b(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] e() {
        return this.b;
    }

    public final void c(byte[] bArr) {
        this.b = bArr;
    }
}
