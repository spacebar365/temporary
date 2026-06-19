package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: renamed from: org.bouncycastle.a.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0603c extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: c */
    private static final char[] f2134c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    protected final byte[] f2135a;

    /* JADX INFO: renamed from: b */
    protected final int f2136b;

    public AbstractC0603c(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f2135a = C1535a.m4086b(bArr);
        this.f2136b = i;
    }

    /* JADX INFO: renamed from: a */
    protected static int m1469a(int i) {
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

    /* JADX INFO: renamed from: a */
    static AbstractC0603c m1470a(int i, InputStream inputStream) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = inputStream.read();
        byte[] bArr = new byte[i - 1];
        if (bArr.length != 0) {
            if (C1545a.m4121a(inputStream, bArr) != bArr.length) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (i2 > 0 && i2 < 8 && bArr[bArr.length - 1] != ((byte) (bArr[bArr.length - 1] & (255 << i2)))) {
                return new C0596bt(bArr, i2);
            }
        }
        return new C0558au(bArr, i2);
    }

    /* JADX INFO: renamed from: a */
    protected static byte[] m1471a(byte[] bArr, int i) {
        byte[] bArrM4086b = C1535a.m4086b(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrM4086b[length] = (byte) (bArrM4086b[length] & (255 << i));
        }
        return bArrM4086b;
    }

    /* JADX INFO: renamed from: b */
    protected static byte[] m1472b(int i) {
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

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    abstract void mo1335a(C0660s c0660s);

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    protected final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof AbstractC0603c)) {
            return false;
        }
        AbstractC0603c abstractC0603c = (AbstractC0603c) abstractC0686u;
        return this.f2136b == abstractC0603c.f2136b && C1535a.m4076a(m1474d(), abstractC0603c.m1474d());
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C0660s(byteArrayOutputStream).mo1459a((InterfaceC0618f) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(f2134c[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(f2134c[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C0684t("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m1473c() {
        if (this.f2136b != 0) {
            throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
        }
        return C1535a.m4086b(this.f2135a);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m1474d() {
        return m1471a(this.f2135a, this.f2136b);
    }

    /* JADX INFO: renamed from: f */
    public final int m1475f() {
        return this.f2136b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        return new C0558au(this.f2135a, this.f2136b);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: h */
    final AbstractC0686u mo1401h() {
        return new C0596bt(this.f2135a, this.f2136b);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        return this.f2136b ^ C1535a.m4066a(m1474d());
    }

    public String toString() {
        return mo1350b();
    }
}
