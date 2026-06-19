package org.bouncycastle.p083b.p093i;

import android.R;
import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.i.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1028m extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    boolean f4275a;

    /* JADX INFO: renamed from: b */
    int f4276b;

    /* JADX INFO: renamed from: c */
    int f4277c;

    /* JADX INFO: renamed from: d */
    private byte[] f4278d;

    /* JADX INFO: renamed from: e */
    private byte[] f4279e;

    /* JADX INFO: renamed from: f */
    private byte[] f4280f;

    /* JADX INFO: renamed from: g */
    private int f4281g;

    /* JADX INFO: renamed from: h */
    private final int f4282h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC0890e f4283i;

    public C1028m(InterfaceC0890e interfaceC0890e) {
        super(interfaceC0890e);
        this.f4275a = true;
        this.f4283i = interfaceC0890e;
        this.f4282h = interfaceC0890e.mo2125b();
        if (this.f4282h != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.f4278d = new byte[interfaceC0890e.mo2125b()];
        this.f4279e = new byte[interfaceC0890e.mo2125b()];
        this.f4280f = new byte[interfaceC0890e.mo2125b()];
    }

    /* JADX INFO: renamed from: a */
    private static int m2527a(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: a */
    private static void m2528a(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4281g == 0) {
            if (this.f4275a) {
                this.f4275a = false;
                this.f4283i.mo2122a(this.f4279e, 0, this.f4280f, 0);
                this.f4276b = m2527a(this.f4280f, 0);
                this.f4277c = m2527a(this.f4280f, 4);
            }
            this.f4276b += R.attr.cacheColorHint;
            this.f4277c += R.attr.hand_minute;
            if (this.f4277c < 16843012 && this.f4277c > 0) {
                this.f4277c++;
            }
            m2528a(this.f4276b, this.f4279e, 0);
            m2528a(this.f4277c, this.f4279e, 4);
            this.f4283i.mo2122a(this.f4279e, 0, this.f4280f, 0);
        }
        byte[] bArr = this.f4280f;
        int i = this.f4281g;
        this.f4281g = i + 1;
        byte b2 = (byte) (bArr[i] ^ b);
        if (this.f4281g == this.f4282h) {
            this.f4281g = 0;
            System.arraycopy(this.f4279e, this.f4282h, this.f4279e, 0, this.f4279e.length - this.f4282h);
            System.arraycopy(this.f4280f, 0, this.f4279e, this.f4279e.length - this.f4282h, this.f4282h);
        }
        return b2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4282h, bArr2, i2);
        return this.f4282h;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4283i.mo2123a() + "/GCTR";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4275a = true;
        this.f4276b = 0;
        this.f4277c = 0;
        if (!(interfaceC1003i instanceof C1080be)) {
            mo1913c();
            if (interfaceC1003i != null) {
                this.f4283i.mo2124a(true, interfaceC1003i);
                return;
            }
            return;
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a.length < this.f4278d.length) {
            System.arraycopy(bArrM2611a, 0, this.f4278d, this.f4278d.length - bArrM2611a.length, bArrM2611a.length);
            for (int i = 0; i < this.f4278d.length - bArrM2611a.length; i++) {
                this.f4278d[i] = 0;
            }
        } else {
            System.arraycopy(bArrM2611a, 0, this.f4278d, 0, this.f4278d.length);
        }
        mo1913c();
        if (c1080be.m2612b() != null) {
            this.f4283i.mo2124a(true, c1080be.m2612b());
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4282h;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        this.f4275a = true;
        this.f4276b = 0;
        this.f4277c = 0;
        System.arraycopy(this.f4278d, 0, this.f4279e, 0, this.f4278d.length);
        this.f4281g = 0;
        this.f4283i.mo2126c();
    }
}
