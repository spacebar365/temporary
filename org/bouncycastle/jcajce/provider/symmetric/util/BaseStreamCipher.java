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
import org.bouncycastle.b.ao;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.l;
import org.bouncycastle.b.o;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;

/* JADX INFO: loaded from: classes.dex */
public class BaseStreamCipher extends BaseWrapCipher implements PBE {
    private Class[] e;
    private ao f;
    private int g;
    private int h;
    private be i;
    private int j;
    private PBEParameterSpec k;
    private String l;

    protected BaseStreamCipher(ao aoVar, int i) {
        this(aoVar, i, -1, -1);
    }

    protected BaseStreamCipher(ao aoVar, int i, int i2, int i3) {
        this.e = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.j = 0;
        this.k = null;
        this.l = null;
        this.f = aoVar;
        this.j = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            this.f.a(bArr, i, i2, bArr2, i3);
        }
        this.f.c();
        return i2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            this.f.c();
            return new byte[0];
        }
        byte[] bArrEngineUpdate = engineUpdate(bArr, i, i2);
        this.f.c();
        return bArrEngineUpdate;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        if (this.i != null) {
            return this.i.a();
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
        if (this.c == null) {
            if (this.k != null) {
                try {
                    AlgorithmParameters algorithmParametersA = a(this.l);
                    algorithmParametersA.init(this.k);
                    return algorithmParametersA;
                } catch (Exception e) {
                    return null;
                }
            }
            if (this.i != null) {
                String strA = this.f.a();
                if (strA.indexOf(47) >= 0) {
                    strA = strA.substring(0, strA.indexOf(47));
                }
                if (strA.startsWith("ChaCha7539")) {
                    strA = "ChaCha7539";
                } else if (strA.startsWith("Grain")) {
                    strA = "Grainv1";
                } else if (strA.startsWith("HC")) {
                    int iIndexOf = strA.indexOf(45);
                    strA = strA.substring(0, iIndexOf) + strA.substring(iIndexOf + 1);
                }
                try {
                    this.c = a(strA);
                    this.c.init(new IvParameterSpec(this.i.a()));
                } catch (Exception e2) {
                    throw new RuntimeException(e2.toString());
                }
            }
        }
        return this.c;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                if (i2 == this.e.length) {
                    parameterSpec = null;
                    break;
                } else {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(this.e[i2]);
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
        this.c = algorithmParameters;
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
            this.f.a(bArr, i, i2, bArr2, i3);
            return i2;
        } catch (o e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f.a(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        i baVar;
        i iVarA;
        this.k = null;
        this.l = null;
        this.c = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
        }
        if (key instanceof PKCS12Key) {
            PKCS12Key pKCS12Key = (PKCS12Key) key;
            this.k = (PBEParameterSpec) algorithmParameterSpec;
            if ((pKCS12Key instanceof PKCS12KeyWithParameters) && this.k == null) {
                this.k = new PBEParameterSpec(((PKCS12KeyWithParameters) pKCS12Key).getSalt(), ((PKCS12KeyWithParameters) pKCS12Key).getIterationCount());
            }
            baVar = PBE$Util.a(pKCS12Key.getEncoded(), 2, this.h, this.g, this.j * 8, this.k, this.f.a());
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.b != null) {
                this.l = bCPBEKey.b.b();
            } else {
                this.l = bCPBEKey.getAlgorithm();
            }
            if (bCPBEKey.g != null) {
                iVarA = bCPBEKey.g;
                this.k = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                iVarA = PBE$Util.a(bCPBEKey, algorithmParameterSpec, this.f.a());
                this.k = (PBEParameterSpec) algorithmParameterSpec;
            }
            if (bCPBEKey.f != 0) {
                this.i = (be) iVarA;
            }
            baVar = iVarA;
        } else if (algorithmParameterSpec == null) {
            if (this.h > 0) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            baVar = new ba(key.getEncoded());
        } else {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            }
            be beVar = new be(new ba(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.i = beVar;
            baVar = beVar;
        }
        if (this.j != 0 && !(baVar instanceof be)) {
            if (secureRandom == null) {
                secureRandom = l.a();
            }
            if (i != 1 && i != 3) {
                throw new InvalidAlgorithmParameterException("no IV set when one expected");
            }
            byte[] bArr = new byte[this.j];
            secureRandom.nextBytes(bArr);
            be beVar2 = new be(baVar, bArr);
            this.i = beVar2;
            baVar = beVar2;
        }
        try {
            switch (i) {
                case 1:
                case 3:
                    this.f.a(true, baVar);
                    return;
                case 2:
                case 4:
                    this.f.a(false, baVar);
                    return;
                default:
                    throw new InvalidParameterException("unknown opmode " + i + " passed");
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }
}
