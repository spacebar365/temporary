package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.a.s.p;
import org.bouncycastle.b.ap;
import org.bouncycastle.b.v;
import org.bouncycastle.c.b.a;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCipherSpi extends CipherSpi {
    private Class[] c = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private final JcaJceHelper d = new BCJcaJceHelper();
    protected AlgorithmParameters a = null;
    protected ap b = null;

    protected BaseCipherSpi() {
    }

    protected final AlgorithmParameters a(String str) {
        return this.d.c(str);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
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
            byte[] bArrEngineDoFinal = this.b == null ? engineDoFinal(bArr, 0, bArr.length) : this.b.b(bArr, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    p pVarA = p.a(bArrEngineDoFinal);
                    PrivateKey privateKeyA = a.a(pVarA);
                    if (privateKeyA == null) {
                        throw new InvalidKeyException("algorithm " + pVarA.b().a() + " not supported");
                    }
                    return privateKeyA;
                } catch (Exception e) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory keyFactoryD = this.d.d(str);
                if (i == 1) {
                    keyGeneratePrivate = keyFactoryD.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                } else {
                    if (i != 2) {
                        throw new InvalidKeyException("Unknown key type ".concat(String.valueOf(i)));
                    }
                    keyGeneratePrivate = keyFactoryD.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                return keyGeneratePrivate;
            } catch (NoSuchAlgorithmException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            } catch (NoSuchProviderException e3) {
                throw new InvalidKeyException("Unknown key type " + e3.getMessage());
            } catch (InvalidKeySpecException e4) {
                throw new InvalidKeyException("Unknown key type " + e4.getMessage());
            }
        } catch (BadPaddingException e5) {
            throw new BaseCipherSpi$1(this, "unable to unwrap", e5);
        } catch (IllegalBlockSizeException e6) {
            throw new InvalidKeyException(e6.getMessage());
        } catch (v e7) {
            throw new InvalidKeyException(e7.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return this.b == null ? engineDoFinal(encoded, 0, encoded.length) : this.b.a(encoded, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }
}
