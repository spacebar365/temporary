package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p088d.C0885a;
import org.bouncycastle.p083b.p088d.C0886b;
import org.bouncycastle.p083b.p088d.C0887c;
import org.bouncycastle.p083b.p089e.C0943t;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p103c.p104a.InterfaceC1188d;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class CipherSpi extends BaseCipherSpi {

    /* JADX INFO: renamed from: c */
    private InterfaceC0786a f5823c;

    /* JADX INFO: renamed from: d */
    private AlgorithmParameterSpec f5824d;

    /* JADX INFO: renamed from: e */
    private AlgorithmParameters f5825e;

    /* JADX INFO: renamed from: f */
    private BaseCipherSpi.ErasableOutputStream f5826f = new BaseCipherSpi.ErasableOutputStream();

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new C0943t());
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new C0887c(new C0943t()));
        }
    }

    public CipherSpi(InterfaceC0786a interfaceC0786a) {
        this.f5823c = interfaceC0786a;
    }

    /* JADX INFO: renamed from: a */
    private void m4278a(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        InterfaceC1175r interfaceC1175rM4479a = DigestFactory.m4479a(mGF1ParameterSpec.getDigestAlgorithm());
        if (interfaceC1175rM4479a == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.f5823c = new C0886b(new C0943t(), interfaceC1175rM4479a, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        this.f5824d = oAEPParameterSpec;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4279a() {
        try {
            try {
                return this.f5823c.mo1870a(this.f5826f.m4305a(), 0, this.f5826f.size());
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BadBlockException("unable to decrypt block", e);
            } catch (C1179v e2) {
                throw new BadBlockException("unable to decrypt block", e2);
            }
        } finally {
            this.f5826f.m4306b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.f5826f.write(bArr, i, i2);
        }
        if (this.f5823c instanceof C0943t) {
            if (this.f5826f.size() > this.f5823c.mo1868a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.f5826f.size() > this.f5823c.mo1868a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        byte[] bArrM4279a = m4279a();
        for (int i4 = 0; i4 != bArrM4279a.length; i4++) {
            bArr2[i3 + i4] = bArrM4279a[i4];
        }
        return bArrM4279a.length;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f5826f.write(bArr, i, i2);
        }
        if (this.f5823c instanceof C0943t) {
            if (this.f5826f.size() > this.f5823c.mo1868a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.f5826f.size() > this.f5823c.mo1868a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return m4279a();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.f5823c.mo1868a();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        if (key instanceof InterfaceC1188d) {
            return ((InterfaceC1188d) key).mo2830a().m2877a().bitLength();
        }
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not an ElGamal key!");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.f5823c.mo1871b();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f5825e == null && this.f5824d != null) {
            try {
                this.f5825e = m4304a("OAEP");
                this.f5825e.init(this.f5824d);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f5825e;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        InterfaceC1003i interfaceC1003iM4280a;
        if (key instanceof DHPublicKey) {
            interfaceC1003iM4280a = ElGamalUtil.m4281a((PublicKey) key);
        } else {
            if (!(key instanceof DHPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to ElGamal");
            }
            interfaceC1003iM4280a = ElGamalUtil.m4280a((PrivateKey) key);
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.f5824d = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(InterfaceC0674n.f2738j_.m1593b())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            InterfaceC1175r interfaceC1175rM4479a = DigestFactory.m4479a(oAEPParameterSpec.getDigestAlgorithm());
            if (interfaceC1175rM4479a == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            InterfaceC1175r interfaceC1175rM4479a2 = DigestFactory.m4479a(mGF1ParameterSpec.getDigestAlgorithm());
            if (interfaceC1175rM4479a2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.f5823c = new C0886b(new C0943t(), interfaceC1175rM4479a, interfaceC1175rM4479a2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        if (secureRandom != null) {
            interfaceC1003iM4280a = new C1081bf(interfaceC1003iM4280a, secureRandom);
        }
        switch (i) {
            case 1:
            case 3:
                this.f5823c.mo1869a(true, interfaceC1003iM4280a);
                return;
            case 2:
            case 4:
                this.f5823c.mo1869a(false, interfaceC1003iM4280a);
                return;
            default:
                throw new InvalidParameterException("unknown opmode " + i + " passed to ElGamal");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        String strM4163b = C1560k.m4163b(str);
        if (!strM4163b.equals("NONE") && !strM4163b.equals("ECB")) {
            throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String strM4163b = C1560k.m4163b(str);
        if (strM4163b.equals("NOPADDING")) {
            this.f5823c = new C0943t();
            return;
        }
        if (strM4163b.equals("PKCS1PADDING")) {
            this.f5823c = new C0887c(new C0943t());
            return;
        }
        if (strM4163b.equals("ISO9796-1PADDING")) {
            this.f5823c = new C0885a(new C0943t());
            return;
        }
        if (strM4163b.equals("OAEPPADDING")) {
            m4278a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strM4163b.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
            m4278a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (strM4163b.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            m4278a(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else {
            if (!strM4163b.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(str + " unavailable with ElGamal.");
            }
            m4278a(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f5826f.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f5826f.write(bArr, i, i2);
        return null;
    }
}
