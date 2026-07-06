package org.bouncycastle.b.j;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {
    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr) {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.b.j.a
    public final int a(byte[] bArr, int i) {
        byte b;
        int length = bArr.length - i;
        if (i > 0) {
            b = (byte) ((bArr[i + (-1)] & 1) != 0 ? 0 : 255);
        } else {
            b = (byte) ((bArr[bArr.length + (-1)] & 1) != 0 ? 0 : 255);
        }
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.b.j.a
    public final void a(SecureRandom secureRandom) {
    }
}
