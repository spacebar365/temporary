package p000a.p006d.p009c;

import p000a.p006d.InterfaceC0045a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.c.f */
/* JADX INFO: compiled from: FileFsSizeInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0061f implements InterfaceC0045a {

    /* JADX INFO: renamed from: a */
    private long f286a;

    /* JADX INFO: renamed from: b */
    private long f287b;

    /* JADX INFO: renamed from: c */
    private int f288c;

    /* JADX INFO: renamed from: d */
    private int f289d;

    @Override // p000a.p006d.InterfaceC0045a
    /* JADX INFO: renamed from: a */
    public final long mo171a() {
        return this.f286a * ((long) this.f288c) * ((long) this.f289d);
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f286a = C0173a.m513c(bArr, i);
        int i3 = i + 8;
        this.f287b = C0173a.m513c(bArr, i3);
        int i4 = i3 + 8;
        this.f288c = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        this.f289d = C0173a.m511b(bArr, i5);
        return (i5 + 4) - i;
    }

    public final String toString() {
        return new String("SmbInfoAllocation[alloc=" + this.f286a + ",free=" + this.f287b + ",sectPerAlloc=" + this.f288c + ",bytesPerSect=" + this.f289d + "]");
    }
}
