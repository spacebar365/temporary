package org.bouncycastle.f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static String a;

    static {
        try {
            a = (String) AccessController.doPrivileged(new l());
        } catch (Exception e) {
            try {
                a = String.format("%n", new Object[0]);
            } catch (Exception e2) {
                a = "\n";
            }
        }
    }

    public static String a() {
        return a;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iA = org.bouncycastle.f.a.h.a(bArr, cArr);
        if (iA < 0) {
            throw new IllegalArgumentException("Invalid UTF-8 input");
        }
        return new String(cArr, 0, iA);
    }

    private static void a(char[] cArr, OutputStream outputStream) throws IOException {
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

    public static byte[] a(String str) {
        return a(str.toCharArray());
    }

    public static byte[] a(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String b(String str) {
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

    public static String b(byte[] bArr) {
        return new String(c(bArr));
    }

    public static byte[] b(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static String c(String str) {
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

    private static char[] c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i != cArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
