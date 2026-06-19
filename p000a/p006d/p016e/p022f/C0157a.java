package p000a.p006d.p016e.p022f;

import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.f.a */
/* JADX INFO: compiled from: EncryptionNegotiateContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0157a implements InterfaceC0158b, InterfaceC0159c {

    /* JADX INFO: renamed from: a */
    private int[] f765a;

    public C0157a(int[] iArr) {
        this.f765a = iArr;
    }

    public C0157a() {
    }

    /* JADX INFO: renamed from: b */
    public final int[] m488b() {
        return this.f765a;
    }

    @Override // p000a.p006d.p016e.p022f.InterfaceC0158b, p000a.p006d.p016e.p022f.InterfaceC0159c
    /* JADX INFO: renamed from: c */
    public final int mo489c() {
        return 2;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m510a(this.f765a != null ? this.f765a.length : 0L, bArr, i);
        int i2 = i + 2;
        if (this.f765a != null) {
            int length = this.f765a.length;
            for (int i3 = 0; i3 < length; i3++) {
                C0173a.m510a(r2[i3], bArr, i2);
                i2 += 2;
            }
        }
        return i2 - i;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        int iM509a = C0173a.m509a(bArr, i);
        int i3 = i + 2;
        this.f765a = new int[iM509a];
        for (int i4 = 0; i4 < iM509a; i4++) {
            this.f765a[i4] = C0173a.m509a(bArr, i3);
            i3 += 2;
        }
        return i3 - i;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return (this.f765a != null ? this.f765a.length * 2 : 0) + 4;
    }
}
