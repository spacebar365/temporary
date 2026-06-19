package org.bouncycastle.p083b.p097k;

/* JADX INFO: renamed from: org.bouncycastle.b.k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1101d extends C1100c {
    /* JADX INFO: renamed from: b */
    public static boolean m2656b(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2 += 8) {
            if (C1100c.m2654a(bArr, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2655b(byte[] bArr) {
        if (bArr.length == 16) {
            boolean z = false;
            for (int i = 0; i != 8; i++) {
                if (bArr[i] != bArr[i + 8]) {
                    z = true;
                }
            }
            return z;
        }
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 != 8; i2++) {
            z4 |= bArr[i2] != bArr[i2 + 8];
            z3 |= bArr[i2] != bArr[i2 + 16];
            z2 |= bArr[i2 + 8] != bArr[i2 + 16];
        }
        return z4 && z3 && z2;
    }
}
