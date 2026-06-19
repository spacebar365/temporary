package org.bouncycastle.p142f.p143a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.f.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1542g implements InterfaceC1539d {

    /* JADX INFO: renamed from: a */
    protected final byte[] f5490a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: b */
    protected final byte[] f5491b = new byte[128];

    public C1542g() {
        m4109a();
    }

    /* JADX INFO: renamed from: a */
    private void m4109a() {
        for (int i = 0; i < this.f5491b.length; i++) {
            this.f5491b[i] = -1;
        }
        for (int i2 = 0; i2 < this.f5490a.length; i2++) {
            this.f5491b[this.f5490a[i2]] = (byte) i2;
        }
        this.f5491b[65] = this.f5491b[97];
        this.f5491b[66] = this.f5491b[98];
        this.f5491b[67] = this.f5491b[99];
        this.f5491b[68] = this.f5491b[100];
        this.f5491b[69] = this.f5491b[101];
        this.f5491b[70] = this.f5491b[102];
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4110a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // org.bouncycastle.p142f.p143a.InterfaceC1539d
    /* JADX INFO: renamed from: a */
    public final int mo4103a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && m4110a(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i;
            while (i3 < length && m4110a(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b = this.f5491b[str.charAt(i3)];
            while (i4 < length && m4110a(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = this.f5491b[str.charAt(i4)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write(b2 | (b << 4));
            i2++;
            i = i5;
        }
        return i2;
    }

    @Override // org.bouncycastle.p142f.p143a.InterfaceC1539d
    /* JADX INFO: renamed from: a */
    public final int mo4104a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.f5490a[i4 >>> 4]);
            outputStream.write(this.f5490a[i4 & 15]);
        }
        return i2 * 2;
    }
}
