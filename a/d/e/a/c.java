package a.d.e.a;

import a.h;

/* JADX INFO: compiled from: Smb2CloseRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends a.d.e.c<d> implements a.d.e.a {
    private static final org.c.b a = org.c.c.a((Class<?>) c.class);
    private byte[] b;
    private final String c;
    private int d;

    private c(h hVar, byte[] bArr, String str) {
        super(hVar, 6);
        this.b = bArr;
        this.c = str;
    }

    public c(h hVar, byte[] bArr) {
        this(hVar, bArr, "");
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.b = bArr;
    }

    public c(h hVar, String str) {
        this(hVar, a.d.e.e.a, str);
    }

    public final void k() {
        this.d = 1;
    }

    @Override // a.d.c
    public final int l_() {
        return i(88);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(24L, bArr, i);
        a.d.f.a.a(this.d, bArr, i + 2);
        int i2 = i + 4 + 4;
        System.arraycopy(this.b, 0, bArr, i2, 16);
        int i3 = i2 + 16;
        if (a.c()) {
            a.b(String.format("Closing %s (%s)", a.i.e.a(this.b), this.c));
        }
        return i3 - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new d(cVar.a(), this.b, this.c);
    }
}
