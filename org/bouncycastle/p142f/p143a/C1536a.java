package org.bouncycastle.p142f.p143a;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: org.bouncycastle.f.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1536a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1539d f5483a = new C1537b();

    /* JADX INFO: renamed from: a */
    public static byte[] m4097a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f5483a.mo4103a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C1538c("unable to decode base64 string: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4098a(byte[] bArr) {
        return m4099a(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4099a(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i + 2) / 3) * 4);
        try {
            f5483a.mo4104a(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C1540e("exception encoding base64 string: " + e.getMessage(), e);
        }
    }
}
