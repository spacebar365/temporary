package org.bouncycastle.f.a;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final d a = new g();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new c("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new e("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr) {
        return k.b(a(bArr, 0, bArr.length));
    }
}
