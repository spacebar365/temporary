package org.bouncycastle.p118e.p140d.p141a;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1531h {

    /* JADX INFO: renamed from: a */
    private int[] f5473a;

    public C1531h(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iM4036a = C1529f.m4036a(bArr, 0);
        int iM4035a = C1528e.m4035a(iM4036a - 1);
        if (bArr.length != (iM4036a * iM4035a) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f5473a = new int[iM4036a];
        for (int i = 0; i < iM4036a; i++) {
            this.f5473a[i] = C1529f.m4037a(bArr, (i * iM4035a) + 4, iM4035a);
        }
        if (!m4041a(this.f5473a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4041a(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] >= length || zArr[iArr[i]]) {
                return false;
            }
            zArr[iArr[i]] = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1531h) {
            return C1527d.m4033a(this.f5473a, ((C1531h) obj).f5473a);
        }
        return false;
    }

    public final int hashCode() {
        return C1535a.m4082b(this.f5473a);
    }

    public final String toString() {
        String str = "[" + this.f5473a[0];
        for (int i = 1; i < this.f5473a.length; i++) {
            str = str + ", " + this.f5473a[i];
        }
        return str + "]";
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m4042a() {
        int length = this.f5473a.length;
        int iM4035a = C1528e.m4035a(length - 1);
        byte[] bArr = new byte[(length * iM4035a) + 4];
        C1529f.m4038a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            int i2 = this.f5473a[i];
            int i3 = (i * iM4035a) + 4;
            for (int i4 = iM4035a - 1; i4 >= 0; i4--) {
                bArr[i3 + i4] = (byte) (i2 >>> (i4 * 8));
            }
        }
        return bArr;
    }
}
