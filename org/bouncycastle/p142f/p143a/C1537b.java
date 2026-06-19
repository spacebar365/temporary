package org.bouncycastle.p142f.p143a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.f.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1537b implements InterfaceC1539d {

    /* JADX INFO: renamed from: a */
    protected final byte[] f5484a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b */
    protected byte f5485b = 61;

    /* JADX INFO: renamed from: c */
    protected final byte[] f5486c = new byte[128];

    public C1537b() {
        m4101a();
    }

    /* JADX INFO: renamed from: a */
    private static int m4100a(String str, int i, int i2) {
        while (i < i2 && m4102a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private void m4101a() {
        for (int i = 0; i < this.f5486c.length; i++) {
            this.f5486c[i] = -1;
        }
        for (int i2 = 0; i2 < this.f5484a.length; i2++) {
            this.f5486c[this.f5484a[i2]] = (byte) i2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4102a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // org.bouncycastle.p142f.p143a.InterfaceC1539d
    /* JADX INFO: renamed from: a */
    public final int mo4104a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3 = i2 % 3;
        int i4 = i2 - i3;
        for (int i5 = i; i5 < i + i4; i5 += 3) {
            int i6 = bArr[i5] & 255;
            int i7 = bArr[i5 + 1] & 255;
            int i8 = bArr[i5 + 2] & 255;
            outputStream.write(this.f5484a[(i6 >>> 2) & 63]);
            outputStream.write(this.f5484a[((i6 << 4) | (i7 >>> 4)) & 63]);
            outputStream.write(this.f5484a[((i7 << 2) | (i8 >>> 6)) & 63]);
            outputStream.write(this.f5484a[i8 & 63]);
        }
        switch (i3) {
            case 1:
                int i9 = bArr[i + i4] & 255;
                outputStream.write(this.f5484a[(i9 >>> 2) & 63]);
                outputStream.write(this.f5484a[(i9 << 4) & 63]);
                outputStream.write(this.f5485b);
                outputStream.write(this.f5485b);
                break;
            case 2:
                int i10 = bArr[i + i4] & 255;
                int i11 = bArr[i + i4 + 1] & 255;
                outputStream.write(this.f5484a[(i10 >>> 2) & 63]);
                outputStream.write(this.f5484a[((i10 << 4) | (i11 >>> 4)) & 63]);
                outputStream.write(this.f5484a[(i11 << 2) & 63]);
                outputStream.write(this.f5485b);
                break;
        }
        return (i3 == 0 ? 0 : 4) + ((i4 / 3) * 4);
    }

    @Override // org.bouncycastle.p142f.p143a.InterfaceC1539d
    /* JADX INFO: renamed from: a */
    public final int mo4103a(String str, OutputStream outputStream) throws IOException {
        int i;
        int i2 = 0;
        int length = str.length();
        while (length > 0 && m4102a(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i3 = length;
        int i4 = 0;
        while (i3 > 0 && i4 != 4) {
            if (!m4102a(str.charAt(i3 - 1))) {
                i4++;
            }
            i3--;
        }
        int iM4100a = m4100a(str, 0, i3);
        while (iM4100a < i3) {
            int i5 = iM4100a + 1;
            byte b = this.f5486c[str.charAt(iM4100a)];
            int iM4100a2 = m4100a(str, i5, i3);
            int i6 = iM4100a2 + 1;
            byte b2 = this.f5486c[str.charAt(iM4100a2)];
            int iM4100a3 = m4100a(str, i6, i3);
            int i7 = iM4100a3 + 1;
            byte b3 = this.f5486c[str.charAt(iM4100a3)];
            int iM4100a4 = m4100a(str, i7, i3);
            int i8 = iM4100a4 + 1;
            byte b4 = this.f5486c[str.charAt(iM4100a4)];
            if ((b | b2 | b3 | b4) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i2 += 3;
            iM4100a = m4100a(str, i8, i3);
        }
        int iM4100a5 = m4100a(str, iM4100a, length);
        int iM4100a6 = m4100a(str, iM4100a5 + 1, length);
        int iM4100a7 = m4100a(str, iM4100a6 + 1, length);
        int iM4100a8 = m4100a(str, iM4100a7 + 1, length);
        char cCharAt = str.charAt(iM4100a5);
        char cCharAt2 = str.charAt(iM4100a6);
        char cCharAt3 = str.charAt(iM4100a7);
        char cCharAt4 = str.charAt(iM4100a8);
        if (cCharAt3 == this.f5485b) {
            if (cCharAt4 != this.f5485b) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte b5 = this.f5486c[cCharAt];
            byte b6 = this.f5486c[cCharAt2];
            if ((b5 | b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b5 << 2) | (b6 >> 4));
            i = 1;
        } else if (cCharAt4 == this.f5485b) {
            byte b7 = this.f5486c[cCharAt];
            byte b8 = this.f5486c[cCharAt2];
            byte b9 = this.f5486c[cCharAt3];
            if ((b7 | b8 | b9) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b7 << 2) | (b8 >> 4));
            outputStream.write((b8 << 4) | (b9 >> 2));
            i = 2;
        } else {
            byte b10 = this.f5486c[cCharAt];
            byte b11 = this.f5486c[cCharAt2];
            byte b12 = this.f5486c[cCharAt3];
            byte b13 = this.f5486c[cCharAt4];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write((b12 << 6) | b13);
            i = 3;
        }
        return i + i2;
    }
}
