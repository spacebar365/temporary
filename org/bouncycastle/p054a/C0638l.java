package org.bouncycastle.p054a;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: renamed from: org.bouncycastle.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0638l extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final int f2388a;

    /* JADX INFO: renamed from: b */
    private final boolean f2389b;

    /* JADX INFO: renamed from: c */
    private final byte[][] f2390c;

    public C0638l(InputStream inputStream) {
        this(inputStream, C0612ch.m1489a(inputStream));
    }

    public C0638l(InputStream inputStream, byte b) {
        this(inputStream, C0612ch.m1489a(inputStream), true);
    }

    private C0638l(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    private C0638l(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f2388a = i;
        this.f2389b = z;
        this.f2390c = new byte[11][];
    }

    public C0638l(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C0638l(byte[] bArr, byte b) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    /* JADX INFO: renamed from: a */
    static int m1550a(InputStream inputStream, int i) throws IOException {
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

    /* JADX INFO: renamed from: a */
    private static C0625g m1551a(C0605ca c0605ca) {
        return new C0638l(c0605ca).m1558d();
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0686u m1552a(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        C0605ca c0605ca = new C0605ca(this, i3);
        if ((i & 64) != 0) {
            return new C0595bs(z, i2, c0605ca.m1477b());
        }
        if ((i & 128) != 0) {
            return new C0758z(c0605ca).m1779a(z, i2);
        }
        if (!z) {
            return m1553a(i2, c0605ca, this.f2390c);
        }
        switch (i2) {
            case 4:
                C0625g c0625gM1551a = m1551a(c0605ca);
                AbstractC0655q[] abstractC0655qArr = new AbstractC0655q[c0625gM1551a.m1519a()];
                for (int i4 = 0; i4 != abstractC0655qArr.length; i4++) {
                    abstractC0655qArr[i4] = (AbstractC0655q) c0625gM1551a.m1520a(i4);
                }
                return new C0545ah(abstractC0655qArr);
            case 8:
                return new C0597bu(m1551a(c0605ca));
            case 16:
                return this.f2389b ? new C0609ce(c0605ca.m1477b()) : C0561ax.m1416a(m1551a(c0605ca));
            case 17:
                return C0561ax.m1417b(m1551a(c0605ca));
            default:
                throw new IOException("unknown tag " + i2 + " encountered");
        }
    }

    /* JADX INFO: renamed from: a */
    static AbstractC0686u m1553a(int i, C0605ca c0605ca, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return C0613d.m1494a(m1554a(c0605ca, bArr));
            case 2:
                return new C0640m(c0605ca.m1477b(), false);
            case 3:
                return AbstractC0603c.m1470a(c0605ca.mo1476a(), c0605ca);
            case 4:
                return new C0581be(c0605ca.m1477b());
            case 5:
                return C0579bc.f2112a;
            case 6:
                return C0653p.m1586a(m1554a(c0605ca, bArr));
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
                return C0627h.m1524a(m1554a(c0605ca, bArr));
            case 12:
                return new C0591bo(c0605ca.m1477b());
            case 18:
                return new C0580bd(c0605ca.m1477b());
            case 19:
                return new C0584bh(c0605ca.m1477b());
            case 20:
                return new C0589bm(c0605ca.m1477b());
            case 21:
                return new C0593bq(c0605ca.m1477b());
            case 22:
                return new C0578bb(c0605ca.m1477b());
            case 23:
                return new C0541ad(c0605ca.m1477b());
            case 24:
                return new C0636k(c0605ca.m1477b());
            case 25:
                return new C0577ba(c0605ca.m1477b());
            case 26:
                return new C0594br(c0605ca.m1477b());
            case 27:
                return new C0562ay(c0605ca.m1477b());
            case 28:
                return new C0592bp(c0605ca.m1477b());
            case 30:
                return new C0557at(m1556b(c0605ca));
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1554a(C0605ca c0605ca, byte[][] bArr) {
        int iMo1476a = c0605ca.mo1476a();
        if (c0605ca.mo1476a() >= bArr.length) {
            return c0605ca.m1477b();
        }
        byte[] bArr2 = bArr[iMo1476a];
        if (bArr2 == null) {
            bArr2 = new byte[iMo1476a];
            bArr[iMo1476a] = bArr2;
        }
        C1545a.m4121a(c0605ca, bArr2);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    static int m1555b(InputStream inputStream, int i) throws IOException {
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

    /* JADX INFO: renamed from: b */
    private static char[] m1556b(C0605ca c0605ca) throws IOException {
        int i;
        int iMo1476a = c0605ca.mo1476a() / 2;
        char[] cArr = new char[iMo1476a];
        for (int i2 = 0; i2 < iMo1476a; i2++) {
            int i3 = c0605ca.read();
            if (i3 < 0 || (i = c0605ca.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }

    /* JADX INFO: renamed from: c */
    private int m1557c() {
        return m1555b(this, this.f2388a);
    }

    /* JADX INFO: renamed from: d */
    private C0625g m1558d() {
        C0625g c0625g = new C0625g();
        while (true) {
            AbstractC0686u abstractC0686uM1560b = m1560b();
            if (abstractC0686uM1560b == null) {
                return c0625g;
            }
            c0625g.m1521a(abstractC0686uM1560b);
        }
    }

    /* JADX INFO: renamed from: a */
    final int m1559a() {
        return this.f2388a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0686u m1560b() {
        int i = read();
        if (i <= 0) {
            if (i == 0) {
                throw new IOException("unexpected end-of-contents marker");
            }
            return null;
        }
        int iM1550a = m1550a(this, i);
        boolean z = (i & 32) != 0;
        int iM1557c = m1557c();
        if (iM1557c >= 0) {
            try {
                return m1552a(i, iM1550a, iM1557c);
            } catch (IllegalArgumentException e) {
                throw new C0629i("corrupted stream detected", e);
            }
        }
        if (!z) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C0758z c0758z = new C0758z(new C0607cc(this, this.f2388a), this.f2388a);
        if ((i & 64) != 0) {
            return new C0543af(iM1550a, c0758z).mo1398d();
        }
        if ((i & 128) != 0) {
            return new C0554aq(true, iM1550a, c0758z).mo1398d();
        }
        switch (iM1550a) {
            case 4:
                return new C0547aj(c0758z).mo1398d();
            case 8:
                return new C0560aw(c0758z).mo1398d();
            case 16:
                return new C0550am(c0758z).mo1398d();
            case 17:
                return new C0552ao(c0758z).mo1398d();
            default:
                throw new IOException("unknown BER object encountered");
        }
    }
}
