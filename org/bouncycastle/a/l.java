package org.bouncycastle.a;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class l extends FilterInputStream {
    private final int a;
    private final boolean b;
    private final byte[][] c;

    public l(InputStream inputStream) {
        this(inputStream, ch.a(inputStream));
    }

    public l(InputStream inputStream, byte b) {
        this(inputStream, ch.a(inputStream), true);
    }

    private l(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    private l(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = new byte[11][];
    }

    public l(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public l(byte[] bArr, byte b) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    static int a(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int i4 = inputStream.read();
        if ((i4 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while (i4 >= 0 && (i4 & 128) != 0) {
            i3 = ((i4 & 127) | i3) << 7;
            i4 = inputStream.read();
        }
        if (i4 < 0) {
            throw new EOFException("EOF found inside tag value.");
        }
        return (i4 & 127) | i3;
    }

    private static g a(ca caVar) {
        return new l(caVar).d();
    }

    private u a(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        ca caVar = new ca(this, i3);
        if ((i & 64) != 0) {
            return new bs(z, i2, caVar.b());
        }
        if ((i & 128) != 0) {
            return new z(caVar).a(z, i2);
        }
        if (!z) {
            return a(i2, caVar, this.c);
        }
        switch (i2) {
            case 4:
                g gVarA = a(caVar);
                q[] qVarArr = new q[gVarA.a()];
                for (int i4 = 0; i4 != qVarArr.length; i4++) {
                    qVarArr[i4] = (q) gVarA.a(i4);
                }
                return new ah(qVarArr);
            case 8:
                return new bu(a(caVar));
            case 16:
                return this.b ? new ce(caVar.b()) : ax.a(a(caVar));
            case 17:
                return ax.b(a(caVar));
            default:
                throw new IOException("unknown tag " + i2 + " encountered");
        }
    }

    static u a(int i, ca caVar, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return d.a(a(caVar, bArr));
            case 2:
                return new m(caVar.b(), false);
            case 3:
                return c.a(caVar.a(), caVar);
            case 4:
                return new be(caVar.b());
            case 5:
                return bc.a;
            case 6:
                return p.a(a(caVar, bArr));
            case 7:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException("unknown tag " + i + " encountered");
            case 10:
                return h.a(a(caVar, bArr));
            case 12:
                return new bo(caVar.b());
            case 18:
                return new bd(caVar.b());
            case 19:
                return new bh(caVar.b());
            case 20:
                return new bm(caVar.b());
            case 21:
                return new bq(caVar.b());
            case 22:
                return new bb(caVar.b());
            case 23:
                return new ad(caVar.b());
            case 24:
                return new k(caVar.b());
            case 25:
                return new ba(caVar.b());
            case 26:
                return new br(caVar.b());
            case 27:
                return new ay(caVar.b());
            case 28:
                return new bp(caVar.b());
            case 30:
                return new at(b(caVar));
        }
    }

    private static byte[] a(ca caVar, byte[][] bArr) {
        int iA = caVar.a();
        if (caVar.a() >= bArr.length) {
            return caVar.b();
        }
        byte[] bArr2 = bArr[iA];
        if (bArr2 == null) {
            bArr2 = new byte[iA];
            bArr[iA] = bArr2;
        }
        org.bouncycastle.f.b.a.a(caVar, bArr2);
        return bArr2;
    }

    static int b(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 <= 127) {
            return i2;
        }
        int i3 = i2 & 127;
        if (i3 > 4) {
            throw new IOException("DER length more than 4 bytes: ".concat(String.valueOf(i3)));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i4 = (i4 << 8) + i6;
        }
        if (i4 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i4 >= i) {
            throw new IOException("corrupted stream - out of bounds length found");
        }
        return i4;
    }

    private static char[] b(ca caVar) throws IOException {
        int i;
        int iA = caVar.a() / 2;
        char[] cArr = new char[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            int i3 = caVar.read();
            if (i3 < 0 || (i = caVar.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }

    private int c() {
        return b(this, this.a);
    }

    private g d() throws IOException {
        g gVar = new g();
        while (true) {
            u uVarB = b();
            if (uVarB == null) {
                return gVar;
            }
            gVar.a(uVarB);
        }
    }

    final int a() {
        return this.a;
    }

    public final u b() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i == 0) {
                throw new IOException("unexpected end-of-contents marker");
            }
            return null;
        }
        int iA = a(this, i);
        boolean z = (i & 32) != 0;
        int iC = c();
        if (iC >= 0) {
            try {
                return a(i, iA, iC);
            } catch (IllegalArgumentException e) {
                throw new i("corrupted stream detected", e);
            }
        }
        if (!z) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        z zVar = new z(new cc(this, this.a), this.a);
        if ((i & 64) != 0) {
            return new af(iA, zVar).d();
        }
        if ((i & 128) != 0) {
            return new aq(true, iA, zVar).d();
        }
        switch (iA) {
            case 4:
                return new aj(zVar).d();
            case 8:
                return new aw(zVar).d();
            case 16:
                return new am(zVar).d();
            case 17:
                return new ao(zVar).d();
            default:
                throw new IOException("unknown BER object encountered");
        }
    }
}
