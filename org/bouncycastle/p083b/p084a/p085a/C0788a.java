package org.bouncycastle.p083b.p084a.p085a;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.InterfaceC1174q;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1074az;

/* JADX INFO: renamed from: org.bouncycastle.b.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0788a implements InterfaceC1173p {

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f3297a;

    /* JADX INFO: renamed from: b */
    private byte[] f3298b;

    /* JADX INFO: renamed from: c */
    private byte[] f3299c;

    /* JADX INFO: renamed from: d */
    private int f3300d;

    public C0788a(InterfaceC1175r interfaceC1175r) {
        this.f3297a = interfaceC1175r;
        this.f3300d = interfaceC1175r.mo1930b();
    }

    /* JADX INFO: renamed from: a */
    private static void m1875a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final int mo1876a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (bArr.length - i2 < 0) {
            throw new C0803ac("output buffer too small");
        }
        byte[] bArr2 = new byte[this.f3300d];
        byte[] bArr3 = new byte[4];
        int i5 = 1;
        this.f3297a.mo1931c();
        if (i2 > this.f3300d) {
            i3 = 0;
            while (true) {
                m1875a(i5, bArr3);
                this.f3297a.mo1929a(bArr3, 0, 4);
                this.f3297a.mo1929a(this.f3298b, 0, this.f3298b.length);
                this.f3297a.mo1929a(this.f3299c, 0, this.f3299c.length);
                this.f3297a.mo1926a(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i3 + 0, this.f3300d);
                i3 += this.f3300d;
                i4 = i5 + 1;
                if (i5 >= i2 / this.f3300d) {
                    break;
                }
                i5 = i4;
            }
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (i3 < i2) {
            m1875a(i4, bArr3);
            this.f3297a.mo1929a(bArr3, 0, 4);
            this.f3297a.mo1929a(this.f3298b, 0, this.f3298b.length);
            this.f3297a.mo1929a(this.f3299c, 0, this.f3299c.length);
            this.f3297a.mo1926a(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i3 + 0, i2 - i3);
        }
        return i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final void mo1877a(InterfaceC1174q interfaceC1174q) {
        if (!(interfaceC1174q instanceof C1074az)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        C1074az c1074az = (C1074az) interfaceC1174q;
        this.f3298b = c1074az.m2600a();
        this.f3299c = c1074az.m2601b();
    }
}
