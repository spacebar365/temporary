package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p086b.C0822ac;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1090bo;

/* JADX INFO: renamed from: org.bouncycastle.b.h.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1001n implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private C0822ac f4156a;

    public C1001n(int i, int i2) {
        this.f4156a = new C0822ac(i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        return this.f4156a.m1955a(bArr, i);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return "Skein-MAC-" + (this.f4156a.m1959b() * 8) + "-" + (this.f4156a.m1954a() * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4156a.m1956a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        C1090bo c1090boM2636a;
        if (interfaceC1003i instanceof C1090bo) {
            c1090boM2636a = (C1090bo) interfaceC1003i;
        } else {
            if (!(interfaceC1003i instanceof C1076ba)) {
                throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + interfaceC1003i.getClass().getName());
            }
            c1090boM2636a = new C1090bo.a().m2635a(((C1076ba) interfaceC1003i).m2603a()).m2636a();
        }
        if (c1090boM2636a.m2634b() == null) {
            throw new IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        this.f4156a.m1957a(c1090boM2636a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        this.f4156a.m1958a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4156a.m1954a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4156a.m1960c();
    }
}
