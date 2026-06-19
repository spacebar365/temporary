package org.bouncycastle.p083b.p089e;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1061am;
import org.bouncycastle.p083b.p097k.C1063ao;
import org.bouncycastle.p083b.p097k.C1064ap;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.e.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0943t implements InterfaceC0786a {

    /* JADX INFO: renamed from: e */
    private static final BigInteger f3932e = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: f */
    private static final BigInteger f3933f = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: g */
    private static final BigInteger f3934g = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a */
    private C1061am f3935a;

    /* JADX INFO: renamed from: b */
    private SecureRandom f3936b;

    /* JADX INFO: renamed from: c */
    private boolean f3937c;

    /* JADX INFO: renamed from: d */
    private int f3938d;

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final int mo1868a() {
        return this.f3937c ? (this.f3938d - 1) / 8 : ((this.f3938d + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final void mo1869a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f3935a = (C1061am) c1081bf.m2614b();
            this.f3936b = c1081bf.m2613a();
        } else {
            this.f3935a = (C1061am) interfaceC1003i;
            this.f3936b = C1124l.m2709a();
        }
        this.f3937c = z;
        this.f3938d = this.f3935a.m2578b().m2579a().bitLength();
        if (z) {
            if (!(this.f3935a instanceof C1064ap)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f3935a instanceof C1063ao)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final byte[] mo1870a(byte[] bArr, int i, int i2) {
        if (this.f3935a == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i2 > (this.f3937c ? ((this.f3938d - 1) + 7) / 8 : mo1868a())) {
            throw new C1163o("input too large for ElGamal cipher.\n");
        }
        BigInteger bigIntegerM2579a = this.f3935a.m2578b().m2579a();
        if (this.f3935a instanceof C1063ao) {
            byte[] bArr2 = new byte[i2 / 2];
            byte[] bArr3 = new byte[i2 / 2];
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            System.arraycopy(bArr, bArr2.length + i, bArr3, 0, bArr3.length);
            return C1544b.m4118a(new BigInteger(1, bArr2).modPow(bigIntegerM2579a.subtract(f3933f).subtract(((C1063ao) this.f3935a).m2582c()), bigIntegerM2579a).multiply(new BigInteger(1, bArr3)).mod(bigIntegerM2579a));
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(bigIntegerM2579a) >= 0) {
            throw new C1163o("input too large for ElGamal cipher.\n");
        }
        C1064ap c1064ap = (C1064ap) this.f3935a;
        int iBitLength = bigIntegerM2579a.bitLength();
        BigInteger bigIntegerM4114a = C1544b.m4114a(iBitLength, this.f3936b);
        while (true) {
            if (!bigIntegerM4114a.equals(f3932e) && bigIntegerM4114a.compareTo(bigIntegerM2579a.subtract(f3934g)) <= 0) {
                break;
            }
            bigIntegerM4114a = C1544b.m4114a(iBitLength, this.f3936b);
        }
        BigInteger bigIntegerModPow = this.f3935a.m2578b().m2580b().modPow(bigIntegerM4114a, bigIntegerM2579a);
        BigInteger bigIntegerMod = bigInteger.multiply(c1064ap.m2583c().modPow(bigIntegerM4114a, bigIntegerM2579a)).mod(bigIntegerM2579a);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        byte[] bArr5 = new byte[mo1871b()];
        if (byteArray.length > bArr5.length / 2) {
            System.arraycopy(byteArray, 1, bArr5, (bArr5.length / 2) - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, (bArr5.length / 2) - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > bArr5.length / 2) {
            System.arraycopy(byteArray2, 1, bArr5, bArr5.length - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, bArr5.length - byteArray2.length, byteArray2.length);
        return bArr5;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: b */
    public final int mo1871b() {
        return this.f3937c ? ((this.f3938d + 7) / 8) * 2 : (this.f3938d - 1) / 8;
    }
}
