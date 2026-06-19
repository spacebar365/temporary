package p000a.p006d.p016e.p022f;

import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.f.d */
/* JADX INFO: compiled from: PreauthIntegrityNegotiateContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0160d implements InterfaceC0158b, InterfaceC0159c {

    /* JADX INFO: renamed from: a */
    private int[] f766a;

    /* JADX INFO: renamed from: b */
    private byte[] f767b;

    public C0160d(int[] iArr, byte[] bArr) {
        this.f766a = iArr;
        this.f767b = bArr;
    }

    public C0160d() {
    }

    /* JADX INFO: renamed from: b */
    public final int[] m490b() {
        return this.f766a;
    }

    @Override // p000a.p006d.p016e.p022f.InterfaceC0158b, p000a.p006d.p016e.p022f.InterfaceC0159c
    /* JADX INFO: renamed from: c */
    public final int mo489c() {
        return 1;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m510a(this.f766a != null ? this.f766a.length : 0L, bArr, i);
        C0173a.m510a(this.f767b != null ? this.f767b.length : 0L, bArr, i + 2);
        int length = i + 4;
        if (this.f766a != null) {
            int length2 = this.f766a.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C0173a.m510a(r2[i2], bArr, length);
                length += 2;
            }
        }
        if (this.f767b != null) {
            System.arraycopy(this.f767b, 0, bArr, length, this.f767b.length);
            length += this.f767b.length;
        }
        return length - i;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        int iM509a = C0173a.m509a(bArr, i);
        int iM509a2 = C0173a.m509a(bArr, i + 2);
        int i3 = i + 4;
        this.f766a = new int[iM509a];
        for (int i4 = 0; i4 < iM509a; i4++) {
            this.f766a[i4] = C0173a.m509a(bArr, i3);
            i3 += 2;
        }
        this.f767b = new byte[iM509a2];
        System.arraycopy(bArr, i3, this.f767b, 0, iM509a2);
        return (i3 + iM509a2) - i;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return (this.f766a != null ? this.f766a.length * 2 : 0) + 4 + (this.f767b != null ? this.f767b.length : 0);
    }
}
