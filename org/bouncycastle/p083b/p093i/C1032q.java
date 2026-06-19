package org.bouncycastle.p083b.p093i;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p093i.p095b.C1015e;
import org.bouncycastle.p083b.p093i.p095b.C1016f;
import org.bouncycastle.p083b.p093i.p095b.C1017g;
import org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1032q implements InterfaceC1004a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f4305a;

    /* JADX INFO: renamed from: b */
    private C0950f f4306b;

    /* JADX INFO: renamed from: d */
    private boolean f4308d;

    /* JADX INFO: renamed from: e */
    private byte[] f4309e;

    /* JADX INFO: renamed from: f */
    private byte[] f4310f;

    /* JADX INFO: renamed from: g */
    private byte[] f4311g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1011a f4312h;

    /* JADX INFO: renamed from: i */
    private long[] f4313i;

    /* JADX INFO: renamed from: j */
    private final int f4314j;

    /* JADX INFO: renamed from: k */
    private a f4315k = new a();

    /* JADX INFO: renamed from: l */
    private a f4316l = new a();

    /* JADX INFO: renamed from: c */
    private int f4307c = -1;

    /* JADX INFO: renamed from: org.bouncycastle.b.i.q$a */
    private class a extends ByteArrayOutputStream {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m2543a() {
            return this.buf;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2539a(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i2;
        while (i < i4) {
            m2540a(this.f4313i, bArr, i);
            this.f4312h.mo2493b(this.f4313i);
            i += this.f4314j;
        }
        long[] jArr = this.f4313i;
        jArr[0] = ((((long) i3) & 4294967295L) << 3) ^ jArr[0];
        long[] jArr2 = this.f4313i;
        int i5 = this.f4314j >>> 4;
        jArr2[i5] = ((((long) i2) & 4294967295L) << 3) ^ jArr2[i5];
        this.f4310f = AbstractC1556g.m4145a(this.f4313i);
        this.f4305a.mo2122a(this.f4310f, 0, this.f4310f, 0);
    }

    /* JADX INFO: renamed from: a */
    private static void m2540a(long[] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = jArr[i2] ^ AbstractC1556g.m4153d(bArr, i);
            i += 8;
        }
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
            throw new C1163o("input buffer too short");
        }
        this.f4316l.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e mo2475a() {
        return this.f4305a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2541a(byte b) {
        this.f4315k.write(b);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2476a(boolean z, InterfaceC1003i interfaceC1003i) {
        C1076ba c1076baM2558a;
        this.f4308d = z;
        if (interfaceC1003i instanceof C1048a) {
            C1048a c1048a = (C1048a) interfaceC1003i;
            byte[] bArrM2561d = c1048a.m2561d();
            int length = this.f4311g.length - bArrM2561d.length;
            C1535a.m4071a(this.f4311g, (byte) 0);
            System.arraycopy(bArrM2561d, 0, this.f4311g, length, bArrM2561d.length);
            this.f4309e = c1048a.m2560c();
            int iM2559b = c1048a.m2559b();
            if (iM2559b < 64 || iM2559b > (this.f4314j << 3) || (iM2559b & 7) != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iM2559b)));
            }
            this.f4307c = iM2559b >>> 3;
            c1076baM2558a = c1048a.m2558a();
            if (this.f4309e != null) {
                mo2477a(this.f4309e, 0, this.f4309e.length);
            }
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("Invalid parameter passed");
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            byte[] bArrM2611a = c1080be.m2611a();
            int length2 = this.f4311g.length - bArrM2611a.length;
            C1535a.m4071a(this.f4311g, (byte) 0);
            System.arraycopy(bArrM2611a, 0, this.f4311g, length2, bArrM2611a.length);
            this.f4309e = null;
            this.f4307c = this.f4314j;
            c1076baM2558a = (C1076ba) c1080be.m2612b();
        }
        this.f4310f = new byte[this.f4314j];
        this.f4306b.mo2403a(true, (InterfaceC1003i) new C1080be(c1076baM2558a, this.f4311g));
        this.f4305a.mo2124a(true, c1076baM2558a);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2477a(byte[] bArr, int i, int i2) {
        this.f4315k.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final int mo2478b(int i) {
        int size = this.f4316l.size() + i;
        if (this.f4308d) {
            return size + this.f4307c;
        }
        if (size < this.f4307c) {
            return 0;
        }
        return size - this.f4307c;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final byte[] mo2479b() {
        byte[] bArr = new byte[this.f4307c];
        System.arraycopy(this.f4310f, 0, bArr, 0, this.f4307c);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m2542c() {
        C1535a.m4073a(this.f4313i);
        this.f4305a.mo2126c();
        this.f4316l.reset();
        this.f4315k.reset();
        if (this.f4309e != null) {
            mo2477a(this.f4309e, 0, this.f4309e.length);
        }
    }

    public C1032q(InterfaceC0890e interfaceC0890e) {
        InterfaceC1011a c1015e;
        this.f4305a = interfaceC0890e;
        this.f4306b = new C0950f(new C1031p(this.f4305a));
        this.f4314j = this.f4305a.mo2125b();
        this.f4309e = new byte[this.f4314j];
        this.f4311g = new byte[this.f4314j];
        switch (this.f4314j) {
            case 16:
                c1015e = new C1016f();
                break;
            case 32:
                c1015e = new C1017g();
                break;
            case 64:
                c1015e = new C1015e();
                break;
            default:
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
        }
        this.f4312h = c1015e;
        this.f4313i = new long[this.f4314j >>> 3];
        this.f4310f = null;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2473a(byte[] bArr, int i) throws C1179v {
        int iMo2400a;
        int size = this.f4316l.size();
        if (!this.f4308d && size < this.f4307c) {
            throw new C1179v("data too short");
        }
        byte[] bArr2 = new byte[this.f4314j];
        this.f4305a.mo2122a(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.f4314j >>> 3];
        AbstractC1556g.m4149b(bArr2, 0, jArr);
        this.f4312h.mo2492a(jArr);
        C1535a.m4071a(bArr2, (byte) 0);
        C1535a.m4073a(jArr);
        int size2 = this.f4315k.size();
        if (size2 > 0) {
            byte[] bArrM2543a = this.f4315k.m2543a();
            int i2 = size2 + 0;
            int i3 = 0;
            while (i3 < i2) {
                m2540a(this.f4313i, bArrM2543a, i3);
                this.f4312h.mo2493b(this.f4313i);
                i3 += this.f4314j;
            }
        }
        if (!this.f4308d) {
            int i4 = size - this.f4307c;
            if (bArr.length - i < i4) {
                throw new C0803ac("Output buffer too short");
            }
            m2539a(this.f4316l.m2543a(), 0, i4, size2);
            int iMo2401a = this.f4306b.mo2401a(this.f4316l.m2543a(), 0, i4, bArr, i);
            iMo2400a = iMo2401a + this.f4306b.mo2400a(bArr, i + iMo2401a);
        } else {
            if ((bArr.length - i) - this.f4307c < size) {
                throw new C0803ac("Output buffer too short");
            }
            int iMo2401a2 = this.f4306b.mo2401a(this.f4316l.m2543a(), 0, size, bArr, i);
            iMo2400a = iMo2401a2 + this.f4306b.mo2400a(bArr, i + iMo2401a2);
            m2539a(bArr, i, size, size2);
        }
        if (this.f4310f == null) {
            throw new IllegalStateException("mac is not calculated");
        }
        if (this.f4308d) {
            System.arraycopy(this.f4310f, 0, bArr, i + iMo2400a, this.f4307c);
            m2542c();
            return iMo2400a + this.f4307c;
        }
        byte[] bArr3 = new byte[this.f4307c];
        System.arraycopy(this.f4316l.m2543a(), size - this.f4307c, bArr3, 0, this.f4307c);
        byte[] bArr4 = new byte[this.f4307c];
        System.arraycopy(this.f4310f, 0, bArr4, 0, this.f4307c);
        if (!C1535a.m4085b(bArr3, bArr4)) {
            throw new C1179v("mac verification failed");
        }
        m2542c();
        return iMo2400a;
    }
}
