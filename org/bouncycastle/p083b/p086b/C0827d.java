package org.bouncycastle.p083b.p086b;

import java.lang.reflect.Array;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p083b.p089e.C0944u;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1082bg;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0827d implements InterfaceC1178u, InterfaceC1554e {

    /* JADX INFO: renamed from: s */
    private static final byte[] f3434s = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* JADX INFO: renamed from: a */
    byte[] f3435a;

    /* JADX INFO: renamed from: b */
    short[] f3436b;

    /* JADX INFO: renamed from: c */
    short[] f3437c;

    /* JADX INFO: renamed from: d */
    byte[] f3438d;

    /* JADX INFO: renamed from: e */
    byte[] f3439e;

    /* JADX INFO: renamed from: f */
    byte[] f3440f;

    /* JADX INFO: renamed from: g */
    byte[] f3441g;

    /* JADX INFO: renamed from: h */
    private byte[] f3442h;

    /* JADX INFO: renamed from: i */
    private byte[] f3443i;

    /* JADX INFO: renamed from: j */
    private byte[] f3444j;

    /* JADX INFO: renamed from: k */
    private byte[] f3445k;

    /* JADX INFO: renamed from: l */
    private byte[][] f3446l;

    /* JADX INFO: renamed from: m */
    private byte[] f3447m;

    /* JADX INFO: renamed from: n */
    private int f3448n;

    /* JADX INFO: renamed from: o */
    private long f3449o;

    /* JADX INFO: renamed from: p */
    private InterfaceC0890e f3450p;

    /* JADX INFO: renamed from: q */
    private byte[] f3451q;

    /* JADX INFO: renamed from: r */
    private byte[] f3452r;

    public C0827d() {
        this.f3442h = new byte[32];
        this.f3443i = new byte[32];
        this.f3444j = new byte[32];
        this.f3445k = new byte[32];
        this.f3446l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f3447m = new byte[32];
        this.f3450p = new C0944u();
        this.f3452r = new byte[32];
        this.f3435a = new byte[8];
        this.f3436b = new short[16];
        this.f3437c = new short[16];
        this.f3438d = new byte[32];
        this.f3439e = new byte[32];
        this.f3440f = new byte[32];
        this.f3441g = new byte[32];
        this.f3451q = C0944u.m2377a("D-A");
        this.f3450p.mo2124a(true, new C1082bg(null, this.f3451q));
        mo1931c();
    }

    public C0827d(C0827d c0827d) {
        this.f3442h = new byte[32];
        this.f3443i = new byte[32];
        this.f3444j = new byte[32];
        this.f3445k = new byte[32];
        this.f3446l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f3447m = new byte[32];
        this.f3450p = new C0944u();
        this.f3452r = new byte[32];
        this.f3435a = new byte[8];
        this.f3436b = new short[16];
        this.f3437c = new short[16];
        this.f3438d = new byte[32];
        this.f3439e = new byte[32];
        this.f3440f = new byte[32];
        this.f3441g = new byte[32];
        mo1939a(c0827d);
    }

    public C0827d(byte[] bArr) {
        this.f3442h = new byte[32];
        this.f3443i = new byte[32];
        this.f3444j = new byte[32];
        this.f3445k = new byte[32];
        this.f3446l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f3447m = new byte[32];
        this.f3450p = new C0944u();
        this.f3452r = new byte[32];
        this.f3435a = new byte[8];
        this.f3436b = new short[16];
        this.f3437c = new short[16];
        this.f3438d = new byte[32];
        this.f3439e = new byte[32];
        this.f3440f = new byte[32];
        this.f3441g = new byte[32];
        this.f3451q = C1535a.m4086b(bArr);
        this.f3450p.mo2124a(true, new C1082bg(null, this.f3451q));
        mo1931c();
    }

    /* JADX INFO: renamed from: a */
    private void m2003a(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.f3450p.mo2124a(true, new C1076ba(bArr));
        this.f3450p.mo2122a(bArr3, i2, bArr2, i);
    }

    /* JADX INFO: renamed from: a */
    private byte[] m2004a(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.f3452r[i * 4] = bArr[i];
            this.f3452r[(i * 4) + 1] = bArr[i + 8];
            this.f3452r[(i * 4) + 2] = bArr[i + 16];
            this.f3452r[(i * 4) + 3] = bArr[i + 24];
        }
        return this.f3452r;
    }

    /* JADX INFO: renamed from: b */
    private byte[] m2005b(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.f3435a[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f3435a, 0, bArr, 24, 8);
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    private void m2007d(byte[] bArr) {
        System.arraycopy(bArr, 0, this.f3444j, 0, 32);
        System.arraycopy(this.f3442h, 0, this.f3439e, 0, 32);
        System.arraycopy(this.f3444j, 0, this.f3440f, 0, 32);
        for (int i = 0; i < 32; i++) {
            this.f3441g[i] = (byte) (this.f3439e[i] ^ this.f3440f[i]);
        }
        m2003a(m2004a(this.f3441g), this.f3438d, 0, this.f3442h, 0);
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 >= 4) {
                break;
            }
            byte[] bArrM2005b = m2005b(this.f3439e);
            for (int i4 = 0; i4 < 32; i4++) {
                this.f3439e[i4] = (byte) (bArrM2005b[i4] ^ this.f3446l[i3][i4]);
            }
            this.f3440f = m2005b(m2005b(this.f3440f));
            for (int i5 = 0; i5 < 32; i5++) {
                this.f3441g[i5] = (byte) (this.f3439e[i5] ^ this.f3440f[i5]);
            }
            m2003a(m2004a(this.f3441g), this.f3438d, i3 * 8, this.f3442h, i3 * 8);
            i2 = i3 + 1;
        }
        for (int i6 = 0; i6 < 12; i6++) {
            m2006c(this.f3438d);
        }
        for (int i7 = 0; i7 < 32; i7++) {
            byte[] bArr2 = this.f3438d;
            bArr2[i7] = (byte) (bArr2[i7] ^ this.f3444j[i7]);
        }
        m2006c(this.f3438d);
        for (int i8 = 0; i8 < 32; i8++) {
            this.f3438d[i8] = (byte) (this.f3442h[i8] ^ this.f3438d[i8]);
        }
        for (int i9 = 0; i9 < 61; i9++) {
            m2006c(this.f3438d);
        }
        System.arraycopy(this.f3438d, 0, this.f3442h, 0, this.f3442h.length);
    }

    /* JADX INFO: renamed from: e */
    private void m2008e(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 == this.f3445k.length) {
                return;
            }
            int i4 = (this.f3445k[i2] & 255) + (bArr[i2] & 255) + i3;
            this.f3445k[i2] = (byte) i4;
            i = i4 >>> 8;
            i2++;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        byte[] bArr = this.f3447m;
        int i = this.f3448n;
        this.f3448n = i + 1;
        bArr[i] = b;
        if (this.f3448n == this.f3447m.length) {
            m2008e(this.f3447m);
            m2007d(this.f3447m);
            this.f3448n = 0;
        }
        this.f3449o++;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        C0827d c0827d = (C0827d) interfaceC1554e;
        this.f3451q = c0827d.f3451q;
        this.f3450p.mo2124a(true, new C1082bg(null, this.f3451q));
        mo1931c();
        System.arraycopy(c0827d.f3442h, 0, this.f3442h, 0, c0827d.f3442h.length);
        System.arraycopy(c0827d.f3443i, 0, this.f3443i, 0, c0827d.f3443i.length);
        System.arraycopy(c0827d.f3444j, 0, this.f3444j, 0, c0827d.f3444j.length);
        System.arraycopy(c0827d.f3445k, 0, this.f3445k, 0, c0827d.f3445k.length);
        System.arraycopy(c0827d.f3446l[1], 0, this.f3446l[1], 0, c0827d.f3446l[1].length);
        System.arraycopy(c0827d.f3446l[2], 0, this.f3446l[2], 0, c0827d.f3446l[2].length);
        System.arraycopy(c0827d.f3446l[3], 0, this.f3446l[3], 0, c0827d.f3446l[3].length);
        System.arraycopy(c0827d.f3447m, 0, this.f3447m, 0, c0827d.f3447m.length);
        this.f3448n = c0827d.f3448n;
        this.f3449o = c0827d.f3449o;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        while (this.f3448n != 0 && i2 > 0) {
            mo1928a(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f3447m.length) {
            System.arraycopy(bArr, i, this.f3447m, 0, this.f3447m.length);
            m2008e(this.f3447m);
            m2007d(this.f3447m);
            i += this.f3447m.length;
            i2 -= this.f3447m.length;
            this.f3449o += (long) this.f3447m.length;
        }
        while (i2 > 0) {
            mo1928a(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 32;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3449o = 0L;
        this.f3448n = 0;
        for (int i = 0; i < this.f3442h.length; i++) {
            this.f3442h[i] = 0;
        }
        for (int i2 = 0; i2 < this.f3443i.length; i2++) {
            this.f3443i[i2] = 0;
        }
        for (int i3 = 0; i3 < this.f3444j.length; i3++) {
            this.f3444j[i3] = 0;
        }
        for (int i4 = 0; i4 < this.f3446l[1].length; i4++) {
            this.f3446l[1][i4] = 0;
        }
        for (int i5 = 0; i5 < this.f3446l[3].length; i5++) {
            this.f3446l[3][i5] = 0;
        }
        for (int i6 = 0; i6 < this.f3445k.length; i6++) {
            this.f3445k[i6] = 0;
        }
        for (int i7 = 0; i7 < this.f3447m.length; i7++) {
            this.f3447m[i7] = 0;
        }
        System.arraycopy(f3434s, 0, this.f3446l[2], 0, f3434s.length);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 32;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0827d(this);
    }

    /* JADX INFO: renamed from: c */
    private void m2006c(byte[] bArr) {
        short[] sArr = this.f3436b;
        for (int i = 0; i < bArr.length / 2; i++) {
            sArr[i] = (short) (((bArr[(i * 2) + 1] << 8) & 65280) | (bArr[i * 2] & 255));
        }
        this.f3437c[15] = (short) (((((this.f3436b[0] ^ this.f3436b[1]) ^ this.f3436b[2]) ^ this.f3436b[3]) ^ this.f3436b[12]) ^ this.f3436b[15]);
        System.arraycopy(this.f3436b, 1, this.f3437c, 0, 15);
        short[] sArr2 = this.f3437c;
        for (int i2 = 0; i2 < bArr.length / 2; i2++) {
            bArr[(i2 * 2) + 1] = (byte) (sArr2[i2] >> 8);
            bArr[i2 * 2] = (byte) sArr2[i2];
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        AbstractC1556g.m4148b(this.f3449o * 8, this.f3443i, 0);
        while (this.f3448n != 0) {
            mo1928a((byte) 0);
        }
        m2007d(this.f3443i);
        m2007d(this.f3445k);
        System.arraycopy(this.f3442h, 0, bArr, i, this.f3442h.length);
        mo1931c();
        return 32;
    }
}
