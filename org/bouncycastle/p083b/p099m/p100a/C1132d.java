package org.bouncycastle.p083b.p099m.p100a;

import java.util.Hashtable;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1183z;

/* JADX INFO: renamed from: org.bouncycastle.b.m.a.d */
/* JADX INFO: loaded from: classes.dex */
final class C1132d {

    /* JADX INFO: renamed from: a */
    static final Hashtable f4545a;

    /* JADX INFO: renamed from: a */
    static int m2729a(InterfaceC1175r interfaceC1175r) {
        return ((Integer) f4545a.get(interfaceC1175r.mo1927a())).intValue();
    }

    /* JADX INFO: renamed from: a */
    static int m2730a(InterfaceC1183z interfaceC1183z) {
        String strMo2447a = interfaceC1183z.mo2447a();
        return ((Integer) f4545a.get(strMo2447a.substring(0, strMo2447a.indexOf("/")))).intValue();
    }

    /* JADX INFO: renamed from: a */
    static byte[] m2731a(InterfaceC1175r interfaceC1175r, byte[] bArr, int i) {
        byte[] bArr2 = new byte[(i + 7) / 8];
        int length = bArr2.length / interfaceC1175r.mo1930b();
        byte[] bArr3 = new byte[interfaceC1175r.mo1930b()];
        int i2 = 1;
        for (int i3 = 0; i3 <= length; i3++) {
            interfaceC1175r.mo1928a((byte) i2);
            interfaceC1175r.mo1928a((byte) (i >> 24));
            interfaceC1175r.mo1928a((byte) (i >> 16));
            interfaceC1175r.mo1928a((byte) (i >> 8));
            interfaceC1175r.mo1928a((byte) i);
            interfaceC1175r.mo1929a(bArr, 0, bArr.length);
            interfaceC1175r.mo1926a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, bArr3.length * i3, bArr2.length - (bArr3.length * i3) > bArr3.length ? bArr3.length : bArr2.length - (bArr3.length * i3));
            i2++;
        }
        if (i % 8 != 0) {
            int i4 = 8 - (i % 8);
            int i5 = 0;
            int i6 = 0;
            while (i6 != bArr2.length) {
                int i7 = bArr2[i6] & 255;
                bArr2[i6] = (byte) ((i5 << (8 - i4)) | (i7 >>> i4));
                i6++;
                i5 = i7;
            }
        }
        return bArr2;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f4545a = hashtable;
        hashtable.put("SHA-1", 128);
        f4545a.put("SHA-224", 192);
        f4545a.put("SHA-256", 256);
        f4545a.put("SHA-384", 256);
        f4545a.put("SHA-512", 256);
        f4545a.put("SHA-512/224", 192);
        f4545a.put("SHA-512/256", 256);
    }
}
