package org.bouncycastle.b.j;

import java.security.SecureRandom;
import org.bouncycastle.b.v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr) throws v {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] != -128) {
            throw new v("pad block corrupted");
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = -128;
        for (int i2 = i + 1; i2 < bArr.length; i2++) {
            bArr[i2] = 0;
        }
        return length;
    }

    @Override // org.bouncycastle.b.j.a
    public final void a(SecureRandom secureRandom) {
    }
}
