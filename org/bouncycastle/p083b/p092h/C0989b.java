package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p096j.InterfaceC1039a;

/* JADX INFO: renamed from: org.bouncycastle.b.h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0989b implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private byte[] f4065a;

    /* JADX INFO: renamed from: b */
    private byte[] f4066b;

    /* JADX INFO: renamed from: c */
    private int f4067c;

    /* JADX INFO: renamed from: d */
    private C0997j f4068d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1039a f4069e;

    /* JADX INFO: renamed from: f */
    private int f4070f;

    public C0989b(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, (interfaceC0890e.mo2125b() * 8) / 2);
    }

    private C0989b(InterfaceC0890e interfaceC0890e, int i) {
        this.f4069e = null;
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f4065a = new byte[interfaceC0890e.mo2125b()];
        this.f4068d = new C0997j(interfaceC0890e);
        this.f4069e = null;
        this.f4070f = i / 8;
        this.f4066b = new byte[this.f4068d.m2464b()];
        this.f4067c = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        int iM2464b = this.f4068d.m2464b();
        if (this.f4069e == null) {
            while (this.f4067c < iM2464b) {
                this.f4066b[this.f4067c] = 0;
                this.f4067c++;
            }
        } else {
            this.f4069e.mo2556a(this.f4066b, this.f4067c);
        }
        this.f4068d.m2460a(this.f4066b, 0, this.f4065a);
        this.f4068d.m2463a(this.f4065a);
        System.arraycopy(this.f4065a, 0, bArr, i, this.f4070f);
        mo2452c();
        return this.f4070f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4068d.m2461a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        if (this.f4067c == this.f4066b.length) {
            this.f4068d.m2460a(this.f4066b, 0, this.f4065a);
            this.f4067c = 0;
        }
        byte[] bArr = this.f4066b;
        int i = this.f4067c;
        this.f4067c = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        mo2452c();
        this.f4068d.m2462a(interfaceC1003i);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iM2464b = this.f4068d.m2464b();
        int i3 = iM2464b - this.f4067c;
        if (i2 > i3) {
            System.arraycopy(bArr, i, this.f4066b, this.f4067c, i3);
            this.f4068d.m2460a(this.f4066b, 0, this.f4065a);
            this.f4067c = 0;
            i2 -= i3;
            i += i3;
            while (i2 > iM2464b) {
                this.f4068d.m2460a(bArr, i, this.f4065a);
                i2 -= iM2464b;
                i += iM2464b;
            }
        }
        System.arraycopy(bArr, i, this.f4066b, this.f4067c, i2);
        this.f4067c += i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4070f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        for (int i = 0; i < this.f4066b.length; i++) {
            this.f4066b[i] = 0;
        }
        this.f4067c = 0;
        this.f4068d.m2465c();
    }
}
