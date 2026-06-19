package org.bouncycastle.p083b.p099m;

/* JADX INFO: renamed from: org.bouncycastle.b.m.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1137f {
    /* JADX INFO: renamed from: a */
    public static byte[] m2735a(InterfaceC1135d interfaceC1135d, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= interfaceC1135d.mo2733b()) {
            System.arraycopy(interfaceC1135d.mo2732a(), 0, bArr, 0, bArr.length);
        } else {
            int iMo2733b = interfaceC1135d.mo2733b() / 8;
            for (int i2 = 0; i2 < bArr.length; i2 += iMo2733b) {
                byte[] bArrMo2732a = interfaceC1135d.mo2732a();
                if (bArrMo2732a.length <= bArr.length - i2) {
                    System.arraycopy(bArrMo2732a, 0, bArr, i2, bArrMo2732a.length);
                } else {
                    System.arraycopy(bArrMo2732a, 0, bArr, i2, bArr.length - i2);
                }
            }
        }
        return bArr;
    }
}
