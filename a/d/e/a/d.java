package a.d.e.a;

import a.d.g;
import a.d.i;
import a.h;

/* JADX INFO: compiled from: Smb2CloseResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends a.d.e.d implements i {
    private static final org.c.b a = org.c.c.a((Class<?>) d.class);
    private final byte[] b;
    private final String c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private int k;

    public d(h hVar, byte[] bArr, String str) {
        super(hVar);
        this.b = bArr;
        this.c = str;
    }

    public final int g() {
        return this.d;
    }

    @Override // a.d.i
    public final long e() {
        return this.f;
    }

    @Override // a.d.i
    public final long d() {
        return this.g;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 60) {
            throw new g("Expected structureSize = 60");
        }
        this.d = a.d.f.a.a(bArr, i + 2);
        int i2 = i + 4 + 4;
        this.e = a.d.f.a.d(bArr, i2);
        int i3 = i2 + 8;
        this.f = a.d.f.a.d(bArr, i3);
        int i4 = i3 + 8;
        this.g = a.d.f.a.d(bArr, i4);
        int i5 = i4 + 8;
        this.h = a.d.f.a.d(bArr, i5);
        int i6 = i5 + 8;
        this.i = a.d.f.a.c(bArr, i6);
        int i7 = i6 + 8;
        this.j = a.d.f.a.c(bArr, i7);
        int i8 = i7 + 8;
        this.k = a.d.f.a.b(bArr, i8);
        int i9 = i8 + 4;
        if (a.c()) {
            a.b(String.format("Closed %s (%s)", a.i.e.a(this.b), this.c));
        }
        return i9 - i;
    }

    @Override // a.d.i
    public final long b_() {
        return this.e;
    }

    @Override // a.d.i
    public final long c_() {
        return this.j;
    }

    @Override // a.d.i
    public final int b() {
        return this.k;
    }
}
