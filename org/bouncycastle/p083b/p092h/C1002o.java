package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.h.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1002o implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private byte f4157a;

    /* JADX INFO: renamed from: b */
    private byte f4158b = 0;

    /* JADX INFO: renamed from: c */
    private byte[] f4159c = null;

    /* JADX INFO: renamed from: d */
    private byte f4160d = 0;

    /* JADX INFO: renamed from: e */
    private byte[] f4161e;

    /* JADX INFO: renamed from: f */
    private byte[] f4162f;

    /* JADX INFO: renamed from: g */
    private byte[] f4163g;

    /* JADX INFO: renamed from: h */
    private byte f4164h;

    /* JADX INFO: renamed from: i */
    private byte f4165i;

    /* JADX INFO: renamed from: j */
    private byte f4166j;

    /* JADX INFO: renamed from: k */
    private byte f4167k;

    /* JADX INFO: renamed from: a */
    private void m2471a(byte[] bArr, byte[] bArr2) {
        this.f4160d = (byte) 0;
        this.f4159c = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f4159c[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            this.f4160d = this.f4159c[(this.f4160d + this.f4159c[i2 & 255] + bArr[i2 % bArr.length]) & 255];
            byte b = this.f4159c[i2 & 255];
            this.f4159c[i2 & 255] = this.f4159c[this.f4160d & 255];
            this.f4159c[this.f4160d & 255] = b;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.f4160d = this.f4159c[(this.f4160d + this.f4159c[i3 & 255] + bArr2[i3 % bArr2.length]) & 255];
            byte b2 = this.f4159c[i3 & 255];
            this.f4159c[i3 & 255] = this.f4159c[this.f4160d & 255];
            this.f4159c[this.f4160d & 255] = b2;
        }
        this.f4158b = (byte) 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        for (int i2 = 1; i2 < 25; i2++) {
            this.f4160d = this.f4159c[(this.f4160d + this.f4159c[this.f4158b & 255]) & 255];
            this.f4167k = this.f4159c[(this.f4167k + this.f4166j + i2) & 255];
            this.f4166j = this.f4159c[(this.f4166j + this.f4165i + i2) & 255];
            this.f4165i = this.f4159c[(this.f4165i + this.f4164h + i2) & 255];
            this.f4164h = this.f4159c[(this.f4164h + this.f4160d + i2) & 255];
            this.f4161e[this.f4157a & 31] = (byte) (this.f4161e[this.f4157a & 31] ^ this.f4164h);
            this.f4161e[(this.f4157a + 1) & 31] = (byte) (this.f4161e[(this.f4157a + 1) & 31] ^ this.f4165i);
            this.f4161e[(this.f4157a + 2) & 31] = (byte) (this.f4161e[(this.f4157a + 2) & 31] ^ this.f4166j);
            this.f4161e[(this.f4157a + 3) & 31] = (byte) (this.f4161e[(this.f4157a + 3) & 31] ^ this.f4167k);
            this.f4157a = (byte) ((this.f4157a + 4) & 31);
            byte b = this.f4159c[this.f4158b & 255];
            this.f4159c[this.f4158b & 255] = this.f4159c[this.f4160d & 255];
            this.f4159c[this.f4160d & 255] = b;
            this.f4158b = (byte) ((this.f4158b + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.f4160d = this.f4159c[(this.f4160d + this.f4159c[i3 & 255] + this.f4161e[i3 & 31]) & 255];
            byte b2 = this.f4159c[i3 & 255];
            this.f4159c[i3 & 255] = this.f4159c[this.f4160d & 255];
            this.f4159c[this.f4160d & 255] = b2;
        }
        byte[] bArr2 = new byte[20];
        for (int i4 = 0; i4 < 20; i4++) {
            this.f4160d = this.f4159c[(this.f4160d + this.f4159c[i4 & 255]) & 255];
            bArr2[i4] = this.f4159c[(this.f4159c[this.f4159c[this.f4160d & 255] & 255] + 1) & 255];
            byte b3 = this.f4159c[i4 & 255];
            this.f4159c[i4 & 255] = this.f4159c[this.f4160d & 255];
            this.f4159c[this.f4160d & 255] = b3;
        }
        System.arraycopy(bArr2, 0, bArr, i, 20);
        mo2452c();
        return 20;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4160d = this.f4159c[(this.f4160d + this.f4159c[this.f4158b & 255]) & 255];
        byte b2 = (byte) (this.f4159c[(this.f4159c[this.f4159c[this.f4160d & 255] & 255] + 1) & 255] ^ b);
        this.f4167k = this.f4159c[(this.f4167k + this.f4166j) & 255];
        this.f4166j = this.f4159c[(this.f4166j + this.f4165i) & 255];
        this.f4165i = this.f4159c[(this.f4165i + this.f4164h) & 255];
        this.f4164h = this.f4159c[(b2 + this.f4164h + this.f4160d) & 255];
        this.f4161e[this.f4157a & 31] = (byte) (this.f4161e[this.f4157a & 31] ^ this.f4164h);
        this.f4161e[(this.f4157a + 1) & 31] = (byte) (this.f4161e[(this.f4157a + 1) & 31] ^ this.f4165i);
        this.f4161e[(this.f4157a + 2) & 31] = (byte) (this.f4161e[(this.f4157a + 2) & 31] ^ this.f4166j);
        this.f4161e[(this.f4157a + 3) & 31] = (byte) (this.f4161e[(this.f4157a + 3) & 31] ^ this.f4167k);
        this.f4157a = (byte) ((this.f4157a + 4) & 31);
        byte b3 = this.f4159c[this.f4158b & 255];
        this.f4159c[this.f4158b & 255] = this.f4159c[this.f4160d & 255];
        this.f4159c[this.f4160d & 255] = b3;
        this.f4158b = (byte) ((this.f4158b + 1) & 255);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        C1076ba c1076ba = (C1076ba) c1080be.m2612b();
        if (!(c1080be.m2612b() instanceof C1076ba)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        this.f4162f = c1080be.m2611a();
        if (this.f4162f == null || this.f4162f.length <= 0 || this.f4162f.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.f4163g = c1076ba.m2603a();
        mo2452c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            mo2448a(bArr[i + i3]);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return 20;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        m2471a(this.f4163g, this.f4162f);
        this.f4158b = (byte) 0;
        this.f4167k = (byte) 0;
        this.f4166j = (byte) 0;
        this.f4165i = (byte) 0;
        this.f4164h = (byte) 0;
        this.f4157a = (byte) 0;
        this.f4161e = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.f4161e[i] = 0;
        }
    }
}
