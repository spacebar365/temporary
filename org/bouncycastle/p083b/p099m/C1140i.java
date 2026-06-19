package org.bouncycastle.p083b.p099m;

import org.bouncycastle.p083b.InterfaceC0890e;

/* JADX INFO: renamed from: org.bouncycastle.b.m.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1140i {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0890e f4566a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1135d f4567b;

    /* JADX INFO: renamed from: c */
    private final byte[] f4568c;

    /* JADX INFO: renamed from: d */
    private final byte[] f4569d;

    /* JADX INFO: renamed from: e */
    private final byte[] f4570e;

    /* JADX INFO: renamed from: f */
    private byte[] f4571f;

    /* JADX INFO: renamed from: g */
    private long f4572g;

    /* JADX INFO: renamed from: a */
    private static void m2740a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) (bArr[length] + 1);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2741a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
        }
        this.f4566a.mo2122a(bArr, 0, bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2742a(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    /* JADX INFO: renamed from: a */
    final int m2743a(byte[] bArr, boolean z) {
        if (this.f4570e.length == 8) {
            if (this.f4572g > 32768) {
                return -1;
            }
            if (m2742a(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.f4572g > 8388608) {
                return -1;
            }
            if (m2742a(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z || this.f4571f == null) {
            this.f4571f = this.f4567b.mo2732a();
            if (this.f4571f.length != this.f4566a.mo2125b()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length = bArr.length / this.f4570e.length;
        for (int i = 0; i < length; i++) {
            this.f4566a.mo2122a(this.f4568c, 0, this.f4569d, 0);
            m2741a(this.f4570e, this.f4569d, this.f4571f);
            m2741a(this.f4571f, this.f4570e, this.f4569d);
            System.arraycopy(this.f4570e, 0, bArr, this.f4570e.length * i, this.f4570e.length);
            m2740a(this.f4568c);
        }
        int length2 = bArr.length - (this.f4570e.length * length);
        if (length2 > 0) {
            this.f4566a.mo2122a(this.f4568c, 0, this.f4569d, 0);
            m2741a(this.f4570e, this.f4569d, this.f4571f);
            m2741a(this.f4571f, this.f4570e, this.f4569d);
            System.arraycopy(this.f4570e, 0, bArr, length * this.f4570e.length, length2);
            m2740a(this.f4568c);
        }
        this.f4572g++;
        return bArr.length;
    }

    /* JADX INFO: renamed from: a */
    final void m2744a() {
        this.f4571f = this.f4567b.mo2732a();
        if (this.f4571f.length != this.f4566a.mo2125b()) {
            throw new IllegalStateException("Insufficient entropy returned");
        }
        this.f4572g = 1L;
    }

    /* JADX INFO: renamed from: b */
    final InterfaceC1135d m2745b() {
        return this.f4567b;
    }
}
