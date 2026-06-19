package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0831h implements InterfaceC1178u, InterfaceC1554e {

    /* JADX INFO: renamed from: a */
    private final byte[] f3467a;

    /* JADX INFO: renamed from: b */
    private int f3468b;

    /* JADX INFO: renamed from: c */
    private long f3469c;

    protected AbstractC0831h() {
        this.f3467a = new byte[4];
        this.f3468b = 0;
    }

    protected AbstractC0831h(AbstractC0831h abstractC0831h) {
        this.f3467a = new byte[4];
        m2016a(abstractC0831h);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        byte[] bArr = this.f3467a;
        int i = this.f3468b;
        this.f3468b = i + 1;
        bArr[i] = b;
        if (this.f3468b == this.f3467a.length) {
            mo1940b(this.f3467a, 0);
            this.f3468b = 0;
        }
        this.f3469c++;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo1938a(long j);

    /* JADX INFO: renamed from: a */
    protected final void m2016a(AbstractC0831h abstractC0831h) {
        System.arraycopy(abstractC0831h.f3467a, 0, this.f3467a, 0, abstractC0831h.f3467a.length);
        this.f3468b = abstractC0831h.f3468b;
        this.f3469c = abstractC0831h.f3469c;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        if (this.f3468b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= iMax) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f3467a;
                int i5 = this.f3468b;
                this.f3468b = i5 + 1;
                int i6 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (this.f3468b == 4) {
                    mo1940b(this.f3467a, 0);
                    this.f3468b = 0;
                    i3 = i6;
                    break;
                }
                i4 = i6;
            }
        }
        int i7 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i7) {
            mo1940b(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < iMax) {
            byte[] bArr3 = this.f3467a;
            int i8 = this.f3468b;
            this.f3468b = i8 + 1;
            bArr3[i8] = bArr[i3 + i];
            i3++;
        }
        this.f3469c += (long) iMax;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo1940b(byte[] bArr, int i);

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public void mo1931c() {
        this.f3469c = 0L;
        this.f3468b = 0;
        for (int i = 0; i < this.f3467a.length; i++) {
            this.f3467a[i] = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 64;
    }

    /* JADX INFO: renamed from: f */
    public final void m2017f() {
        long j = this.f3469c << 3;
        mo1928a((byte) -128);
        while (this.f3468b != 0) {
            mo1928a((byte) 0);
        }
        mo1938a(j);
        mo1942g();
    }

    /* JADX INFO: renamed from: g */
    protected abstract void mo1942g();
}
