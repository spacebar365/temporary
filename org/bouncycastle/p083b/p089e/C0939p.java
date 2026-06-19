package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0939p extends C0938o {

    /* JADX INFO: renamed from: a */
    private int[] f3898a = null;

    /* JADX INFO: renamed from: b */
    private int[] f3899b = null;

    /* JADX INFO: renamed from: c */
    private int[] f3900c = null;

    /* JADX INFO: renamed from: d */
    private boolean f3901d;

    @Override // org.bouncycastle.p083b.p089e.C0938o, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3898a == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.f3901d) {
            m2348a(this.f3898a, bArr, i, bArr3, 0);
            m2348a(this.f3899b, bArr3, 0, bArr3, 0);
            m2348a(this.f3900c, bArr3, 0, bArr2, i2);
        } else {
            m2348a(this.f3900c, bArr, i, bArr3, 0);
            m2348a(this.f3899b, bArr3, 0, bArr3, 0);
            m2348a(this.f3898a, bArr3, 0, bArr2, i2);
        }
        return 8;
    }

    @Override // org.bouncycastle.p083b.p089e.C0938o, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "DESede";
    }

    @Override // org.bouncycastle.p083b.p089e.C0938o, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + interfaceC1003i.getClass().getName());
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (bArrM2603a.length != 24 && bArrM2603a.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f3901d = z;
        byte[] bArr = new byte[8];
        System.arraycopy(bArrM2603a, 0, bArr, 0, 8);
        this.f3898a = m2349a(z, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArrM2603a, 8, bArr2, 0, 8);
        this.f3899b = m2349a(!z, bArr2);
        if (bArrM2603a.length != 24) {
            this.f3900c = this.f3898a;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArrM2603a, 16, bArr3, 0, 8);
        this.f3900c = m2349a(z, bArr3);
    }

    @Override // org.bouncycastle.p083b.p089e.C0938o, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 8;
    }

    @Override // org.bouncycastle.p083b.p089e.C0938o, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }
}
