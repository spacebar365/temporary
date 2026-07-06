package org.bouncycastle.f.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    protected final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte b = 61;
    protected final byte[] c = new byte[128];

    public b() {
        a();
    }

    private static int a(String str, int i, int i2) {
        while (i < i2 && a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private void a() {
        for (int i = 0; i < this.c.length; i++) {
            this.c[i] = -1;
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.c[this.a[i2]] = (byte) i2;
        }
    }

    private static boolean a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // org.bouncycastle.f.a.d
    public final int a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3 = i2 % 3;
        int i4 = i2 - i3;
        for (int i5 = i; i5 < i + i4; i5 += 3) {
            int i6 = bArr[i5] & 255;
            int i7 = bArr[i5 + 1] & 255;
            int i8 = bArr[i5 + 2] & 255;
            outputStream.write(this.a[(i6 >>> 2) & 63]);
            outputStream.write(this.a[((i6 << 4) | (i7 >>> 4)) & 63]);
            outputStream.write(this.a[((i7 << 2) | (i8 >>> 6)) & 63]);
            outputStream.write(this.a[i8 & 63]);
        }
        switch (i3) {
            case 1:
                int i9 = bArr[i + i4] & 255;
                outputStream.write(this.a[(i9 >>> 2) & 63]);
                outputStream.write(this.a[(i9 << 4) & 63]);
                outputStream.write(this.b);
                outputStream.write(this.b);
                break;
            case 2:
                int i10 = bArr[i + i4] & 255;
                int i11 = bArr[i + i4 + 1] & 255;
                outputStream.write(this.a[(i10 >>> 2) & 63]);
                outputStream.write(this.a[((i10 << 4) | (i11 >>> 4)) & 63]);
                outputStream.write(this.a[(i11 << 2) & 63]);
                outputStream.write(this.b);
                break;
        }
        return (i3 == 0 ? 0 : 4) + ((i4 / 3) * 4);
    }

    @Override // org.bouncycastle.f.a.d
    public final int a(String str, OutputStream outputStream) throws IOException {
        int i;
        int i2 = 0;
        int length = str.length();
        while (length > 0 && a(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i3 = length;
        int i4 = 0;
        while (i3 > 0 && i4 != 4) {
            if (!a(str.charAt(i3 - 1))) {
                i4++;
            }
            i3--;
        }
        int iA = a(str, 0, i3);
        while (iA < i3) {
            int i5 = iA + 1;
            byte b = this.c[str.charAt(iA)];
            int iA2 = a(str, i5, i3);
            int i6 = iA2 + 1;
            byte b2 = this.c[str.charAt(iA2)];
            int iA3 = a(str, i6, i3);
            int i7 = iA3 + 1;
            byte b3 = this.c[str.charAt(iA3)];
            int iA4 = a(str, i7, i3);
            int i8 = iA4 + 1;
            byte b4 = this.c[str.charAt(iA4)];
            if ((b | b2 | b3 | b4) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i2 += 3;
            iA = a(str, i8, i3);
        }
        int iA5 = a(str, iA, length);
        int iA6 = a(str, iA5 + 1, length);
        int iA7 = a(str, iA6 + 1, length);
        int iA8 = a(str, iA7 + 1, length);
        char cCharAt = str.charAt(iA5);
        char cCharAt2 = str.charAt(iA6);
        char cCharAt3 = str.charAt(iA7);
        char cCharAt4 = str.charAt(iA8);
        if (cCharAt3 == this.b) {
            if (cCharAt4 != this.b) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte b5 = this.c[cCharAt];
            byte b6 = this.c[cCharAt2];
            if ((b5 | b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b5 << 2) | (b6 >> 4));
            i = 1;
        } else if (cCharAt4 == this.b) {
            byte b7 = this.c[cCharAt];
            byte b8 = this.c[cCharAt2];
            byte b9 = this.c[cCharAt3];
            if ((b7 | b8 | b9) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b7 << 2) | (b8 >> 4));
            outputStream.write((b8 << 4) | (b9 >> 2));
            i = 2;
        } else {
            byte b10 = this.c[cCharAt];
            byte b11 = this.c[cCharAt2];
            byte b12 = this.c[cCharAt3];
            byte b13 = this.c[cCharAt4];
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
