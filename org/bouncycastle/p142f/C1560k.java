package org.bouncycastle.p142f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import org.bouncycastle.p142f.p143a.C1543h;

/* JADX INFO: renamed from: org.bouncycastle.f.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1560k {

    /* JADX INFO: renamed from: a */
    private static String f5514a;

    static {
        try {
            f5514a = (String) AccessController.doPrivileged(new C1561l());
        } catch (Exception e) {
            try {
                f5514a = String.format("%n", new Object[0]);
            } catch (Exception e2) {
                f5514a = "\n";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4158a() {
        return f5514a;
    }

    /* JADX INFO: renamed from: a */
    public static String m4159a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iM4111a = C1543h.m4111a(bArr, cArr);
        if (iM4111a < 0) {
            throw new IllegalArgumentException("Invalid UTF-8 input");
        }
        return new String(cArr, 0, iM4111a);
    }

    /* JADX INFO: renamed from: a */
    private static void m4160a(char[] cArr, OutputStream outputStream) throws IOException {
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c < 128) {
                outputStream.write(c);
            } else if (c < 2048) {
                outputStream.write((c >> 6) | 192);
                outputStream.write((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                outputStream.write((c >> '\f') | 224);
                outputStream.write(((c >> 6) & 63) | 128);
                outputStream.write((c & '?') | 128);
            } else {
                if (i + 1 >= cArr.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                i++;
                char c2 = cArr[i];
                if (c > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int i2 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                outputStream.write((i2 >> 18) | 240);
                outputStream.write(((i2 >> 12) & 63) | 128);
                outputStream.write(((i2 >> 6) & 63) | 128);
                outputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4161a(String str) {
        return m4162a(str.toCharArray());
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4162a(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m4160a(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m4163b(String str) {
        boolean z;
        boolean z2 = false;
        char[] charArray = str.toCharArray();
        int i = 0;
        while (true) {
            z = z2;
            if (i == charArray.length) {
                break;
            }
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                z = true;
                charArray[i] = (char) ((c - 'a') + 65);
            }
            z2 = z;
            i++;
        }
        return z ? new String(charArray) : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m4164b(byte[] bArr) {
        return new String(m4167c(bArr));
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4165b(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static String m4166c(String str) {
        boolean z;
        boolean z2 = false;
        char[] charArray = str.toCharArray();
        int i = 0;
        while (true) {
            z = z2;
            if (i == charArray.length) {
                break;
            }
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                z = true;
                charArray[i] = (char) ((c - 'A') + 97);
            }
            z2 = z;
            i++;
        }
        return z ? new String(charArray) : str;
    }

    /* JADX INFO: renamed from: c */
    private static char[] m4167c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i != cArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m4168d(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
