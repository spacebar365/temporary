package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1022g implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int f4212a;

    /* JADX INFO: renamed from: b */
    private int f4213b;

    /* JADX INFO: renamed from: c */
    private byte[] f4214c;

    /* JADX INFO: renamed from: d */
    private byte[] f4215d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0890e f4216e;

    /* JADX INFO: renamed from: f */
    private boolean f4217f = false;

    /* JADX INFO: renamed from: g */
    private boolean f4218g;

    public C1022g(InterfaceC0890e interfaceC0890e) {
        this.f4213b = interfaceC0890e.mo2125b();
        this.f4216e = interfaceC0890e;
    }

    /* JADX INFO: renamed from: a */
    private void m2511a(byte[] bArr) {
        byte[] bArrM2529a = C1029n.m2529a(this.f4214c, this.f4212a - this.f4213b);
        System.arraycopy(bArrM2529a, 0, this.f4214c, 0, bArrM2529a.length);
        System.arraycopy(bArr, 0, this.f4214c, bArrM2529a.length, this.f4212a - bArrM2529a.length);
    }

    /* JADX INFO: renamed from: d */
    private void m2512d() {
        this.f4214c = new byte[this.f4212a];
        this.f4215d = new byte[this.f4212a];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return this.f4216e.mo2123a() + "/CBC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4213b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
        if (this.f4217f) {
            System.arraycopy(this.f4215d, 0, this.f4214c, 0, this.f4215d.length);
            this.f4216e.mo2126c();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4218g = z;
        if (interfaceC1003i instanceof C1080be) {
            C1080be c1080be = (C1080be) interfaceC1003i;
            byte[] bArrM2611a = c1080be.m2611a();
            if (bArrM2611a.length < this.f4213b) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.f4212a = bArrM2611a.length;
            m2512d();
            this.f4215d = C1535a.m4086b(bArrM2611a);
            System.arraycopy(this.f4215d, 0, this.f4214c, 0, this.f4215d.length);
            if (c1080be.m2612b() != null) {
                this.f4216e.mo2124a(z, c1080be.m2612b());
            }
        } else {
            this.f4212a = this.f4213b;
            m2512d();
            System.arraycopy(this.f4215d, 0, this.f4214c, 0, this.f4215d.length);
            if (interfaceC1003i != null) {
                this.f4216e.mo2124a(z, interfaceC1003i);
            }
        }
        this.f4217f = true;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f4218g) {
            byte[] bArrM2531a = C1029n.m2531a(C1029n.m2530a(bArr, this.f4213b, i), C1535a.m4078a(this.f4214c, this.f4213b));
            byte[] bArr3 = new byte[bArrM2531a.length];
            this.f4216e.mo2122a(bArrM2531a, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            if (bArr2.length > bArrM2531a.length + i2) {
                m2511a(bArr3);
            }
            return bArr3.length;
        }
        byte[] bArrM4078a = C1535a.m4078a(this.f4214c, this.f4213b);
        byte[] bArrM2530a = C1029n.m2530a(bArr, this.f4213b, i);
        byte[] bArr4 = new byte[bArrM2530a.length];
        this.f4216e.mo2122a(bArrM2530a, 0, bArr4, 0);
        byte[] bArrM2531a2 = C1029n.m2531a(bArr4, bArrM4078a);
        System.arraycopy(bArrM2531a2, 0, bArr2, i2, bArrM2531a2.length);
        if (bArr2.length > bArrM2531a2.length + i2) {
            m2511a(bArrM2530a);
        }
        return bArrM2531a2.length;
    }
}
