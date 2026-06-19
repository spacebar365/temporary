package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
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
public class BCECGOST3410_2012PublicKey implements ECPublicKey, InterfaceC1187c {

    /* JADX INFO: renamed from: a */
    private String f5763a;

    /* JADX INFO: renamed from: b */
    private transient C1053ae f5764b;

    /* JADX INFO: renamed from: c */
    private transient ECParameterSpec f5765c;

    /* JADX INFO: renamed from: d */
    private transient C0624f f5766d;

    public BCECGOST3410_2012PublicKey(String str, C1053ae c1053ae) {
        this.f5763a = "ECGOST3410-2012";
        this.f5763a = str;
        this.f5764b = c1053ae;
        this.f5765c = null;
    }

    public BCECGOST3410_2012PublicKey(String str, C1053ae c1053ae, ECParameterSpec eCParameterSpec) {
        this.f5763a = "ECGOST3410-2012";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5763a = str;
        this.f5764b = c1053ae;
        if (c1122yB instanceof C1123z) {
            C1123z c1123z = (C1123z) c1122yB;
            this.f5766d = new C0624f(c1123z.m2705g(), c1123z.m2706h(), c1123z.m2707i());
        }
        if (eCParameterSpec != null) {
            this.f5765c = eCParameterSpec;
            return;
        }
        AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
        c1122yB.m2704f();
        this.f5765c = m4256a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
    }

    public BCECGOST3410_2012PublicKey(String str, C1053ae c1053ae, C1208e c1208e) {
        this.f5763a = "ECGOST3410-2012";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5763a = str;
        this.f5764b = c1053ae;
        if (c1208e != null) {
            this.f5765c = EC5Util.m4310a(EC5Util.m4314a(c1208e.m2869b()), c1208e);
            return;
        }
        AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
        c1122yB.m2704f();
        this.f5765c = m4256a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f5763a = "ECGOST3410-2012";
        this.f5765c = eCPublicKeySpec.getParams();
        this.f5764b = new C1053ae(EC5Util.m4319a(this.f5765c, eCPublicKeySpec.getW()), EC5Util.m4315a((ProviderConfiguration) null, eCPublicKeySpec.getParams()));
    }

    BCECGOST3410_2012PublicKey(C0780u c0780u) {
        this.f5763a = "ECGOST3410-2012";
        m4257a(c0780u);
    }

    /* JADX INFO: renamed from: a */
    private static ECParameterSpec m4256a(EllipticCurve ellipticCurve, C1122y c1122y) {
        return new ECParameterSpec(ellipticCurve, EC5Util.m4313a(c1122y.m2700b()), c1122y.m2701c(), c1122y.m2702d().intValue());
    }

    /* JADX INFO: renamed from: a */
    private void m4257a(C0780u c0780u) {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        C0558au c0558auM1846c = c0780u.m1846c();
        this.f5763a = "ECGOST3410-2012";
        try {
            byte[] bArrMo1410c = ((AbstractC0655q) AbstractC0686u.m1692b(c0558auM1846c.m1474d())).mo1410c();
            int i = c0653pM1783a.equals(InterfaceC0685a.f2808h) ? 64 : 32;
            int i2 = i * 2;
            byte[] bArr = new byte[i2 + 1];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = bArrMo1410c[i - i3];
                bArr[i3 + i] = bArrMo1410c[i2 - i3];
            }
            this.f5766d = C0624f.m1515a(c0780u.m1844a().m1784b());
            C1206c c1206cM2826a = C1184a.m2826a(C0620b.m1505b(this.f5766d.m1516a()));
            AbstractC1381d abstractC1381dB = c1206cM2826a.m2869b();
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(abstractC1381dB);
            this.f5764b = new C1053ae(abstractC1381dB.m3357a(bArr), ECUtil.m4331a((ProviderConfiguration) null, c1206cM2826a));
            this.f5765c = new C1207d(C0620b.m1505b(this.f5766d.m1516a()), ellipticCurveM4314a, EC5Util.m4313a(c1206cM2826a.m2870c()), c1206cM2826a.m2871d(), c1206cM2826a.m2872e());
        } catch (IOException e) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4258a(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] bArr2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
        } else {
            bArr2 = byteArray;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = bArr2[(bArr2.length - 1) - i3];
        }
    }

    /* JADX INFO: renamed from: e */
    private C1208e m4259e() {
        return this.f5765c != null ? EC5Util.m4316a(this.f5765c) : C1200a.f4677a.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5765c == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5765c);
    }

    /* JADX INFO: renamed from: b */
    final C1053ae m4260b() {
        return this.f5764b;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1187c
    /* JADX INFO: renamed from: c */
    public final AbstractC1389j mo2829c() {
        return this.f5765c == null ? this.f5764b.m2566c().m3456c() : this.f5764b.m2566c();
    }

    /* JADX INFO: renamed from: d */
    public final C0624f m4261d() {
        if (this.f5766d == null && (this.f5765c instanceof C1207d)) {
            if (this.f5764b.m2566c().m3461g().mo2928a().bitLength() > 256) {
                this.f5766d = new C0624f(C0620b.m1506b(((C1207d) this.f5765c).m2868a()), InterfaceC0685a.f2804d);
            } else {
                this.f5766d = new C0624f(C0620b.m1506b(((C1207d) this.f5765c).m2868a()), InterfaceC0685a.f2803c);
            }
        }
        return this.f5766d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.f5764b.m2566c().m3450a(bCECGOST3410_2012PublicKey.f5764b.m2566c()) && m4259e().equals(bCECGOST3410_2012PublicKey.m4259e());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5763a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        InterfaceC0618f c0505ab;
        int i;
        C0653p c0653p;
        int i2;
        BigInteger bigIntegerMo2928a = this.f5764b.m2566c().m3461g().mo2928a();
        BigInteger bigIntegerMo2928a2 = this.f5764b.m2566c().m3462h().mo2928a();
        boolean z = bigIntegerMo2928a.bitLength() > 256;
        C0624f c0624fM4261d = m4261d();
        if (c0624fM4261d != null) {
            c0505ab = c0624fM4261d;
        } else if (this.f5765c instanceof C1207d) {
            c0505ab = z ? new C0624f(C0620b.m1506b(((C1207d) this.f5765c).m2868a()), InterfaceC0685a.f2804d) : new C0624f(C0620b.m1506b(((C1207d) this.f5765c).m2868a()), InterfaceC0685a.f2803c);
        } else {
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(this.f5765c.getCurve());
            c0505ab = new C0505ab(new C0507ad(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, this.f5765c.getGenerator()), this.f5765c.getOrder(), BigInteger.valueOf(this.f5765c.getCofactor()), this.f5765c.getCurve().getSeed()));
        }
        if (z) {
            i2 = 128;
            c0653p = InterfaceC0685a.f2808h;
            i = 64;
        } else {
            i = 32;
            c0653p = InterfaceC0685a.f2807g;
            i2 = 64;
        }
        byte[] bArr = new byte[i2];
        m4258a(bArr, i2 / 2, 0, bigIntegerMo2928a);
        m4258a(bArr, i2 / 2, i, bigIntegerMo2928a2);
        try {
            return KeyUtil.m4340a(new C0780u(new C0759a(c0653p, c0505ab), new C0581be(bArr)));
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
        return this.f5765c;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.m4313a(this.f5764b.m2566c());
    }

    public int hashCode() {
        return this.f5764b.m2566c().hashCode() ^ m4259e().hashCode();
    }

    public String toString() {
        return ECUtil.m4323a(this.f5763a, this.f5764b.m2566c(), m4259e());
    }

    public BCECGOST3410_2012PublicKey(C1210g c1210g, ProviderConfiguration providerConfiguration) {
        this.f5763a = "ECGOST3410-2012";
        if (c1210g.m2865a() == null) {
            this.f5764b = new C1053ae(providerConfiguration.mo2859a().m2869b().mo3355a(c1210g.m2875b().m3461g().mo2928a(), c1210g.m2875b().m3462h().mo2928a(), false), EC5Util.m4315a(providerConfiguration, (ECParameterSpec) null));
            this.f5765c = null;
        } else {
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(c1210g.m2865a().m2869b());
            this.f5764b = new C1053ae(c1210g.m2875b(), ECUtil.m4331a(providerConfiguration, c1210g.m2865a()));
            this.f5765c = EC5Util.m4310a(ellipticCurveM4314a, c1210g.m2865a());
        }
    }
}
