package a.f.a;

/* JADX INFO: compiled from: AvFlags.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public b(byte[] bArr) {
        super(6, bArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i) {
        byte[] bArr = new byte[4];
        a.d.f.a.b(i, bArr, 0);
        this(bArr);
    }
}
