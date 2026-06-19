package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1010b implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private byte[] f4171a;

    /* JADX INFO: renamed from: b */
    private byte[] f4172b;

    /* JADX INFO: renamed from: c */
    private byte[] f4173c;

    /* JADX INFO: renamed from: d */
    private int f4174d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0890e f4175e;

    /* JADX INFO: renamed from: f */
    private boolean f4176f;

    public C1010b(InterfaceC0890e interfaceC0890e) {
        this.f4175e = null;
        this.f4175e = interfaceC0890e;
        this.f4174d = interfaceC0890e.mo2125b();
        this.f4171a = new byte[this.f4174d];
        this.f4172b = new byte[this.f4174d];
        this.f4173c = new byte[this.f4174d];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return this.f4175e.mo2123a() + "/CBC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        boolean z2 = this.f4176f;
        this.f4176f = z;
        if (!(interfaceC1003i instanceof C1080be)) {
            mo2126c();
            if (interfaceC1003i != null) {
                this.f4175e.mo2124a(z, interfaceC1003i);
                return;
            } else {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a.length != this.f4174d) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(bArrM2611a, 0, this.f4171a, 0, bArrM2611a.length);
        mo2126c();
        if (c1080be.m2612b() != null) {
            this.f4175e.mo2124a(z, c1080be.m2612b());
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4175e.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
        System.arraycopy(this.f4171a, 0, this.f4172b, 0, this.f4171a.length);
        C1535a.m4071a(this.f4173c, (byte) 0);
        this.f4175e.mo2126c();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0890e m2491d() {
        return this.f4175e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f4176f) {
            if (this.f4174d + i > bArr.length) {
                throw new C1163o("input buffer too short");
            }
            for (int i3 = 0; i3 < this.f4174d; i3++) {
                byte[] bArr3 = this.f4172b;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int iMo2122a = this.f4175e.mo2122a(this.f4172b, 0, bArr2, i2);
            System.arraycopy(bArr2, i2, this.f4172b, 0, this.f4172b.length);
            return iMo2122a;
        }
        if (this.f4174d + i > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        System.arraycopy(bArr, i, this.f4173c, 0, this.f4174d);
        int iMo2122a2 = this.f4175e.mo2122a(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < this.f4174d; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ this.f4172b[i4]);
        }
        byte[] bArr4 = this.f4172b;
        this.f4172b = this.f4173c;
        this.f4173c = bArr4;
        return iMo2122a2;
    }
}
