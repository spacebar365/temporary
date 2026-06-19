package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bj */
/* JADX INFO: loaded from: classes.dex */
public final class C1085bj implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private byte[] f4429a;

    /* JADX INFO: renamed from: b */
    private int f4430b;

    public C1085bj(byte[] bArr, int i) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        this.f4429a = new byte[bArr.length];
        this.f4430b = i;
        System.arraycopy(bArr, 0, this.f4429a, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2620a() {
        return this.f4429a;
    }

    /* JADX INFO: renamed from: b */
    public final int m2621b() {
        return this.f4430b;
    }
}
