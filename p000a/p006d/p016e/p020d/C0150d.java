package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.d.d */
/* JADX INFO: compiled from: SrvPipePeekResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0150d implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private int f745a;

    /* JADX INFO: renamed from: b */
    private int f746b;

    /* JADX INFO: renamed from: c */
    private int f747c;

    /* JADX INFO: renamed from: d */
    private int f748d;

    /* JADX INFO: renamed from: e */
    private byte[] f749e;

    /* JADX INFO: renamed from: a */
    public final int m481a() {
        return this.f746b;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f745a = C0173a.m511b(bArr, i);
        int i3 = i + 4;
        this.f746b = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4;
        this.f747c = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        this.f748d = C0173a.m511b(bArr, i5);
        int i6 = i5 + 4;
        this.f749e = new byte[i2 - 16];
        if (this.f749e.length > 0) {
            System.arraycopy(bArr, i6, this.f749e, 0, this.f749e.length);
        }
        return i6 - i;
    }
}
