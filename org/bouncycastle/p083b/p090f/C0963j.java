package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p097k.C1114q;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1118u;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.b.f.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0963j {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4011a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4012b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f4013c = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: d */
    private InterfaceC1175r f4014d;

    /* JADX INFO: renamed from: e */
    private int f4015e;

    /* JADX INFO: renamed from: f */
    private int f4016f;

    /* JADX INFO: renamed from: g */
    private int f4017g;

    /* JADX INFO: renamed from: h */
    private int f4018h;

    /* JADX INFO: renamed from: i */
    private SecureRandom f4019i;

    /* JADX INFO: renamed from: j */
    private boolean f4020j;

    /* JADX INFO: renamed from: k */
    private int f4021k;

    public C0963j(InterfaceC1175r interfaceC1175r) {
        this.f4014d = interfaceC1175r;
    }

    /* JADX INFO: renamed from: a */
    private static int m2423a(int i) {
        if (i <= 1024) {
            return 40;
        }
        return (((i - 1) / 1024) * 8) + 48;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2424a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerDivide = bigInteger.subtract(f4012b).divide(bigInteger2);
        BigInteger bigIntegerSubtract = bigInteger.subtract(f4013c);
        do {
            bigIntegerModPow = C1544b.m4115a(f4013c, bigIntegerSubtract, secureRandom).modPow(bigIntegerDivide, bigInteger);
        } while (bigIntegerModPow.bitLength() <= 1);
        return bigIntegerModPow;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2425a(InterfaceC1175r interfaceC1175r, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
        BigInteger bigIntegerDivide = bigInteger.subtract(f4012b).divide(bigInteger2);
        byte[] bArrM4106a = C1541f.m4106a("6767656E");
        byte[] bArr2 = new byte[bArr.length + bArrM4106a.length + 1 + 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrM4106a, 0, bArr2, bArr.length, bArrM4106a.length);
        bArr2[bArr2.length - 3] = (byte) i;
        byte[] bArr3 = new byte[interfaceC1175r.mo1930b()];
        for (int i2 = 1; i2 < 65536; i2++) {
            m2427a(bArr2);
            m2426a(interfaceC1175r, bArr2, bArr3, 0);
            BigInteger bigIntegerModPow = new BigInteger(1, bArr3).modPow(bigIntegerDivide, bigInteger);
            if (bigIntegerModPow.compareTo(f4013c) >= 0) {
                return bigIntegerModPow;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m2426a(InterfaceC1175r interfaceC1175r, byte[] bArr, byte[] bArr2, int i) {
        interfaceC1175r.mo1929a(bArr, 0, bArr.length);
        interfaceC1175r.mo1926a(bArr2, i);
    }

    /* JADX INFO: renamed from: a */
    private static void m2427a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2428a(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.f4017g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.bouncycastle.p083b.p097k.C1115r m2429b() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p083b.p090f.C0963j.m2429b():org.bouncycastle.b.k.r");
    }

    /* JADX INFO: renamed from: a */
    public final void m2432a(C1114q c1114q) {
        int iM2681a = c1114q.m2681a();
        int iM2682b = c1114q.m2682b();
        if (iM2681a < 1024 || iM2681a > 3072 || iM2681a % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (iM2681a == 1024 && iM2682b != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (iM2681a == 2048 && iM2682b != 224 && iM2682b != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (iM2681a == 3072 && iM2682b != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.f4014d.mo1930b() * 8 < iM2682b) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.f4015e = iM2681a;
        this.f4016f = iM2682b;
        this.f4017g = c1114q.m2683c();
        this.f4018h = Math.max(m2423a(iM2681a), (this.f4017g + 1) / 2);
        this.f4019i = c1114q.m2684d();
        this.f4020j = true;
        this.f4021k = c1114q.m2685e();
    }

    public C0963j() {
        this(new C0842s());
    }

    /* JADX INFO: renamed from: a */
    public final void m2431a(int i, int i2, SecureRandom secureRandom) {
        this.f4015e = i;
        this.f4016f = i > 1024 ? 256 : 160;
        this.f4017g = i2;
        this.f4018h = Math.max(m2423a(this.f4015e), (i2 + 1) / 2);
        this.f4019i = secureRandom;
        this.f4020j = false;
        this.f4021k = -1;
    }

    /* JADX INFO: renamed from: a */
    public final C1115r m2430a() {
        BigInteger bit;
        int i;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerM2425a;
        if (!this.f4020j) {
            return m2429b();
        }
        InterfaceC1175r interfaceC1175r = this.f4014d;
        int iMo1930b = interfaceC1175r.mo1930b() * 8;
        byte[] bArr = new byte[this.f4016f / 8];
        int i2 = (this.f4015e - 1) / iMo1930b;
        byte[] bArr2 = new byte[this.f4015e / 8];
        byte[] bArr3 = new byte[interfaceC1175r.mo1930b()];
        loop0: while (true) {
            this.f4019i.nextBytes(bArr);
            m2426a(interfaceC1175r, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(f4012b.shiftLeft(this.f4016f - 1)).setBit(0).setBit(this.f4016f - 1);
            if (m2428a(bit)) {
                byte[] bArrM4086b = C1535a.m4086b(bArr);
                int i3 = this.f4015e * 4;
                i = 0;
                while (i < i3) {
                    for (int i4 = 1; i4 <= i2; i4++) {
                        m2427a(bArrM4086b);
                        m2426a(interfaceC1175r, bArrM4086b, bArr2, bArr2.length - (bArr3.length * i4));
                    }
                    int length = bArr2.length - (bArr3.length * i2);
                    m2427a(bArrM4086b);
                    m2426a(interfaceC1175r, bArrM4086b, bArr3, 0);
                    System.arraycopy(bArr3, bArr3.length - length, bArr2, 0, length);
                    bArr2[0] = (byte) (bArr2[0] | (-128));
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    bigIntegerSubtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(f4012b));
                    if (bigIntegerSubtract.bitLength() == this.f4015e && m2428a(bigIntegerSubtract)) {
                        break loop0;
                    }
                    i++;
                }
            }
        }
        return (this.f4021k < 0 || (bigIntegerM2425a = m2425a(interfaceC1175r, bigIntegerSubtract, bit, bArr, this.f4021k)) == null) ? new C1115r(bigIntegerSubtract, bit, m2424a(bigIntegerSubtract, bit, this.f4019i), new C1118u(bArr, i)) : new C1115r(bigIntegerSubtract, bit, bigIntegerM2425a, new C1118u(bArr, i, this.f4021k));
    }
}
