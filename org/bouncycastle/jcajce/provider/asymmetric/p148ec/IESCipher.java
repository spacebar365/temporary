package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

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
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1180w;
import org.bouncycastle.p083b.p084a.C0792c;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p089e.C0891a;
import org.bouncycastle.p083b.p089e.C0894ac;
import org.bouncycastle.p083b.p089e.C0939p;
import org.bouncycastle.p083b.p090f.C0965l;
import org.bouncycastle.p083b.p090f.C0970q;
import org.bouncycastle.p083b.p090f.C0972s;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.C1043e;
import org.bouncycastle.p083b.p097k.C1049aa;
import org.bouncycastle.p083b.p097k.C1050ab;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1071aw;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p083b.p098l.C1126b;
import org.bouncycastle.p103c.p104a.InterfaceC1185a;
import org.bouncycastle.p103c.p104a.InterfaceC1195k;
import org.bouncycastle.p103c.p106c.C1219p;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class IESCipher extends CipherSpi {

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5698a;

    /* JADX INFO: renamed from: b */
    private int f5699b;

    /* JADX INFO: renamed from: c */
    private C0894ac f5700c;

    /* JADX INFO: renamed from: d */
    private int f5701d;

    /* JADX INFO: renamed from: e */
    private ByteArrayOutputStream f5702e;

    /* JADX INFO: renamed from: f */
    private AlgorithmParameters f5703f;

    /* JADX INFO: renamed from: g */
    private C1219p f5704g;

    /* JADX INFO: renamed from: h */
    private C1075b f5705h;

    /* JADX INFO: renamed from: i */
    private SecureRandom f5706i;

    /* JADX INFO: renamed from: j */
    private boolean f5707j;

    /* JADX INFO: renamed from: k */
    private C1075b f5708k;

    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new C1010b(new C0891a()), 16);
        }
    }

    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new C1010b(new C0939p()), 8);
        }
    }

    public IESCipher(C0894ac c0894ac) {
        this.f5698a = new BCJcaJceHelper();
        this.f5701d = -1;
        this.f5702e = new ByteArrayOutputStream();
        this.f5703f = null;
        this.f5704g = null;
        this.f5707j = false;
        this.f5708k = null;
        this.f5700c = c0894ac;
        this.f5699b = 0;
    }

    public IESCipher(C0894ac c0894ac, int i) {
        this.f5698a = new BCJcaJceHelper();
        this.f5701d = -1;
        this.f5702e = new ByteArrayOutputStream();
        this.f5703f = null;
        this.f5704g = null;
        this.f5707j = false;
        this.f5708k = null;
        this.f5700c = c0894ac;
        this.f5699b = i;
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
            this.f5702e.write(bArr, i, i2);
        }
        byte[] byteArray = this.f5702e.toByteArray();
        this.f5702e.reset();
        InterfaceC1003i c1071aw = new C1071aw(this.f5704g.m2893a(), this.f5704g.m2894b(), this.f5704g.m2895c(), this.f5704g.m2896d());
        if (this.f5704g.m2897e() != null) {
            c1071aw = new C1080be(c1071aw, this.f5704g.m2897e());
        }
        C1122y c1122yM2563b = ((C1050ab) this.f5705h).m2563b();
        if (this.f5708k != null) {
            try {
                if (this.f5701d == 1 || this.f5701d == 3) {
                    this.f5700c.m2149a(true, this.f5708k, this.f5705h, c1071aw);
                } else {
                    this.f5700c.m2149a(false, this.f5705h, this.f5708k, c1071aw);
                }
                return this.f5700c.m2150a(byteArray, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        if (this.f5701d != 1 && this.f5701d != 3) {
            if (this.f5701d != 2 && this.f5701d != 4) {
                throw new IllegalStateException("cipher not initialised");
            }
            try {
                this.f5700c.m2148a(this.f5705h, c1071aw, new C1126b(c1122yM2563b));
                return this.f5700c.m2150a(byteArray, byteArray.length);
            } catch (C1179v e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        }
        C0965l c0965l = new C0965l();
        c0965l.mo2109a(new C1049aa(c1122yM2563b, this.f5706i));
        final boolean zM2898f = this.f5704g.m2898f();
        try {
            this.f5700c.m2147a(this.f5705h, c1071aw, new C0970q(c0965l, new InterfaceC1180w() { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.1
                @Override // org.bouncycastle.p083b.InterfaceC1180w
                /* JADX INFO: renamed from: a */
                public final byte[] mo2823a(C1075b c1075b) {
                    return ((C1053ae) c1075b).m2566c().m3452a(zM2898f);
                }
            }));
            return this.f5700c.m2150a(byteArray, byteArray.length);
        } catch (Exception e3) {
            throw new BadBlockException("unable to process block", e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.f5700c.m2146a() != null) {
            return this.f5700c.m2146a().m2404b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        if (this.f5704g != null) {
            return this.f5704g.m2897e();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof InterfaceC1185a) {
            return ((InterfaceC1185a) key).mo2827a().m2869b().mo2905a();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        if (this.f5705h == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        int iMo2451b = this.f5700c.m2151b().mo2451b();
        int iMo2905a = this.f5708k == null ? ((((C1050ab) this.f5705h).m2563b().m2699a().mo2905a() + 7) / 8) * 2 : 0;
        if (this.f5700c.m2146a() != null) {
            if (this.f5701d == 1 || this.f5701d == 3) {
                i = this.f5700c.m2146a().mo2405b(i);
            } else {
                if (this.f5701d != 2 && this.f5701d != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                i = this.f5700c.m2146a().mo2405b((i - iMo2451b) - iMo2905a);
            }
        }
        if (this.f5701d == 1 || this.f5701d == 3) {
            return iMo2905a + iMo2451b + this.f5702e.size() + 1 + i;
        }
        if (this.f5701d == 2 || this.f5701d == 4) {
            return ((this.f5702e.size() - iMo2451b) - iMo2905a) + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f5703f == null && this.f5704g != null) {
            try {
                this.f5703f = this.f5698a.mo4522c("IES");
                this.f5703f.init(this.f5704g);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f5703f;
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
        this.f5703f = algorithmParameters;
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
        byte[] bArr = null;
        this.f5708k = null;
        if (algorithmParameterSpec == null) {
            if (this.f5699b != 0 && i == 1) {
                bArr = new byte[this.f5699b];
                secureRandom.nextBytes(bArr);
            }
            this.f5704g = IESUtil.m4337a(this.f5700c.m2146a(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof C1219p)) {
                throw new InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            this.f5704g = (C1219p) algorithmParameterSpec;
        }
        byte[] bArrM2897e = this.f5704g.m2897e();
        if (this.f5699b != 0 && (bArrM2897e == null || bArrM2897e.length != this.f5699b)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.f5699b + " bytes long");
        }
        if (i == 1 || i == 3) {
            if (key instanceof PublicKey) {
                this.f5705h = ECUtils.m4232a((PublicKey) key);
            } else {
                if (!(key instanceof InterfaceC1195k)) {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
                InterfaceC1195k interfaceC1195k = (InterfaceC1195k) key;
                this.f5705h = ECUtils.m4232a(interfaceC1195k.m2838a());
                this.f5708k = ECUtil.m4328a(interfaceC1195k.m2839b());
            }
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (key instanceof PrivateKey) {
                this.f5705h = ECUtil.m4328a((PrivateKey) key);
            } else {
                if (!(key instanceof InterfaceC1195k)) {
                    throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
                }
                InterfaceC1195k interfaceC1195k2 = (InterfaceC1195k) key;
                this.f5708k = ECUtils.m4232a(interfaceC1195k2.m2838a());
                this.f5705h = ECUtil.m4328a(interfaceC1195k2.m2839b());
            }
        }
        this.f5706i = secureRandom;
        this.f5701d = i;
        this.f5702e.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String strM4163b = C1560k.m4163b(str);
        if (strM4163b.equals("NONE")) {
            this.f5707j = false;
        } else {
            if (!strM4163b.equals("DHAES")) {
                throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
            }
            this.f5707j = true;
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
        this.f5702e.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f5702e.write(bArr, i, i2);
        return null;
    }

    public static class ECIES extends IESCipher {
        public ECIES() {
            super(new C0894ac(new C0792c(), new C0972s(new C0842s()), new C0994g(new C0842s())));
        }
    }

    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(InterfaceC0890e interfaceC0890e, int i) {
            super(new C0894ac(new C0792c(), new C0972s(new C0842s()), new C0994g(new C0842s()), new C1043e(interfaceC0890e)), i);
        }
    }
}
