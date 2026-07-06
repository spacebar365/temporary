package org.bouncycastle.jcajce.provider.asymmetric.ec;

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
import org.bouncycastle.b.e.as;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.l;
import org.bouncycastle.c.a.a;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class GMCipherSpi extends CipherSpi {
    private as b;
    private b e;
    private SecureRandom f;
    private final JcaJceHelper a = new BCJcaJceHelper();
    private int c = -1;
    private GMCipherSpi$ErasableOutputStream d = new GMCipherSpi$ErasableOutputStream();

    public GMCipherSpi(as asVar) {
        this.b = asVar;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        byte[] bArrA;
        if (i2 != 0) {
            this.d.write(bArr, i, i2);
        }
        try {
            if (this.c == 1 || this.c == 3) {
                try {
                    this.b.a(true, (i) new bf(this.e, this.f));
                    bArrA = this.b.a(this.d.a(), this.d.size());
                } catch (Exception e) {
                    throw new BadBlockException("unable to process block", e);
                }
            } else {
                if (this.c != 2 && this.c != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                try {
                    this.b.a(false, (i) this.e);
                    bArrA = this.b.a(this.d.a(), this.d.size());
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            }
            return bArrA;
        } finally {
            this.d.b();
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof a) {
            return ((a) key).a().b().a();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        if (this.c == 1 || this.c == 3) {
            return this.b.a(i);
        }
        if (this.c == 2 || this.c == 4) {
            return this.b.a(i);
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters != null) {
            throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + algorithmParameters.getClass().getName());
        }
        engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
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
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException {
        if (i == 1 || i == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
            this.e = ECUtils.a((PublicKey) key);
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException("must be passed private EC key for decryption");
            }
            this.e = ECUtil.a((PrivateKey) key);
        }
        if (secureRandom != null) {
            this.f = secureRandom;
        } else {
            this.f = l.a();
        }
        this.c = i;
        this.d.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        if (!k.b(str).equals("NONE")) {
            throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!k.b(str).equals("NOPADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.d.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.d.write(bArr, i, i2);
        return null;
    }
}
