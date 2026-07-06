package org.bouncycastle.b.m;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private final org.bouncycastle.b.e a;
    private final d b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private byte[] f;
    private long g;

    private static void a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) (bArr[length] + 1);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
        }
        this.a.a(bArr, 0, bArr, 0);
    }

    private static boolean a(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    final int a(byte[] bArr, boolean z) {
        if (this.e.length == 8) {
            if (this.g > 32768) {
                return -1;
            }
            if (a(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.g > 8388608) {
                return -1;
            }
            if (a(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z || this.f == null) {
            this.f = this.b.a();
            if (this.f.length != this.a.b()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length = bArr.length / this.e.length;
        for (int i = 0; i < length; i++) {
            this.a.a(this.c, 0, this.d, 0);
            a(this.e, this.d, this.f);
            a(this.f, this.e, this.d);
            System.arraycopy(this.e, 0, bArr, this.e.length * i, this.e.length);
            a(this.c);
        }
        int length2 = bArr.length - (this.e.length * length);
        if (length2 > 0) {
            this.a.a(this.c, 0, this.d, 0);
            a(this.e, this.d, this.f);
            a(this.f, this.e, this.d);
            System.arraycopy(this.e, 0, bArr, length * this.e.length, length2);
            a(this.c);
        }
        this.g++;
        return bArr.length;
    }

    final void a() {
        this.f = this.b.a();
        if (this.f.length != this.a.b()) {
            throw new IllegalStateException("Insufficient entropy returned");
        }
        this.g = 1L;
    }

    final d b() {
        return this.b;
    }
}
