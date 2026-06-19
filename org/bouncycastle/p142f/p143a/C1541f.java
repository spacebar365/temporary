package org.bouncycastle.p142f.p143a;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.f.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1541f {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1539d f5489a = new C1542g();

    /* JADX INFO: renamed from: a */
    public static byte[] m4106a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f5489a.mo4103a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C1538c("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4107a(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f5489a.mo4104a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C1540e("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4108b(byte[] bArr) {
        return m4107a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static String m4105a(byte[] bArr) {
        return C1560k.m4164b(m4107a(bArr, 0, bArr.length));
    }
}
