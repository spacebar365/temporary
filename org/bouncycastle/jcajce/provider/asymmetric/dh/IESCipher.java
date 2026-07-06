package org.bouncycastle.jcajce.provider.asymmetric.dh;

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
import org.bouncycastle.b.e.ac;
import org.bouncycastle.b.f.q;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.aw;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.e;
import org.bouncycastle.b.k.f;
import org.bouncycastle.b.l.a;
import org.bouncycastle.b.v;
import org.bouncycastle.c.a.k;
import org.bouncycastle.c.c.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class IESCipher extends CipherSpi {
    private final JcaJceHelper a;
    private final int b;
    private ac c;
    private int d;
    private ByteArrayOutputStream e;
    private AlgorithmParameters f;
    private p g;
    private b h;
    private SecureRandom i;
    private boolean j;
    private b k;

    public IESCipher(ac acVar) {
        this.a = new BCJcaJceHelper();
        this.d = -1;
        this.e = new ByteArrayOutputStream();
        this.f = null;
        this.g = null;
        this.j = false;
        this.k = null;
        this.c = acVar;
        this.b = 0;
    }

    public IESCipher(ac acVar, int i) {
        this.a = new BCJcaJceHelper();
        this.d = -1;
        this.e = new ByteArrayOutputStream();
        this.f = null;
        this.g = null;
        this.j = false;
        this.k = null;
        this.c = acVar;
        this.b = i;
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
            this.e.write(bArr, i, i2);
        }
        byte[] byteArray = this.e.toByteArray();
        this.e.reset();
        i awVar = new aw(this.g.a(), this.g.b(), this.g.c(), this.g.d());
        if (this.g.e() != null) {
            awVar = new be(awVar, this.g.e());
        }
        org.bouncycastle.b.k.i iVarB = ((f) this.h).b();
        if (this.k != null) {
            try {
                if (this.d == 1 || this.d == 3) {
                    this.c.a(true, this.k, this.h, awVar);
                } else {
                    this.c.a(false, this.h, this.k, awVar);
                }
                return this.c.a(byteArray, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        if (this.d == 1 || this.d == 3) {
            org.bouncycastle.b.f.f fVar = new org.bouncycastle.b.f.f();
            fVar.a(new e(this.i, iVarB));
            try {
                this.c.a(this.h, awVar, new q(fVar, new IESCipher$1(this)));
                return this.c.a(byteArray, byteArray.length);
            } catch (Exception e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        }
        if (this.d != 2 && this.d != 4) {
            throw new IllegalStateException("IESCipher not initialised");
        }
        try {
            this.c.a(this.h, awVar, new a(((f) this.h).b()));
            return this.c.a(byteArray, byteArray.length);
        } catch (v e3) {
            throw new BadBlockException("unable to process block", e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.c.a() != null) {
            return this.c.a().b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        if (this.g != null) {
            return this.g.e();
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
        if (this.h == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        int iB = this.c.b().b();
        int iBitLength = this.k == null ? (((((f) this.h).b().a().bitLength() + 7) * 2) / 8) + 1 : 0;
        if (this.c.a() != null) {
            if (this.d == 1 || this.d == 3) {
                i = this.c.a().b(i);
            } else {
                if (this.d != 2 && this.d != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                i = this.c.a().b((i - iB) - iBitLength);
            }
        }
        if (this.d == 1 || this.d == 3) {
            return iBitLength + iB + this.e.size() + i;
        }
        if (this.d == 2 || this.d == 4) {
            return ((this.e.size() - iB) - iBitLength) + i;
        }
        throw new IllegalStateException("IESCipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f == null && this.g != null) {
            try {
                this.f = this.a.c("IES");
                this.f.init(this.g);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(p.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString());
            }
        }
        this.f = algorithmParameters;
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
            if (this.b != 0 && i == 1) {
                bArr = new byte[this.b];
                secureRandom.nextBytes(bArr);
            }
            this.g = IESUtil.a(this.c.a(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof p)) {
                throw new InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            this.g = (p) algorithmParameterSpec;
        }
        byte[] bArrE = this.g.e();
        if (this.b != 0 && (bArrE == null || bArrE.length != this.b)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.b + " bytes long");
        }
        if (i == 1 || i == 3) {
            if (key instanceof DHPublicKey) {
                this.h = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.a((PublicKey) key);
            } else {
                if (!(key instanceof k)) {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                k kVar = (k) key;
                this.h = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.a(kVar.a());
                this.k = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.a(kVar.b());
            }
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (key instanceof DHPrivateKey) {
                this.h = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.a((PrivateKey) key);
            } else {
                if (!(key instanceof k)) {
                    throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
                }
                k kVar2 = (k) key;
                this.k = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.a(kVar2.a());
                this.h = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.a(kVar2.b());
            }
        }
        this.i = secureRandom;
        this.d = i;
        this.e.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String strB = org.bouncycastle.f.k.b(str);
        if (strB.equals("NONE")) {
            this.j = false;
        } else {
            if (!strB.equals("DHAES")) {
                throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
            }
            this.j = true;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String strB = org.bouncycastle.f.k.b(str);
        if (!strB.equals("NOPADDING") && !strB.equals("PKCS5PADDING") && !strB.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.e.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.e.write(bArr, i, i2);
        return null;
    }
}
