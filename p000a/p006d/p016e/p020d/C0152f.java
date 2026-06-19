package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0290n;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.d.f */
/* JADX INFO: compiled from: ValidateNegotiateInfoRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0152f implements InterfaceC0290n {

    /* JADX INFO: renamed from: a */
    private int f751a;

    /* JADX INFO: renamed from: b */
    private byte[] f752b;

    /* JADX INFO: renamed from: c */
    private int f753c;

    /* JADX INFO: renamed from: d */
    private int[] f754d;

    public C0152f(int i, byte[] bArr, int i2, int[] iArr) {
        this.f751a = i;
        this.f752b = bArr;
        this.f753c = i2;
        this.f754d = iArr;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m512b(this.f751a, bArr, i);
        int i2 = i + 4;
        System.arraycopy(this.f752b, 0, bArr, i2, 16);
        int i3 = i2 + 16;
        C0173a.m510a(this.f753c, bArr, i3);
        int i4 = i3 + 2;
        C0173a.m510a(this.f754d.length, bArr, i4);
        int i5 = i4 + 2;
        int length = this.f754d.length;
        for (int i6 = 0; i6 < length; i6++) {
            C0173a.m510a(r2[i6], bArr, i5);
            i5 += 2;
        }
        return i5 - i;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return (this.f754d.length * 2) + 24;
    }
}
