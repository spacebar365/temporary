package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1180w;
import org.bouncycastle.p083b.p084a.C0787a;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p089e.C0891a;
import org.bouncycastle.p083b.p089e.C0894ac;
import org.bouncycastle.p083b.p089e.C0939p;
import org.bouncycastle.p083b.p090f.C0959f;
import org.bouncycastle.p083b.p090f.C0970q;
import org.bouncycastle.p083b.p090f.C0972s;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.C1043e;
import org.bouncycastle.p083b.p097k.C1071aw;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1102e;
import org.bouncycastle.p083b.p097k.C1103f;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1108k;
import org.bouncycastle.p083b.p098l.C1125a;
import org.bouncycastle.p103c.p104a.InterfaceC1195k;
import org.bouncycastle.p103c.p106c.C1219p;
import org.bouncycastle.p142f.C1544b;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class IESCipher extends CipherSpi {

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5604a;

    /* JADX INFO: renamed from: b */
    private final int f5605b;

    /* JADX INFO: renamed from: c */
    private C0894ac f5606c;

    /* JADX INFO: renamed from: d */
    private int f5607d;

    /* JADX INFO: renamed from: e */
    private ByteArrayOutputStream f5608e;

    /* JADX INFO: renamed from: f */
    private AlgorithmParameters f5609f;

    /* JADX INFO: renamed from: g */
    private C1219p f5610g;

    /* JADX INFO: renamed from: h */
    private C1075b f5611h;

    /* JADX INFO: renamed from: i */
    private SecureRandom f5612i;

    /* JADX INFO: renamed from: j */
    private boolean f5613j;

    /* JADX INFO: renamed from: k */
    private C1075b f5614k;

    public IESCipher(C0894ac c0894ac) {
        this.f5604a = new BCJcaJceHelper();
        this.f5607d = -1;
        this.f5608e = new ByteArrayOutputStream();
        this.f5609f = null;
        this.f5610g = null;
        this.f5613j = false;
        this.f5614k = null;
        this.f5606c = c0894ac;
        this.f5605b = 0;
    }

    public IESCipher(C0894ac c0894ac, int i) {
        this.f5604a = new BCJcaJceHelper();
        this.f5607d = -1;
        this.f5608e = new ByteArrayOutputStream();
        this.f5609f = null;
        this.f5610g = null;
        this.f5613j = false;
        this.f5614k = null;
        this.f5606c = c0894ac;
        this.f5605b = i;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadBlockException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadBlockException {
        if (i2 != 0) {
            this.f5608e.write(bArr, i, i2);
        }
        byte[] byteArray = this.f5608e.toByteArray();
        this.f5608e.reset();
        InterfaceC1003i c1071aw = new C1071aw(this.f5610g.m2893a(), this.f5610g.m2894b(), this.f5610g.m2895c(), this.f5610g.m2896d());
        if (this.f5610g.m2897e() != null) {
            c1071aw = new C1080be(c1071aw, this.f5610g.m2897e());
        }
        C1106i c1106iM2658b = ((C1103f) this.f5611h).m2658b();
        if (this.f5614k != null) {
            try {
                if (this.f5607d == 1 || this.f5607d == 3) {
                    this.f5606c.m2149a(true, this.f5614k, this.f5611h, c1071aw);
                } else {
                    this.f5606c.m2149a(false, this.f5611h, this.f5614k, c1071aw);
                }
                return this.f5606c.m2150a(byteArray, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        if (this.f5607d == 1 || this.f5607d == 3) {
            C0959f c0959f = new C0959f();
            c0959f.mo2109a(new C1102e(this.f5612i, c1106iM2658b));
            try {
                this.f5606c.m2147a(this.f5611h, c1071aw, new C0970q(c0959f, new InterfaceC1180w() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                    @Override // org.bouncycastle.p083b.InterfaceC1180w
                    /* JADX INFO: renamed from: a */
                    public final byte[] mo2823a(C1075b c1075b) {
                        byte[] bArr2 = new byte[(((C1103f) c1075b).m2658b().m2664a().bitLength() + 7) / 8];
                        byte[] bArrM4118a = C1544b.m4118a(((C1108k) c1075b).m2672c());
                        if (bArrM4118a.length > bArr2.length) {
                            throw new IllegalArgumentException("Senders's public key longer than expected.");
                        }
                        System.arraycopy(bArrM4118a, 0, bArr2, bArr2.length - bArrM4118a.length, bArrM4118a.length);
                        return bArr2;
                    }
                }));
                return this.f5606c.m2150a(byteArray, byteArray.length);
            } catch (Exception e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        }
        if (this.f5607d != 2 && this.f5607d != 4) {
            throw new IllegalStateException("IESCipher not initialised");
        }
        try {
            this.f5606c.m2148a(this.f5611h, c1071aw, new C1125a(((C1103f) this.f5611h).m2658b()));
            return this.f5606c.m2150a(byteArray, byteArray.length);
        } catch (C1179v e3) {
            throw new BadBlockException("unable to process block", e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.f5606c.m2146a() != null) {
            return this.f5606c.m2146a().m2404b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        if (this.f5610g != null) {
            return this.f5610g.m2897e();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        if (this.f5611h == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        int iMo2451b = this.f5606c.m2151b().mo2451b();
        int iBitLength = this.f5614k == null ? (((((C1103f) this.f5611h).m2658b().m2664a().bitLength() + 7) * 2) / 8) + 1 : 0;
        if (this.f5606c.m2146a() != null) {
            if (this.f5607d == 1 || this.f5607d == 3) {
                i = this.f5606c.m2146a().mo2405b(i);
            } else {
                if (this.f5607d != 2 && this.f5607d != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                i = this.f5606c.m2146a().mo2405b((i - iMo2451b) - iBitLength);
            }
        }
        if (this.f5607d == 1 || this.f5607d == 3) {
            return iBitLength + iMo2451b + this.f5608e.size() + i;
        }
        if (this.f5607d == 2 || this.f5607d == 4) {
            return ((this.f5608e.size() - iMo2451b) - iBitLength) + i;
        }
        throw new IllegalStateException("IESCipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f5609f == null && this.f5610g != null) {
            try {
                this.f5609f = this.f5604a.mo4522c("IES");
                this.f5609f.init(this.f5610g);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f5609f;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(C1219p.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString());
            }
        }
        this.f5609f = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            byte[] bArr = null;
            if (this.f5605b != 0 && i == 1) {
                bArr = new byte[this.f5605b];
                secureRandom.nextBytes(bArr);
            }
            this.f5610g = IESUtil.m4337a(this.f5606c.m2146a(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof C1219p)) {
                throw new InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            this.f5610g = (C1219p) algorithmParameterSpec;
        }
        byte[] bArrM2897e = this.f5610g.m2897e();
        if (this.f5605b != 0 && (bArrM2897e == null || bArrM2897e.length != this.f5605b)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.f5605b + " bytes long");
        }
        if (i == 1 || i == 3) {
            if (key instanceof DHPublicKey) {
                this.f5611h = DHUtil.m4308a((PublicKey) key);
            } else {
                if (!(key instanceof InterfaceC1195k)) {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                InterfaceC1195k interfaceC1195k = (InterfaceC1195k) key;
                this.f5611h = DHUtil.m4308a(interfaceC1195k.m2838a());
                this.f5614k = DHUtil.m4307a(interfaceC1195k.m2839b());
            }
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (key instanceof DHPrivateKey) {
                this.f5611h = DHUtil.m4307a((PrivateKey) key);
            } else {
                if (!(key instanceof InterfaceC1195k)) {
                    throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
                }
                InterfaceC1195k interfaceC1195k2 = (InterfaceC1195k) key;
                this.f5614k = DHUtil.m4308a(interfaceC1195k2.m2838a());
                this.f5611h = DHUtil.m4307a(interfaceC1195k2.m2839b());
            }
        }
        this.f5612i = secureRandom;
        this.f5607d = i;
        this.f5608e.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String strM4163b = C1560k.m4163b(str);
        if (strM4163b.equals("NONE")) {
            this.f5613j = false;
        } else {
            if (!strM4163b.equals("DHAES")) {
                throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
            }
            this.f5613j = true;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String strM4163b = C1560k.m4163b(str);
        if (!strM4163b.equals("NOPADDING") && !strM4163b.equals("PKCS5PADDING") && !strM4163b.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f5608e.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f5608e.write(bArr, i, i2);
        return null;
    }

    public static class IES extends IESCipher {
        public IES() {
            super(new C0894ac(new C0787a(), new C0972s(new C0842s()), new C0994g(new C0842s())));
        }
    }

    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new C0894ac(new C0787a(), new C0972s(new C0842s()), new C0994g(new C0842s()), new C1043e(new C1010b(new C0891a()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new C0894ac(new C0787a(), new C0972s(new C0842s()), new C0994g(new C0842s()), new C1043e(new C1010b(new C0939p()))), 8);
        }
    }
}
