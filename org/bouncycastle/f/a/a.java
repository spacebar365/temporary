package org.bouncycastle.f.a;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final d a = new b();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new c("unable to decode base64 string: " + e.getMessage(), e);
        }
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static byte[] a(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i + 2) / 3) * 4);
        try {
            a.a(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new e("exception encoding base64 string: " + e.getMessage(), e);
        }
    }
}
