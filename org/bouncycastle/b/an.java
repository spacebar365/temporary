package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class an implements ao, e {
    private final e a;

    protected an(e eVar) {
        this.a = eVar;
    }

    protected abstract byte a(byte b);

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new o("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new ac("output buffer too short");
        }
        int i4 = i + i2;
        while (i < i4) {
            bArr2[i3] = a(bArr[i]);
            i++;
            i3++;
        }
        return i2;
    }

    public final e d() {
        return this.a;
    }
}
