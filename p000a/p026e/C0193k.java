package p000a.p026e;

import p000a.InterfaceC0267h;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.e.k */
/* JADX INFO: compiled from: NodeStatusResponse.java */
/* JADX INFO: loaded from: classes.dex */
final class C0193k extends AbstractC0189g {

    /* JADX INFO: renamed from: A */
    C0190h[] f908A;

    /* JADX INFO: renamed from: B */
    private C0190h f909B;

    /* JADX INFO: renamed from: C */
    private int f910C;

    /* JADX INFO: renamed from: D */
    private byte[] f911D;

    /* JADX INFO: renamed from: E */
    private byte[] f912E;

    C0193k(InterfaceC0267h interfaceC0267h, C0190h c0190h) {
        super(interfaceC0267h);
        this.f909B = c0190h;
        this.f885r = new C0184b(interfaceC0267h);
        this.f911D = new byte[6];
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo532a(byte[] bArr) {
        return 0;
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: b */
    final int mo534b(byte[] bArr) {
        return m568d(bArr, 12);
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo533a(byte[] bArr, int i) {
        boolean z;
        this.f910C = bArr[i] & 255;
        int i2 = this.f910C * 18;
        int i3 = (this.f891x - i2) - 1;
        int i4 = i + 1;
        this.f910C = bArr[i] & 255;
        System.arraycopy(bArr, i2 + i4, this.f911D, 0, 6);
        this.f908A = new C0190h[this.f910C];
        String str = this.f909B.f895b.f827b;
        int i5 = 0;
        boolean z2 = false;
        int i6 = i4;
        while (i5 < this.f910C) {
            int i7 = i6 + 14;
            while (bArr[i7] == 32) {
                i7--;
            }
            String strM951a = C0285f.m951a(bArr, i6, (i7 - i6) + 1, this.f893z);
            int i8 = bArr[i6 + 15] & 255;
            boolean z3 = (bArr[i6 + 16] & 128) == 128;
            int i9 = (bArr[i6 + 16] & 96) >> 5;
            boolean z4 = (bArr[i6 + 16] & 16) == 16;
            boolean z5 = (bArr[i6 + 16] & 8) == 8;
            boolean z6 = (bArr[i6 + 16] & 4) == 4;
            boolean z7 = (bArr[i6 + 16] & 2) == 2;
            if (!z2 && this.f909B.f895b.f828c == i8 && (this.f909B.f895b.m531d() || this.f909B.f895b.f826a.equals(strM951a))) {
                if (this.f909B.f895b.m531d()) {
                    this.f909B.f895b = new C0184b(this.f893z, strM951a, i8, str);
                }
                this.f909B.f898e = z3;
                this.f909B.f897d = i9;
                this.f909B.f899f = z4;
                this.f909B.f900g = z5;
                this.f909B.f901h = z6;
                this.f909B.f902i = z7;
                this.f909B.f904k = this.f911D;
                this.f909B.f903j = true;
                z = true;
                this.f908A[i5] = this.f909B;
            } else {
                this.f908A[i5] = new C0190h(new C0184b(this.f893z, strM951a, i8, str), this.f909B.f896c, z3, i9, z4, z5, z6, z7, this.f911D);
                z = z2;
            }
            i5++;
            z2 = z;
            i6 += 18;
        }
        int i10 = (i6 - i4) + i4;
        this.f912E = new byte[i3];
        System.arraycopy(bArr, i10, this.f912E, 0, i3);
        return (i10 + i3) - i;
    }

    @Override // p000a.p026e.AbstractC0189g
    public final String toString() {
        return new String("NodeStatusResponse[" + super.toString() + "]");
    }
}
