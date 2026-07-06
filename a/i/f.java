package a.i;

import a.h;
import a.u;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Strings.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final org.c.b a = org.c.c.a((Class<?>) f.class);
    private static final Charset b = Charset.forName("UTF-16LE");
    private static final Charset c = Charset.forName("US-ASCII");

    private f() {
    }

    private static byte[] a(String str, Charset charset) {
        return str == null ? new byte[0] : str.getBytes(charset);
    }

    public static byte[] a(String str) {
        return a(str, b);
    }

    public static byte[] b(String str) {
        return a(str, c);
    }

    public static byte[] a(String str, h hVar) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes(hVar.O());
        } catch (UnsupportedEncodingException e) {
            throw new u("Unsupported OEM encoding " + hVar.O(), e);
        }
    }

    public static String a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, b);
    }

    public static int b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            if (bArr[i + i3] != 0 || bArr[i + i3 + 1] != 0) {
                i3 += 2;
            } else {
                return i3;
            }
        } while (i3 <= i2);
        if (a.c()) {
            a.d("Failed to find string termination with max length ".concat(String.valueOf(i2)));
            a.b(e.a(bArr, i, i3));
        }
        throw new u("zero termination not found");
    }

    public static String a(byte[] bArr, int i, int i2, h hVar) {
        try {
            return new String(bArr, i, i2, hVar.O());
        } catch (UnsupportedEncodingException e) {
            throw new u("Unsupported OEM encoding " + hVar.O(), e);
        }
    }

    public static int c(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            i3++;
            if (i3 > i2) {
                throw new u("zero termination not found");
            }
        }
        return i3;
    }
}
