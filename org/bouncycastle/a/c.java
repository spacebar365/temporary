package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends u implements aa {
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] a;
    protected final int b;

    public c(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = i;
    }

    protected static int a(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                if ((i >> (i3 * 8)) != 0) {
                    i2 = (i >> (i3 * 8)) & 255;
                    break;
                }
                i3--;
            } else {
                if (i != 0) {
                    i2 = i & 255;
                    break;
                }
                i3--;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i4;
            }
            i4++;
        }
    }

    static c a(int i, InputStream inputStream) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = inputStream.read();
        byte[] bArr = new byte[i - 1];
        if (bArr.length != 0) {
            if (org.bouncycastle.f.b.a.a(inputStream, bArr) != bArr.length) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (i2 > 0 && i2 < 8 && bArr[bArr.length - 1] != ((byte) (bArr[bArr.length - 1] & (255 << i2)))) {
                return new bt(bArr, i2);
            }
        }
        return new au(bArr, i2);
    }

    protected static byte[] a(byte[] bArr, int i) {
        byte[] bArrB = org.bouncycastle.f.a.b(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrB[length] = (byte) (bArrB[length] & (255 << i));
        }
        return bArrB;
    }

    protected static byte[] b(int i) {
        if (i == 0) {
            return new byte[0];
        }
        int i2 = 4;
        for (int i3 = 3; i3 > 0 && ((255 << (i3 * 8)) & i) == 0; i3--) {
            i2--;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    @Override // org.bouncycastle.a.u
    abstract void a(s sVar);

    @Override // org.bouncycastle.a.u
    protected final boolean a(u uVar) {
        if (!(uVar instanceof c)) {
            return false;
        }
        c cVar = (c) uVar;
        return this.b == cVar.b && org.bouncycastle.f.a.a(d(), cVar.d());
    }

    @Override // org.bouncycastle.a.aa
    public final String b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new s(byteArrayOutputStream).a((f) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(c[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(c[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new t("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    public final byte[] c() {
        if (this.b != 0) {
            throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
        }
        return org.bouncycastle.f.a.b(this.a);
    }

    public final byte[] d() {
        return a(this.a, this.b);
    }

    public final int f() {
        return this.b;
    }

    @Override // org.bouncycastle.a.u
    final u g() {
        return new au(this.a, this.b);
    }

    @Override // org.bouncycastle.a.u
    final u h() {
        return new bt(this.a, this.b);
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        return this.b ^ org.bouncycastle.f.a.a(d());
    }

    public String toString() {
        return b();
    }
}
