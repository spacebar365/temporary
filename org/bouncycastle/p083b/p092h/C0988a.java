package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.InterfaceC1039a;

/* JADX INFO: renamed from: org.bouncycastle.b.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0988a implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private byte[] f4059a;

    /* JADX INFO: renamed from: b */
    private byte[] f4060b;

    /* JADX INFO: renamed from: c */
    private int f4061c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0890e f4062d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1039a f4063e;

    /* JADX INFO: renamed from: f */
    private int f4064f;

    public C0988a(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, (interfaceC0890e.mo2125b() * 8) / 2, null);
    }

    public C0988a(InterfaceC0890e interfaceC0890e, int i) {
        this(interfaceC0890e, i, null);
    }

    public C0988a(InterfaceC0890e interfaceC0890e, int i, InterfaceC1039a interfaceC1039a) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f4062d = new C1010b(interfaceC0890e);
        this.f4063e = interfaceC1039a;
        this.f4064f = i / 8;
        this.f4059a = new byte[interfaceC0890e.mo2125b()];
        this.f4060b = new byte[interfaceC0890e.mo2125b()];
        this.f4061c = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        int iMo2125b = this.f4062d.mo2125b();
        if (this.f4063e == null) {
            while (this.f4061c < iMo2125b) {
                this.f4060b[this.f4061c] = 0;
                this.f4061c++;
            }
        } else {
            if (this.f4061c == iMo2125b) {
                this.f4062d.mo2122a(this.f4060b, 0, this.f4059a, 0);
                this.f4061c = 0;
            }
            this.f4063e.mo2556a(this.f4060b, this.f4061c);
        }
        this.f4062d.mo2122a(this.f4060b, 0, this.f4059a, 0);
        System.arraycopy(this.f4059a, 0, bArr, i, this.f4064f);
        mo2452c();
        return this.f4064f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4062d.mo2123a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        if (this.f4061c == this.f4060b.length) {
            this.f4062d.mo2122a(this.f4060b, 0, this.f4059a, 0);
            this.f4061c = 0;
        }
        byte[] bArr = this.f4060b;
        int i = this.f4061c;
        this.f4061c = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        mo2452c();
        this.f4062d.mo2124a(true, interfaceC1003i);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iMo2125b = this.f4062d.mo2125b();
        int i3 = iMo2125b - this.f4061c;
        if (i2 > i3) {
            System.arraycopy(bArr, i, this.f4060b, this.f4061c, i3);
            this.f4062d.mo2122a(this.f4060b, 0, this.f4059a, 0);
            this.f4061c = 0;
            i2 -= i3;
            i += i3;
            while (i2 > iMo2125b) {
                this.f4062d.mo2122a(bArr, i, this.f4059a, 0);
                i2 -= iMo2125b;
                i += iMo2125b;
            }
        }
        System.arraycopy(bArr, i, this.f4060b, this.f4061c, i2);
        this.f4061c += i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4064f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        for (int i = 0; i < this.f4060b.length; i++) {
            this.f4060b[i] = 0;
        }
        this.f4061c = 0;
        this.f4062d.mo2126c();
    }
}
