package org.bouncycastle.p142f.p144b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.f.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1545a {

    /* JADX INFO: renamed from: a */
    private static int f5498a = 4096;

    /* JADX INFO: renamed from: a */
    public static int m4121a(InputStream inputStream, byte[] bArr) {
        return m4122a(inputStream, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m4122a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    private static void m4123a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[f5498a];
        while (true) {
            int i = inputStream.read(bArr, 0, bArr.length);
            if (i < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4124a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m4123a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
