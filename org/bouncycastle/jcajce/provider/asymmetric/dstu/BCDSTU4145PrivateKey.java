package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.p054a.AbstractC0642n;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p076u.C0687a;
import org.bouncycastle.p054a.p078w.AbstractC0745e;
import org.bouncycastle.p054a.p078w.C0741a;
import org.bouncycastle.p054a.p078w.C0742b;
import org.bouncycastle.p054a.p078w.C0743c;
import org.bouncycastle.p054a.p078w.C0744d;
import org.bouncycastle.p054a.p078w.InterfaceC0746f;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1186b;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1206c;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1209f;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, InterfaceC1186b, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private String f5658a;

    /* JADX INFO: renamed from: b */
    private transient BigInteger f5659b;

    /* JADX INFO: renamed from: c */
    private transient ECParameterSpec f5660c;

    /* JADX INFO: renamed from: d */
    private transient C0558au f5661d;

    /* JADX INFO: renamed from: e */
    private transient PKCS12BagAttributeCarrierImpl f5662e;

    protected BCDSTU4145PrivateKey() {
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSTU4145PrivateKey(String str, C1052ad c1052ad) {
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
        this.f5658a = str;
        this.f5659b = c1052ad.m2565c();
        this.f5660c = null;
    }

    public BCDSTU4145PrivateKey(String str, C1052ad c1052ad, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
        C1122y c1122yB = c1052ad.m2563b();
        this.f5658a = str;
        this.f5659b = c1052ad.m2565c();
        if (eCParameterSpec == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5660c = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yB.m2700b()), c1122yB.m2701c(), c1122yB.m2702d().intValue());
        } else {
            this.f5660c = eCParameterSpec;
        }
        this.f5661d = m4213a(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, C1052ad c1052ad, BCDSTU4145PublicKey bCDSTU4145PublicKey, C1208e c1208e) {
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
        C1122y c1122yB = c1052ad.m2563b();
        this.f5658a = str;
        this.f5659b = c1052ad.m2565c();
        if (c1208e == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5660c = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yB.m2700b()), c1122yB.m2701c(), c1122yB.m2702d().intValue());
        } else {
            this.f5660c = new ECParameterSpec(EC5Util.m4314a(c1208e.m2869b()), EC5Util.m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e().intValue());
        }
        this.f5661d = m4213a(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
        this.f5659b = eCPrivateKeySpec.getS();
        this.f5660c = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(C1209f c1209f) {
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
        this.f5659b = c1209f.m2874b();
        if (c1209f.m2865a() != null) {
            this.f5660c = EC5Util.m4310a(EC5Util.m4314a(c1209f.m2865a().m2869b()), c1209f.m2865a());
        } else {
            this.f5660c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0558au m4213a(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return C0780u.m1843a(AbstractC0686u.m1692b(bCDSTU4145PublicKey.getEncoded())).m1846c();
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4214a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    /* JADX INFO: renamed from: d */
    private C1208e m4215d() {
        return this.f5660c != null ? EC5Util.m4316a(this.f5660c) : C1200a.f4677a.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5662e.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5660c == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5660c);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5662e.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5662e.mo2847b();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1186b
    /* JADX INFO: renamed from: c */
    public final BigInteger mo2828c() {
        return this.f5659b;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5658a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C0505ab c0505ab;
        int iM4321a;
        if (this.f5660c instanceof C1207d) {
            C0653p c0653pM4326a = ECUtil.m4326a(((C1207d) this.f5660c).m2868a());
            if (c0653pM4326a == null) {
                c0653pM4326a = new C0653p(((C1207d) this.f5660c).m2868a());
            }
            c0505ab = new C0505ab(c0653pM4326a);
            iM4321a = ECUtil.m4321a(C1200a.f4677a, this.f5660c.getOrder(), getS());
        } else if (this.f5660c == null) {
            c0505ab = new C0505ab((AbstractC0642n) C0579bc.f2112a);
            iM4321a = ECUtil.m4321a(C1200a.f4677a, (BigInteger) null, getS());
        } else {
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(this.f5660c.getCurve());
            c0505ab = new C0505ab(new C0507ad(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, this.f5660c.getGenerator()), this.f5660c.getOrder(), BigInteger.valueOf(this.f5660c.getCofactor()), this.f5660c.getCurve().getSeed()));
            iM4321a = ECUtil.m4321a(C1200a.f4677a, this.f5660c.getOrder(), getS());
        }
        C0687a c0687a = this.f5661d != null ? new C0687a(iM4321a, getS(), this.f5661d, c0505ab) : new C0687a(iM4321a, getS(), c0505ab);
        try {
            return (this.f5658a.equals("DSTU4145") ? new C0676p(new C0759a(InterfaceC0746f.f2989c, c0505ab.mo1358i()), c0687a.mo1358i()) : new C0676p(new C0759a(InterfaceC0513aj.f1952k, c0505ab.mo1358i()), c0687a.mo1358i())).m1577a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f5660c;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f5659b;
    }

    public String toString() {
        return ECUtil.m4322a(this.f5658a, this.f5659b, m4215d());
    }

    BCDSTU4145PrivateKey(C0676p c0676p) {
        C1208e c1208e;
        this.f5658a = "DSTU4145";
        this.f5662e = new PKCS12BagAttributeCarrierImpl();
        C0505ab c0505abM1359a = C0505ab.m1359a(c0676p.m1658b().m1784b());
        if (c0505abM1359a.m1360a()) {
            C0653p c0653pM1584a = C0653p.m1584a((Object) c0505abM1359a.m1362c());
            C0507ad c0507adM4325a = ECUtil.m4325a(c0653pM1584a);
            if (c0507adM4325a == null) {
                C1122y c1122yM1729a = C0743c.m1729a(c0653pM1584a);
                AbstractC1381d abstractC1381dM2699a = c1122yM1729a.m2699a();
                c1122yM1729a.m2704f();
                this.f5660c = new C1207d(c0653pM1584a.m1593b(), EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yM1729a.m2700b()), c1122yM1729a.m2701c(), c1122yM1729a.m2702d());
            } else {
                AbstractC1381d abstractC1381dM1366a = c0507adM4325a.m1366a();
                c0507adM4325a.m1370e();
                this.f5660c = new C1207d(ECUtil.m4333b(c0653pM1584a), EC5Util.m4314a(abstractC1381dM1366a), EC5Util.m4313a(c0507adM4325a.m1367b()), c0507adM4325a.m1368c(), c0507adM4325a.m1369d());
            }
        } else if (c0505abM1359a.m1361b()) {
            this.f5660c = null;
        } else {
            AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a((Object) c0505abM1359a.m1362c());
            if (abstractC0723vM1708a.mo1482a(0) instanceof C0640m) {
                C0507ad c0507adM1365a = C0507ad.m1365a(c0505abM1359a.m1362c());
                AbstractC1381d abstractC1381dM1366a2 = c0507adM1365a.m1366a();
                c0507adM1365a.m1370e();
                this.f5660c = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM1366a2), EC5Util.m4313a(c0507adM1365a.m1367b()), c0507adM1365a.m1368c(), c0507adM1365a.m1369d().intValue());
            } else {
                C0744d c0744dM1730a = C0744d.m1730a(abstractC0723vM1708a);
                if (c0744dM1730a.m1732a()) {
                    C0653p c0653pM1735e = c0744dM1730a.m1735e();
                    C1122y c1122yM1729a2 = C0743c.m1729a(c0653pM1735e);
                    c1208e = new C1206c(c0653pM1735e.m1593b(), c1122yM1729a2.m2699a(), c1122yM1729a2.m2700b(), c1122yM1729a2.m2701c(), c1122yM1729a2.m2702d(), c1122yM1729a2.m2704f());
                } else {
                    C0742b c0742bM1733b = c0744dM1730a.m1733b();
                    byte[] bArrM1726c = c0742bM1733b.m1726c();
                    if (c0676p.m1658b().m1783a().equals(InterfaceC0746f.f2988b)) {
                        m4214a(bArrM1726c);
                    }
                    C0741a c0741aM1724a = c0742bM1733b.m1724a();
                    AbstractC1381d.d dVar = new AbstractC1381d.d(c0741aM1724a.m1719a(), c0741aM1724a.m1720b(), c0741aM1724a.m1721c(), c0741aM1724a.m1722d(), c0742bM1733b.m1725b(), new BigInteger(1, bArrM1726c));
                    byte[] bArrM1728e = c0742bM1733b.m1728e();
                    if (c0676p.m1658b().m1783a().equals(InterfaceC0746f.f2988b)) {
                        m4214a(bArrM1728e);
                    }
                    c1208e = new C1208e(dVar, AbstractC0745e.m1738a(dVar, bArrM1728e), c0742bM1733b.m1727d());
                }
                this.f5660c = new ECParameterSpec(EC5Util.m4314a(c1208e.m2869b()), EC5Util.m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e().intValue());
            }
        }
        InterfaceC0618f interfaceC0618fM1659c = c0676p.m1659c();
        if (interfaceC0618fM1659c instanceof C0640m) {
            this.f5659b = C0640m.m1561a(interfaceC0618fM1659c).m1564b();
            return;
        }
        C0687a c0687aM1693a = C0687a.m1693a(interfaceC0618fM1659c);
        this.f5659b = c0687aM1693a.m1695a();
        this.f5661d = c0687aM1693a.m1696b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return this.f5659b.equals(bCDSTU4145PrivateKey.f5659b) && m4215d().equals(bCDSTU4145PrivateKey.m4215d());
    }

    public int hashCode() {
        return this.f5659b.hashCode() ^ m4215d().hashCode();
    }
}
