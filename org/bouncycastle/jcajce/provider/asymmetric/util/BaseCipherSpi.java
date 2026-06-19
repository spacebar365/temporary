package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
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
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCipherSpi extends CipherSpi {

    /* JADX INFO: renamed from: c */
    private Class[] f5910c = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};

    /* JADX INFO: renamed from: d */
    private final JcaJceHelper f5911d = new BCJcaJceHelper();

    /* JADX INFO: renamed from: a */
    protected AlgorithmParameters f5908a = null;

    /* JADX INFO: renamed from: b */
    protected InterfaceC0816ap f5909b = null;

    protected static final class ErasableOutputStream extends ByteArrayOutputStream {
        /* JADX INFO: renamed from: a */
        public final byte[] m4305a() {
            return this.buf;
        }

        /* JADX INFO: renamed from: b */
        public final void m4306b() {
            C1535a.m4071a(this.buf, (byte) 0);
            reset();
        }
    }

    protected BaseCipherSpi() {
    }

    /* JADX INFO: renamed from: a */
    protected final AlgorithmParameters m4304a(String str) {
        return this.f5911d.mo4522c(str);
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
            byte[] bArrEngineDoFinal = this.f5909b == null ? engineDoFinal(bArr, 0, bArr.length) : this.f5909b.mo1917b(bArr, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    C0676p c0676pM1656a = C0676p.m1656a(bArrEngineDoFinal);
                    PrivateKey privateKeyM2848a = C1200a.m2848a(c0676pM1656a);
                    if (privateKeyM2848a == null) {
                        throw new InvalidKeyException("algorithm " + c0676pM1656a.m1658b().m1783a() + " not supported");
                    }
                    return privateKeyM2848a;
                } catch (Exception e) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory keyFactoryMo4523d = this.f5911d.mo4523d(str);
                if (i == 1) {
                    keyGeneratePrivate = keyFactoryMo4523d.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                } else {
                    if (i != 2) {
                        throw new InvalidKeyException("Unknown key type ".concat(String.valueOf(i)));
                    }
                    keyGeneratePrivate = keyFactoryMo4523d.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
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
            throw new InvalidKeyException("unable to unwrap") { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.1
                @Override // java.lang.Throwable
                public synchronized Throwable getCause() {
                    return e5;
                }
            };
        } catch (IllegalBlockSizeException e6) {
            throw new InvalidKeyException(e6.getMessage());
        } catch (C1179v e7) {
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
            return this.f5909b == null ? engineDoFinal(encoded, 0, encoded.length) : this.f5909b.mo1916a(encoded, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }
}
