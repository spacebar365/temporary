package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.e.bd */
/* JADX INFO: loaded from: classes.dex */
public class C0922bd implements InterfaceC0815ao {

    /* JADX INFO: renamed from: a */
    protected byte f3827a = 0;

    /* JADX INFO: renamed from: b */
    protected byte[] f3828b = null;

    /* JADX INFO: renamed from: c */
    protected byte f3829c = 0;

    /* JADX INFO: renamed from: d */
    protected byte[] f3830d;

    /* JADX INFO: renamed from: e */
    protected byte[] f3831e;

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final int mo1909a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            this.f3829c = this.f3828b[(this.f3829c + this.f3828b[this.f3827a & 255]) & 255];
            byte b = this.f3828b[(this.f3828b[this.f3828b[this.f3829c & 255] & 255] + 1) & 255];
            byte b2 = this.f3828b[this.f3827a & 255];
            this.f3828b[this.f3827a & 255] = this.f3828b[this.f3829c & 255];
            this.f3828b[this.f3829c & 255] = b2;
            this.f3827a = (byte) ((this.f3827a + 1) & 255);
            bArr2[i4 + i3] = (byte) (b ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public String mo1911a() {
        return "VMPC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        if (!(c1080be.m2612b() instanceof C1076ba)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        C1076ba c1076ba = (C1076ba) c1080be.m2612b();
        this.f3830d = c1080be.m2611a();
        if (this.f3830d == null || this.f3830d.length <= 0 || this.f3830d.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        this.f3831e = c1076ba.m2603a();
        mo2298a(this.f3831e, this.f3830d);
    }

    /* JADX INFO: renamed from: a */
    protected void mo2298a(byte[] bArr, byte[] bArr2) {
        this.f3829c = (byte) 0;
        this.f3828b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f3828b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            this.f3829c = this.f3828b[(this.f3829c + this.f3828b[i2 & 255] + bArr[i2 % bArr.length]) & 255];
            byte b = this.f3828b[i2 & 255];
            this.f3828b[i2 & 255] = this.f3828b[this.f3829c & 255];
            this.f3828b[this.f3829c & 255] = b;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.f3829c = this.f3828b[(this.f3829c + this.f3828b[i3 & 255] + bArr2[i3 % bArr2.length]) & 255];
            byte b2 = this.f3828b[i3 & 255];
            this.f3828b[i3 & 255] = this.f3828b[this.f3829c & 255];
            this.f3828b[this.f3829c & 255] = b2;
        }
        this.f3827a = (byte) 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        mo2298a(this.f3831e, this.f3830d);
    }
}
