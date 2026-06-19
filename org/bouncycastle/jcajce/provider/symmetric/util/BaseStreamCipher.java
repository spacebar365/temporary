package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: loaded from: classes.dex */
public class BaseStreamCipher extends BaseWrapCipher implements PBE {

    /* JADX INFO: renamed from: e */
    private Class[] f6190e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0815ao f6191f;

    /* JADX INFO: renamed from: g */
    private int f6192g;

    /* JADX INFO: renamed from: h */
    private int f6193h;

    /* JADX INFO: renamed from: i */
    private C1080be f6194i;

    /* JADX INFO: renamed from: j */
    private int f6195j;

    /* JADX INFO: renamed from: k */
    private PBEParameterSpec f6196k;

    /* JADX INFO: renamed from: l */
    private String f6197l;

    protected BaseStreamCipher(InterfaceC0815ao interfaceC0815ao, int i) {
        this(interfaceC0815ao, i, -1, -1);
    }

    protected BaseStreamCipher(InterfaceC0815ao interfaceC0815ao, int i, int i2, int i3) {
        this.f6190e = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6195j = 0;
        this.f6196k = null;
        this.f6197l = null;
        this.f6191f = interfaceC0815ao;
        this.f6195j = i;
        this.f6192g = i2;
        this.f6193h = i3;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            this.f6191f.mo1909a(bArr, i, i2, bArr2, i3);
        }
        this.f6191f.mo1913c();
        return i2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            this.f6191f.mo1913c();
            return new byte[0];
        }
        byte[] bArrEngineUpdate = engineUpdate(bArr, i, i2);
        this.f6191f.mo1913c();
        return bArrEngineUpdate;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        if (this.f6194i != null) {
            return this.f6194i.m2611a();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f6200c == null) {
            if (this.f6196k != null) {
                try {
                    AlgorithmParameters algorithmParametersA = m4463a(this.f6197l);
                    algorithmParametersA.init(this.f6196k);
                    return algorithmParametersA;
                } catch (Exception e) {
                    return null;
                }
            }
            if (this.f6194i != null) {
                String strMo1911a = this.f6191f.mo1911a();
                if (strMo1911a.indexOf(47) >= 0) {
                    strMo1911a = strMo1911a.substring(0, strMo1911a.indexOf(47));
                }
                if (strMo1911a.startsWith("ChaCha7539")) {
                    strMo1911a = "ChaCha7539";
                } else if (strMo1911a.startsWith("Grain")) {
                    strMo1911a = "Grainv1";
                } else if (strMo1911a.startsWith("HC")) {
                    int iIndexOf = strMo1911a.indexOf(45);
                    strMo1911a = strMo1911a.substring(0, iIndexOf) + strMo1911a.substring(iIndexOf + 1);
                }
                try {
                    this.f6200c = m4463a(strMo1911a);
                    this.f6200c.init(new IvParameterSpec(this.f6194i.m2611a()));
                } catch (Exception e2) {
                    throw new RuntimeException(e2.toString());
                }
            }
        }
        return this.f6200c;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                if (i2 == this.f6190e.length) {
                    parameterSpec = null;
                    break;
                } else {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(this.f6190e[i2]);
                        break;
                    } catch (Exception e) {
                        i2++;
                    }
                }
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, secureRandom);
        this.f6200c = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB") && !str.equals("NONE")) {
            throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            this.f6191f.mo1909a(bArr, i, i2, bArr2, i3);
            return i2;
        } catch (C1163o e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f6191f.mo1909a(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        InterfaceC1003i c1076ba;
        InterfaceC1003i interfaceC1003iM4472a;
        this.f6196k = null;
        this.f6197l = null;
        this.f6200c = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
        }
        if (key instanceof PKCS12Key) {
            PKCS12Key pKCS12Key = (PKCS12Key) key;
            this.f6196k = (PBEParameterSpec) algorithmParameterSpec;
            if ((pKCS12Key instanceof PKCS12KeyWithParameters) && this.f6196k == null) {
                this.f6196k = new PBEParameterSpec(((PKCS12KeyWithParameters) pKCS12Key).getSalt(), ((PKCS12KeyWithParameters) pKCS12Key).getIterationCount());
            }
            c1076ba = PBE.Util.m4473a(pKCS12Key.getEncoded(), 2, this.f6193h, this.f6192g, this.f6195j * 8, this.f6196k, this.f6191f.mo1911a());
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.f6148b != null) {
                this.f6197l = bCPBEKey.f6148b.m1593b();
            } else {
                this.f6197l = bCPBEKey.getAlgorithm();
            }
            if (bCPBEKey.f6153g != null) {
                interfaceC1003iM4472a = bCPBEKey.f6153g;
                this.f6196k = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                interfaceC1003iM4472a = PBE.Util.m4472a(bCPBEKey, algorithmParameterSpec, this.f6191f.mo1911a());
                this.f6196k = (PBEParameterSpec) algorithmParameterSpec;
            }
            if (bCPBEKey.f6152f != 0) {
                this.f6194i = (C1080be) interfaceC1003iM4472a;
            }
            c1076ba = interfaceC1003iM4472a;
        } else if (algorithmParameterSpec == null) {
            if (this.f6193h > 0) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            c1076ba = new C1076ba(key.getEncoded());
        } else {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            }
            C1080be c1080be = new C1080be(new C1076ba(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.f6194i = c1080be;
            c1076ba = c1080be;
        }
        if (this.f6195j != 0 && !(c1076ba instanceof C1080be)) {
            if (secureRandom == null) {
                secureRandom = C1124l.m2709a();
            }
            if (i != 1 && i != 3) {
                throw new InvalidAlgorithmParameterException("no IV set when one expected");
            }
            byte[] bArr = new byte[this.f6195j];
            secureRandom.nextBytes(bArr);
            C1080be c1080be2 = new C1080be(c1076ba, bArr);
            this.f6194i = c1080be2;
            c1076ba = c1080be2;
        }
        try {
            switch (i) {
                case 1:
                case 3:
                    this.f6191f.mo1912a(true, c1076ba);
                    return;
                case 2:
                case 4:
                    this.f6191f.mo1912a(false, c1076ba);
                    return;
                default:
                    throw new InvalidParameterException("unknown opmode " + i + " passed");
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }
}
