package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1082bg;

/* JADX INFO: renamed from: org.bouncycastle.b.i.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1026k extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private static final byte[] f4246a = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};

    /* JADX INFO: renamed from: b */
    private final C1019d f4247b;

    /* JADX INFO: renamed from: c */
    private C1076ba f4248c;

    /* JADX INFO: renamed from: d */
    private long f4249d;

    /* JADX INFO: renamed from: e */
    private boolean f4250e;

    public C1026k(InterfaceC0890e interfaceC0890e) {
        super(interfaceC0890e);
        this.f4249d = 0L;
        this.f4247b = new C1019d(interfaceC0890e, interfaceC0890e.mo2125b() * 8);
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4249d > 0 && this.f4249d % 1024 == 0) {
            InterfaceC0890e interfaceC0890eD = this.f4247b.m1910d();
            interfaceC0890eD.mo2124a(false, this.f4248c);
            byte[] bArr = new byte[32];
            interfaceC0890eD.mo2122a(f4246a, 0, bArr, 0);
            interfaceC0890eD.mo2122a(f4246a, 8, bArr, 8);
            interfaceC0890eD.mo2122a(f4246a, 16, bArr, 16);
            interfaceC0890eD.mo2122a(f4246a, 24, bArr, 24);
            this.f4248c = new C1076ba(bArr);
            interfaceC0890eD.mo2124a(true, this.f4248c);
            byte[] bArrM2507e = this.f4247b.m2507e();
            interfaceC0890eD.mo2122a(bArrM2507e, 0, bArrM2507e, 0);
            this.f4247b.mo1912a(this.f4250e, new C1080be(this.f4248c, bArrM2507e));
        }
        this.f4249d++;
        return this.f4247b.mo1908a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4247b.mo2125b(), bArr2, i2);
        return this.f4247b.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        String strMo1911a = this.f4247b.mo1911a();
        return strMo1911a.substring(0, strMo1911a.indexOf(47)) + "/G" + strMo1911a.substring(strMo1911a.indexOf(47) + 1);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4249d = 0L;
        this.f4247b.mo1912a(z, interfaceC1003i);
        this.f4250e = z;
        InterfaceC1003i interfaceC1003iM2612b = interfaceC1003i instanceof C1080be ? ((C1080be) interfaceC1003i).m2612b() : interfaceC1003i;
        if (interfaceC1003iM2612b instanceof C1081bf) {
            interfaceC1003iM2612b = ((C1081bf) interfaceC1003iM2612b).m2614b();
        }
        if (interfaceC1003iM2612b instanceof C1082bg) {
            interfaceC1003iM2612b = ((C1082bg) interfaceC1003iM2612b).m2616b();
        }
        this.f4248c = (C1076ba) interfaceC1003iM2612b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4247b.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        this.f4249d = 0L;
        this.f4247b.mo1913c();
    }
}
