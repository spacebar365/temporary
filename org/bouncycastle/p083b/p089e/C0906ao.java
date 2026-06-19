package org.bouncycastle.p083b.p089e;

import java.math.BigInteger;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ao */
/* JADX INFO: loaded from: classes.dex */
final class C0906ao {

    /* JADX INFO: renamed from: a */
    private C1088bm f3731a;

    /* JADX INFO: renamed from: b */
    private boolean f3732b;

    C0906ao() {
    }

    /* JADX INFO: renamed from: a */
    public final int m2185a() {
        return this.f3732b ? ((r0 + 7) / 8) - 1 : (this.f3731a.m2625b().bitLength() + 7) / 8;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2186a(byte[] bArr, int i, int i2) {
        if (i2 > m2185a() + 1) {
            throw new C1163o("input too large for RSA cipher.");
        }
        if (i2 == m2185a() + 1 && !this.f3732b) {
            throw new C1163o("input too large for RSA cipher.");
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.f3731a.m2625b()) >= 0) {
            throw new C1163o("input too large for RSA cipher.");
        }
        return bigInteger;
    }

    /* JADX INFO: renamed from: a */
    public final void m2187a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1081bf) {
            this.f3731a = (C1088bm) ((C1081bf) interfaceC1003i).m2614b();
        } else {
            this.f3731a = (C1088bm) interfaceC1003i;
        }
        this.f3732b = z;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2188a(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.f3732b) {
            if (byteArray[0] == 0) {
                bArr = new byte[byteArray.length - 1];
                System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
            } else {
                bArr = new byte[byteArray.length];
                System.arraycopy(byteArray, 0, bArr, 0, bArr.length);
            }
            C1535a.m4071a(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > m2189b()) {
            byte[] bArr2 = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr2, 0, bArr2.length);
            return bArr2;
        }
        if (byteArray.length >= m2189b()) {
            return byteArray;
        }
        byte[] bArr3 = new byte[m2189b()];
        System.arraycopy(byteArray, 0, bArr3, bArr3.length - byteArray.length, byteArray.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public final int m2189b() {
        return this.f3732b ? (this.f3731a.m2625b().bitLength() + 7) / 8 : ((r0 + 7) / 8) - 1;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2190b(BigInteger bigInteger) {
        if (!(this.f3731a instanceof C1089bn)) {
            return bigInteger.modPow(this.f3731a.m2626c(), this.f3731a.m2625b());
        }
        C1089bn c1089bn = (C1089bn) this.f3731a;
        BigInteger bigIntegerM2628e = c1089bn.m2628e();
        BigInteger bigIntegerM2629f = c1089bn.m2629f();
        BigInteger bigIntegerM2630g = c1089bn.m2630g();
        BigInteger bigIntegerM2631h = c1089bn.m2631h();
        BigInteger bigIntegerM2632i = c1089bn.m2632i();
        BigInteger bigIntegerModPow = bigInteger.remainder(bigIntegerM2628e).modPow(bigIntegerM2630g, bigIntegerM2628e);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(bigIntegerM2629f).modPow(bigIntegerM2631h, bigIntegerM2629f);
        return bigIntegerModPow.subtract(bigIntegerModPow2).multiply(bigIntegerM2632i).mod(bigIntegerM2628e).multiply(bigIntegerM2629f).add(bigIntegerModPow2);
    }
}
