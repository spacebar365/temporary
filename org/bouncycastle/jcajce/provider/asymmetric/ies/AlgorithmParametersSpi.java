package org.bouncycastle.jcajce.provider.asymmetric.ies;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p103c.p106c.C1219p;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a */
    C1219p f5849a;

    /* JADX INFO: renamed from: a */
    private static boolean m4287a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            C0625g c0625g = new C0625g();
            if (this.f5849a.m2893a() != null) {
                c0625g.m1521a(new C0590bn(false, 0, new C0581be(this.f5849a.m2893a())));
            }
            if (this.f5849a.m2894b() != null) {
                c0625g.m1521a(new C0590bn(false, 1, new C0581be(this.f5849a.m2894b())));
            }
            c0625g.m1521a(new C0640m(this.f5849a.m2895c()));
            if (this.f5849a.m2897e() != null) {
                C0625g c0625g2 = new C0625g();
                c0625g2.m1521a(new C0640m(this.f5849a.m2896d()));
                c0625g2.m1521a(new C0640m(this.f5849a.m2897e()));
                c0625g.m1521a(new C0585bi(c0625g2));
            }
            return new C0585bi(c0625g).m1577a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding IESParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (m4287a(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof C1219p)) {
            throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
        this.f5849a = (C1219p) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            AbstractC0723v abstractC0723v = (AbstractC0723v) AbstractC0686u.m1692b(bArr);
            if (abstractC0723v.mo1484d() == 1) {
                this.f5849a = new C1219p(null, null, C0640m.m1561a(abstractC0723v.mo1482a(0)).m1564b().intValue());
                return;
            }
            if (abstractC0723v.mo1484d() == 2) {
                AbstractC0539ab abstractC0539abM1394a = AbstractC0539ab.m1394a(abstractC0723v.mo1482a(0));
                if (abstractC0539abM1394a.m1396b() == 0) {
                    this.f5849a = new C1219p(AbstractC0655q.m1597a(abstractC0539abM1394a, false).mo1410c(), null, C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b().intValue());
                    return;
                } else {
                    this.f5849a = new C1219p(null, AbstractC0655q.m1597a(abstractC0539abM1394a, false).mo1410c(), C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b().intValue());
                    return;
                }
            }
            if (abstractC0723v.mo1484d() == 3) {
                this.f5849a = new C1219p(AbstractC0655q.m1597a(AbstractC0539ab.m1394a(abstractC0723v.mo1482a(0)), false).mo1410c(), AbstractC0655q.m1597a(AbstractC0539ab.m1394a(abstractC0723v.mo1482a(1)), false).mo1410c(), C0640m.m1561a(abstractC0723v.mo1482a(2)).m1564b().intValue());
            } else if (abstractC0723v.mo1484d() == 4) {
                AbstractC0539ab abstractC0539abM1394a2 = AbstractC0539ab.m1394a(abstractC0723v.mo1482a(0));
                AbstractC0539ab abstractC0539abM1394a3 = AbstractC0539ab.m1394a(abstractC0723v.mo1482a(1));
                AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(abstractC0723v.mo1482a(3));
                this.f5849a = new C1219p(AbstractC0655q.m1597a(abstractC0539abM1394a2, false).mo1410c(), AbstractC0655q.m1597a(abstractC0539abM1394a3, false).mo1410c(), C0640m.m1561a(abstractC0723v.mo1482a(2)).m1564b().intValue(), C0640m.m1561a(abstractC0723vM1708a.mo1482a(0)).m1564b().intValue(), AbstractC0655q.m1596a(abstractC0723vM1708a.mo1482a(1)).mo1410c());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid IES Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!m4287a(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "IES Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        if (cls == C1219p.class || cls == AlgorithmParameterSpec.class) {
            return this.f5849a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }
}
