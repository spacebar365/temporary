package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.f.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0976w extends AbstractC0804ad {

    /* JADX INFO: renamed from: d */
    private InterfaceC1175r f4047d;

    public C0976w(InterfaceC1175r interfaceC1175r) {
        this.f4047d = interfaceC1175r;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m2440a() {
        byte[] bArr = new byte[this.f4047d.mo1930b()];
        this.f4047d.mo1929a(this.f3324a, 0, this.f3324a.length);
        this.f4047d.mo1929a(this.f3325b, 0, this.f3325b.length);
        this.f4047d.mo1926a(bArr, 0);
        for (int i = 1; i < this.f3326c; i++) {
            this.f4047d.mo1929a(bArr, 0, bArr.length);
            this.f4047d.mo1926a(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1897a(int i) {
        int i2 = i / 8;
        if (i2 > this.f4047d.mo1930b()) {
            throw new IllegalArgumentException("Can't generate a derived key " + i2 + " bytes long.");
        }
        return new C1076ba(m2440a(), 0, i2);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1898a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        if (i3 + i4 > this.f4047d.mo1930b()) {
            throw new IllegalArgumentException("Can't generate a derived key " + (i3 + i4) + " bytes long.");
        }
        byte[] bArrM2440a = m2440a();
        return new C1080be(new C1076ba(bArrM2440a, 0, i3), bArrM2440a, i3, i4);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i mo1900b(int i) {
        return mo1897a(i);
    }
}
