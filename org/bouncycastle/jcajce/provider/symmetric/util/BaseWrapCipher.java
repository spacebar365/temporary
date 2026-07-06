package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.a.s.p;
import org.bouncycastle.b.ap;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.bg;
import org.bouncycastle.b.k.bh;
import org.bouncycastle.b.v;
import org.bouncycastle.f.a;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    protected int a;
    protected int b;
    protected AlgorithmParameters c;
    protected ap d;
    private Class[] e;
    private int f;
    private byte[] g;
    private BaseWrapCipher$ErasableOutputStream h;
    private boolean i;
    private final JcaJceHelper j;

    protected BaseWrapCipher() {
        this.e = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.a = 2;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.h = null;
        this.j = new BCJcaJceHelper();
    }

    protected BaseWrapCipher(ap apVar) {
        this(apVar, 0);
    }

    protected BaseWrapCipher(ap apVar, int i) {
        this.e = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.a = 2;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.h = null;
        this.j = new BCJcaJceHelper();
        this.d = apVar;
        this.f = i;
    }

    protected final AlgorithmParameters a(String str) {
        return this.j.c(str);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrA;
        if (this.h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.h.write(bArr, i, i2);
        try {
            if (this.i) {
                try {
                    bArrA = this.d.a(this.h.a(), this.h.size());
                } catch (Exception e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                }
            } else {
                try {
                    bArrA = this.d.b(this.h.a(), this.h.size());
                } catch (v e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            }
            if (bArrA.length + i3 > bArr2.length) {
                throw new ShortBufferException("output buffer too short for input.");
            }
            System.arraycopy(bArrA, 0, bArr2, i3, bArrA.length);
            return bArrA.length;
        } finally {
            this.h.b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        byte[] bArrB;
        if (this.h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.h.write(bArr, i, i2);
        try {
            if (this.i) {
                try {
                    bArrB = this.d.a(this.h.a(), this.h.size());
                } catch (Exception e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                }
            } else {
                try {
                    bArrB = this.d.b(this.h.a(), this.h.size());
                } catch (v e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            }
            return bArrB;
        } finally {
            this.h.b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return a.b(this.g);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.c == null && this.g != null) {
            String strA = this.d.a();
            if (strA.indexOf(47) >= 0) {
                strA = strA.substring(0, strA.indexOf(47));
            }
            try {
                this.c = a(strA);
                this.c.init(new IvParameterSpec(this.g));
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.c;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws BaseWrapCipher$InvalidKeyOrParametersException, InvalidAlgorithmParameterException {
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
        this.c = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws BaseWrapCipher$InvalidKeyOrParametersException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new BaseWrapCipher$InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        Key keyGeneratePrivate;
        try {
            byte[] bArrEngineDoFinal = this.d == null ? engineDoFinal(bArr, 0, bArr.length) : this.d.b(bArr, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    p pVarA = p.a(bArrEngineDoFinal);
                    PrivateKey privateKeyA = org.bouncycastle.c.b.a.a(pVarA);
                    if (privateKeyA == null) {
                        throw new InvalidKeyException("algorithm " + pVarA.b().a() + " not supported");
                    }
                    return privateKeyA;
                } catch (Exception e) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory keyFactoryD = this.j.d(str);
                if (i == 1) {
                    keyGeneratePrivate = keyFactoryD.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                } else {
                    if (i != 2) {
                        throw new InvalidKeyException("Unknown key type ".concat(String.valueOf(i)));
                    }
                    keyGeneratePrivate = keyFactoryD.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                return keyGeneratePrivate;
            } catch (NoSuchProviderException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            } catch (InvalidKeySpecException e3) {
                throw new InvalidKeyException("Unknown key type " + e3.getMessage());
            }
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        } catch (v e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.h.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        if (this.h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.h.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return this.d == null ? engineDoFinal(encoded, 0, encoded.length) : this.d.a(encoded, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws BaseWrapCipher$InvalidKeyOrParametersException, InvalidAlgorithmParameterException {
        i baVar;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                baVar = PBE$Util.a(bCPBEKey, algorithmParameterSpec, this.d.a());
            } else {
                if (bCPBEKey.g == null) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                baVar = bCPBEKey.g;
            }
        } else {
            baVar = new ba(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.g = ((IvParameterSpec) algorithmParameterSpec).getIV();
            baVar = new be(baVar, this.g);
        }
        if (algorithmParameterSpec instanceof GOST28147WrapParameterSpec) {
            GOST28147WrapParameterSpec gOST28147WrapParameterSpec = (GOST28147WrapParameterSpec) algorithmParameterSpec;
            byte[] bArrA = gOST28147WrapParameterSpec.a();
            if (bArrA != null) {
                baVar = new bg(baVar, bArrA);
            }
            baVar = new bh(baVar, gOST28147WrapParameterSpec.b());
        }
        if ((baVar instanceof ba) && this.f != 0 && (i == 3 || i == 1)) {
            this.g = new byte[this.f];
            secureRandom.nextBytes(this.g);
            baVar = new be(baVar, this.g);
        }
        i bfVar = secureRandom != null ? new bf(baVar, secureRandom) : baVar;
        try {
            switch (i) {
                case 1:
                    this.d.a(true, bfVar);
                    this.h = new BaseWrapCipher$ErasableOutputStream();
                    this.i = true;
                    return;
                case 2:
                    this.d.a(false, bfVar);
                    this.h = new BaseWrapCipher$ErasableOutputStream();
                    this.i = false;
                    return;
                case 3:
                    this.d.a(true, bfVar);
                    this.h = null;
                    this.i = true;
                    return;
                case 4:
                    this.d.a(false, bfVar);
                    this.h = null;
                    this.i = false;
                    return;
                default:
                    throw new InvalidParameterException("Unknown mode parameter passed to init.");
            }
        } catch (Exception e) {
            throw new BaseWrapCipher$InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }
}
