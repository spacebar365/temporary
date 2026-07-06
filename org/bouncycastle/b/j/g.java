package org.bouncycastle.b.j;

import java.security.SecureRandom;
import org.bouncycastle.b.v;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a {
    SecureRandom a = null;

    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr) throws v {
        int i = bArr[bArr.length - 1] & 255;
        if (i > bArr.length) {
            throw new v("pad block corrupted");
        }
        return i;
    }

    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            if (this.a == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) this.a.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // org.bouncycastle.b.j.a
    public final void a(SecureRandom secureRandom) {
        this.a = secureRandom;
    }
}
