package org.bouncycastle.a.aa;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ai {
    public static int a(org.bouncycastle.d.a.d dVar) {
        return (dVar.a() + 7) / 8;
    }

    public static byte[] a(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - bArr.length, bArr, 0, bArr.length);
            return bArr;
        }
        if (i <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
        return bArr2;
    }
}
