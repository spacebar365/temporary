package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0813am;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1037v extends AbstractC0814an implements InterfaceC0813am {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0890e f4362a;

    /* JADX INFO: renamed from: b */
    private final int f4363b;

    /* JADX INFO: renamed from: c */
    private byte[] f4364c;

    /* JADX INFO: renamed from: d */
    private byte[] f4365d;

    /* JADX INFO: renamed from: e */
    private byte[] f4366e;

    /* JADX INFO: renamed from: f */
    private int f4367f;

    public C1037v(InterfaceC0890e interfaceC0890e) {
        super(interfaceC0890e);
        this.f4362a = interfaceC0890e;
        this.f4363b = this.f4362a.mo2125b();
        this.f4364c = new byte[this.f4363b];
        this.f4365d = new byte[this.f4363b];
        this.f4366e = new byte[this.f4363b];
        this.f4367f = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4363b, bArr2, i2);
        return this.f4363b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4362a.mo2123a() + "/SIC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        this.f4364c = C1535a.m4086b(c1080be.m2611a());
        if (this.f4363b < this.f4364c.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.f4363b + " bytes.");
        }
        int i = 8 > this.f4363b / 2 ? this.f4363b / 2 : 8;
        if (this.f4363b - this.f4364c.length > i) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.f4363b - i) + " bytes.");
        }
        if (c1080be.m2612b() != null) {
            this.f4362a.mo2124a(true, c1080be.m2612b());
        }
        mo1913c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4362a.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        C1535a.m4071a(this.f4365d, (byte) 0);
        System.arraycopy(this.f4364c, 0, this.f4365d, 0, this.f4364c.length);
        this.f4362a.mo2126c();
        this.f4367f = 0;
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        byte b2;
        if (this.f4367f == 0) {
            this.f4362a.mo2122a(this.f4365d, 0, this.f4366e, 0);
            byte[] bArr = this.f4366e;
            int i = this.f4367f;
            this.f4367f = i + 1;
            return (byte) (bArr[i] ^ b);
        }
        byte[] bArr2 = this.f4366e;
        int i2 = this.f4367f;
        this.f4367f = i2 + 1;
        byte b3 = (byte) (bArr2[i2] ^ b);
        if (this.f4367f == this.f4365d.length) {
            this.f4367f = 0;
            int length = this.f4365d.length + 0;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                byte[] bArr3 = this.f4365d;
                b2 = (byte) (bArr3[length] + 1);
                bArr3[length] = b2;
            } while (b2 == 0);
            if (this.f4364c.length < this.f4363b) {
                for (int i3 = 0; i3 != this.f4364c.length; i3++) {
                    if (this.f4365d[i3] != this.f4364c[i3]) {
                        throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                    }
                }
            }
        }
        return b3;
    }
}
