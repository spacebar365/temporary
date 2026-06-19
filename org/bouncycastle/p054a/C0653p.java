package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0653p extends AbstractC0686u {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentMap<a, C0653p> f2514c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private final String f2515a;

    /* JADX INFO: renamed from: b */
    private byte[] f2516b;

    /* JADX INFO: renamed from: org.bouncycastle.a.p$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final int f2517a;

        /* JADX INFO: renamed from: b */
        private final byte[] f2518b;

        a(byte[] bArr) {
            this.f2517a = C1535a.m4066a(bArr);
            this.f2518b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return C1535a.m4076a(this.f2518b, ((a) obj).f2518b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2517a;
        }
    }

    private C0653p(byte[] bArr) {
        BigInteger bigIntegerShiftLeft;
        boolean z;
        StringBuffer stringBuffer = new StringBuffer();
        long j = 0;
        BigInteger bigInteger = null;
        boolean z2 = true;
        int i = 0;
        while (i != bArr.length) {
            int i2 = bArr[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                    bigIntegerShiftLeft = bigInteger;
                } else {
                    j = j2 << 7;
                    bigIntegerShiftLeft = bigInteger;
                }
            } else {
                BigInteger bigIntegerOr = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        z = false;
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                    } else {
                        z = z2;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                    z2 = z;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            i++;
            bigInteger = bigIntegerShiftLeft;
        }
        this.f2515a = stringBuffer.toString();
        this.f2516b = C1535a.m4086b(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0653p m1584a(Object obj) {
        if (obj == null || (obj instanceof C0653p)) {
            return (C0653p) obj;
        }
        if (obj instanceof InterfaceC0618f) {
            AbstractC0686u abstractC0686uMo1358i = ((InterfaceC0618f) obj).mo1358i();
            if (abstractC0686uMo1358i instanceof C0653p) {
                return (C0653p) abstractC0686uMo1358i;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    public static C0653p m1585a(AbstractC0539ab abstractC0539ab, boolean z) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        return (z || (abstractC0686uM1402j instanceof C0653p)) ? m1584a((Object) abstractC0686uM1402j) : m1586a(AbstractC0655q.m1596a((Object) abstractC0686uM1402j).mo1410c());
    }

    /* JADX INFO: renamed from: a */
    static C0653p m1586a(byte[] bArr) {
        C0653p c0653p = f2514c.get(new a(bArr));
        return c0653p == null ? new C0653p(bArr) : c0653p;
    }

    /* JADX INFO: renamed from: a */
    private void m1587a(ByteArrayOutputStream byteArrayOutputStream) {
        C0611cg c0611cg = new C0611cg(this.f2515a);
        int i = Integer.parseInt(c0611cg.m1487b()) * 40;
        String strM1487b = c0611cg.m1487b();
        if (strM1487b.length() <= 18) {
            m1588a(byteArrayOutputStream, Long.parseLong(strM1487b) + ((long) i));
        } else {
            m1589a(byteArrayOutputStream, new BigInteger(strM1487b).add(BigInteger.valueOf(i)));
        }
        while (c0611cg.m1486a()) {
            String strM1487b2 = c0611cg.m1487b();
            if (strM1487b2.length() <= 18) {
                m1588a(byteArrayOutputStream, Long.parseLong(strM1487b2));
            } else {
                m1589a(byteArrayOutputStream, new BigInteger(strM1487b2));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1588a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        int i = 8;
        byte[] bArr = new byte[9];
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* JADX INFO: renamed from: a */
    private static void m1589a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        for (int i = iBitLength - 1; i >= 0; i--) {
            bArr[i] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        int i2 = iBitLength - 1;
        bArr[i2] = (byte) (bArr[i2] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1590a(String str, int i) {
        int length = str.length();
        boolean z = false;
        while (true) {
            length--;
            if (length < i) {
                return z;
            }
            char cCharAt = str.charAt(length);
            if ('0' <= cCharAt && cCharAt <= '9') {
                z = true;
            } else {
                if (cCharAt != '.' || !z) {
                    return false;
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized byte[] m1591d() {
        if (this.f2516b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m1587a(byteArrayOutputStream);
            this.f2516b = byteArrayOutputStream.toByteArray();
        }
        return this.f2516b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        byte[] bArrM1591d = m1591d();
        c0660s.mo1608b(6);
        c0660s.m1602a(bArrM1591d.length);
        c0660s.m1607a(bArrM1591d);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u == this) {
            return true;
        }
        if (abstractC0686u instanceof C0653p) {
            return this.f2515a.equals(((C0653p) abstractC0686u).f2515a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final String m1593b() {
        return this.f2515a;
    }

    /* JADX INFO: renamed from: b */
    public final C0653p m1594b(String str) {
        return new C0653p(this, str);
    }

    /* JADX INFO: renamed from: c */
    public final C0653p m1595c() {
        a aVar = new a(m1591d());
        C0653p c0653p = f2514c.get(aVar);
        if (c0653p != null) {
            return c0653p;
        }
        C0653p c0653pPutIfAbsent = f2514c.putIfAbsent(aVar, this);
        return c0653pPutIfAbsent == null ? this : c0653pPutIfAbsent;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int length = m1591d().length;
        return length + C0612ch.m1488a(length) + 1;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return this.f2515a.hashCode();
    }

    public C0653p(String str) {
        char cCharAt;
        boolean zM1590a = false;
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            zM1590a = m1590a(str, 2);
        }
        if (!zM1590a) {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        this.f2515a = str;
    }

    private C0653p(C0653p c0653p, String str) {
        if (!m1590a(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f2515a = c0653p.f2515a + "." + str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1592a(C0653p c0653p) {
        String str = this.f2515a;
        String str2 = c0653p.f2515a;
        return str.length() > str2.length() && str.charAt(str2.length()) == '.' && str.startsWith(str2);
    }

    public final String toString() {
        return this.f2515a;
    }
}
