package org.bouncycastle.p083b.p089e;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0902ak implements InterfaceC0816ap {

    /* JADX INFO: renamed from: a */
    private C1010b f3712a;

    /* JADX INFO: renamed from: b */
    private C1080be f3713b;

    /* JADX INFO: renamed from: c */
    private boolean f3714c;

    /* JADX INFO: renamed from: d */
    private SecureRandom f3715d;

    public C0902ak(InterfaceC0890e interfaceC0890e) {
        this.f3712a = new C1010b(interfaceC0890e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return this.f3712a.m2491d().mo2123a() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3714c = z;
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f3715d = c1081bf.m2613a();
            if (!(c1081bf.m2614b() instanceof C1080be)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.f3713b = (C1080be) c1081bf.m2614b();
            return;
        }
        if (z) {
            this.f3715d = C1124l.m2709a();
        }
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.f3713b = (C1080be) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        if (!this.f3714c) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i > 255 || i < 0) {
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        this.f3712a.mo2124a(true, this.f3713b);
        int iMo2125b = this.f3712a.mo2125b();
        byte[] bArr2 = new byte[i + 4 < iMo2125b * 2 ? iMo2125b * 2 : (i + 4) % iMo2125b == 0 ? i + 4 : (((i + 4) / iMo2125b) + 1) * iMo2125b];
        bArr2[0] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 4, i);
        byte[] bArr3 = new byte[bArr2.length - (i + 4)];
        this.f3715d.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i + 4, bArr3.length);
        bArr2[1] = (byte) (bArr2[4] ^ (-1));
        bArr2[2] = (byte) (bArr2[5] ^ (-1));
        bArr2[3] = (byte) (bArr2[6] ^ (-1));
        for (int i2 = 0; i2 < bArr2.length; i2 += iMo2125b) {
            this.f3712a.mo2122a(bArr2, i2, bArr2, i2);
        }
        for (int i3 = 0; i3 < bArr2.length; i3 += iMo2125b) {
            this.f3712a.mo2122a(bArr2, i3, bArr2, i3);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) throws C1179v {
        if (this.f3714c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int iMo2125b = this.f3712a.mo2125b();
        if (i < iMo2125b * 2) {
            throw new C1179v("input too short");
        }
        byte[] bArr2 = new byte[i];
        byte[] bArr3 = new byte[iMo2125b];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(bArr, 0, bArr3, 0, bArr3.length);
        this.f3712a.mo2124a(false, new C1080be(this.f3713b.m2612b(), bArr3));
        for (int i2 = iMo2125b; i2 < bArr2.length; i2 += iMo2125b) {
            this.f3712a.mo2122a(bArr2, i2, bArr2, i2);
        }
        System.arraycopy(bArr2, bArr2.length - bArr3.length, bArr3, 0, bArr3.length);
        this.f3712a.mo2124a(false, new C1080be(this.f3713b.m2612b(), bArr3));
        this.f3712a.mo2122a(bArr2, 0, bArr2, 0);
        this.f3712a.mo2124a(false, this.f3713b);
        for (int i3 = 0; i3 < bArr2.length; i3 += iMo2125b) {
            this.f3712a.mo2122a(bArr2, i3, bArr2, i3);
        }
        boolean z = (bArr2[0] & 255) > bArr2.length + (-4);
        byte[] bArr4 = z ? new byte[bArr2.length - 4] : new byte[bArr2[0] & 255];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i4 = 0;
        for (int i5 = 0; i5 != 3; i5++) {
            i4 |= ((byte) (bArr2[i5 + 1] ^ (-1))) ^ bArr2[i5 + 4];
        }
        C1535a.m4094d(bArr2);
        if ((i4 != 0) || z) {
            throw new C1179v("wrapped key corrupted");
        }
        return bArr4;
    }
}
