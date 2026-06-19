package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.ByteArrayOutputStream;
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
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1082bg;
import org.bouncycastle.p083b.p097k.C1083bh;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {

    /* JADX INFO: renamed from: a */
    protected int f6198a;

    /* JADX INFO: renamed from: b */
    protected int f6199b;

    /* JADX INFO: renamed from: c */
    protected AlgorithmParameters f6200c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC0816ap f6201d;

    /* JADX INFO: renamed from: e */
    private Class[] f6202e;

    /* JADX INFO: renamed from: f */
    private int f6203f;

    /* JADX INFO: renamed from: g */
    private byte[] f6204g;

    /* JADX INFO: renamed from: h */
    private ErasableOutputStream f6205h;

    /* JADX INFO: renamed from: i */
    private boolean f6206i;

    /* JADX INFO: renamed from: j */
    private final JcaJceHelper f6207j;

    protected static final class ErasableOutputStream extends ByteArrayOutputStream {
        /* JADX INFO: renamed from: a */
        public final byte[] m4464a() {
            return this.buf;
        }

        /* JADX INFO: renamed from: b */
        public final void m4465b() {
            C1535a.m4071a(this.buf, (byte) 0);
            reset();
        }
    }

    protected static class InvalidKeyOrParametersException extends InvalidKeyException {

        /* JADX INFO: renamed from: a */
        private final Throwable f6208a;

        InvalidKeyOrParametersException(String str, Throwable th) {
            super(str);
            this.f6208a = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f6208a;
        }
    }

    protected BaseWrapCipher() {
        this.f6202e = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.f6198a = 2;
        this.f6199b = 1;
        this.f6200c = null;
        this.f6201d = null;
        this.f6205h = null;
        this.f6207j = new BCJcaJceHelper();
    }

    protected BaseWrapCipher(InterfaceC0816ap interfaceC0816ap) {
        this(interfaceC0816ap, 0);
    }

    protected BaseWrapCipher(InterfaceC0816ap interfaceC0816ap, int i) {
        this.f6202e = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.f6198a = 2;
        this.f6199b = 1;
        this.f6200c = null;
        this.f6201d = null;
        this.f6205h = null;
        this.f6207j = new BCJcaJceHelper();
        this.f6201d = interfaceC0816ap;
        this.f6203f = i;
    }

    /* JADX INFO: renamed from: a */
    protected final AlgorithmParameters m4463a(String str) {
        return this.f6207j.mo4522c(str);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrMo1916a;
        if (this.f6205h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.f6205h.write(bArr, i, i2);
        try {
            if (this.f6206i) {
                try {
                    bArrMo1916a = this.f6201d.mo1916a(this.f6205h.m4464a(), this.f6205h.size());
                } catch (Exception e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                }
            } else {
                try {
                    bArrMo1916a = this.f6201d.mo1917b(this.f6205h.m4464a(), this.f6205h.size());
                } catch (C1179v e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            }
            if (bArrMo1916a.length + i3 > bArr2.length) {
                throw new ShortBufferException("output buffer too short for input.");
            }
            System.arraycopy(bArrMo1916a, 0, bArr2, i3, bArrMo1916a.length);
            return bArrMo1916a.length;
        } finally {
            this.f6205h.m4465b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        byte[] bArrMo1917b;
        if (this.f6205h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.f6205h.write(bArr, i, i2);
        try {
            if (this.f6206i) {
                try {
                    bArrMo1917b = this.f6201d.mo1916a(this.f6205h.m4464a(), this.f6205h.size());
                } catch (Exception e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                }
            } else {
                try {
                    bArrMo1917b = this.f6201d.mo1917b(this.f6205h.m4464a(), this.f6205h.size());
                } catch (C1179v e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            }
            return bArrMo1917b;
        } finally {
            this.f6205h.m4465b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return C1535a.m4086b(this.f6204g);
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
        if (this.f6200c == null && this.f6204g != null) {
            String strMo1914a = this.f6201d.mo1914a();
            if (strMo1914a.indexOf(47) >= 0) {
                strMo1914a = strMo1914a.substring(0, strMo1914a.indexOf(47));
            }
            try {
                this.f6200c = m4463a(strMo1914a);
                this.f6200c.init(new IvParameterSpec(this.f6204g));
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f6200c;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyOrParametersException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                if (i2 == this.f6202e.length) {
                    parameterSpec = null;
                    break;
                } else {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(this.f6202e[i2]);
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
        this.f6200c = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyOrParametersException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
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
            byte[] bArrEngineDoFinal = this.f6201d == null ? engineDoFinal(bArr, 0, bArr.length) : this.f6201d.mo1917b(bArr, bArr.length);
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
                KeyFactory keyFactoryMo4523d = this.f6207j.mo4523d(str);
                if (i == 1) {
                    keyGeneratePrivate = keyFactoryMo4523d.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                } else {
                    if (i != 2) {
                        throw new InvalidKeyException("Unknown key type ".concat(String.valueOf(i)));
                    }
                    keyGeneratePrivate = keyFactoryMo4523d.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
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
        } catch (C1179v e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.f6205h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.f6205h.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        if (this.f6205h == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        this.f6205h.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return this.f6201d == null ? engineDoFinal(encoded, 0, encoded.length) : this.f6201d.mo1916a(encoded, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyOrParametersException, InvalidAlgorithmParameterException {
        InterfaceC1003i c1076ba;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                c1076ba = PBE.Util.m4472a(bCPBEKey, algorithmParameterSpec, this.f6201d.mo1914a());
            } else {
                if (bCPBEKey.f6153g == null) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                c1076ba = bCPBEKey.f6153g;
            }
        } else {
            c1076ba = new C1076ba(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.f6204g = ((IvParameterSpec) algorithmParameterSpec).getIV();
            c1076ba = new C1080be(c1076ba, this.f6204g);
        }
        if (algorithmParameterSpec instanceof GOST28147WrapParameterSpec) {
            GOST28147WrapParameterSpec gOST28147WrapParameterSpec = (GOST28147WrapParameterSpec) algorithmParameterSpec;
            byte[] bArrM4495a = gOST28147WrapParameterSpec.m4495a();
            if (bArrM4495a != null) {
                c1076ba = new C1082bg(c1076ba, bArrM4495a);
            }
            c1076ba = new C1083bh(c1076ba, gOST28147WrapParameterSpec.m4496b());
        }
        if ((c1076ba instanceof C1076ba) && this.f6203f != 0 && (i == 3 || i == 1)) {
            this.f6204g = new byte[this.f6203f];
            secureRandom.nextBytes(this.f6204g);
            c1076ba = new C1080be(c1076ba, this.f6204g);
        }
        InterfaceC1003i c1081bf = secureRandom != null ? new C1081bf(c1076ba, secureRandom) : c1076ba;
        try {
            switch (i) {
                case 1:
                    this.f6201d.mo1915a(true, c1081bf);
                    this.f6205h = new ErasableOutputStream();
                    this.f6206i = true;
                    return;
                case 2:
                    this.f6201d.mo1915a(false, c1081bf);
                    this.f6205h = new ErasableOutputStream();
                    this.f6206i = false;
                    return;
                case 3:
                    this.f6201d.mo1915a(true, c1081bf);
                    this.f6205h = null;
                    this.f6206i = true;
                    return;
                case 4:
                    this.f6201d.mo1915a(false, c1081bf);
                    this.f6205h = null;
                    this.f6206i = false;
                    return;
                default:
                    throw new InvalidParameterException("Unknown mode parameter passed to init.");
            }
        } catch (Exception e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }
}
