package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.p054a.p056aa.C0512ai;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.p084a.C0792c;
import org.bouncycastle.p083b.p084a.C0793d;
import org.bouncycastle.p083b.p084a.C0794e;
import org.bouncycastle.p083b.p084a.C0795f;
import org.bouncycastle.p083b.p084a.p085a.C0788a;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p090f.C0972s;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1077bb;
import org.bouncycastle.p083b.p097k.C1078bc;
import org.bouncycastle.p083b.p097k.C1120w;
import org.bouncycastle.p083b.p097k.C1121x;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1186b;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p104a.InterfaceC1196l;
import org.bouncycastle.p103c.p104a.InterfaceC1197m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: d */
    private static final C0512ai f5711d = new C0512ai();

    /* JADX INFO: renamed from: e */
    private String f5712e;

    /* JADX INFO: renamed from: f */
    private C1122y f5713f;

    /* JADX INFO: renamed from: g */
    private Object f5714g;

    /* JADX INFO: renamed from: h */
    private MQVParameterSpec f5715h;

    /* JADX INFO: renamed from: i */
    private DHUParameterSpec f5716i;

    /* JADX INFO: renamed from: j */
    private byte[] f5717j;

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH */
    public static class C1574DH extends KeyAgreementSpi {
        public C1574DH() {
            super("ECDH", new C0792c(), (InterfaceC1173p) null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new C0793d(), (InterfaceC1173p) null);
        }
    }

    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new C0794e(), (InterfaceC1173p) null);
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new C0792c(), new C0972s(new C0839p()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new C0795f(), (InterfaceC1173p) null);
        }
    }

    protected KeyAgreementSpi(String str, C0794e c0794e, InterfaceC1173p interfaceC1173p) {
        super(str, interfaceC1173p);
        this.f5712e = str;
        this.f5714g = c0794e;
    }

    protected KeyAgreementSpi(String str, InterfaceC0884d interfaceC0884d, InterfaceC1173p interfaceC1173p) {
        super(str, interfaceC1173p);
        this.f5712e = str;
        this.f5714g = interfaceC0884d;
    }

    /* JADX INFO: renamed from: a */
    private static String m4235a(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    /* JADX INFO: renamed from: a */
    private void m4236a(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C1052ad c1052ad;
        C1052ad c1052ad2;
        C1053ae c1053ae = null;
        if (this.f5714g instanceof C0795f) {
            this.f5715h = null;
            if (!(key instanceof InterfaceC1196l) && !(algorithmParameterSpec instanceof MQVParameterSpec)) {
                throw new InvalidAlgorithmParameterException(this.f5712e + " key agreement requires " + m4235a(MQVParameterSpec.class) + " for initialisation");
            }
            if (key instanceof InterfaceC1196l) {
                InterfaceC1196l interfaceC1196l = (InterfaceC1196l) key;
                c1052ad = (C1052ad) ECUtil.m4328a(interfaceC1196l.m2840a());
                c1052ad2 = (C1052ad) ECUtil.m4328a(interfaceC1196l.m2841b());
                if (interfaceC1196l.m2842c() != null) {
                    c1053ae = (C1053ae) ECUtils.m4232a(interfaceC1196l.m2842c());
                }
            } else {
                MQVParameterSpec mQVParameterSpec = (MQVParameterSpec) algorithmParameterSpec;
                c1052ad = (C1052ad) ECUtil.m4328a((PrivateKey) key);
                c1052ad2 = (C1052ad) ECUtil.m4328a(mQVParameterSpec.m4500a());
                c1053ae = mQVParameterSpec.m4501b() != null ? (C1053ae) ECUtils.m4232a(mQVParameterSpec.m4501b()) : null;
                this.f5715h = mQVParameterSpec;
                this.f5906c = mQVParameterSpec.m4503d();
            }
            C1077bb c1077bb = new C1077bb(c1052ad, c1052ad2, c1053ae);
            this.f5713f = c1052ad.m2563b();
            ((C0795f) this.f5714g).mo1873a(c1077bb);
            return;
        }
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException(this.f5712e + " key agreement requires " + m4235a(InterfaceC1186b.class) + " for initialisation");
            }
            if (this.f5905b == null && (algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            C1052ad c1052ad3 = (C1052ad) ECUtil.m4328a((PrivateKey) key);
            this.f5713f = c1052ad3.m2563b();
            this.f5906c = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).m4517a() : null;
            ((InterfaceC0884d) this.f5714g).mo1873a(c1052ad3);
            return;
        }
        if (!(this.f5714g instanceof C0794e)) {
            throw new InvalidAlgorithmParameterException(this.f5712e + " key agreement cannot be used with " + m4235a(DHUParameterSpec.class));
        }
        DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
        C1052ad c1052ad4 = (C1052ad) ECUtil.m4328a((PrivateKey) key);
        C1052ad c1052ad5 = (C1052ad) ECUtil.m4328a(dHUParameterSpec.m4486a());
        C1053ae c1053ae2 = dHUParameterSpec.m4487b() != null ? (C1053ae) ECUtils.m4232a(dHUParameterSpec.m4487b()) : null;
        this.f5716i = dHUParameterSpec;
        this.f5906c = dHUParameterSpec.m4489d();
        C1120w c1120w = new C1120w(c1052ad4, c1052ad5, c1053ae2);
        this.f5713f = c1052ad4.m2563b();
        ((C0794e) this.f5714g).m1886a(c1120w);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    /* JADX INFO: renamed from: a */
    protected final byte[] mo4204a() {
        return C1535a.m4086b(this.f5717j);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            m4236a(key, null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof MQVParameterSpec) && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec) && !(algorithmParameterSpec instanceof DHUParameterSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        m4236a(key, algorithmParameterSpec);
    }

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new C0793d(), new C0972s(new C0842s()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new C0793d(), new C0972s(new C0843t()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new C0793d(), new C0972s(new C0844u()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new C0793d(), new C0972s(new C0845v()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new C0793d(), new C0972s(new C0847x()));
        }
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new C0794e(), new C0788a(new C0842s()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new C0794e(), new C0972s(new C0842s()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new C0794e(), new C0788a(new C0843t()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new C0794e(), new C0972s(new C0843t()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new C0794e(), new C0788a(new C0844u()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new C0794e(), new C0972s(new C0844u()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new C0794e(), new C0788a(new C0845v()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new C0794e(), new C0972s(new C0845v()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new C0794e(), new C0788a(new C0847x()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new C0794e(), new C0972s(new C0847x()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new C0793d(), new C0788a(new C0842s()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new C0792c(), new C0972s(new C0842s()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new C0792c(), new C0972s(new C0842s()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new C0792c(), new C0972s(new C0843t()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new C0793d(), new C0788a(new C0844u()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new C0792c(), new C0972s(new C0844u()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new C0793d(), new C0788a(new C0845v()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new C0792c(), new C0972s(new C0845v()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new C0793d(), new C0788a(new C0847x()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new C0792c(), new C0972s(new C0847x()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", new C0792c(), new C0972s(new C0842s()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", new C0792c(), new C0972s(new C0843t()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", new C0792c(), new C0972s(new C0844u()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", new C0792c(), new C0972s(new C0845v()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", new C0792c(), new C0972s(new C0847x()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new C0795f(), new C0788a(new C0842s()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", new C0795f(), new C0972s(new C0842s()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new C0795f(), new C0972s(new C0842s()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new C0795f(), new C0788a(new C0843t()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", new C0795f(), new C0972s(new C0843t()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new C0795f(), new C0972s(new C0843t()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new C0795f(), new C0788a(new C0844u()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", new C0795f(), new C0972s(new C0844u()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new C0795f(), new C0972s(new C0844u()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new C0795f(), new C0788a(new C0845v()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", new C0795f(), new C0972s(new C0845v()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new C0795f(), new C0972s(new C0845v()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new C0795f(), new C0788a(new C0847x()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", new C0795f(), new C0972s(new C0847x()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new C0795f(), new C0972s(new C0847x()));
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        InterfaceC1003i interfaceC1003iM4232a;
        if (this.f5713f == null) {
            throw new IllegalStateException(this.f5712e + " not initialised.");
        }
        if (!z) {
            throw new IllegalStateException(this.f5712e + " can only be between two parties.");
        }
        if (this.f5714g instanceof C0795f) {
            if (key instanceof InterfaceC1197m) {
                InterfaceC1197m interfaceC1197m = (InterfaceC1197m) key;
                interfaceC1003iM4232a = new C1078bc((C1053ae) ECUtils.m4232a(interfaceC1197m.m2843a()), (C1053ae) ECUtils.m4232a(interfaceC1197m.m2844b()));
            } else {
                interfaceC1003iM4232a = new C1078bc((C1053ae) ECUtils.m4232a((PublicKey) key), (C1053ae) ECUtils.m4232a(this.f5715h.m4502c()));
            }
        } else if (this.f5714g instanceof C0794e) {
            interfaceC1003iM4232a = new C1121x((C1053ae) ECUtils.m4232a((PublicKey) key), (C1053ae) ECUtils.m4232a(this.f5716i.m4488c()));
        } else {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException(this.f5712e + " key agreement requires " + m4235a(InterfaceC1187c.class) + " for doPhase");
            }
            interfaceC1003iM4232a = ECUtils.m4232a((PublicKey) key);
        }
        try {
            if (this.f5714g instanceof InterfaceC0884d) {
                this.f5717j = C0512ai.m1377a(((InterfaceC0884d) this.f5714g).mo1874b(interfaceC1003iM4232a), C0512ai.m1376a(this.f5713f.m2699a()));
                return null;
            }
            this.f5717j = ((C0794e) this.f5714g).m1887b(interfaceC1003iM4232a);
            return null;
        } catch (Exception e) {
            throw new InvalidKeyException("calculation failed: " + e.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e;
                }
            };
        }
    }
}
