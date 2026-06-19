package p000a.p027f;

import java.io.IOException;
import p000a.InterfaceC0016c;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.f.b */
/* JADX INFO: compiled from: Type1Message.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0206b extends AbstractC0198a {

    /* JADX INFO: renamed from: c */
    private String f925c;

    /* JADX INFO: renamed from: d */
    private String f926d;

    public C0206b(InterfaceC0016c interfaceC0016c, int i, String str, String str2) {
        m581a((interfaceC0016c.mo114a().mo66k() ? 1 : 2) | 33554944 | i);
        this.f925c = str;
        this.f926d = str2;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m589c() {
        int i;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        try {
            int iA = m580a();
            int length = ((iA & 33554432) != 0 ? 8 : 0) + 32;
            byte[] bArr3 = new byte[0];
            String str = this.f925c;
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
            String str2 = this.f926d;
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
            System.arraycopy(f919a, 0, bArr5, 0, f919a.length);
            int length2 = f919a.length + 0;
            m577a(bArr5, length2, 1);
            int i3 = length2 + 4;
            m577a(bArr5, i3, i2);
            int i4 = i3 + 4;
            int iA2 = m576a(bArr5, i4, bArr);
            int i5 = i4 + 8;
            int iA3 = m576a(bArr5, i5, bArr2);
            int length3 = i5 + 8;
            if ((i2 & 33554432) != 0) {
                System.arraycopy(f920b, 0, bArr5, length3, f920b.length);
                length3 += f920b.length;
            }
            m575a(bArr5, length3 + m575a(bArr5, length3, iA2, bArr), iA3, bArr2);
            return bArr5;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        String str = this.f925c;
        String str2 = this.f926d;
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        if (str == null) {
            str = "null";
        }
        return sb.append(str).append(",suppliedWorkstation=").append(str2 == null ? "null" : str2).append(",flags=0x").append(C0284e.m947a(m580a(), 8)).append("]").toString();
    }
}
