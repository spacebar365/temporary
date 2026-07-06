package org.bouncycastle.f;

import org.bouncycastle.b.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] b;

    public c(byte[] bArr) {
        this(bArr, 160);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return a.a(((c) obj).b, this.b);
        }
        return false;
    }

    public final int hashCode() {
        return a.a(this.b);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.b.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(a[(this.b[i] >>> 4) & 15]);
            stringBuffer.append(a[this.b[i] & 15]);
        }
        return stringBuffer.toString();
    }

    public c(byte[] bArr, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        z zVar = new z(256);
        zVar.a(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[i / 8];
        zVar.b(bArr2, 0, i / 8);
        this.b = bArr2;
    }
}
