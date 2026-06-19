package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p116b.InterfaceC1412g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ad */
/* JADX INFO: loaded from: classes.dex */
public class C0507ad extends AbstractC0650o implements InterfaceC0513aj {

    /* JADX INFO: renamed from: ap */
    private static final BigInteger f1886ap = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: aq */
    private C0511ah f1887aq;

    /* JADX INFO: renamed from: ar */
    private AbstractC1381d f1888ar;

    /* JADX INFO: renamed from: as */
    private C0509af f1889as;

    /* JADX INFO: renamed from: at */
    private BigInteger f1890at;

    /* JADX INFO: renamed from: au */
    private BigInteger f1891au;

    /* JADX INFO: renamed from: av */
    private byte[] f1892av;

    private C0507ad(AbstractC0723v abstractC0723v) {
        if (!(abstractC0723v.mo1482a(0) instanceof C0640m) || !((C0640m) abstractC0723v.mo1482a(0)).m1564b().equals(f1886ap)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f1890at = ((C0640m) abstractC0723v.mo1482a(4)).m1564b();
        if (abstractC0723v.mo1484d() == 6) {
            this.f1891au = ((C0640m) abstractC0723v.mo1482a(5)).m1564b();
        }
        C0506ac c0506ac = new C0506ac(C0511ah.m1373a(abstractC0723v.mo1482a(1)), this.f1890at, this.f1891au, AbstractC0723v.m1708a(abstractC0723v.mo1482a(2)));
        this.f1888ar = c0506ac.m1363a();
        InterfaceC0618f interfaceC0618fMo1482a = abstractC0723v.mo1482a(3);
        if (interfaceC0618fMo1482a instanceof C0509af) {
            this.f1889as = (C0509af) interfaceC0618fMo1482a;
        } else {
            this.f1889as = new C0509af(this.f1888ar, (AbstractC0655q) interfaceC0618fMo1482a);
        }
        this.f1892av = c0506ac.m1364b();
    }

    public C0507ad(AbstractC1381d abstractC1381d, C0509af c0509af, BigInteger bigInteger, BigInteger bigInteger2) {
        this(abstractC1381d, c0509af, bigInteger, bigInteger2, (byte[]) null);
    }

    public C0507ad(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(abstractC1381d, new C0509af(abstractC1389j), bigInteger, bigInteger2, bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1365a(Object obj) {
        if (obj != null) {
            return new C0507ad(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1381d m1366a() {
        return this.f1888ar;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1389j m1367b() {
        return this.f1889as.m1372a();
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1368c() {
        return this.f1890at;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m1369d() {
        return this.f1891au;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m1370e() {
        return C1535a.m4086b(this.f1892av);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(f1886ap));
        c0625g.m1521a(this.f1887aq);
        c0625g.m1521a(new C0506ac(this.f1888ar, this.f1892av));
        c0625g.m1521a(this.f1889as);
        c0625g.m1521a(new C0640m(this.f1890at));
        if (this.f1891au != null) {
            c0625g.m1521a(new C0640m(this.f1891au));
        }
        return new C0585bi(c0625g);
    }

    public C0507ad(AbstractC1381d abstractC1381d, C0509af c0509af, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f1888ar = abstractC1381d;
        this.f1889as = c0509af;
        this.f1890at = bigInteger;
        this.f1891au = bigInteger2;
        this.f1892av = C1535a.m4086b(bArr);
        if (C1371b.m3280b(abstractC1381d.m3365f())) {
            this.f1887aq = new C0511ah(abstractC1381d.m3365f().mo3552a());
            return;
        }
        if (!C1371b.m3278a(abstractC1381d.m3365f())) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        int[] iArrMo3557b = ((InterfaceC1412g) abstractC1381d.m3365f()).mo3558c().mo3557b();
        if (iArrMo3557b.length == 3) {
            this.f1887aq = new C0511ah(iArrMo3557b[2], iArrMo3557b[1]);
        } else {
            if (iArrMo3557b.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
            this.f1887aq = new C0511ah(iArrMo3557b[4], iArrMo3557b[1], iArrMo3557b[2], iArrMo3557b[3]);
        }
    }
}
