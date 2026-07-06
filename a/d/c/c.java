package a.d.c;

import java.util.Date;

/* JADX INFO: compiled from: FileBothDirectoryInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a.g.j, a.j {
    private int a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private int i;
    private int j;
    private String k;
    private String l;
    private final a.h m;
    private final boolean n;

    public c(a.h hVar, boolean z) {
        this.m = hVar;
        this.n = z;
    }

    @Override // a.g.j
    public final String a() {
        return this.l;
    }

    @Override // a.g.j
    public final int b() {
        return 1;
    }

    @Override // a.g.j
    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.l;
    }

    @Override // a.g.j
    public final int e() {
        return this.i;
    }

    @Override // a.g.j
    public final long f() {
        return this.c;
    }

    @Override // a.g.j
    public final long g() {
        return this.e;
    }

    @Override // a.g.j
    public final long h() {
        return this.d;
    }

    @Override // a.g.j
    public final long i() {
        return this.g;
    }

    public final int j() {
        return this.a;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        String strA;
        this.a = a.d.f.a.b(bArr, i);
        int i3 = i + 4;
        this.b = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4;
        this.c = a.d.f.a.d(bArr, i4);
        int i5 = i4 + 8;
        this.d = a.d.f.a.d(bArr, i5);
        int i6 = i5 + 8;
        this.e = a.d.f.a.d(bArr, i6);
        int i7 = i6 + 8;
        this.f = a.d.f.a.d(bArr, i7);
        int i8 = i7 + 8;
        this.g = a.d.f.a.c(bArr, i8);
        int i9 = i8 + 8;
        this.h = a.d.f.a.c(bArr, i9);
        int i10 = i9 + 8;
        this.i = a.d.f.a.b(bArr, i10);
        int i11 = i10 + 4;
        int iB = a.d.f.a.b(bArr, i11);
        int i12 = i11 + 4;
        this.j = a.d.f.a.b(bArr, i12);
        int i13 = i12 + 4;
        int i14 = bArr[i13] & 255;
        int i15 = i13 + 2;
        this.k = a.i.f.a(bArr, i15, i14);
        int i16 = i15 + 24;
        if (this.n) {
            if (iB > 0 && bArr[(i16 + iB) - 1] == 0 && bArr[(i16 + iB) - 2] == 0) {
                iB -= 2;
            }
            strA = a.i.f.a(bArr, i16, iB);
        } else {
            if (iB > 0 && bArr[(i16 + iB) - 1] == 0) {
                iB--;
            }
            strA = a.i.f.a(bArr, i16, iB, this.m);
        }
        this.l = strA;
        return i - (iB + i16);
    }

    public final String toString() {
        return new String("SmbFindFileBothDirectoryInfo[nextEntryOffset=" + this.a + ",fileIndex=" + this.b + ",creationTime=" + new Date(this.c) + ",lastAccessTime=" + new Date(this.d) + ",lastWriteTime=" + new Date(this.e) + ",changeTime=" + new Date(this.f) + ",endOfFile=" + this.g + ",allocationSize=" + this.h + ",extFileAttributes=" + this.i + ",eaSize=" + this.j + ",shortName=" + this.k + ",filename=" + this.l + "]");
    }
}
