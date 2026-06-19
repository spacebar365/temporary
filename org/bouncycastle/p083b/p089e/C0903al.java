package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.al */
/* JADX INFO: loaded from: classes.dex */
public class C0903al implements InterfaceC0816ap {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f3716a;

    /* JADX INFO: renamed from: b */
    private boolean f3717b;

    /* JADX INFO: renamed from: c */
    private C1076ba f3718c;

    /* JADX INFO: renamed from: d */
    private boolean f3719d;

    /* JADX INFO: renamed from: e */
    private byte[] f3720e;

    public C0903al(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, (byte) 0);
    }

    private C0903al(InterfaceC0890e interfaceC0890e, byte b) {
        this.f3720e = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.f3716a = interfaceC0890e;
        this.f3717b = true;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return this.f3716a.mo2123a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3719d = z;
        InterfaceC1003i interfaceC1003iM2614b = interfaceC1003i instanceof C1081bf ? ((C1081bf) interfaceC1003i).m2614b() : interfaceC1003i;
        if (interfaceC1003iM2614b instanceof C1076ba) {
            this.f3718c = (C1076ba) interfaceC1003iM2614b;
        } else if (interfaceC1003iM2614b instanceof C1080be) {
            this.f3720e = ((C1080be) interfaceC1003iM2614b).m2611a();
            this.f3718c = (C1076ba) ((C1080be) interfaceC1003iM2614b).m2612b();
            if (this.f3720e.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        if (!this.f3719d) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new C1163o("wrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = new byte[this.f3720e.length + i];
        byte[] bArr3 = new byte[this.f3720e.length + 8];
        System.arraycopy(this.f3720e, 0, bArr2, 0, this.f3720e.length);
        System.arraycopy(bArr, 0, bArr2, this.f3720e.length, i);
        this.f3716a.mo2124a(this.f3717b, this.f3718c);
        for (int i3 = 0; i3 != 6; i3++) {
            for (int i4 = 1; i4 <= i2; i4++) {
                System.arraycopy(bArr2, 0, bArr3, 0, this.f3720e.length);
                System.arraycopy(bArr2, i4 * 8, bArr3, this.f3720e.length, 8);
                this.f3716a.mo2122a(bArr3, 0, bArr3, 0);
                int i5 = (i2 * i3) + i4;
                int i6 = 1;
                while (i5 != 0) {
                    int length = this.f3720e.length - i6;
                    bArr3[length] = (byte) (((byte) i5) ^ bArr3[length]);
                    i5 >>>= 8;
                    i6++;
                }
                System.arraycopy(bArr3, 0, bArr2, 0, 8);
                System.arraycopy(bArr3, 8, bArr2, i4 * 8, 8);
            }
        }
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) throws C1179v {
        if (this.f3719d) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new C1179v("unwrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = new byte[i - this.f3720e.length];
        byte[] bArr3 = new byte[this.f3720e.length];
        byte[] bArr4 = new byte[this.f3720e.length + 8];
        System.arraycopy(bArr, 0, bArr3, 0, this.f3720e.length);
        System.arraycopy(bArr, this.f3720e.length + 0, bArr2, 0, i - this.f3720e.length);
        this.f3716a.mo2124a(!this.f3717b, this.f3718c);
        int i3 = i2 - 1;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i3; i5 > 0; i5--) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.f3720e.length);
                System.arraycopy(bArr2, (i5 - 1) * 8, bArr4, this.f3720e.length, 8);
                int i6 = (i3 * i4) + i5;
                int i7 = 1;
                while (i6 != 0) {
                    int length = this.f3720e.length - i7;
                    bArr4[length] = (byte) (((byte) i6) ^ bArr4[length]);
                    i6 >>>= 8;
                    i7++;
                }
                this.f3716a.mo2122a(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, (i5 - 1) * 8, 8);
            }
        }
        if (C1535a.m4085b(bArr3, this.f3720e)) {
            return bArr2;
        }
        throw new C1179v("checksum failed");
    }
}
