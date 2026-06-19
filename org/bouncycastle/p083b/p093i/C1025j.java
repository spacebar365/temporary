package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1025j extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private int f4238a;

    /* JADX INFO: renamed from: b */
    private int f4239b;

    /* JADX INFO: renamed from: c */
    private byte[] f4240c;

    /* JADX INFO: renamed from: d */
    private byte[] f4241d;

    /* JADX INFO: renamed from: e */
    private byte[] f4242e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0890e f4243f;

    /* JADX INFO: renamed from: g */
    private int f4244g;

    /* JADX INFO: renamed from: h */
    private boolean f4245h;

    public C1025j(InterfaceC0890e interfaceC0890e) {
        super(interfaceC0890e);
        this.f4245h = false;
        this.f4239b = interfaceC0890e.mo2125b();
        this.f4243f = interfaceC0890e;
        this.f4242e = new byte[this.f4239b];
    }

    /* JADX INFO: renamed from: e */
    private void m2515e() {
        this.f4240c = new byte[this.f4238a];
        this.f4241d = new byte[this.f4238a];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4239b, bArr2, i2);
        return this.f4239b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4243f.mo2123a() + "/OFB";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4239b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        if (this.f4245h) {
            System.arraycopy(this.f4241d, 0, this.f4240c, 0, this.f4241d.length);
            C1535a.m4094d(this.f4242e);
            this.f4244g = 0;
            this.f4243f.mo2126c();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1080be) {
            C1080be c1080be = (C1080be) interfaceC1003i;
            byte[] bArrM2611a = c1080be.m2611a();
            if (bArrM2611a.length < this.f4239b) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.f4238a = bArrM2611a.length;
            m2515e();
            this.f4241d = C1535a.m4086b(bArrM2611a);
            System.arraycopy(this.f4241d, 0, this.f4240c, 0, this.f4241d.length);
            if (c1080be.m2612b() != null) {
                this.f4243f.mo2124a(true, c1080be.m2612b());
            }
        } else {
            this.f4238a = this.f4239b * 2;
            m2515e();
            System.arraycopy(this.f4241d, 0, this.f4240c, 0, this.f4241d.length);
            if (interfaceC1003i != null) {
                this.f4243f.mo2124a(true, interfaceC1003i);
            }
        }
        this.f4245h = true;
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4244g == 0) {
            this.f4243f.mo2122a(C1535a.m4078a(this.f4240c, this.f4239b), 0, this.f4242e, 0);
        }
        byte b2 = (byte) (this.f4242e[this.f4244g] ^ b);
        this.f4244g++;
        if (this.f4244g == this.f4239b) {
            this.f4244g = 0;
            byte[] bArrM2529a = C1029n.m2529a(this.f4240c, this.f4238a - this.f4239b);
            System.arraycopy(bArrM2529a, 0, this.f4240c, 0, bArrM2529a.length);
            System.arraycopy(this.f4242e, 0, this.f4240c, bArrM2529a.length, this.f4238a - bArrM2529a.length);
        }
        return b2;
    }
}
