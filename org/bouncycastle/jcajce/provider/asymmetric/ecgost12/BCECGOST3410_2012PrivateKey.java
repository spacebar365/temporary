package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p061f.C0620b;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p054a.p076u.C0687a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.C1184a;
import org.bouncycastle.p103c.p104a.InterfaceC1186b;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1206c;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1209f;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, InterfaceC1186b, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private String f5757a;

    /* JADX INFO: renamed from: b */
    private transient C0624f f5758b;

    /* JADX INFO: renamed from: c */
    private transient BigInteger f5759c;

    /* JADX INFO: renamed from: d */
    private transient ECParameterSpec f5760d;

    /* JADX INFO: renamed from: e */
    private transient C0558au f5761e;

    /* JADX INFO: renamed from: f */
    private transient PKCS12BagAttributeCarrierImpl f5762f;

    protected BCECGOST3410_2012PrivateKey() {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410_2012PrivateKey(String str, C1052ad c1052ad) {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
        this.f5757a = str;
        this.f5759c = c1052ad.m2565c();
        this.f5760d = null;
    }

    public BCECGOST3410_2012PrivateKey(String str, C1052ad c1052ad, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
        C1122y c1122yB = c1052ad.m2563b();
        this.f5757a = str;
        this.f5759c = c1052ad.m2565c();
        if (eCParameterSpec == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5760d = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yB.m2700b()), c1122yB.m2701c(), c1122yB.m2702d().intValue());
        } else {
            this.f5760d = eCParameterSpec;
        }
        this.f5758b = bCECGOST3410_2012PublicKey.m4261d();
        this.f5761e = m4253a(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(String str, C1052ad c1052ad, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, C1208e c1208e) {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
        C1122y c1122yB = c1052ad.m2563b();
        this.f5757a = str;
        this.f5759c = c1052ad.m2565c();
        if (c1208e == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5760d = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yB.m2700b()), c1122yB.m2701c(), c1122yB.m2702d().intValue());
        } else {
            this.f5760d = new ECParameterSpec(EC5Util.m4314a(c1208e.m2869b()), EC5Util.m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e().intValue());
        }
        this.f5758b = bCECGOST3410_2012PublicKey.m4261d();
        this.f5761e = m4253a(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
        this.f5759c = eCPrivateKeySpec.getS();
        this.f5760d = eCPrivateKeySpec.getParams();
    }

    BCECGOST3410_2012PrivateKey(C0676p c0676p) {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
        m4254a(c0676p);
    }

    public BCECGOST3410_2012PrivateKey(C1209f c1209f) {
        this.f5757a = "ECGOST3410-2012";
        this.f5762f = new PKCS12BagAttributeCarrierImpl();
        this.f5759c = c1209f.m2874b();
        if (c1209f.m2865a() != null) {
            this.f5760d = EC5Util.m4310a(EC5Util.m4314a(c1209f.m2865a().m2869b()), c1209f.m2865a());
        } else {
            this.f5760d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0558au m4253a(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        return C0780u.m1843a(bCECGOST3410_2012PublicKey.getEncoded()).m1846c();
    }

    /* JADX INFO: renamed from: a */
    private void m4254a(C0676p c0676p) {
        AbstractC0686u abstractC0686uMo1358i = c0676p.m1658b().m1784b().mo1358i();
        if ((abstractC0686uMo1358i instanceof AbstractC0723v) && (AbstractC0723v.m1708a((Object) abstractC0686uMo1358i).mo1484d() == 2 || AbstractC0723v.m1708a((Object) abstractC0686uMo1358i).mo1484d() == 3)) {
            this.f5758b = C0624f.m1515a(c0676p.m1658b().m1784b());
            C1206c c1206cM2826a = C1184a.m2826a(C0620b.m1505b(this.f5758b.m1516a()));
            this.f5760d = new C1207d(C0620b.m1505b(this.f5758b.m1516a()), EC5Util.m4314a(c1206cM2826a.m2869b()), EC5Util.m4313a(c1206cM2826a.m2870c()), c1206cM2826a.m2871d(), c1206cM2826a.m2872e());
            InterfaceC0618f interfaceC0618fM1659c = c0676p.m1659c();
            if (interfaceC0618fM1659c instanceof C0640m) {
                this.f5759c = C0640m.m1561a(interfaceC0618fM1659c).m1565c();
                return;
            }
            byte[] bArrMo1410c = AbstractC0655q.m1596a(interfaceC0618fM1659c).mo1410c();
            byte[] bArr = new byte[bArrMo1410c.length];
            for (int i = 0; i != bArrMo1410c.length; i++) {
                bArr[i] = bArrMo1410c[(bArrMo1410c.length - 1) - i];
            }
            this.f5759c = new BigInteger(1, bArr);
            return;
        }
        C0505ab c0505abM1359a = C0505ab.m1359a(c0676p.m1658b().m1784b());
        if (c0505abM1359a.m1360a()) {
            C0653p c0653pM1584a = C0653p.m1584a((Object) c0505abM1359a.m1362c());
            C0507ad c0507adM4325a = ECUtil.m4325a(c0653pM1584a);
            if (c0507adM4325a == null) {
                C1122y c1122yM1504a = C0620b.m1504a(c0653pM1584a);
                AbstractC1381d abstractC1381dM2699a = c1122yM1504a.m2699a();
                c1122yM1504a.m2704f();
                this.f5760d = new C1207d(C0620b.m1505b(c0653pM1584a), EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yM1504a.m2700b()), c1122yM1504a.m2701c(), c1122yM1504a.m2702d());
            } else {
                AbstractC1381d abstractC1381dM1366a = c0507adM4325a.m1366a();
                c0507adM4325a.m1370e();
                this.f5760d = new C1207d(ECUtil.m4333b(c0653pM1584a), EC5Util.m4314a(abstractC1381dM1366a), EC5Util.m4313a(c0507adM4325a.m1367b()), c0507adM4325a.m1368c(), c0507adM4325a.m1369d());
            }
        } else if (c0505abM1359a.m1361b()) {
            this.f5760d = null;
        } else {
            C0507ad c0507adM1365a = C0507ad.m1365a(c0505abM1359a.m1362c());
            AbstractC1381d abstractC1381dM1366a2 = c0507adM1365a.m1366a();
            c0507adM1365a.m1370e();
            this.f5760d = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM1366a2), EC5Util.m4313a(c0507adM1365a.m1367b()), c0507adM1365a.m1368c(), c0507adM1365a.m1369d().intValue());
        }
        InterfaceC0618f interfaceC0618fM1659c2 = c0676p.m1659c();
        if (interfaceC0618fM1659c2 instanceof C0640m) {
            this.f5759c = C0640m.m1561a(interfaceC0618fM1659c2).m1564b();
            return;
        }
        C0687a c0687aM1693a = C0687a.m1693a(interfaceC0618fM1659c2);
        this.f5759c = c0687aM1693a.m1695a();
        this.f5761e = c0687aM1693a.m1696b();
    }

    /* JADX INFO: renamed from: d */
    private C1208e m4255d() {
        return this.f5760d != null ? EC5Util.m4316a(this.f5760d) : C1200a.f4677a.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5762f.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5760d == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5760d);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5762f.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5762f.mo2847b();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1186b
    /* JADX INFO: renamed from: c */
    public final BigInteger mo2828c() {
        return this.f5759c;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5757a;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f5760d;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f5759c;
    }

    public String toString() {
        return ECUtil.m4322a(this.f5757a, this.f5759c, m4255d());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int iM4321a;
        C0505ab c0505ab;
        byte[] bArr;
        boolean z = this.f5759c.bitLength() > 256;
        C0653p c0653p = z ? InterfaceC0685a.f2808h : InterfaceC0685a.f2807g;
        int i = z ? 64 : 32;
        if (this.f5758b != null) {
            byte[] bArr2 = new byte[i];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < i) {
                bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, bArr.length - byteArray.length, byteArray.length);
            } else {
                bArr = byteArray;
            }
            for (int i2 = 0; i2 != i; i2++) {
                bArr2[i2 + 0] = bArr[(bArr.length - 1) - i2];
            }
            try {
                return new C0676p(new C0759a(c0653p, this.f5758b), new C0581be(bArr2)).m1577a("DER");
            } catch (IOException e) {
                return null;
            }
        }
        if (this.f5760d instanceof C1207d) {
            C0653p c0653pM4326a = ECUtil.m4326a(((C1207d) this.f5760d).m2868a());
            if (c0653pM4326a == null) {
                c0653pM4326a = new C0653p(((C1207d) this.f5760d).m2868a());
            }
            C0505ab c0505ab2 = new C0505ab(c0653pM4326a);
            iM4321a = ECUtil.m4321a(C1200a.f4677a, this.f5760d.getOrder(), getS());
            c0505ab = c0505ab2;
        } else if (this.f5760d == null) {
            c0505ab = new C0505ab((AbstractC0642n) C0579bc.f2112a);
            iM4321a = ECUtil.m4321a(C1200a.f4677a, (BigInteger) null, getS());
        } else {
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(this.f5760d.getCurve());
            C0505ab c0505ab3 = new C0505ab(new C0507ad(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, this.f5760d.getGenerator()), this.f5760d.getOrder(), BigInteger.valueOf(this.f5760d.getCofactor()), this.f5760d.getCurve().getSeed()));
            iM4321a = ECUtil.m4321a(C1200a.f4677a, this.f5760d.getOrder(), getS());
            c0505ab = c0505ab3;
        }
        try {
            return new C0676p(new C0759a(c0653p, c0505ab.mo1358i()), (this.f5761e != null ? new C0687a(iM4321a, getS(), this.f5761e, c0505ab) : new C0687a(iM4321a, getS(), c0505ab)).mo1358i()).m1577a("DER");
        } catch (IOException e2) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return this.f5759c.equals(bCECGOST3410_2012PrivateKey.f5759c) && m4255d().equals(bCECGOST3410_2012PrivateKey.m4255d());
    }

    public int hashCode() {
        return this.f5759c.hashCode() ^ m4255d().hashCode();
    }
}
