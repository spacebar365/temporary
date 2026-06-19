package org.bouncycastle.p083b;

/* JADX INFO: renamed from: org.bouncycastle.b.an */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814an implements InterfaceC0815ao, InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0890e f3331a;

    protected AbstractC0814an(InterfaceC0890e interfaceC0890e) {
        this.f3331a = interfaceC0890e;
    }

    /* JADX INFO: renamed from: a */
    protected abstract byte mo1908a(byte b);

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final int mo1909a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new C1163o("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        int i4 = i + i2;
        while (i < i4) {
            bArr2[i3] = mo1908a(bArr[i]);
            i++;
            i3++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0890e m1910d() {
        return this.f3331a;
    }
}
