package org.bouncycastle.p083b.p093i;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1030o implements InterfaceC1004a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f4284a;

    /* JADX INFO: renamed from: b */
    private int f4285b;

    /* JADX INFO: renamed from: c */
    private boolean f4286c;

    /* JADX INFO: renamed from: d */
    private byte[] f4287d;

    /* JADX INFO: renamed from: e */
    private byte[] f4288e;

    /* JADX INFO: renamed from: f */
    private byte[] f4289f;

    /* JADX INFO: renamed from: g */
    private byte[] f4290g;

    /* JADX INFO: renamed from: h */
    private byte[] f4291h;

    /* JADX INFO: renamed from: i */
    private byte[] f4292i;

    /* JADX INFO: renamed from: j */
    private byte[] f4293j;

    /* JADX INFO: renamed from: k */
    private byte[] f4294k;

    /* JADX INFO: renamed from: l */
    private a f4295l;

    /* JADX INFO: renamed from: m */
    private a f4296m;

    /* JADX INFO: renamed from: n */
    private int f4297n;

    /* JADX INFO: renamed from: org.bouncycastle.b.i.o$a */
    private class a extends ByteArrayOutputStream {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m2538a() {
            return this.buf;
        }
    }

    public C1030o(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    private static void m2532a(int i, byte[] bArr) {
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) (i >> 16);
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    private void m2533a(byte[] bArr, int i, int i2, int i3) {
        if (i2 + 0 < this.f4284a.mo2125b()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i2 % this.f4284a.mo2125b() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        System.arraycopy(this.f4290g, 0, this.f4291h, 0, (this.f4290g.length - this.f4297n) - 1);
        m2532a(i3, this.f4292i);
        System.arraycopy(this.f4292i, 0, this.f4291h, (this.f4290g.length - this.f4297n) - 1, 4);
        this.f4291h[this.f4291h.length - 1] = m2536c(this.f4285b);
        this.f4284a.mo2122a(this.f4291h, 0, this.f4289f, 0);
        m2532a(i2, this.f4292i);
        if (i2 <= this.f4284a.mo2125b() - this.f4297n) {
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr2 = this.f4292i;
                int i5 = this.f4297n + i4;
                bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i4 + 0]);
            }
            for (int i6 = 0; i6 < this.f4284a.mo2125b(); i6++) {
                byte[] bArr3 = this.f4289f;
                bArr3[i6] = (byte) (bArr3[i6] ^ this.f4292i[i6]);
            }
            this.f4284a.mo2122a(this.f4289f, 0, this.f4289f, 0);
            return;
        }
        for (int i7 = 0; i7 < this.f4284a.mo2125b(); i7++) {
            byte[] bArr4 = this.f4289f;
            bArr4[i7] = (byte) (bArr4[i7] ^ this.f4292i[i7]);
        }
        this.f4284a.mo2122a(this.f4289f, 0, this.f4289f, 0);
        while (i2 != 0) {
            for (int i8 = 0; i8 < this.f4284a.mo2125b(); i8++) {
                byte[] bArr5 = this.f4289f;
                bArr5[i8] = (byte) (bArr5[i8] ^ bArr[i8 + i]);
            }
            this.f4284a.mo2122a(this.f4289f, 0, this.f4289f, 0);
            i += this.f4284a.mo2125b();
            i2 -= this.f4284a.mo2125b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2534a(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < this.f4294k.length; i3++) {
            byte[] bArr3 = this.f4293j;
            bArr3[i3] = (byte) (bArr3[i3] + this.f4294k[i3]);
        }
        this.f4284a.mo2122a(this.f4293j, 0, this.f4292i, 0);
        for (int i4 = 0; i4 < this.f4284a.mo2125b(); i4++) {
            bArr2[i2 + i4] = (byte) (this.f4292i[i4] ^ bArr[i + i4]);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2535b(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            for (int i3 = 0; i3 < this.f4284a.mo2125b(); i3++) {
                byte[] bArr2 = this.f4289f;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i + i3]);
            }
            this.f4284a.mo2122a(this.f4289f, 0, this.f4289f, 0);
            i2 -= this.f4284a.mo2125b();
            i += this.f4284a.mo2125b();
        }
    }

    /* JADX INFO: renamed from: c */
    private byte m2536c(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1");
        switch (i) {
            case 8:
                stringBuffer.append("010");
                break;
            case 16:
                stringBuffer.append("011");
                break;
            case 32:
                stringBuffer.append("100");
                break;
            case 48:
                stringBuffer.append("101");
                break;
            case 64:
                stringBuffer.append("110");
                break;
        }
        String binaryString = Integer.toBinaryString(this.f4297n - 1);
        while (binaryString.length() < 4) {
            binaryString = new StringBuffer(binaryString).insert(0, "0").toString();
        }
        stringBuffer.append(binaryString);
        return (byte) Integer.parseInt(stringBuffer.toString(), 2);
    }

    /* JADX INFO: renamed from: c */
    private void m2537c() {
        C1535a.m4071a(this.f4291h, (byte) 0);
        C1535a.m4071a(this.f4292i, (byte) 0);
        C1535a.m4071a(this.f4294k, (byte) 0);
        C1535a.m4071a(this.f4289f, (byte) 0);
        this.f4294k[0] = 1;
        this.f4296m.reset();
        this.f4295l.reset();
        if (this.f4287d != null) {
            mo2477a(this.f4287d, 0, this.f4287d.length);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2472a(int i) {
        return i;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2474a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new C1163o("input buffer too short");
        }
        this.f4296m.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e mo2475a() {
        return this.f4284a;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2476a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2612b;
        if (interfaceC1003i instanceof C1048a) {
            C1048a c1048a = (C1048a) interfaceC1003i;
            if (c1048a.m2559b() > 512 || c1048a.m2559b() < 64 || c1048a.m2559b() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.f4290g = c1048a.m2561d();
            this.f4285b = c1048a.m2559b() / 8;
            this.f4287d = c1048a.m2560c();
            interfaceC1003iM2612b = c1048a.m2558a();
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            this.f4290g = ((C1080be) interfaceC1003i).m2611a();
            this.f4285b = this.f4284a.mo2125b();
            this.f4287d = null;
            interfaceC1003iM2612b = ((C1080be) interfaceC1003i).m2612b();
        }
        this.f4288e = new byte[this.f4285b];
        this.f4286c = z;
        this.f4284a.mo2124a(true, interfaceC1003iM2612b);
        this.f4294k[0] = 1;
        if (this.f4287d != null) {
            mo2477a(this.f4287d, 0, this.f4287d.length);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2477a(byte[] bArr, int i, int i2) {
        this.f4295l.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final int mo2478b(int i) {
        return this.f4285b + i;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final byte[] mo2479b() {
        return C1535a.m4086b(this.f4288e);
    }

    private C1030o(InterfaceC0890e interfaceC0890e, byte b) {
        this.f4295l = new a();
        this.f4296m = new a();
        this.f4297n = 4;
        this.f4284a = interfaceC0890e;
        this.f4285b = interfaceC0890e.mo2125b();
        this.f4290g = new byte[interfaceC0890e.mo2125b()];
        this.f4287d = new byte[interfaceC0890e.mo2125b()];
        this.f4288e = new byte[interfaceC0890e.mo2125b()];
        this.f4289f = new byte[interfaceC0890e.mo2125b()];
        this.f4291h = new byte[interfaceC0890e.mo2125b()];
        this.f4292i = new byte[interfaceC0890e.mo2125b()];
        this.f4293j = new byte[interfaceC0890e.mo2125b()];
        this.f4294k = new byte[interfaceC0890e.mo2125b()];
        this.f4297n = 4;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2473a(byte[] bArr, int i) throws C1179v {
        int i2;
        int i3;
        byte[] bArrM2538a = this.f4296m.m2538a();
        int size = this.f4296m.size();
        if (bArrM2538a.length + 0 < size) {
            throw new C1163o("input buffer too short");
        }
        if (bArr.length - i < size) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f4295l.size() > 0) {
            if (this.f4286c) {
                m2533a(this.f4295l.m2538a(), 0, this.f4295l.size(), this.f4296m.size());
            } else {
                m2533a(this.f4295l.m2538a(), 0, this.f4295l.size(), this.f4296m.size() - this.f4285b);
            }
        }
        if (this.f4286c) {
            if (size % this.f4284a.mo2125b() != 0) {
                throw new C1163o("partial blocks not supported");
            }
            m2535b(bArrM2538a, 0, size);
            this.f4284a.mo2122a(this.f4290g, 0, this.f4293j, 0);
            int iMo2125b = size;
            int iMo2125b2 = 0;
            while (iMo2125b > 0) {
                m2534a(bArrM2538a, iMo2125b2, bArr, i);
                iMo2125b -= this.f4284a.mo2125b();
                iMo2125b2 += this.f4284a.mo2125b();
                i += this.f4284a.mo2125b();
            }
            for (int i4 = 0; i4 < this.f4294k.length; i4++) {
                byte[] bArr2 = this.f4293j;
                bArr2[i4] = (byte) (bArr2[i4] + this.f4294k[i4]);
            }
            this.f4284a.mo2122a(this.f4293j, 0, this.f4292i, 0);
            for (int i5 = 0; i5 < this.f4285b; i5++) {
                bArr[i + i5] = (byte) (this.f4292i[i5] ^ this.f4289f[i5]);
            }
            System.arraycopy(this.f4289f, 0, this.f4288e, 0, this.f4285b);
            m2537c();
            i3 = this.f4285b + size;
        } else {
            if ((size - this.f4285b) % this.f4284a.mo2125b() != 0) {
                throw new C1163o("partial blocks not supported");
            }
            this.f4284a.mo2122a(this.f4290g, 0, this.f4293j, 0);
            int iMo2125b3 = size / this.f4284a.mo2125b();
            int iMo2125b4 = i;
            int iMo2125b5 = 0;
            for (int i6 = 0; i6 < iMo2125b3; i6++) {
                m2534a(bArrM2538a, iMo2125b5, bArr, iMo2125b4);
                iMo2125b5 += this.f4284a.mo2125b();
                iMo2125b4 += this.f4284a.mo2125b();
            }
            if (size > iMo2125b5) {
                for (int i7 = 0; i7 < this.f4294k.length; i7++) {
                    byte[] bArr3 = this.f4293j;
                    bArr3[i7] = (byte) (bArr3[i7] + this.f4294k[i7]);
                }
                this.f4284a.mo2122a(this.f4293j, 0, this.f4292i, 0);
                for (int i8 = 0; i8 < this.f4285b; i8++) {
                    bArr[iMo2125b4 + i8] = (byte) (this.f4292i[i8] ^ bArrM2538a[iMo2125b5 + i8]);
                }
                i2 = this.f4285b + iMo2125b4;
            } else {
                i2 = iMo2125b4;
            }
            for (int i9 = 0; i9 < this.f4294k.length; i9++) {
                byte[] bArr4 = this.f4293j;
                bArr4[i9] = (byte) (bArr4[i9] + this.f4294k[i9]);
            }
            this.f4284a.mo2122a(this.f4293j, 0, this.f4292i, 0);
            System.arraycopy(bArr, i2 - this.f4285b, this.f4292i, 0, this.f4285b);
            m2535b(bArr, 0, i2 - this.f4285b);
            System.arraycopy(this.f4289f, 0, this.f4288e, 0, this.f4285b);
            byte[] bArr5 = new byte[this.f4285b];
            System.arraycopy(this.f4292i, 0, bArr5, 0, this.f4285b);
            if (!C1535a.m4085b(this.f4288e, bArr5)) {
                throw new C1179v("mac check failed");
            }
            m2537c();
            i3 = size - this.f4285b;
        }
        m2537c();
        return i3;
    }
}
