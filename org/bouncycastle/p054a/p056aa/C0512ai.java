package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C0512ai {
    /* JADX INFO: renamed from: a */
    public static int m1376a(AbstractC1381d abstractC1381d) {
        return (abstractC1381d.mo2905a() + 7) / 8;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1377a(BigInteger bigInteger, int i) {
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
