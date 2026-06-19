package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.be */
/* JADX INFO: loaded from: classes.dex */
public final class C1080be implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private byte[] f4420a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1003i f4421b;

    public C1080be(InterfaceC1003i interfaceC1003i, byte[] bArr) {
        this(interfaceC1003i, bArr, 0, bArr.length);
    }

    public C1080be(InterfaceC1003i interfaceC1003i, byte[] bArr, int i, int i2) {
        this.f4420a = new byte[i2];
        this.f4421b = interfaceC1003i;
        System.arraycopy(bArr, i, this.f4420a, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2611a() {
        return this.f4420a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i m2612b() {
        return this.f4421b;
    }
}
