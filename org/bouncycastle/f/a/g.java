package org.bouncycastle.f.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {
    protected final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] b = new byte[128];

    public g() {
        a();
    }

    private void a() {
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = -1;
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.b[this.a[i2]] = (byte) i2;
        }
        this.b[65] = this.b[97];
        this.b[66] = this.b[98];
        this.b[67] = this.b[99];
        this.b[68] = this.b[100];
        this.b[69] = this.b[101];
        this.b[70] = this.b[102];
    }

    private static boolean a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // org.bouncycastle.f.a.d
    public final int a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && a(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i;
            while (i3 < length && a(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b = this.b[str.charAt(i3)];
            while (i4 < length && a(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = this.b[str.charAt(i4)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write(b2 | (b << 4));
            i2++;
            i = i5;
        }
        return i2;
    }

    @Override // org.bouncycastle.f.a.d
    public final int a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.a[i4 >>> 4]);
            outputStream.write(this.a[i4 & 15]);
        }
        return i2 * 2;
    }
}
