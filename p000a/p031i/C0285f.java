package p000a.p031i;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.i.f */
/* JADX INFO: compiled from: Strings.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0285f {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1252a = C1620c.m4563a((Class<?>) C0285f.class);

    /* JADX INFO: renamed from: b */
    private static final Charset f1253b = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: c */
    private static final Charset f1254c = Charset.forName("US-ASCII");

    private C0285f() {
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m954a(String str, Charset charset) {
        return str == null ? new byte[0] : str.getBytes(charset);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m952a(String str) {
        return m954a(str, f1253b);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m956b(String str) {
        return m954a(str, f1254c);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m953a(String str, InterfaceC0267h interfaceC0267h) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes(interfaceC0267h.mo20O());
        } catch (UnsupportedEncodingException e) {
            throw new C0297u("Unsupported OEM encoding " + interfaceC0267h.mo20O(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m950a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, f1253b);
    }

    /* JADX INFO: renamed from: b */
    public static int m955b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            if (bArr[i + i3] != 0 || bArr[i + i3 + 1] != 0) {
                i3 += 2;
            } else {
                return i3;
            }
        } while (i3 <= i2);
        if (f1252a.mo4539c()) {
            f1252a.mo4540d("Failed to find string termination with max length ".concat(String.valueOf(i2)));
            f1252a.mo4534b(C0284e.m949a(bArr, i, i3));
        }
        throw new C0297u("zero termination not found");
    }

    /* JADX INFO: renamed from: a */
    public static String m951a(byte[] bArr, int i, int i2, InterfaceC0267h interfaceC0267h) {
        try {
            return new String(bArr, i, i2, interfaceC0267h.mo20O());
        } catch (UnsupportedEncodingException e) {
            throw new C0297u("Unsupported OEM encoding " + interfaceC0267h.mo20O(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m957c(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            i3++;
            if (i3 > i2) {
                throw new C0297u("zero termination not found");
            }
        }
        return i3;
    }
}
