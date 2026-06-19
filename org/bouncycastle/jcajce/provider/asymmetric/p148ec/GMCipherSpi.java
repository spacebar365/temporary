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
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p086b.C0819a;
import org.bouncycastle.p083b.p086b.C0824ae;
import org.bouncycastle.p083b.p086b.C0825b;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p089e.C0910as;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p103c.p104a.InterfaceC1185a;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class GMCipherSpi extends CipherSpi {

    /* JADX INFO: renamed from: b */
    private C0910as f5689b;

    /* JADX INFO: renamed from: e */
    private C1075b f5692e;

    /* JADX INFO: renamed from: f */
    private SecureRandom f5693f;

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5688a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: c */
    private int f5690c = -1;

    /* JADX INFO: renamed from: d */
    private ErasableOutputStream f5691d = new ErasableOutputStream();

    protected static final class ErasableOutputStream extends ByteArrayOutputStream {
        /* JADX INFO: renamed from: a */
        public final byte[] m4233a() {
            return this.buf;
        }

        /* JADX INFO: renamed from: b */
        public final void m4234b() {
            C1535a.m4071a(this.buf, (byte) 0);
            reset();
        }
    }

    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new C0910as());
        }
    }

    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new C0910as(new C0819a(512)));
        }
    }

    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new C0910as(new C0825b(256)));
        }
    }

    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new C0910as(new C0836m()));
        }
    }

    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new C0910as(new C0839p()));
        }
    }

    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new C0910as(new C0842s()));
        }
    }

    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new C0910as(new C0843t()));
        }
    }

    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new C0910as(new C0844u()));
        }
    }

    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new C0910as(new C0845v()));
        }
    }

    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new C0910as(new C0847x()));
        }
    }

    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new C0910as(new C0824ae()));
        }
    }

    public GMCipherSpi(C0910as c0910as) {
        this.f5689b = c0910as;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        byte[] bArrM2217a;
        if (i2 != 0) {
            this.f5691d.write(bArr, i, i2);
        }
        try {
            if (this.f5690c == 1 || this.f5690c == 3) {
                try {
                    this.f5689b.m2216a(true, (InterfaceC1003i) new C1081bf(this.f5692e, this.f5693f));
                    bArrM2217a = this.f5689b.m2217a(this.f5691d.m4233a(), this.f5691d.size());
                } catch (Exception e) {
                    throw new BadBlockException("unable to process block", e);
                }
            } else {
                if (this.f5690c != 2 && this.f5690c != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                try {
                    this.f5689b.m2216a(false, (InterfaceC1003i) this.f5692e);
                    bArrM2217a = this.f5689b.m2217a(this.f5691d.m4233a(), this.f5691d.size());
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            }
            return bArrM2217a;
        } finally {
            this.f5691d.m4234b();
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
        if (key instanceof InterfaceC1185a) {
            return ((InterfaceC1185a) key).mo2827a().m2869b().mo2905a();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        if (this.f5690c == 1 || this.f5690c == 3) {
            return this.f5689b.m2215a(i);
        }
        if (this.f5690c == 2 || this.f5690c == 4) {
            return this.f5689b.m2215a(i);
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
            this.f5692e = ECUtils.m4232a((PublicKey) key);
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException("must be passed private EC key for decryption");
            }
            this.f5692e = ECUtil.m4328a((PrivateKey) key);
        }
        if (secureRandom != null) {
            this.f5693f = secureRandom;
        } else {
            this.f5693f = C1124l.m2709a();
        }
        this.f5690c = i;
        this.f5691d.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        if (!C1560k.m4163b(str).equals("NONE")) {
            throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!C1560k.m4163b(str).equals("NOPADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f5691d.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f5691d.write(bArr, i, i2);
        return null;
    }
}
