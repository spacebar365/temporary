package org.bouncycastle.b.j;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {
    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr) {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr, int i) {
        int length = bArr.length - i;
        while (i < bArr.length) {
            bArr[i] = 0;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.b.j.a
    public final void a(SecureRandom secureRandom) {
    }
}
