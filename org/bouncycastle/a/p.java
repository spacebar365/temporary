package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class p extends u {
    private static final ConcurrentMap<p$a, p> c = new ConcurrentHashMap();
    private final String a;
    private byte[] b;

    private p(byte[] bArr) {
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
        this.a = stringBuffer.toString();
        this.b = org.bouncycastle.f.a.b(bArr);
    }

    public static p a(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof f) {
            u uVarI = ((f) obj).i();
            if (uVarI instanceof p) {
                return (p) uVarI;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static p a(ab abVar, boolean z) {
        u uVarJ = abVar.j();
        return (z || (uVarJ instanceof p)) ? a((Object) uVarJ) : a(q.a((Object) uVarJ).c());
    }

    static p a(byte[] bArr) {
        p pVar = c.get(new p$a(bArr));
        return pVar == null ? new p(bArr) : pVar;
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream) {
        cg cgVar = new cg(this.a);
        int i = Integer.parseInt(cgVar.b()) * 40;
        String strB = cgVar.b();
        if (strB.length() <= 18) {
            a(byteArrayOutputStream, Long.parseLong(strB) + ((long) i));
        } else {
            a(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i)));
        }
        while (cgVar.a()) {
            String strB2 = cgVar.b();
            if (strB2.length() <= 18) {
                a(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                a(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, long j) {
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

    private static void a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
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

    private static boolean a(String str, int i) {
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

    private synchronized byte[] d() {
        if (this.b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a(byteArrayOutputStream);
            this.b = byteArrayOutputStream.toByteArray();
        }
        return this.b;
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        byte[] bArrD = d();
        sVar.b(6);
        sVar.a(bArrD.length);
        sVar.a(bArrD);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar == this) {
            return true;
        }
        if (uVar instanceof p) {
            return this.a.equals(((p) uVar).a);
        }
        return false;
    }

    public final String b() {
        return this.a;
    }

    public final p b(String str) {
        return new p(this, str);
    }

    public final p c() {
        p$a p_a = new p$a(d());
        p pVar = c.get(p_a);
        if (pVar != null) {
            return pVar;
        }
        p pVarPutIfAbsent = c.putIfAbsent(p_a, this);
        return pVarPutIfAbsent == null ? this : pVarPutIfAbsent;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int length = d().length;
        return length + ch.a(length) + 1;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return this.a.hashCode();
    }

    public p(String str) {
        char cCharAt;
        boolean zA = false;
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            zA = a(str, 2);
        }
        if (!zA) {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        this.a = str;
    }

    private p(p pVar, String str) {
        if (!a(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.a = pVar.a + "." + str;
    }

    public final boolean a(p pVar) {
        String str = this.a;
        String str2 = pVar.a;
        return str.length() > str2.length() && str.charAt(str2.length()) == '.' && str.startsWith(str2);
    }

    public final String toString() {
        return this.a;
    }
}
