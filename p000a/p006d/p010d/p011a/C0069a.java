package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0286j;
import p000a.InterfaceC0290n;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.a */
/* JADX INFO: compiled from: LockingAndXRange.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0069a implements InterfaceC0286j, InterfaceC0290n {

    /* JADX INFO: renamed from: a */
    private final boolean f304a;

    /* JADX INFO: renamed from: b */
    private int f305b;

    /* JADX INFO: renamed from: c */
    private long f306c;

    /* JADX INFO: renamed from: d */
    private long f307d;

    public C0069a(boolean z) {
        this.f304a = z;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        if (this.f304a) {
            this.f305b = C0173a.m509a(bArr, i);
            this.f306c = (C0173a.m511b(bArr, i + 4) << 32) | C0173a.m511b(bArr, i + 8);
            this.f307d = (C0173a.m511b(bArr, i + 12) << 32) | C0173a.m511b(bArr, i + 16);
            return 20;
        }
        this.f305b = C0173a.m509a(bArr, i);
        this.f306c = C0173a.m511b(bArr, i + 2);
        this.f307d = C0173a.m511b(bArr, i + 6);
        return 10;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        if (this.f304a) {
            C0173a.m510a(this.f305b, bArr, i);
            C0173a.m512b(this.f306c >> 32, bArr, i + 4);
            C0173a.m512b(this.f306c & (-1), bArr, i + 8);
            C0173a.m512b(this.f307d >> 32, bArr, i + 12);
            C0173a.m512b(this.f307d & (-1), bArr, i + 16);
            return 20;
        }
        C0173a.m510a(this.f305b, bArr, i);
        C0173a.m512b(this.f306c, bArr, i + 2);
        C0173a.m512b(this.f307d, bArr, i + 6);
        return 10;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return this.f304a ? 20 : 10;
    }
}
