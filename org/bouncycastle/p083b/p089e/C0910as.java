package org.bouncycastle.p083b.p089e;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0820aa;
import org.bouncycastle.p083b.p097k.C1050ab;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1392m;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.e.as */
/* JADX INFO: loaded from: classes.dex */
public final class C0910as {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1175r f3760a;

    /* JADX INFO: renamed from: b */
    private boolean f3761b;

    /* JADX INFO: renamed from: c */
    private C1050ab f3762c;

    /* JADX INFO: renamed from: d */
    private C1122y f3763d;

    /* JADX INFO: renamed from: e */
    private int f3764e;

    /* JADX INFO: renamed from: f */
    private SecureRandom f3765f;

    public C0910as() {
        this(new C0820aa());
    }

    public C0910as(InterfaceC1175r interfaceC1175r) {
        this.f3760a = interfaceC1175r;
    }

    /* JADX INFO: renamed from: a */
    private void m2212a(InterfaceC1175r interfaceC1175r, AbstractC1386g abstractC1386g) {
        byte[] bArrM4117a = C1544b.m4117a(this.f3764e, abstractC1386g.mo2928a());
        interfaceC1175r.mo1929a(bArrM4117a, 0, bArrM4117a.length);
    }

    /* JADX INFO: renamed from: a */
    private void m2213a(InterfaceC1175r interfaceC1175r, AbstractC1389j abstractC1389j, byte[] bArr) {
        InterfaceC1554e interfaceC1554eMo1941e;
        InterfaceC1554e interfaceC1554e;
        int iMo1930b = interfaceC1175r.mo1930b();
        byte[] bArr2 = new byte[Math.max(4, iMo1930b)];
        if (interfaceC1175r instanceof InterfaceC1554e) {
            m2212a(interfaceC1175r, abstractC1389j.m3461g());
            m2212a(interfaceC1175r, abstractC1389j.m3462h());
            InterfaceC1554e interfaceC1554e2 = (InterfaceC1554e) interfaceC1175r;
            interfaceC1554eMo1941e = interfaceC1554e2.mo1941e();
            interfaceC1554e = interfaceC1554e2;
        } else {
            interfaceC1554eMo1941e = null;
            interfaceC1554e = null;
        }
        int i = 0;
        int i2 = 0;
        while (i2 < bArr.length) {
            if (interfaceC1554e != null) {
                interfaceC1554e.mo1939a(interfaceC1554eMo1941e);
            } else {
                m2212a(interfaceC1175r, abstractC1389j.m3461g());
                m2212a(interfaceC1175r, abstractC1389j.m3462h());
            }
            i++;
            AbstractC1556g.m4136a(i, bArr2, 0);
            interfaceC1175r.mo1929a(bArr2, 0, 4);
            interfaceC1175r.mo1926a(bArr2, 0);
            int iMin = Math.min(iMo1930b, bArr.length - i2);
            m2214a(bArr, bArr2, i2, iMin);
            i2 += iMin;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2214a(byte[] bArr, byte[] bArr2, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            int i4 = i + i3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2215a(int i) {
        return (this.f3764e * 2) + 1 + i + this.f3760a.mo1930b();
    }

    /* JADX INFO: renamed from: a */
    public final void m2216a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3761b = z;
        if (z) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f3762c = (C1050ab) c1081bf.m2614b();
            this.f3763d = this.f3762c.m2563b();
            if (((C1053ae) this.f3762c).m2566c().m3447a(this.f3763d.m2702d()).m3469p()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.f3765f = c1081bf.m2613a();
        } else {
            this.f3762c = (C1050ab) interfaceC1003i;
            this.f3763d = this.f3762c.m2563b();
        }
        this.f3764e = (this.f3763d.m2699a().mo2905a() + 7) / 8;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2217a(byte[] bArr, int i) throws C1179v {
        BigInteger bigIntegerM4114a;
        byte[] bArrM3452a;
        AbstractC1389j abstractC1389jM3468o;
        boolean z;
        if (!this.f3761b) {
            byte[] bArr2 = new byte[(this.f3764e * 2) + 1];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            AbstractC1389j abstractC1389jM3357a = this.f3763d.m2699a().m3357a(bArr2);
            if (abstractC1389jM3357a.m3447a(this.f3763d.m2702d()).m3469p()) {
                throw new C1179v("[h]C1 at infinity");
            }
            AbstractC1389j abstractC1389jM3468o2 = abstractC1389jM3357a.m3447a(((C1052ad) this.f3762c).m2565c()).m3468o();
            byte[] bArr3 = new byte[(i - bArr2.length) - this.f3760a.mo1930b()];
            System.arraycopy(bArr, bArr2.length + 0, bArr3, 0, bArr3.length);
            m2213a(this.f3760a, abstractC1389jM3468o2, bArr3);
            byte[] bArr4 = new byte[this.f3760a.mo1930b()];
            m2212a(this.f3760a, abstractC1389jM3468o2.m3461g());
            this.f3760a.mo1929a(bArr3, 0, bArr3.length);
            m2212a(this.f3760a, abstractC1389jM3468o2.m3462h());
            this.f3760a.mo1926a(bArr4, 0);
            int i2 = 0;
            for (int i3 = 0; i3 != bArr4.length; i3++) {
                i2 |= bArr4[i3] ^ bArr[((bArr2.length + 0) + bArr3.length) + i3];
            }
            C1535a.m4071a(bArr2, (byte) 0);
            C1535a.m4071a(bArr4, (byte) 0);
            if (i2 == 0) {
                return bArr3;
            }
            C1535a.m4071a(bArr3, (byte) 0);
            throw new C1179v("invalid cipher text");
        }
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr, 0, bArr5, 0, bArr5.length);
        C1392m c1392m = new C1392m();
        do {
            int iBitLength = this.f3763d.m2701c().bitLength();
            while (true) {
                bigIntegerM4114a = C1544b.m4114a(iBitLength, this.f3765f);
                if (!bigIntegerM4114a.equals(InterfaceC1376c.f4994c) && bigIntegerM4114a.compareTo(this.f3763d.m2701c()) < 0) {
                    break;
                }
            }
            bArrM3452a = c1392m.mo2903a(this.f3763d.m2700b(), bigIntegerM4114a).m3468o().m3452a(false);
            abstractC1389jM3468o = ((C1053ae) this.f3762c).m2566c().m3447a(bigIntegerM4114a).m3468o();
            m2213a(this.f3760a, abstractC1389jM3468o, bArr5);
            int i4 = 0;
            while (true) {
                if (i4 == bArr5.length) {
                    z = true;
                    break;
                }
                if (bArr5[i4] != bArr[0]) {
                    z = false;
                    break;
                }
                i4++;
            }
        } while (z);
        byte[] bArr6 = new byte[this.f3760a.mo1930b()];
        m2212a(this.f3760a, abstractC1389jM3468o.m3461g());
        this.f3760a.mo1929a(bArr, 0, i);
        m2212a(this.f3760a, abstractC1389jM3468o.m3462h());
        this.f3760a.mo1926a(bArr6, 0);
        return C1535a.m4079a(bArrM3452a, bArr5, bArr6);
    }
}
