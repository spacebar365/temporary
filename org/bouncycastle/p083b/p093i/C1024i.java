package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1024i extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private final int f4230a;

    /* JADX INFO: renamed from: b */
    private byte[] f4231b;

    /* JADX INFO: renamed from: c */
    private byte[] f4232c;

    /* JADX INFO: renamed from: d */
    private byte[] f4233d;

    /* JADX INFO: renamed from: e */
    private final int f4234e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0890e f4235f;

    /* JADX INFO: renamed from: g */
    private int f4236g;

    /* JADX INFO: renamed from: h */
    private boolean f4237h;

    public C1024i(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, interfaceC0890e.mo2125b() * 8);
    }

    private C1024i(InterfaceC0890e interfaceC0890e, int i) {
        super(interfaceC0890e);
        this.f4236g = 0;
        if (i < 0 || i > interfaceC0890e.mo2125b() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (interfaceC0890e.mo2125b() * 8));
        }
        this.f4235f = interfaceC0890e;
        this.f4234e = interfaceC0890e.mo2125b();
        this.f4230a = i / 8;
        this.f4231b = new byte[this.f4234e];
    }

    /* JADX INFO: renamed from: e */
    private void m2514e() {
        this.f4232c = new byte[this.f4234e / 2];
        this.f4231b = new byte[this.f4234e];
        this.f4233d = new byte[this.f4230a];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4230a, bArr2, i2);
        return this.f4230a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4235f.mo2123a() + "/GCTR";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1080be) {
            C1080be c1080be = (C1080be) interfaceC1003i;
            m2514e();
            this.f4232c = C1535a.m4086b(c1080be.m2611a());
            if (this.f4232c.length != this.f4234e / 2) {
                throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
            }
            System.arraycopy(this.f4232c, 0, this.f4231b, 0, this.f4232c.length);
            for (int length = this.f4232c.length; length < this.f4234e; length++) {
                this.f4231b[length] = 0;
            }
            if (c1080be.m2612b() != null) {
                this.f4235f.mo2124a(true, c1080be.m2612b());
            }
        } else {
            m2514e();
            if (interfaceC1003i != null) {
                this.f4235f.mo2124a(true, interfaceC1003i);
            }
        }
        this.f4237h = true;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4230a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        if (this.f4237h) {
            System.arraycopy(this.f4232c, 0, this.f4231b, 0, this.f4232c.length);
            for (int length = this.f4232c.length; length < this.f4234e; length++) {
                this.f4231b[length] = 0;
            }
            this.f4236g = 0;
            this.f4235f.mo2126c();
        }
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4236g == 0) {
            byte[] bArr = new byte[this.f4231b.length];
            this.f4235f.mo2122a(this.f4231b, 0, bArr, 0);
            this.f4233d = C1535a.m4078a(bArr, this.f4230a);
        }
        byte b2 = (byte) (this.f4233d[this.f4236g] ^ b);
        this.f4236g++;
        if (this.f4236g == this.f4230a) {
            this.f4236g = 0;
            byte[] bArr2 = this.f4231b;
            int length = this.f4231b.length - 1;
            bArr2[length] = (byte) (bArr2[length] + 1);
        }
        return b2;
    }
}
