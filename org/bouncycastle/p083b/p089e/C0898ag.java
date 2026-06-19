package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C0898ag implements InterfaceC0815ao {

    /* JADX INFO: renamed from: a */
    private byte[] f3700a = null;

    /* JADX INFO: renamed from: b */
    private int f3701b = 0;

    /* JADX INFO: renamed from: c */
    private int f3702c = 0;

    /* JADX INFO: renamed from: d */
    private byte[] f3703d = null;

    /* JADX INFO: renamed from: a */
    private void m2166a(byte[] bArr) {
        this.f3703d = bArr;
        this.f3701b = 0;
        this.f3702c = 0;
        if (this.f3700a == null) {
            this.f3700a = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.f3700a[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        while (i2 < 256) {
            int i4 = ((bArr[length] & 255) + this.f3700a[i2] + i3) & 255;
            byte b = this.f3700a[i2];
            byte[] bArr2 = this.f3700a;
            bArr2[i2] = bArr2[i4];
            this.f3700a[i4] = b;
            length = (length + 1) % bArr.length;
            i2++;
            i3 = i4;
        }
    }

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
            this.f3701b = (this.f3701b + 1) & 255;
            this.f3702c = (this.f3700a[this.f3701b] + this.f3702c) & 255;
            byte b = this.f3700a[this.f3701b];
            this.f3700a[this.f3701b] = this.f3700a[this.f3702c];
            this.f3700a[this.f3702c] = b;
            bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ this.f3700a[(this.f3700a[this.f3701b] + this.f3700a[this.f3702c]) & 255]);
        }
        return i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "RC4";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + interfaceC1003i.getClass().getName());
        }
        this.f3703d = ((C1076ba) interfaceC1003i).m2603a();
        m2166a(this.f3703d);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        m2166a(this.f3703d);
    }
}
