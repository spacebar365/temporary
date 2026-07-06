package a.d.d.a;

/* JADX INFO: compiled from: SmbComClose.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends a.d.d.c implements a.d.e<c> {
    private static final org.c.b n = org.c.c.a((Class<?>) d.class);
    private int o;
    private long p;

    public d(a.h hVar, int i) {
        super(hVar, (byte) 4);
        this.o = i;
        this.p = 0L;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.o, bArr, i);
        int i2 = i + 2;
        if (this.m != null) {
            a.d.d.b.a(T(), this.p, bArr, i2);
            return 6;
        }
        n.a("SmbComClose without a digest");
        return 6;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    public String toString() {
        return new String("SmbComClose[" + super.toString() + ",fid=" + this.o + ",lastWriteTime=" + this.p + "]");
    }

    @Override // a.d.d.c
    public final /* bridge */ /* synthetic */ a.d.d.c H() {
        return (c) super.H();
    }

    @Override // a.d.d.c, a.d.b
    public final /* synthetic */ a.d.d f_() {
        return (c) super.H();
    }

    @Override // a.d.d.c, a.i.a.c
    public final /* synthetic */ a.i.a.e V() {
        return (c) super.H();
    }

    @Override // a.d.e
    public final /* synthetic */ a.d.d a(a.c cVar) {
        c cVar2 = new c(cVar.a());
        a((a.d.d) cVar2);
        return cVar2;
    }
}
