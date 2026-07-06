package a.d.e.g;

/* JADX INFO: compiled from: Smb2SessionSetupRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.d.e.c<d> {
    private byte[] a;
    private int b;
    private boolean c;
    private long d;
    private int e;

    public c(a.c cVar, int i, int i2, long j, byte[] bArr) {
        super(cVar.a(), 1);
        this.e = i;
        this.b = i2;
        this.d = j;
        this.a = bArr;
    }

    @Override // a.d.e.b
    public final boolean a(a.d.e.b bVar) {
        bVar.b(-1L);
        return super.a(bVar);
    }

    @Override // a.d.c
    public final int l_() {
        return i((this.a != null ? this.a.length : 0) + 88);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(25L, bArr, i);
        bArr[i + 2] = (byte) (this.c ? 1 : 0);
        bArr[i + 3] = (byte) this.e;
        int i2 = i + 4;
        a.d.f.a.b(this.b, bArr, i2);
        int i3 = i2 + 4;
        a.d.f.a.b(0L, bArr, i3);
        int i4 = i3 + 4;
        int i5 = i4 + 2;
        a.d.f.a.a(this.a != null ? this.a.length : 0L, bArr, i5);
        int i6 = i5 + 2;
        a.d.f.a.c(this.d, bArr, i6);
        int i7 = i6 + 8;
        a.d.f.a.a(i7 - M(), bArr, i4);
        int iJ = j(i7) + i7;
        if (this.a != null) {
            System.arraycopy(this.a, 0, bArr, iJ, this.a.length);
            iJ += this.a.length;
        }
        return iJ - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new d(cVar.a());
    }
}
