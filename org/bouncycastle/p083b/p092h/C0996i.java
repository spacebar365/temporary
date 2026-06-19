package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p093i.C1032q;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.h.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0996i implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private final C1032q f4112a;

    /* JADX INFO: renamed from: b */
    private final int f4113b;

    public C0996i(C1032q c1032q, int i) {
        this.f4112a = c1032q;
        this.f4113b = i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        try {
            return this.f4112a.mo2473a(bArr, i);
        } catch (C1179v e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4112a.mo2475a().mo2123a() + "-KGMAC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4112a.m2541a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        this.f4112a.mo2476a(true, (InterfaceC1003i) new C1048a((C1076ba) c1080be.m2612b(), this.f4113b, bArrM2611a));
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        this.f4112a.mo2477a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4113b / 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4112a.m2542c();
    }
}
