package a.f;

import a.i.e;
import java.io.IOException;

/* JADX INFO: compiled from: Type1Message.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    private String c;
    private String d;

    public b(a.c cVar, int i, String str, String str2) {
        a((cVar.a().k() ? 1 : 2) | 33554944 | i);
        this.c = str;
        this.d = str2;
    }

    public final byte[] c() {
        int i;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        try {
            int iA = a();
            int length = ((iA & 33554432) != 0 ? 8 : 0) + 32;
            byte[] bArr3 = new byte[0];
            String str = this.c;
            if ((iA & 33554432) == 0 && str != null && str.length() != 0) {
                i = iA | 4096;
                byte[] bytes = str.toUpperCase().getBytes("Cp850");
                length += bytes.length;
                bArr = bytes;
            } else {
                i = iA & (-4097);
                bArr = bArr3;
            }
            byte[] bArr4 = new byte[0];
            String str2 = this.d;
            if ((i & 33554432) == 0 && str2 != null && str2.length() != 0) {
                i2 = i | 8192;
                byte[] bytes2 = str2.toUpperCase().getBytes("Cp850");
                length += bytes2.length;
                bArr2 = bytes2;
            } else {
                i2 = i & (-8193);
                bArr2 = bArr4;
            }
            byte[] bArr5 = new byte[length];
            System.arraycopy(a, 0, bArr5, 0, a.length);
            int length2 = a.length + 0;
            a(bArr5, length2, 1);
            int i3 = length2 + 4;
            a(bArr5, i3, i2);
            int i4 = i3 + 4;
            int iA2 = a(bArr5, i4, bArr);
            int i5 = i4 + 8;
            int iA3 = a(bArr5, i5, bArr2);
            int length3 = i5 + 8;
            if ((i2 & 33554432) != 0) {
                System.arraycopy(b, 0, bArr5, length3, b.length);
                length3 += b.length;
            }
            a(bArr5, length3 + a(bArr5, length3, iA2, bArr), iA3, bArr2);
            return bArr5;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        if (str == null) {
            str = "null";
        }
        return sb.append(str).append(",suppliedWorkstation=").append(str2 == null ? "null" : str2).append(",flags=0x").append(e.a(a(), 8)).append("]").toString();
    }
}
