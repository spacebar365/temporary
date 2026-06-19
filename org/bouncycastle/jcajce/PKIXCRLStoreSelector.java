package org.bouncycastle.jcajce;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0772m;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1559j;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCRLStoreSelector<T extends CRL> implements InterfaceC1559j<T> {

    /* JADX INFO: renamed from: a */
    private final CRLSelector f5565a;

    /* JADX INFO: renamed from: b */
    private final boolean f5566b;

    /* JADX INFO: renamed from: c */
    private final boolean f5567c;

    /* JADX INFO: renamed from: d */
    private final BigInteger f5568d;

    /* JADX INFO: renamed from: e */
    private final byte[] f5569e;

    /* JADX INFO: renamed from: f */
    private final boolean f5570f;

    public static class Builder {
    }

    private static class SelectorClone extends X509CRLSelector {

        /* JADX INFO: renamed from: a */
        private final PKIXCRLStoreSelector f5571a;

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            return this.f5571a == null ? crl != null : this.f5571a.m4183a(crl);
        }
    }

    public Object clone() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4183a(CRL crl) {
        if (!(crl instanceof X509CRL)) {
            return this.f5565a.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C0772m.f3184l.m1593b());
            C0640m c0640mM1561a = extensionValue != null ? C0640m.m1561a((Object) AbstractC0655q.m1596a(extensionValue).mo1410c()) : null;
            if (this.f5566b && c0640mM1561a == null) {
                return false;
            }
            if (this.f5567c && c0640mM1561a != null) {
                return false;
            }
            if (c0640mM1561a != null && this.f5568d != null && c0640mM1561a.m1565c().compareTo(this.f5568d) == 1) {
                return false;
            }
            if (this.f5570f) {
                byte[] extensionValue2 = x509crl.getExtensionValue(C0772m.f3185m.m1593b());
                if (this.f5569e == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!C1535a.m4076a(extensionValue2, this.f5569e)) {
                    return false;
                }
            }
            return this.f5565a.match(crl);
        } catch (Exception e) {
            return false;
        }
    }
}
