package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p061f.C0620b;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p083b.p097k.C1123z;
import org.bouncycastle.p103c.C1184a;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1206c;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1210g;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: loaded from: classes.dex */
public class BCECGOST3410PublicKey implements ECPublicKey, InterfaceC1187c {

    /* JADX INFO: renamed from: a */
    private String f5737a;

    /* JADX INFO: renamed from: b */
    private transient C1053ae f5738b;

    /* JADX INFO: renamed from: c */
    private transient ECParameterSpec f5739c;

    /* JADX INFO: renamed from: d */
    private transient InterfaceC0618f f5740d;

    public BCECGOST3410PublicKey(String str, C1053ae c1053ae) {
        this.f5737a = "ECGOST3410";
        this.f5737a = str;
        this.f5738b = c1053ae;
        this.f5739c = null;
    }

    public BCECGOST3410PublicKey(String str, C1053ae c1053ae, ECParameterSpec eCParameterSpec) {
        this.f5737a = "ECGOST3410";
        C1122y c1122yB = c1053ae.m2563b();
        if (c1122yB instanceof C1123z) {
            C1123z c1123z = (C1123z) c1122yB;
            this.f5740d = new C0624f(c1123z.m2705g(), c1123z.m2706h(), c1123z.m2707i());
        }
        this.f5737a = str;
        this.f5738b = c1053ae;
        if (eCParameterSpec != null) {
            this.f5739c = eCParameterSpec;
            return;
        }
        AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
        c1122yB.m2704f();
        this.f5739c = m4244a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
    }

    public BCECGOST3410PublicKey(String str, C1053ae c1053ae, C1208e c1208e) {
        this.f5737a = "ECGOST3410";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5737a = str;
        this.f5738b = c1053ae;
        if (c1208e != null) {
            this.f5739c = EC5Util.m4310a(EC5Util.m4314a(c1208e.m2869b()), c1208e);
            return;
        }
        AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
        c1122yB.m2704f();
        this.f5739c = m4244a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f5737a = "ECGOST3410";
        this.f5739c = eCPublicKeySpec.getParams();
        this.f5738b = new C1053ae(EC5Util.m4319a(this.f5739c, eCPublicKeySpec.getW()), EC5Util.m4315a((ProviderConfiguration) null, eCPublicKeySpec.getParams()));
    }

    BCECGOST3410PublicKey(C0780u c0780u) {
        this.f5737a = "ECGOST3410";
        m4245a(c0780u);
    }

    /* JADX INFO: renamed from: a */
    private static ECParameterSpec m4244a(EllipticCurve ellipticCurve, C1122y c1122y) {
        return new ECParameterSpec(ellipticCurve, EC5Util.m4313a(c1122y.m2700b()), c1122y.m2701c(), c1122y.m2702d().intValue());
    }

    /* JADX INFO: renamed from: a */
    private void m4245a(C0780u c0780u) {
        C0653p c0653pM1516a;
        C0558au c0558auM1846c = c0780u.m1846c();
        this.f5737a = "ECGOST3410";
        try {
            byte[] bArrMo1410c = ((AbstractC0655q) AbstractC0686u.m1692b(c0558auM1846c.m1474d())).mo1410c();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr[i] = bArrMo1410c[32 - i];
                bArr[i + 32] = bArrMo1410c[64 - i];
            }
            if (c0780u.m1844a().m1784b() instanceof C0653p) {
                C0653p c0653pM1584a = C0653p.m1584a(c0780u.m1844a().m1784b());
                this.f5740d = c0653pM1584a;
                c0653pM1516a = c0653pM1584a;
            } else {
                C0624f c0624fM1515a = C0624f.m1515a(c0780u.m1844a().m1784b());
                this.f5740d = c0624fM1515a;
                c0653pM1516a = c0624fM1515a.m1516a();
            }
            C1206c c1206cM2826a = C1184a.m2826a(C0620b.m1505b(c0653pM1516a));
            AbstractC1381d abstractC1381dB = c1206cM2826a.m2869b();
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(abstractC1381dB);
            this.f5738b = new C1053ae(abstractC1381dB.m3357a(bArr), ECUtil.m4331a((ProviderConfiguration) null, c1206cM2826a));
            this.f5739c = new C1207d(C0620b.m1505b(c0653pM1516a), ellipticCurveM4314a, EC5Util.m4313a(c1206cM2826a.m2870c()), c1206cM2826a.m2871d(), c1206cM2826a.m2872e());
        } catch (IOException e) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4246a(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] bArr2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
        } else {
            bArr2 = byteArray;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = bArr2[(bArr2.length - 1) - i2];
        }
    }

    /* JADX INFO: renamed from: e */
    private C1208e m4247e() {
        return this.f5739c != null ? EC5Util.m4316a(this.f5739c) : C1200a.f4677a.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5739c == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5739c);
    }

    /* JADX INFO: renamed from: b */
    final C1053ae m4248b() {
        return this.f5738b;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1187c
    /* JADX INFO: renamed from: c */
    public final AbstractC1389j mo2829c() {
        return this.f5739c == null ? this.f5738b.m2566c().m3456c() : this.f5738b.m2566c();
    }

    /* JADX INFO: renamed from: d */
    final InterfaceC0618f m4249d() {
        if (this.f5740d == null && (this.f5739c instanceof C1207d)) {
            this.f5740d = new C0624f(C0620b.m1506b(((C1207d) this.f5739c).m2868a()), InterfaceC0619a.f2208p);
        }
        return this.f5740d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return this.f5738b.m2566c().m3450a(bCECGOST3410PublicKey.f5738b.m2566c()) && m4247e().equals(bCECGOST3410PublicKey.m4247e());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5737a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        InterfaceC0618f interfaceC0618fM4249d = m4249d();
        if (interfaceC0618fM4249d == null) {
            if (this.f5739c instanceof C1207d) {
                interfaceC0618fM4249d = new C0624f(C0620b.m1506b(((C1207d) this.f5739c).m2868a()), InterfaceC0619a.f2208p);
            } else {
                AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(this.f5739c.getCurve());
                interfaceC0618fM4249d = new C0505ab(new C0507ad(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, this.f5739c.getGenerator()), this.f5739c.getOrder(), BigInteger.valueOf(this.f5739c.getCofactor()), this.f5739c.getCurve().getSeed()));
            }
        }
        BigInteger bigIntegerMo2928a = this.f5738b.m2566c().m3461g().mo2928a();
        BigInteger bigIntegerMo2928a2 = this.f5738b.m2566c().m3462h().mo2928a();
        byte[] bArr = new byte[64];
        m4246a(bArr, 0, bigIntegerMo2928a);
        m4246a(bArr, 32, bigIntegerMo2928a2);
        try {
            return KeyUtil.m4340a(new C0780u(new C0759a(InterfaceC0619a.f2205m, interfaceC0618fM4249d), new C0581be(bArr)));
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f5739c;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.m4313a(this.f5738b.m2566c());
    }

    public int hashCode() {
        return this.f5738b.m2566c().hashCode() ^ m4247e().hashCode();
    }

    public String toString() {
        return ECUtil.m4323a(this.f5737a, this.f5738b.m2566c(), m4247e());
    }

    public BCECGOST3410PublicKey(C1210g c1210g, ProviderConfiguration providerConfiguration) {
        this.f5737a = "ECGOST3410";
        if (c1210g.m2865a() == null) {
            this.f5738b = new C1053ae(providerConfiguration.mo2859a().m2869b().mo3355a(c1210g.m2875b().m3461g().mo2928a(), c1210g.m2875b().m3462h().mo2928a(), false), EC5Util.m4315a(providerConfiguration, (ECParameterSpec) null));
            this.f5739c = null;
        } else {
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(c1210g.m2865a().m2869b());
            this.f5738b = new C1053ae(c1210g.m2875b(), ECUtil.m4331a(providerConfiguration, c1210g.m2865a()));
            this.f5739c = EC5Util.m4310a(ellipticCurveM4314a, c1210g.m2865a());
        }
    }
}
