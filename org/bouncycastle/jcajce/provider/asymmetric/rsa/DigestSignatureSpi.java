package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p077v.InterfaceC0739p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0769j;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0834k;
import org.bouncycastle.p083b.p086b.C0835l;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p086b.C0837n;
import org.bouncycastle.p083b.p086b.C0838o;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p086b.C0840q;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p088d.C0887c;
import org.bouncycastle.p083b.p089e.C0905an;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p102o.C1164a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class DigestSignatureSpi extends SignatureSpi {

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f5873a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0786a f5874b;

    /* JADX INFO: renamed from: c */
    private C0759a f5875c;

    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(InterfaceC0674n.f2619H, new C0834k(), new C0887c(new C0905an()));
        }
    }

    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(InterfaceC0674n.f2620I, new C0835l(), new C0887c(new C0905an()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(InterfaceC0739p.f2931c, new C0838o(), new C0887c(new C0905an()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(InterfaceC0739p.f2930b, new C0839p(), new C0887c(new C0905an()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(InterfaceC0739p.f2932d, new C0840q(), new C0887c(new C0905an()));
        }
    }

    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(InterfaceC0652b.f2496i, C1164a.m2784c(), new C0887c(new C0905an()));
        }
    }

    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(InterfaceC0652b.f2497j, C1164a.m2785d(), new C0887c(new C0905an()));
        }
    }

    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(InterfaceC0652b.f2498k, C1164a.m2786e(), new C0887c(new C0905an()));
        }
    }

    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(InterfaceC0652b.f2499l, C1164a.m2787f(), new C0887c(new C0905an()));
        }
    }

    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(InterfaceC0652b.f2494g, C1164a.m2782a(), new C0887c(new C0905an()));
        }
    }

    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(InterfaceC0652b.f2495h, C1164a.m2783b(), new C0887c(new C0905an()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new C0837n(), new C0887c(new C0905an()));
        }
    }

    protected DigestSignatureSpi(C0653p c0653p, InterfaceC1175r interfaceC1175r, InterfaceC0786a interfaceC0786a) {
        this.f5873a = interfaceC1175r;
        this.f5874b = interfaceC0786a;
        this.f5875c = new C0759a(c0653p, C0579bc.f2112a);
    }

    protected DigestSignatureSpi(InterfaceC1175r interfaceC1175r, InterfaceC0786a interfaceC0786a) {
        this.f5873a = interfaceC1175r;
        this.f5874b = interfaceC0786a;
        this.f5875c = null;
    }

    /* JADX INFO: renamed from: a */
    private static String m4292a(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4293a(byte[] bArr) {
        return this.f5875c == null ? bArr : new C0769j(this.f5875c, bArr).m1577a("DER");
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key (" + m4292a(privateKey) + ") is not a RSAPrivateKey instance");
        }
        C1088bm c1088bmM4297a = RSAUtil.m4297a((RSAPrivateKey) privateKey);
        this.f5873a.mo1931c();
        this.f5874b.mo1869a(true, c1088bmM4297a);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key (" + m4292a(publicKey) + ") is not a RSAPublicKey instance");
        }
        C1088bm c1088bmM4298a = RSAUtil.m4298a((RSAPublicKey) publicKey);
        this.f5873a.mo1931c();
        this.f5874b.mo1869a(false, c1088bmM4298a);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.f5873a.mo1930b()];
        this.f5873a.mo1926a(bArr, 0);
        try {
            byte[] bArrM4293a = m4293a(bArr);
            return this.f5874b.mo1870a(bArrM4293a, 0, bArrM4293a.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e2) {
            throw new SignatureException(e2.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5873a.mo1928a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5873a.mo1929a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.f5873a.mo1930b()];
        this.f5873a.mo1926a(bArr2, 0);
        try {
            byte[] bArrMo1870a = this.f5874b.mo1870a(bArr, 0, bArr.length);
            byte[] bArrM4293a = m4293a(bArr2);
            if (bArrMo1870a.length == bArrM4293a.length) {
                return C1535a.m4085b(bArrMo1870a, bArrM4293a);
            }
            if (bArrMo1870a.length != bArrM4293a.length - 2) {
                return false;
            }
            bArrM4293a[1] = (byte) (bArrM4293a[1] - 2);
            bArrM4293a[3] = (byte) (bArrM4293a[3] - 2);
            int i = bArrM4293a[3] + 4;
            int i2 = i + 2;
            int i3 = 0;
            for (int i4 = 0; i4 < bArrM4293a.length - i2; i4++) {
                i3 |= bArrMo1870a[i + i4] ^ bArrM4293a[i2 + i4];
            }
            for (int i5 = 0; i5 < i; i5++) {
                i3 |= bArrMo1870a[i5] ^ bArrM4293a[i5];
            }
            return i3 == 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(InterfaceC0674n.f2621J, new C0836m(), new C0887c(new C0905an()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(InterfaceC0659b.f2575i, new C0842s(), new C0887c(new C0905an()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(InterfaceC0652b.f2493f, new C0843t(), new C0887c(new C0905an()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(InterfaceC0652b.f2490c, new C0844u(), new C0887c(new C0905an()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(InterfaceC0652b.f2491d, new C0845v(), new C0887c(new C0905an()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(InterfaceC0652b.f2492e, new C0847x(), new C0887c(new C0905an()));
        }
    }
}
