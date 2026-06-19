package org.bouncycastle.p083b.p093i;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1018c implements InterfaceC1004a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f4180a;

    /* JADX INFO: renamed from: b */
    private int f4181b;

    /* JADX INFO: renamed from: c */
    private boolean f4182c;

    /* JADX INFO: renamed from: d */
    private byte[] f4183d;

    /* JADX INFO: renamed from: e */
    private byte[] f4184e;

    /* JADX INFO: renamed from: f */
    private int f4185f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1003i f4186g;

    /* JADX INFO: renamed from: h */
    private byte[] f4187h;

    /* JADX INFO: renamed from: i */
    private a f4188i = new a();

    /* JADX INFO: renamed from: j */
    private a f4189j = new a();

    /* JADX INFO: renamed from: org.bouncycastle.b.i.c$a */
    private class a extends ByteArrayOutputStream {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m2506a() {
            return this.buf;
        }
    }

    public C1018c(InterfaceC0890e interfaceC0890e) {
        this.f4180a = interfaceC0890e;
        this.f4181b = interfaceC0890e.mo2125b();
        this.f4187h = new byte[this.f4181b];
        if (this.f4181b != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    /* JADX INFO: renamed from: a */
    private int m2500a(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        int i4 = 1;
        C0988a c0988a = new C0988a(this.f4180a, this.f4185f * 8);
        c0988a.mo2449a(this.f4186g);
        byte[] bArr3 = new byte[16];
        if (m2502f()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        bArr3[0] = (byte) (bArr3[0] | ((((c0988a.mo2451b() - 2) / 2) & 7) << 3));
        bArr3[0] = (byte) (bArr3[0] | (((15 - this.f4183d.length) - 1) & 7));
        System.arraycopy(this.f4183d, 0, bArr3, 1, this.f4183d.length);
        int i5 = i2;
        while (i5 > 0) {
            bArr3[16 - i4] = (byte) (i5 & 255);
            i5 >>>= 8;
            i4++;
        }
        c0988a.mo2450a(bArr3, 0, 16);
        if (m2502f()) {
            int iM2501e = m2501e();
            if (iM2501e < 65280) {
                c0988a.mo2448a((byte) (iM2501e >> 8));
                c0988a.mo2448a((byte) iM2501e);
                i3 = 2;
            } else {
                c0988a.mo2448a((byte) -1);
                c0988a.mo2448a((byte) -2);
                c0988a.mo2448a((byte) (iM2501e >> 24));
                c0988a.mo2448a((byte) (iM2501e >> 16));
                c0988a.mo2448a((byte) (iM2501e >> 8));
                c0988a.mo2448a((byte) iM2501e);
                i3 = 6;
            }
            if (this.f4184e != null) {
                c0988a.mo2450a(this.f4184e, 0, this.f4184e.length);
            }
            if (this.f4188i.size() > 0) {
                c0988a.mo2450a(this.f4188i.m2506a(), 0, this.f4188i.size());
            }
            int i6 = (i3 + iM2501e) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    c0988a.mo2448a((byte) 0);
                    i6++;
                }
            }
        }
        c0988a.mo2450a(bArr, i, i2);
        return c0988a.mo2446a(bArr2, 0);
    }

    /* JADX INFO: renamed from: e */
    private int m2501e() {
        return (this.f4184e == null ? 0 : this.f4184e.length) + this.f4188i.size();
    }

    /* JADX INFO: renamed from: f */
    private boolean m2502f() {
        return m2501e() > 0;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2472a(int i) {
        return 0;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2474a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new C1163o("Input buffer too short");
        }
        this.f4189j.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e mo2475a() {
        return this.f4180a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2503a(byte b) {
        this.f4188i.write(b);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2476a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2612b;
        this.f4182c = z;
        if (interfaceC1003i instanceof C1048a) {
            C1048a c1048a = (C1048a) interfaceC1003i;
            this.f4183d = c1048a.m2561d();
            this.f4184e = c1048a.m2560c();
            this.f4185f = c1048a.m2559b() / 8;
            interfaceC1003iM2612b = c1048a.m2558a();
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + interfaceC1003i.getClass().getName());
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            this.f4183d = c1080be.m2611a();
            this.f4184e = null;
            this.f4185f = this.f4187h.length / 2;
            interfaceC1003iM2612b = c1080be.m2612b();
        }
        if (interfaceC1003iM2612b != null) {
            this.f4186g = interfaceC1003iM2612b;
        }
        if (this.f4183d == null || this.f4183d.length < 7 || this.f4183d.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        m2505d();
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2477a(byte[] bArr, int i, int i2) {
        this.f4188i.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final int mo2478b(int i) {
        int size = this.f4189j.size() + i;
        if (this.f4182c) {
            return size + this.f4185f;
        }
        if (size < this.f4185f) {
            return 0;
        }
        return size - this.f4185f;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final byte[] mo2479b() {
        byte[] bArr = new byte[this.f4185f];
        System.arraycopy(this.f4187h, 0, bArr, 0, bArr.length);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public final String m2504c() {
        return this.f4180a.mo2123a() + "/CCM";
    }

    /* JADX INFO: renamed from: d */
    public final void m2505d() {
        this.f4180a.mo2126c();
        this.f4188i.reset();
        this.f4189j.reset();
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2473a(byte[] bArr, int i) throws C1179v {
        int i2;
        byte[] bArrM2506a = this.f4189j.m2506a();
        int size = this.f4189j.size();
        if (this.f4186g == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        int length = 15 - this.f4183d.length;
        if (length < 4 && size >= (1 << (length * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr2 = new byte[this.f4181b];
        bArr2[0] = (byte) ((length - 1) & 7);
        System.arraycopy(this.f4183d, 0, bArr2, 1, this.f4183d.length);
        C1037v c1037v = new C1037v(this.f4180a);
        c1037v.mo2124a(this.f4182c, new C1080be(this.f4186g, bArr2));
        if (this.f4182c) {
            int i3 = size + this.f4185f;
            if (bArr.length < i3 + i) {
                throw new C0803ac("Output buffer too short.");
            }
            m2500a(bArrM2506a, 0, size, this.f4187h);
            byte[] bArr3 = new byte[this.f4181b];
            c1037v.mo2122a(this.f4187h, 0, bArr3, 0);
            int i4 = i;
            int i5 = 0;
            while (i5 < (size + 0) - this.f4181b) {
                c1037v.mo2122a(bArrM2506a, i5, bArr, i4);
                i4 += this.f4181b;
                i5 += this.f4181b;
            }
            byte[] bArr4 = new byte[this.f4181b];
            System.arraycopy(bArrM2506a, i5, bArr4, 0, (size + 0) - i5);
            c1037v.mo2122a(bArr4, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr, i4, (size + 0) - i5);
            System.arraycopy(bArr3, 0, bArr, i + size, this.f4185f);
            i2 = i3;
        } else {
            if (size < this.f4185f) {
                throw new C1179v("data too short");
            }
            int i6 = size - this.f4185f;
            if (bArr.length < i6 + i) {
                throw new C0803ac("Output buffer too short.");
            }
            System.arraycopy(bArrM2506a, i6 + 0, this.f4187h, 0, this.f4185f);
            c1037v.mo2122a(this.f4187h, 0, this.f4187h, 0);
            for (int i7 = this.f4185f; i7 != this.f4187h.length; i7++) {
                this.f4187h[i7] = 0;
            }
            int i8 = i;
            int i9 = 0;
            while (i9 < (i6 + 0) - this.f4181b) {
                c1037v.mo2122a(bArrM2506a, i9, bArr, i8);
                i8 += this.f4181b;
                i9 += this.f4181b;
            }
            byte[] bArr5 = new byte[this.f4181b];
            System.arraycopy(bArrM2506a, i9, bArr5, 0, i6 - (i9 + 0));
            c1037v.mo2122a(bArr5, 0, bArr5, 0);
            System.arraycopy(bArr5, 0, bArr, i8, i6 - (i9 + 0));
            byte[] bArr6 = new byte[this.f4181b];
            m2500a(bArr, i, i6, bArr6);
            if (!C1535a.m4085b(this.f4187h, bArr6)) {
                throw new C1179v("mac check in CCM failed");
            }
            i2 = i6;
        }
        m2505d();
        return i2;
    }
}
