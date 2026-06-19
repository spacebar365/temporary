package p000a.p006d.p009c;

import p000a.InterfaceC0286j;
import p000a.p006d.InterfaceC0045a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.c.e */
/* JADX INFO: compiled from: FileFsFullSizeInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0060e implements InterfaceC0045a, InterfaceC0065j, InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private long f282a;

    /* JADX INFO: renamed from: b */
    private long f283b;

    /* JADX INFO: renamed from: c */
    private int f284c;

    /* JADX INFO: renamed from: d */
    private int f285d;

    @Override // p000a.p006d.InterfaceC0045a
    /* JADX INFO: renamed from: a */
    public final long mo171a() {
        return this.f282a * ((long) this.f284c) * ((long) this.f285d);
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f282a = C0173a.m513c(bArr, i);
        int i3 = i + 8;
        this.f283b = C0173a.m513c(bArr, i3);
        int i4 = i3 + 8 + 8;
        this.f284c = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        this.f285d = C0173a.m511b(bArr, i5);
        return (i5 + 4) - i;
    }

    public final String toString() {
        return new String("SmbInfoAllocation[alloc=" + this.f282a + ",free=" + this.f283b + ",sectPerAlloc=" + this.f284c + ",bytesPerSect=" + this.f285d + "]");
    }
}
