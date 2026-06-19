package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.p083b.InterfaceC0809ai;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.p084a.C0798i;
import org.bouncycastle.p083b.p084a.C0799j;
import org.bouncycastle.p083b.p084a.C0800k;
import org.bouncycastle.p083b.p084a.p085a.C0788a;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p090f.C0972s;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1096bu;
import org.bouncycastle.p083b.p097k.C1098bw;
import org.bouncycastle.p083b.p097k.C1099bx;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: d */
    private InterfaceC0809ai f5797d;

    /* JADX INFO: renamed from: e */
    private DHUParameterSpec f5798e;

    /* JADX INFO: renamed from: f */
    private byte[] f5799f;

    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    KeyAgreementSpi(String str) {
        super(str, null);
    }

    KeyAgreementSpi(String str, InterfaceC1173p interfaceC1173p) {
        super(str, interfaceC1173p);
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0809ai m4270a(String str) throws InvalidKeyException {
        if (this.f5904a.equals("XDH") || this.f5904a.startsWith(str)) {
            return this.f5904a.indexOf(85) > 0 ? str.startsWith("X448") ? new C0800k(new C0799j()) : new C0800k(new C0798i()) : str.startsWith("X448") ? new C0799j() : new C0798i();
        }
        throw new InvalidKeyException("inappropriate key for " + this.f5904a);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    /* JADX INFO: renamed from: a */
    protected final byte[] mo4204a() {
        return this.f5799f;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.f5797d == null) {
            throw new IllegalStateException(this.f5904a + " not initialised.");
        }
        if (!z) {
            throw new IllegalStateException(this.f5904a + " can only be between two parties.");
        }
        if (!(key instanceof BCXDHPublicKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        C1075b c1075bM4269a = ((BCXDHPublicKey) key).m4269a();
        this.f5799f = new byte[this.f5797d.mo1891a()];
        if (this.f5798e != null) {
            this.f5797d.mo1893a(new C1099bx(c1075bM4269a, ((BCXDHPublicKey) this.f5798e.m4488c()).m4269a()), this.f5799f, 0);
            return null;
        }
        this.f5797d.mo1893a(c1075bM4269a, this.f5799f, 0);
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof BCXDHPrivateKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        C1075b c1075bM4268a = ((BCXDHPrivateKey) key).m4268a();
        if (c1075bM4268a instanceof C1096bu) {
            this.f5797d = m4270a("X448");
        } else {
            this.f5797d = m4270a("X25519");
        }
        this.f5797d.mo1892a(c1075bM4268a);
        if (this.f5905b != null) {
            this.f5906c = new byte[0];
        } else {
            this.f5906c = null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof BCXDHPrivateKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        C1075b c1075bM4268a = ((BCXDHPrivateKey) key).m4268a();
        if (c1075bM4268a instanceof C1096bu) {
            this.f5797d = m4270a("X448");
        } else {
            this.f5797d = m4270a("X25519");
        }
        this.f5906c = null;
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            this.f5797d.mo1892a(c1075bM4268a);
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.f5905b == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.f5906c = ((UserKeyingMaterialSpec) algorithmParameterSpec).m4517a();
        } else {
            if (this.f5904a.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.f5798e = (DHUParameterSpec) algorithmParameterSpec;
            this.f5906c = this.f5798e.m4489d();
            this.f5797d.mo1892a(new C1098bw(c1075bM4268a, ((BCXDHPrivateKey) this.f5798e.m4486a()).m4268a(), ((BCXDHPublicKey) this.f5798e.m4487b()).m4269a()));
        }
        if (this.f5905b == null || this.f5906c != null) {
            return;
        }
        this.f5906c = new byte[0];
    }

    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new C0788a(new C0844u()));
        }
    }

    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new C0972s(new C0844u()));
        }
    }

    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new C0788a(new C0844u()));
        }
    }

    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new C0972s(new C0844u()));
        }
    }

    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new C0788a(new C0845v()));
        }
    }

    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new C0788a(new C0847x()));
        }
    }

    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new C0788a(new C0847x()));
        }
    }

    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new C0972s(new C0847x()));
        }
    }

    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new C0788a(new C0844u()));
        }
    }

    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new C0788a(new C0845v()));
        }
    }

    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new C0788a(new C0847x()));
        }
    }

    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new C0972s(new C0847x()));
        }
    }
}
