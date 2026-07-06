package org.bouncycastle.jcajce;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import org.bouncycastle.a.q;
import org.bouncycastle.a.z.m;
import org.bouncycastle.f.a;
import org.bouncycastle.f.j;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCRLStoreSelector<T extends CRL> implements j<T> {
    private final CRLSelector a;
    private final boolean b;
    private final boolean c;
    private final BigInteger d;
    private final byte[] e;
    private final boolean f;

    public Object clone() {
        return this;
    }

    public final boolean a(CRL crl) {
        if (!(crl instanceof X509CRL)) {
            return this.a.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(m.l.b());
            org.bouncycastle.a.m mVarA = extensionValue != null ? org.bouncycastle.a.m.a((Object) q.a(extensionValue).c()) : null;
            if (this.b && mVarA == null) {
                return false;
            }
            if (this.c && mVarA != null) {
                return false;
            }
            if (mVarA != null && this.d != null && mVarA.c().compareTo(this.d) == 1) {
                return false;
            }
            if (this.f) {
                byte[] extensionValue2 = x509crl.getExtensionValue(m.m.b());
                if (this.e == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!a.a(extensionValue2, this.e)) {
                    return false;
                }
            }
            return this.a.match(crl);
        } catch (Exception e) {
            return false;
        }
    }
}
