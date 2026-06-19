package p000a.p006d.p009c;

import java.util.Date;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.InterfaceC0250j;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.d.c.c */
/* JADX INFO: compiled from: FileBothDirectoryInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0058c implements InterfaceC0250j, InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private int f267a;

    /* JADX INFO: renamed from: b */
    private int f268b;

    /* JADX INFO: renamed from: c */
    private long f269c;

    /* JADX INFO: renamed from: d */
    private long f270d;

    /* JADX INFO: renamed from: e */
    private long f271e;

    /* JADX INFO: renamed from: f */
    private long f272f;

    /* JADX INFO: renamed from: g */
    private long f273g;

    /* JADX INFO: renamed from: h */
    private long f274h;

    /* JADX INFO: renamed from: i */
    private int f275i;

    /* JADX INFO: renamed from: j */
    private int f276j;

    /* JADX INFO: renamed from: k */
    private String f277k;

    /* JADX INFO: renamed from: l */
    private String f278l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC0267h f279m;

    /* JADX INFO: renamed from: n */
    private final boolean f280n;

    public C0058c(InterfaceC0267h interfaceC0267h, boolean z) {
        this.f279m = interfaceC0267h;
        this.f280n = z;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: a */
    public final String mo233a() {
        return this.f278l;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return 1;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: c */
    public final int mo235c() {
        return this.f268b;
    }

    /* JADX INFO: renamed from: d */
    public final String m236d() {
        return this.f278l;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: e */
    public final int mo237e() {
        return this.f275i;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: f */
    public final long mo238f() {
        return this.f269c;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: g */
    public final long mo239g() {
        return this.f271e;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: h */
    public final long mo240h() {
        return this.f270d;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: i */
    public final long mo241i() {
        return this.f273g;
    }

    /* JADX INFO: renamed from: j */
    public final int m242j() {
        return this.f267a;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        String strM951a;
        this.f267a = C0173a.m511b(bArr, i);
        int i3 = i + 4;
        this.f268b = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4;
        this.f269c = C0173a.m515d(bArr, i4);
        int i5 = i4 + 8;
        this.f270d = C0173a.m515d(bArr, i5);
        int i6 = i5 + 8;
        this.f271e = C0173a.m515d(bArr, i6);
        int i7 = i6 + 8;
        this.f272f = C0173a.m515d(bArr, i7);
        int i8 = i7 + 8;
        this.f273g = C0173a.m513c(bArr, i8);
        int i9 = i8 + 8;
        this.f274h = C0173a.m513c(bArr, i9);
        int i10 = i9 + 8;
        this.f275i = C0173a.m511b(bArr, i10);
        int i11 = i10 + 4;
        int iM511b = C0173a.m511b(bArr, i11);
        int i12 = i11 + 4;
        this.f276j = C0173a.m511b(bArr, i12);
        int i13 = i12 + 4;
        int i14 = bArr[i13] & 255;
        int i15 = i13 + 2;
        this.f277k = C0285f.m950a(bArr, i15, i14);
        int i16 = i15 + 24;
        if (this.f280n) {
            if (iM511b > 0 && bArr[(i16 + iM511b) - 1] == 0 && bArr[(i16 + iM511b) - 2] == 0) {
                iM511b -= 2;
            }
            strM951a = C0285f.m950a(bArr, i16, iM511b);
        } else {
            if (iM511b > 0 && bArr[(i16 + iM511b) - 1] == 0) {
                iM511b--;
            }
            strM951a = C0285f.m951a(bArr, i16, iM511b, this.f279m);
        }
        this.f278l = strM951a;
        return i - (iM511b + i16);
    }

    public final String toString() {
        return new String("SmbFindFileBothDirectoryInfo[nextEntryOffset=" + this.f267a + ",fileIndex=" + this.f268b + ",creationTime=" + new Date(this.f269c) + ",lastAccessTime=" + new Date(this.f270d) + ",lastWriteTime=" + new Date(this.f271e) + ",changeTime=" + new Date(this.f272f) + ",endOfFile=" + this.f273g + ",allocationSize=" + this.f274h + ",extFileAttributes=" + this.f275i + ",eaSize=" + this.f276j + ",shortName=" + this.f277k + ",filename=" + this.f278l + "]");
    }
}
