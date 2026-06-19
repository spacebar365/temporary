package org.bouncycastle.p142f;

import org.bouncycastle.p083b.p086b.C0849z;

/* JADX INFO: renamed from: org.bouncycastle.f.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1552c {

    /* JADX INFO: renamed from: a */
    private static char[] f5510a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    private final byte[] f5511b;

    public C1552c(byte[] bArr) {
        this(bArr, 160);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1552c) {
            return C1535a.m4076a(((C1552c) obj).f5511b, this.f5511b);
        }
        return false;
    }

    public final int hashCode() {
        return C1535a.m4066a(this.f5511b);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.f5511b.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(f5510a[(this.f5511b[i] >>> 4) & 15]);
            stringBuffer.append(f5510a[this.f5511b[i] & 15]);
        }
        return stringBuffer.toString();
    }

    public C1552c(byte[] bArr, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        C0849z c0849z = new C0849z(256);
        c0849z.mo1929a(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[i / 8];
        c0849z.mo1918b(bArr2, 0, i / 8);
        this.f5511b = bArr2;
    }
}
