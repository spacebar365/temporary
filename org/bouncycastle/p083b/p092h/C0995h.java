package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p089e.C0938o;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.InterfaceC1039a;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.h.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0995h implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private byte[] f4104a;

    /* JADX INFO: renamed from: b */
    private byte[] f4105b;

    /* JADX INFO: renamed from: c */
    private int f4106c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0890e f4107d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1039a f4108e;

    /* JADX INFO: renamed from: f */
    private int f4109f;

    /* JADX INFO: renamed from: g */
    private C1076ba f4110g;

    /* JADX INFO: renamed from: h */
    private C1076ba f4111h;

    public C0995h(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, interfaceC0890e.mo2125b() * 8, null);
    }

    private C0995h(InterfaceC0890e interfaceC0890e, int i, InterfaceC1039a interfaceC1039a) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(interfaceC0890e instanceof C0938o)) {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.f4107d = new C1010b(interfaceC0890e);
        this.f4108e = interfaceC1039a;
        this.f4109f = i / 8;
        this.f4104a = new byte[interfaceC0890e.mo2125b()];
        this.f4105b = new byte[interfaceC0890e.mo2125b()];
        this.f4106c = 0;
    }

    public C0995h(InterfaceC0890e interfaceC0890e, InterfaceC1039a interfaceC1039a) {
        this(interfaceC0890e, interfaceC0890e.mo2125b() * 8, interfaceC1039a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        int iMo2125b = this.f4107d.mo2125b();
        if (this.f4108e == null) {
            while (this.f4106c < iMo2125b) {
                this.f4105b[this.f4106c] = 0;
                this.f4106c++;
            }
        } else {
            if (this.f4106c == iMo2125b) {
                this.f4107d.mo2122a(this.f4105b, 0, this.f4104a, 0);
                this.f4106c = 0;
            }
            this.f4108e.mo2556a(this.f4105b, this.f4106c);
        }
        this.f4107d.mo2122a(this.f4105b, 0, this.f4104a, 0);
        C0938o c0938o = new C0938o();
        c0938o.mo2124a(false, (InterfaceC1003i) this.f4110g);
        c0938o.mo2122a(this.f4104a, 0, this.f4104a, 0);
        c0938o.mo2124a(true, (InterfaceC1003i) this.f4111h);
        c0938o.mo2122a(this.f4104a, 0, this.f4104a, 0);
        System.arraycopy(this.f4104a, 0, bArr, i, this.f4109f);
        mo2452c();
        return this.f4109f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return "ISO9797Alg3";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        if (this.f4106c == this.f4105b.length) {
            this.f4107d.mo2122a(this.f4105b, 0, this.f4104a, 0);
            this.f4106c = 0;
        }
        byte[] bArr = this.f4105b;
        int i = this.f4106c;
        this.f4106c = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        C1076ba c1076ba;
        mo2452c();
        if (!(interfaceC1003i instanceof C1076ba) && !(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] bArrM2603a = (interfaceC1003i instanceof C1076ba ? (C1076ba) interfaceC1003i : (C1076ba) ((C1080be) interfaceC1003i).m2612b()).m2603a();
        if (bArrM2603a.length == 16) {
            c1076ba = new C1076ba(bArrM2603a, 0, 8);
            this.f4110g = new C1076ba(bArrM2603a, 8, 8);
            this.f4111h = c1076ba;
        } else {
            if (bArrM2603a.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            c1076ba = new C1076ba(bArrM2603a, 0, 8);
            this.f4110g = new C1076ba(bArrM2603a, 8, 8);
            this.f4111h = new C1076ba(bArrM2603a, 16, 8);
        }
        if (interfaceC1003i instanceof C1080be) {
            this.f4107d.mo2124a(true, new C1080be(c1076ba, ((C1080be) interfaceC1003i).m2611a()));
        } else {
            this.f4107d.mo2124a(true, c1076ba);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iMo2125b = this.f4107d.mo2125b();
        int i3 = iMo2125b - this.f4106c;
        if (i2 > i3) {
            System.arraycopy(bArr, i, this.f4105b, this.f4106c, i3);
            this.f4107d.mo2122a(this.f4105b, 0, this.f4104a, 0);
            this.f4106c = 0;
            i2 -= i3;
            i += i3;
            while (i2 > iMo2125b) {
                this.f4107d.mo2122a(bArr, i, this.f4104a, 0);
                i2 -= iMo2125b;
                i += iMo2125b;
            }
        }
        System.arraycopy(bArr, i, this.f4105b, this.f4106c, i2);
        this.f4106c += i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4109f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        for (int i = 0; i < this.f4105b.length; i++) {
            this.f4105b[i] = 0;
        }
        this.f4106c = 0;
        this.f4107d.mo2126c();
    }
}
