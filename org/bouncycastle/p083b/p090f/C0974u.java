package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.f.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0974u extends AbstractC0804ad {

    /* JADX INFO: renamed from: d */
    private InterfaceC1175r f4043d = new C0836m();

    /* JADX INFO: renamed from: c */
    private byte[] m2437c(int i) {
        byte[] bArr = new byte[this.f4043d.mo1930b()];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            this.f4043d.mo1929a(this.f3324a, 0, this.f3324a.length);
            this.f4043d.mo1929a(this.f3325b, 0, this.f3325b.length);
            this.f4043d.mo1926a(bArr, 0);
            int length = i > bArr.length ? bArr.length : i;
            System.arraycopy(bArr, 0, bArr2, i2, length);
            i2 += length;
            i -= length;
            if (i == 0) {
                return bArr2;
            }
            this.f4043d.mo1931c();
            this.f4043d.mo1929a(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1897a(int i) {
        int i2 = i / 8;
        return new C1076ba(m2437c(i2), 0, i2);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1898a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrM2437c = m2437c(i3 + i4);
        return new C1080be(new C1076ba(bArrM2437c, 0, i3), bArrM2437c, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m2438a(byte[] bArr, byte[] bArr2) {
        super.m1899a(bArr, bArr2, 1);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i mo1900b(int i) {
        return mo1897a(i);
    }
}
