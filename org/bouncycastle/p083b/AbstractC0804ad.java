package org.bouncycastle.p083b;

import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.b.ad */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0804ad {

    /* JADX INFO: renamed from: a */
    protected byte[] f3324a;

    /* JADX INFO: renamed from: b */
    protected byte[] f3325b;

    /* JADX INFO: renamed from: c */
    protected int f3326c;

    protected AbstractC0804ad() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1894a(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1895b(char[] cArr) {
        return cArr != null ? C1560k.m4162a(cArr) : new byte[0];
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m1896c(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i = 0; i != cArr.length; i++) {
            bArr[i * 2] = (byte) (cArr[i] >>> '\b');
            bArr[(i * 2) + 1] = (byte) cArr[i];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC1003i mo1897a(int i);

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC1003i mo1898a(int i, int i2);

    /* JADX INFO: renamed from: a */
    public final void m1899a(byte[] bArr, byte[] bArr2, int i) {
        this.f3324a = bArr;
        this.f3325b = bArr2;
        this.f3326c = i;
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC1003i mo1900b(int i);
}
