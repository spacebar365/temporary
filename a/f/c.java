package a.f;

import a.i.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Type2Message.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    private static final org.c.b c = org.c.c.a((Class<?>) c.class);
    private static final Map<String, byte[]> h = new HashMap();
    private byte[] d;
    private String e;
    private byte[] f;
    private byte[] g;

    public c(byte[] bArr) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != a[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (a(bArr, 8) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iA = a(bArr, 20);
        a(iA);
        byte[] bArrB = b(bArr, 12);
        int iA2 = a(bArr, 16);
        if (bArrB.length != 0) {
            this.e = new String(bArrB, (iA & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        if (!c(bArr, 24)) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 24, bArr2, 0, 8);
            this.d = bArr2;
        }
        if (iA2 >= 40 && bArr.length >= 40) {
            if (!c(bArr, 32)) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f = bArr3;
            }
            if (iA2 < 48 || bArr.length < 48) {
                return;
            }
            byte[] bArrB2 = b(bArr, 40);
            if (bArrB2.length == 0) {
                return;
            }
            this.g = bArrB2;
        }
    }

    public final byte[] c() {
        return this.d;
    }

    public final byte[] d() {
        return this.g;
    }

    private static boolean c(byte[] bArr, int i) {
        for (int i2 = i; i2 < i + 8; i2++) {
            if (bArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = this.e;
        byte[] bArr = this.d;
        byte[] bArr2 = this.f;
        byte[] bArr3 = this.g;
        return "Type2Message[target=" + str + ",challenge=" + (bArr == null ? "null" : "<" + bArr.length + " bytes>") + ",context=" + (bArr2 == null ? "null" : "<" + bArr2.length + " bytes>") + ",targetInformation=" + (bArr3 == null ? "null" : "<" + bArr3.length + " bytes>") + ",flags=0x" + e.a(a(), 8) + "]";
    }
}
