package p000a.p006d.p009c;

import p000a.p006d.InterfaceC0045a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.c.k */
/* JADX INFO: compiled from: SmbInfoAllocation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0066k implements InterfaceC0045a {

    /* JADX INFO: renamed from: a */
    private long f296a;

    /* JADX INFO: renamed from: b */
    private long f297b;

    /* JADX INFO: renamed from: c */
    private int f298c;

    /* JADX INFO: renamed from: d */
    private int f299d;

    @Override // p000a.p006d.InterfaceC0045a
    /* JADX INFO: renamed from: a */
    public final long mo171a() {
        return this.f296a * ((long) this.f298c) * ((long) this.f299d);
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        int i3 = i + 4;
        this.f298c = C0173a.m511b(bArr, i3);
        this.f296a = C0173a.m511b(bArr, r0);
        this.f297b = C0173a.m511b(bArr, r0);
        int i4 = i3 + 4 + 4 + 4;
        this.f299d = C0173a.m509a(bArr, i4);
        return (i4 + 4) - i;
    }

    public final String toString() {
        return new String("SmbInfoAllocation[alloc=" + this.f296a + ",free=" + this.f297b + ",sectPerAlloc=" + this.f298c + ",bytesPerSect=" + this.f299d + "]");
    }
}
