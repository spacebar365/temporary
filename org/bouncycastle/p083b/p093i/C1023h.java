package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1023h extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private final int f4219a;

    /* JADX INFO: renamed from: b */
    private int f4220b;

    /* JADX INFO: renamed from: c */
    private int f4221c;

    /* JADX INFO: renamed from: d */
    private byte[] f4222d;

    /* JADX INFO: renamed from: e */
    private byte[] f4223e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0890e f4224f;

    /* JADX INFO: renamed from: g */
    private boolean f4225g;

    /* JADX INFO: renamed from: h */
    private boolean f4226h;

    /* JADX INFO: renamed from: i */
    private byte[] f4227i;

    /* JADX INFO: renamed from: j */
    private byte[] f4228j;

    /* JADX INFO: renamed from: k */
    private int f4229k;

    public C1023h(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, interfaceC0890e.mo2125b() * 8);
    }

    /* JADX INFO: renamed from: e */
    private void m2513e() {
        this.f4222d = new byte[this.f4220b];
        this.f4223e = new byte[this.f4220b];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4224f.mo2123a() + "/CFB" + (this.f4221c * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4219a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        this.f4229k = 0;
        C1535a.m4094d(this.f4228j);
        C1535a.m4094d(this.f4227i);
        if (this.f4226h) {
            System.arraycopy(this.f4223e, 0, this.f4222d, 0, this.f4223e.length);
            this.f4224f.mo2126c();
        }
    }

    public C1023h(InterfaceC0890e interfaceC0890e, int i) {
        super(interfaceC0890e);
        this.f4226h = false;
        if (i < 0 || i > interfaceC0890e.mo2125b() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (interfaceC0890e.mo2125b() * 8));
        }
        this.f4221c = interfaceC0890e.mo2125b();
        this.f4224f = interfaceC0890e;
        this.f4219a = i / 8;
        this.f4228j = new byte[this.f4219a];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4225g = z;
        if (interfaceC1003i instanceof C1080be) {
            C1080be c1080be = (C1080be) interfaceC1003i;
            byte[] bArrM2611a = c1080be.m2611a();
            if (bArrM2611a.length < this.f4221c) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.f4220b = bArrM2611a.length;
            m2513e();
            this.f4223e = C1535a.m4086b(bArrM2611a);
            System.arraycopy(this.f4223e, 0, this.f4222d, 0, this.f4223e.length);
            if (c1080be.m2612b() != null) {
                this.f4224f.mo2124a(true, c1080be.m2612b());
            }
        } else {
            this.f4220b = this.f4221c * 2;
            m2513e();
            System.arraycopy(this.f4223e, 0, this.f4222d, 0, this.f4223e.length);
            if (interfaceC1003i != null) {
                this.f4224f.mo2124a(true, interfaceC1003i);
            }
        }
        this.f4226h = true;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4219a, bArr2, i2);
        return this.f4219a;
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4229k == 0) {
            byte[] bArrM4078a = C1535a.m4078a(this.f4222d, this.f4221c);
            byte[] bArr = new byte[bArrM4078a.length];
            this.f4224f.mo2122a(bArrM4078a, 0, bArr, 0);
            this.f4227i = C1535a.m4078a(bArr, this.f4219a);
        }
        byte b2 = (byte) (this.f4227i[this.f4229k] ^ b);
        byte[] bArr2 = this.f4228j;
        int i = this.f4229k;
        this.f4229k = i + 1;
        if (this.f4225g) {
            b = b2;
        }
        bArr2[i] = b;
        if (this.f4229k == this.f4219a) {
            this.f4229k = 0;
            byte[] bArr3 = this.f4228j;
            byte[] bArrM2529a = C1029n.m2529a(this.f4222d, this.f4220b - this.f4219a);
            System.arraycopy(bArrM2529a, 0, this.f4222d, 0, bArrM2529a.length);
            System.arraycopy(bArr3, 0, this.f4222d, bArrM2529a.length, this.f4220b - bArrM2529a.length);
        }
        return b2;
    }
}
