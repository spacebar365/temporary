package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.h.j */
/* JADX INFO: loaded from: classes.dex */
final class C0997j {

    /* JADX INFO: renamed from: a */
    private byte[] f4114a;

    /* JADX INFO: renamed from: b */
    private byte[] f4115b;

    /* JADX INFO: renamed from: c */
    private byte[] f4116c;

    /* JADX INFO: renamed from: d */
    private int f4117d = 1;

    /* JADX INFO: renamed from: e */
    private InterfaceC0890e f4118e;

    public C0997j(InterfaceC0890e interfaceC0890e) {
        this.f4118e = null;
        this.f4118e = interfaceC0890e;
        this.f4114a = new byte[interfaceC0890e.mo2125b()];
        this.f4115b = new byte[interfaceC0890e.mo2125b()];
        this.f4116c = new byte[interfaceC0890e.mo2125b()];
    }

    /* JADX INFO: renamed from: a */
    public final int m2460a(byte[] bArr, int i, byte[] bArr2) {
        if (this.f4117d + i > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (this.f4117d + 0 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        this.f4118e.mo2122a(this.f4115b, 0, this.f4116c, 0);
        for (int i2 = 0; i2 < this.f4117d; i2++) {
            bArr2[i2 + 0] = (byte) (this.f4116c[i2] ^ bArr[i + i2]);
        }
        System.arraycopy(this.f4115b, this.f4117d, this.f4115b, 0, this.f4115b.length - this.f4117d);
        System.arraycopy(bArr2, 0, this.f4115b, this.f4115b.length - this.f4117d, this.f4117d);
        return this.f4117d;
    }

    /* JADX INFO: renamed from: a */
    public final String m2461a() {
        return this.f4118e.mo2123a() + "/CFB" + (this.f4117d * 8);
    }

    /* JADX INFO: renamed from: a */
    public final void m2462a(InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            m2465c();
            this.f4118e.mo2124a(true, interfaceC1003i);
            return;
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a.length < this.f4114a.length) {
            System.arraycopy(bArrM2611a, 0, this.f4114a, this.f4114a.length - bArrM2611a.length, bArrM2611a.length);
        } else {
            System.arraycopy(bArrM2611a, 0, this.f4114a, 0, this.f4114a.length);
        }
        m2465c();
        this.f4118e.mo2124a(true, c1080be.m2612b());
    }

    /* JADX INFO: renamed from: a */
    final void m2463a(byte[] bArr) {
        this.f4118e.mo2122a(this.f4115b, 0, bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public final int m2464b() {
        return this.f4117d;
    }

    /* JADX INFO: renamed from: c */
    public final void m2465c() {
        System.arraycopy(this.f4114a, 0, this.f4115b, 0, this.f4114a.length);
        this.f4118e.mo2126c();
    }
}
