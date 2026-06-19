package org.bouncycastle.jcajce.provider.asymmetric.dstu;

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
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p078w.AbstractC0745e;
import org.bouncycastle.p054a.p078w.C0741a;
import org.bouncycastle.p054a.p078w.C0742b;
import org.bouncycastle.p054a.p078w.C0743c;
import org.bouncycastle.p054a.p078w.C0744d;
import org.bouncycastle.p054a.p078w.InterfaceC0746f;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1206c;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1210g;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: loaded from: classes.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, InterfaceC1187c {

    /* JADX INFO: renamed from: a */
    private String f5663a;

    /* JADX INFO: renamed from: b */
    private transient C1053ae f5664b;

    /* JADX INFO: renamed from: c */
    private transient ECParameterSpec f5665c;

    /* JADX INFO: renamed from: d */
    private transient C0744d f5666d;

    public BCDSTU4145PublicKey(String str, C1053ae c1053ae) {
        this.f5663a = "DSTU4145";
        this.f5663a = str;
        this.f5664b = c1053ae;
        this.f5665c = null;
    }

    public BCDSTU4145PublicKey(String str, C1053ae c1053ae, ECParameterSpec eCParameterSpec) {
        this.f5663a = "DSTU4145";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5663a = str;
        this.f5664b = c1053ae;
        if (eCParameterSpec != null) {
            this.f5665c = eCParameterSpec;
            return;
        }
        AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
        c1122yB.m2704f();
        this.f5665c = m4216a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
    }

    public BCDSTU4145PublicKey(String str, C1053ae c1053ae, C1208e c1208e) {
        this.f5663a = "DSTU4145";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5663a = str;
        if (c1208e == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5665c = m4216a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
        } else {
            this.f5665c = EC5Util.m4310a(EC5Util.m4314a(c1208e.m2869b()), c1208e);
        }
        this.f5664b = c1053ae;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f5663a = "DSTU4145";
        this.f5665c = eCPublicKeySpec.getParams();
        this.f5664b = new C1053ae(EC5Util.m4319a(this.f5665c, eCPublicKeySpec.getW()), EC5Util.m4315a((ProviderConfiguration) null, this.f5665c));
    }

    /* JADX INFO: renamed from: a */
    private static ECParameterSpec m4216a(EllipticCurve ellipticCurve, C1122y c1122y) {
        return new ECParameterSpec(ellipticCurve, EC5Util.m4313a(c1122y.m2700b()), c1122y.m2701c(), c1122y.m2702d().intValue());
    }

    /* JADX INFO: renamed from: a */
    private static void m4217a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    /* JADX INFO: renamed from: e */
    private C1208e m4218e() {
        return this.f5665c != null ? EC5Util.m4316a(this.f5665c) : C1200a.f4677a.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5665c == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5665c);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4219b() {
        return this.f5666d != null ? this.f5666d.m1734c() : C0744d.m1731d();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1187c
    /* JADX INFO: renamed from: c */
    public final AbstractC1389j mo2829c() {
        AbstractC1389j abstractC1389jM2566c = this.f5664b.m2566c();
        return this.f5665c == null ? abstractC1389jM2566c.m3456c() : abstractC1389jM2566c;
    }

    /* JADX INFO: renamed from: d */
    final C1053ae m4220d() {
        return this.f5664b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.f5664b.m2566c().m3450a(bCDSTU4145PublicKey.f5664b.m2566c()) && m4218e().equals(bCDSTU4145PublicKey.m4218e());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5663a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        InterfaceC0618f c0505ab;
        if (this.f5666d != null) {
            c0505ab = this.f5666d;
        } else if (this.f5665c instanceof C1207d) {
            c0505ab = new C0744d(new C0653p(((C1207d) this.f5665c).m2868a()));
        } else {
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(this.f5665c.getCurve());
            c0505ab = new C0505ab(new C0507ad(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, this.f5665c.getGenerator()), this.f5665c.getOrder(), BigInteger.valueOf(this.f5665c.getCofactor()), this.f5665c.getCurve().getSeed()));
        }
        try {
            return KeyUtil.m4340a(new C0780u(new C0759a(InterfaceC0746f.f2989c, c0505ab), new C0581be(AbstractC0745e.m1739a(this.f5664b.m2566c()))));
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
        return this.f5665c;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.m4313a(this.f5664b.m2566c());
    }

    public int hashCode() {
        return this.f5664b.m2566c().hashCode() ^ m4218e().hashCode();
    }

    public String toString() {
        return ECUtil.m4323a(this.f5663a, this.f5664b.m2566c(), m4218e());
    }

    public BCDSTU4145PublicKey(C1210g c1210g, ProviderConfiguration providerConfiguration) {
        this.f5663a = "DSTU4145";
        if (c1210g.m2865a() == null) {
            this.f5664b = new C1053ae(providerConfiguration.mo2859a().m2869b().mo3355a(c1210g.m2875b().m3461g().mo2928a(), c1210g.m2875b().m3462h().mo2928a(), false), EC5Util.m4315a(providerConfiguration, (ECParameterSpec) null));
            this.f5665c = null;
        } else {
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(c1210g.m2865a().m2869b());
            this.f5664b = new C1053ae(c1210g.m2875b(), ECUtil.m4331a(providerConfiguration, c1210g.m2865a()));
            this.f5665c = EC5Util.m4310a(ellipticCurveM4314a, c1210g.m2865a());
        }
    }

    BCDSTU4145PublicKey(C0780u c0780u) {
        C0507ad c0507ad;
        C1208e c1208e;
        this.f5663a = "DSTU4145";
        C0558au c0558auM1846c = c0780u.m1846c();
        this.f5663a = "DSTU4145";
        try {
            byte[] bArrMo1410c = ((AbstractC0655q) AbstractC0686u.m1692b(c0558auM1846c.m1474d())).mo1410c();
            if (c0780u.m1844a().m1783a().equals(InterfaceC0746f.f2988b)) {
                m4217a(bArrMo1410c);
            }
            AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(c0780u.m1844a().m1784b());
            if (abstractC0723vM1708a.mo1482a(0) instanceof C0640m) {
                C0507ad c0507adM1365a = C0507ad.m1365a(abstractC0723vM1708a);
                c0507ad = c0507adM1365a;
                c1208e = new C1208e(c0507adM1365a.m1366a(), c0507adM1365a.m1367b(), c0507adM1365a.m1368c(), c0507adM1365a.m1369d(), c0507adM1365a.m1370e());
            } else {
                this.f5666d = C0744d.m1730a(abstractC0723vM1708a);
                if (this.f5666d.m1732a()) {
                    C0653p c0653pM1735e = this.f5666d.m1735e();
                    C1122y c1122yM1729a = C0743c.m1729a(c0653pM1735e);
                    C1206c c1206c = new C1206c(c0653pM1735e.m1593b(), c1122yM1729a.m2699a(), c1122yM1729a.m2700b(), c1122yM1729a.m2701c(), c1122yM1729a.m2702d(), c1122yM1729a.m2704f());
                    c0507ad = null;
                    c1208e = c1206c;
                } else {
                    C0742b c0742bM1733b = this.f5666d.m1733b();
                    byte[] bArrM1726c = c0742bM1733b.m1726c();
                    if (c0780u.m1844a().m1783a().equals(InterfaceC0746f.f2988b)) {
                        m4217a(bArrM1726c);
                    }
                    C0741a c0741aM1724a = c0742bM1733b.m1724a();
                    AbstractC1381d.d dVar = new AbstractC1381d.d(c0741aM1724a.m1719a(), c0741aM1724a.m1720b(), c0741aM1724a.m1721c(), c0741aM1724a.m1722d(), c0742bM1733b.m1725b(), new BigInteger(1, bArrM1726c));
                    byte[] bArrM1728e = c0742bM1733b.m1728e();
                    if (c0780u.m1844a().m1783a().equals(InterfaceC0746f.f2988b)) {
                        m4217a(bArrM1728e);
                    }
                    C1208e c1208e2 = new C1208e(dVar, AbstractC0745e.m1738a(dVar, bArrM1728e), c0742bM1733b.m1727d());
                    c0507ad = null;
                    c1208e = c1208e2;
                }
            }
            AbstractC1381d abstractC1381dM2869b = c1208e.m2869b();
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(abstractC1381dM2869b);
            if (this.f5666d == null) {
                this.f5665c = EC5Util.m4312a(c0507ad);
            } else if (this.f5666d.m1732a()) {
                this.f5665c = new C1207d(this.f5666d.m1735e().m1593b(), ellipticCurveM4314a, EC5Util.m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e());
            } else {
                this.f5665c = new ECParameterSpec(ellipticCurveM4314a, EC5Util.m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e().intValue());
            }
            this.f5664b = new C1053ae(AbstractC0745e.m1738a(abstractC1381dM2869b, bArrMo1410c), EC5Util.m4315a((ProviderConfiguration) null, this.f5665c));
        } catch (IOException e) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }
}
