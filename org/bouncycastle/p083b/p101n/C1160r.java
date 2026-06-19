package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import org.bouncycastle.p083b.C1038j;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0811ak;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0820aa;
import org.bouncycastle.p083b.p097k.C1050ab;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1079bd;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.C1392m;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.b.n.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1160r implements InterfaceC0811ak, InterfaceC1376c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1144b f4637a;

    /* JADX INFO: renamed from: b */
    private final C0820aa f4638b;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1143a f4639i;

    /* JADX INFO: renamed from: j */
    private C1122y f4640j;

    /* JADX INFO: renamed from: k */
    private AbstractC1389j f4641k;

    /* JADX INFO: renamed from: l */
    private C1050ab f4642l;

    /* JADX INFO: renamed from: m */
    private byte[] f4643m;

    public C1160r() {
        this(C1161s.f4644a);
    }

    private C1160r(InterfaceC1143a interfaceC1143a) {
        this.f4637a = new C1159q();
        this.f4638b = new C0820aa();
        this.f4639i = interfaceC1143a;
    }

    /* JADX INFO: renamed from: a */
    private static void m2773a(InterfaceC1175r interfaceC1175r, AbstractC1386g abstractC1386g) {
        byte[] bArrM3436l = abstractC1386g.m3436l();
        interfaceC1175r.mo1929a(bArrM3436l, 0, bArrM3436l.length);
    }

    /* JADX INFO: renamed from: b */
    private static BigInteger m2774b(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: b */
    private void m2775b() {
        this.f4638b.mo1931c();
        if (this.f4643m != null) {
            this.f4638b.mo1929a(this.f4643m, 0, this.f4643m.length);
        }
    }

    /* JADX INFO: renamed from: c */
    private byte[] m2776c() {
        byte[] bArr = new byte[this.f4638b.mo1930b()];
        this.f4638b.mo1926a(bArr, 0);
        m2775b();
        return bArr;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1903a(byte b) {
        this.f4638b.mo1928a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1905a(byte[] bArr, int i, int i2) {
        this.f4638b.mo1929a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1904a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2610b;
        byte[] bArrM4106a;
        if (interfaceC1003i instanceof C1079bd) {
            interfaceC1003iM2610b = ((C1079bd) interfaceC1003i).m2610b();
            bArrM4106a = ((C1079bd) interfaceC1003i).m2609a();
        } else {
            interfaceC1003iM2610b = interfaceC1003i;
            bArrM4106a = C1541f.m4106a("31323334353637383132333435363738");
        }
        if (z) {
            if (interfaceC1003iM2610b instanceof C1081bf) {
                C1081bf c1081bf = (C1081bf) interfaceC1003iM2610b;
                this.f4642l = (C1050ab) c1081bf.m2614b();
                this.f4640j = this.f4642l.m2563b();
                this.f4637a.mo2750a(this.f4640j.m2701c(), c1081bf.m2613a());
            } else {
                this.f4642l = (C1050ab) interfaceC1003iM2610b;
                this.f4640j = this.f4642l.m2563b();
                this.f4637a.mo2750a(this.f4640j.m2701c(), C1124l.m2709a());
            }
            this.f4641k = new C1392m().mo2903a(this.f4640j.m2700b(), ((C1052ad) this.f4642l).m2565c()).m3468o();
        } else {
            this.f4642l = (C1050ab) interfaceC1003iM2610b;
            this.f4640j = this.f4642l.m2563b();
            this.f4641k = ((C1053ae) this.f4642l).m2566c();
        }
        this.f4638b.mo1931c();
        C0820aa c0820aa = this.f4638b;
        int length = bArrM4106a.length * 8;
        c0820aa.mo1928a((byte) ((length >> 8) & 255));
        c0820aa.mo1928a((byte) (length & 255));
        c0820aa.mo1929a(bArrM4106a, 0, bArrM4106a.length);
        m2773a(this.f4638b, this.f4640j.m2699a().m3366g());
        m2773a(this.f4638b, this.f4640j.m2699a().m3367h());
        m2773a(this.f4638b, this.f4640j.m2700b().m3461g());
        m2773a(this.f4638b, this.f4640j.m2700b().m3462h());
        m2773a(this.f4638b, this.f4641k.m3461g());
        m2773a(this.f4638b, this.f4641k.m3462h());
        byte[] bArr = new byte[this.f4638b.mo1930b()];
        this.f4638b.mo1926a(bArr, 0);
        this.f4643m = bArr;
        this.f4638b.mo1929a(this.f4643m, 0, this.f4643m.length);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final boolean mo1906a(byte[] bArr) {
        try {
            BigInteger[] bigIntegerArrMo2748a = this.f4639i.mo2748a(this.f4640j.m2701c(), bArr);
            BigInteger bigInteger = bigIntegerArrMo2748a[0];
            BigInteger bigInteger2 = bigIntegerArrMo2748a[1];
            BigInteger bigIntegerM2701c = this.f4640j.m2701c();
            if (bigInteger.compareTo(f4995d) < 0 || bigInteger.compareTo(bigIntegerM2701c) >= 0) {
                return false;
            }
            if (bigInteger2.compareTo(f4995d) < 0 || bigInteger2.compareTo(bigIntegerM2701c) >= 0) {
                return false;
            }
            BigInteger bigIntegerM2774b = m2774b(m2776c());
            BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(bigIntegerM2701c);
            if (bigIntegerMod.equals(f4994c)) {
                return false;
            }
            AbstractC1389j abstractC1389jM3468o = C1371b.m3274a(this.f4640j.m2700b(), bigInteger2, ((C1053ae) this.f4642l).m2566c(), bigIntegerMod).m3468o();
            if (abstractC1389jM3468o.m3469p()) {
                return false;
            }
            return bigIntegerM2774b.add(abstractC1389jM3468o.m3461g().mo2928a()).mod(bigIntegerM2701c).equals(bigInteger);
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final byte[] mo1907a() throws C1038j {
        byte[] bArrM2776c = m2776c();
        BigInteger bigIntegerM2701c = this.f4640j.m2701c();
        BigInteger bigIntegerM2774b = m2774b(bArrM2776c);
        BigInteger bigIntegerM2565c = ((C1052ad) this.f4642l).m2565c();
        C1392m c1392m = new C1392m();
        while (true) {
            BigInteger bigIntegerMo2752b = this.f4637a.mo2752b();
            BigInteger bigIntegerMod = bigIntegerM2774b.add(c1392m.mo2903a(this.f4640j.m2700b(), bigIntegerMo2752b).m3468o().m3461g().mo2928a()).mod(bigIntegerM2701c);
            if (!bigIntegerMod.equals(f4994c) && !bigIntegerMod.add(bigIntegerMo2752b).equals(bigIntegerM2701c)) {
                BigInteger bigIntegerMod2 = bigIntegerM2565c.add(f4995d).modInverse(bigIntegerM2701c).multiply(bigIntegerMo2752b.subtract(bigIntegerMod.multiply(bigIntegerM2565c)).mod(bigIntegerM2701c)).mod(bigIntegerM2701c);
                if (!bigIntegerMod2.equals(f4994c)) {
                    try {
                        return this.f4639i.mo2747a(this.f4640j.m2701c(), bigIntegerMod, bigIntegerMod2);
                    } catch (Exception e) {
                        throw new C1038j("unable to encode signature: " + e.getMessage(), e);
                    }
                }
            }
        }
    }
}
