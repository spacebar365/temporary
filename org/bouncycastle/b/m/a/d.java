package org.bouncycastle.b.m.a;

import java.util.Hashtable;
import org.bouncycastle.b.r;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
final class d {
    static final Hashtable a;

    static int a(r rVar) {
        return ((Integer) a.get(rVar.a())).intValue();
    }

    static int a(z zVar) {
        String strA = zVar.a();
        return ((Integer) a.get(strA.substring(0, strA.indexOf("/")))).intValue();
    }

    static byte[] a(r rVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[(i + 7) / 8];
        int length = bArr2.length / rVar.b();
        byte[] bArr3 = new byte[rVar.b()];
        int i2 = 1;
        for (int i3 = 0; i3 <= length; i3++) {
            rVar.a((byte) i2);
            rVar.a((byte) (i >> 24));
            rVar.a((byte) (i >> 16));
            rVar.a((byte) (i >> 8));
            rVar.a((byte) i);
            rVar.a(bArr, 0, bArr.length);
            rVar.a(bArr3, 0);
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
        a = hashtable;
        hashtable.put("SHA-1", 128);
        a.put("SHA-224", 192);
        a.put("SHA-256", 256);
        a.put("SHA-384", 256);
        a.put("SHA-512", 256);
        a.put("SHA-512/224", 192);
        a.put("SHA-512/256", 256);
    }
}
