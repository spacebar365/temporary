package p000a.p006d.p010d.p013c.p014a;

import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.c.a.c */
/* JADX INFO: compiled from: SmbComNtTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107c extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private final int f535n;

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        int i2;
        int iJ;
        if (mo216c() != -95) {
            i2 = i + 1;
            bArr[i] = this.f510D;
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int i3 = i2 + 1;
        bArr[i2] = 0;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        C0173a.m512b(this.f532z, bArr, i4);
        int i5 = i4 + 4;
        C0173a.m512b(this.f507A, bArr, i5);
        int i6 = i5 + 4;
        if (mo216c() != -95) {
            C0173a.m512b(this.f508B, bArr, i6);
            int i7 = i6 + 4;
            C0173a.m512b(this.f509C, bArr, i7);
            i6 = i7 + 4;
        }
        C0173a.m512b(this.f526t, bArr, i6);
        int i8 = i6 + 4;
        C0173a.m512b(this.f526t == 0 ? 0 : this.f527u, bArr, i8);
        int i9 = i8 + 4;
        if (mo216c() == -95) {
            C0173a.m512b(this.f528v, bArr, i9);
            i9 += 4;
        }
        C0173a.m512b(this.f529w, bArr, i9);
        int i10 = i9 + 4;
        C0173a.m512b(this.f529w == 0 ? 0 : this.f530x, bArr, i10);
        int i11 = i10 + 4;
        if (mo216c() == -95) {
            C0173a.m512b(this.f531y, bArr, i11);
            int i12 = i11 + 4;
            iJ = i12 + 1;
            bArr[i12] = 0;
        } else {
            int i13 = i11 + 1;
            bArr[i11] = (byte) this.f512F;
            C0173a.m510a(this.f535n, bArr, i13);
            int i14 = i13 + 2;
            iJ = i14 + mo319j(bArr, i14);
        }
        return iJ - i;
    }
}
