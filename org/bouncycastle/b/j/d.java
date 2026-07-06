package org.bouncycastle.b.j;

import java.security.SecureRandom;
import org.bouncycastle.b.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {
    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr) throws v {
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        boolean z = (i > bArr.length) | (i == 0);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            z |= (bArr.length - i2 <= i) & (bArr[i2] != b);
        }
        if (z) {
            throw new v("pad block corrupted");
        }
        return i;
    }

    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.b.j.a
    public final void a(SecureRandom secureRandom) {
    }
}
