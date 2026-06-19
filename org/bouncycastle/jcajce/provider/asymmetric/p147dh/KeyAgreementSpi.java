package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.p084a.C0791b;
import org.bouncycastle.p083b.p084a.C0797h;
import org.bouncycastle.p083b.p084a.p085a.C0788a;
import org.bouncycastle.p083b.p084a.p085a.C0790c;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p090f.C0972s;
import org.bouncycastle.p083b.p097k.C1104g;
import org.bouncycastle.p083b.p097k.C1105h;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1108k;
import org.bouncycastle.p083b.p097k.C1109l;
import org.bouncycastle.p083b.p097k.C1110m;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: d */
    private static final BigInteger f5616d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: e */
    private static final BigInteger f5617e = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: f */
    private final C0791b f5618f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0884d f5619g;

    /* JADX INFO: renamed from: h */
    private DHUParameterSpec f5620h;

    /* JADX INFO: renamed from: i */
    private MQVParameterSpec f5621i;

    /* JADX INFO: renamed from: j */
    private BigInteger f5622j;

    /* JADX INFO: renamed from: k */
    private BigInteger f5623k;

    /* JADX INFO: renamed from: l */
    private BigInteger f5624l;

    /* JADX INFO: renamed from: m */
    private byte[] f5625m;

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    public KeyAgreementSpi(String str, C0791b c0791b, InterfaceC1173p interfaceC1173p) {
        super(str, interfaceC1173p);
        this.f5618f = c0791b;
        this.f5619g = null;
    }

    public KeyAgreementSpi(String str, InterfaceC0884d interfaceC0884d, InterfaceC1173p interfaceC1173p) {
        super(str, interfaceC1173p);
        this.f5618f = null;
        this.f5619g = interfaceC0884d;
    }

    public KeyAgreementSpi(String str, InterfaceC1173p interfaceC1173p) {
        super(str, interfaceC1173p);
        this.f5618f = null;
        this.f5619g = null;
    }

    /* JADX INFO: renamed from: a */
    private static C1107j m4201a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("private key not a DHPrivateKey");
        }
        if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).m4196a();
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        DHParameterSpec params = dHPrivateKey.getParams();
        return new C1107j(dHPrivateKey.getX(), new C1106i(params.getP(), params.getG(), params.getL()));
    }

    /* JADX INFO: renamed from: a */
    private static C1108k m4202a(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("public key not a DHPublicKey");
        }
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).m4197a();
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        DHParameterSpec params = dHPublicKey.getParams();
        return params instanceof DHDomainParameterSpec ? new C1108k(dHPublicKey.getY(), ((DHDomainParameterSpec) params).m4485b()) : new C1108k(dHPublicKey.getY(), new C1106i(params.getP(), params.getG(), params.getL()));
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4203a(BigInteger bigInteger) {
        int iBitLength = (this.f5623k.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == iBitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == iBitLength + 1) {
            byte[] bArr = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
            return bArr;
        }
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(byteArray, 0, bArr2, iBitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    /* JADX INFO: renamed from: a */
    protected final byte[] mo4204a() {
        return this.f5625m;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.f5622j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey)) {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.f5624l) || !dHPublicKey.getParams().getP().equals(this.f5623k)) {
            throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        BigInteger y = ((DHPublicKey) key).getY();
        if (y == null || y.compareTo(f5617e) < 0 || y.compareTo(this.f5623k.subtract(f5616d)) >= 0) {
            throw new InvalidKeyException("Invalid DH PublicKey");
        }
        if (this.f5618f != null) {
            if (!z) {
                throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
            }
            this.f5625m = this.f5618f.m1884b(new C1110m(m4202a((PublicKey) key), m4202a(this.f5620h.m4488c())));
            return null;
        }
        if (this.f5619g != null) {
            if (!z) {
                throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
            }
            this.f5625m = m4203a(this.f5619g.mo1874b(new C1105h(m4202a((PublicKey) key), m4202a(this.f5621i.m4502c()))));
            return null;
        }
        BigInteger bigIntegerModPow = y.modPow(this.f5622j, this.f5623k);
        if (bigIntegerModPow.compareTo(f5616d) == 0) {
            throw new InvalidKeyException("Shared key can't be 1");
        }
        this.f5625m = m4203a(bigIntegerModPow);
        if (z) {
            return null;
        }
        return new BCDHPublicKey(bigIntegerModPow, dHPublicKey.getParams());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) {
        if (this.f5622j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return super.engineGenerateSecret(bArr, i);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) {
        if (this.f5622j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return str.equals("TlsPremasterSecret") ? new SecretKeySpec(m4301a(this.f5625m), str) : super.engineGenerateSecret(str);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        if (this.f5622j == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return super.engineGenerateSecret();
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.f5623k = dHPrivateKey.getParams().getP();
        this.f5624l = dHPrivateKey.getParams().getG();
        this.f5622j = dHPrivateKey.getX();
        this.f5625m = m4203a(this.f5622j);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.f5623k = dHPrivateKey.getParams().getP();
            this.f5624l = dHPrivateKey.getParams().getG();
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.f5623k = dHParameterSpec.getP();
            this.f5624l = dHParameterSpec.getG();
            this.f5620h = null;
            this.f5906c = null;
        } else if (algorithmParameterSpec instanceof DHUParameterSpec) {
            if (this.f5618f == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.f5623k = dHPrivateKey.getParams().getP();
            this.f5624l = dHPrivateKey.getParams().getG();
            this.f5620h = (DHUParameterSpec) algorithmParameterSpec;
            this.f5906c = ((DHUParameterSpec) algorithmParameterSpec).m4489d();
            if (this.f5620h.m4487b() != null) {
                this.f5618f.m1883a(new C1109l(m4201a(dHPrivateKey), m4201a(this.f5620h.m4486a()), m4202a(this.f5620h.m4487b())));
            } else {
                this.f5618f.m1883a(new C1109l(m4201a(dHPrivateKey), m4201a(this.f5620h.m4486a())));
            }
        } else if (algorithmParameterSpec instanceof MQVParameterSpec) {
            if (this.f5619g == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
            }
            this.f5623k = dHPrivateKey.getParams().getP();
            this.f5624l = dHPrivateKey.getParams().getG();
            this.f5621i = (MQVParameterSpec) algorithmParameterSpec;
            this.f5906c = ((MQVParameterSpec) algorithmParameterSpec).m4503d();
            if (this.f5621i.m4501b() != null) {
                this.f5619g.mo1873a(new C1104g(m4201a(dHPrivateKey), m4201a(this.f5621i.m4500a()), m4202a(this.f5621i.m4501b())));
            } else {
                this.f5619g.mo1873a(new C1104g(m4201a(dHPrivateKey), m4201a(this.f5621i.m4500a())));
            }
        } else {
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            if (this.f5905b == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.f5623k = dHPrivateKey.getParams().getP();
            this.f5624l = dHPrivateKey.getParams().getG();
            this.f5620h = null;
            this.f5906c = ((UserKeyingMaterialSpec) algorithmParameterSpec).m4517a();
        }
        this.f5622j = dHPrivateKey.getX();
        this.f5625m = m4203a(this.f5622j);
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new C0791b(), new C0788a(new C0842s()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new C0791b(), new C0972s(new C0842s()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new C0791b(), new C0788a(new C0843t()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new C0791b(), new C0972s(new C0843t()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new C0791b(), new C0788a(new C0844u()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new C0791b(), new C0972s(new C0844u()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new C0791b(), new C0788a(new C0845v()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new C0791b(), new C0972s(new C0845v()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new C0791b(), new C0788a(new C0847x()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new C0791b(), new C0972s(new C0847x()));
        }
    }

    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new C0790c(new C0842s()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new C0788a(new C0842s()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new C0972s(new C0842s()));
        }
    }

    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new C0788a(new C0843t()));
        }
    }

    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new C0972s(new C0843t()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new C0788a(new C0844u()));
        }
    }

    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new C0972s(new C0844u()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new C0788a(new C0845v()));
        }
    }

    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new C0972s(new C0845v()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new C0788a(new C0847x()));
        }
    }

    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new C0972s(new C0847x()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", new C0797h(), new C0788a(new C0842s()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", new C0797h(), new C0972s(new C0842s()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", new C0797h(), new C0788a(new C0843t()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", new C0797h(), new C0972s(new C0843t()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", new C0797h(), new C0788a(new C0844u()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", new C0797h(), new C0972s(new C0844u()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", new C0797h(), new C0788a(new C0845v()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", new C0797h(), new C0972s(new C0845v()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", new C0797h(), new C0788a(new C0847x()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", new C0797h(), new C0972s(new C0847x()));
        }
    }
}
