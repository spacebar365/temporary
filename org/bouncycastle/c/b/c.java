package org.bouncycastle.c.b;

import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.r;
import org.bouncycastle.b.l;
import org.bouncycastle.b.l$a;
import org.bouncycastle.c.c.e;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;

/* JADX INFO: loaded from: classes.dex */
final class c implements ProviderConfiguration {
    private static Permission a = new ProviderConfigurationPermission("BC", "threadLocalEcImplicitlyCa");
    private static Permission b = new ProviderConfigurationPermission("BC", "ecImplicitlyCa");
    private static Permission c = new ProviderConfigurationPermission("BC", "threadLocalDhDefaultParams");
    private static Permission d = new ProviderConfigurationPermission("BC", "DhDefaultParams");
    private static Permission e = new ProviderConfigurationPermission("BC", "acceptableEcCurves");
    private static Permission f = new ProviderConfigurationPermission("BC", "additionalEcParameters");
    private volatile e i;
    private volatile Object j;
    private ThreadLocal g = new ThreadLocal();
    private ThreadLocal h = new ThreadLocal();
    private volatile Set k = new HashSet();
    private volatile Map l = new HashMap();

    c() {
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final DHParameterSpec a(int i) {
        Object obj = this.h.get();
        if (obj == null) {
            obj = this.j;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i2 = 0; i2 != dHParameterSpecArr.length; i2++) {
                if (dHParameterSpecArr[i2].getP().bitLength() == i) {
                    return dHParameterSpecArr[i2];
                }
            }
        }
        i iVar = (i) l.a(l$a.b, i);
        if (iVar != null) {
            return new DHDomainParameterSpec(iVar);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final e a() {
        e eVar = (e) this.g.get();
        return eVar != null ? eVar : this.i;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final DSAParameterSpec b(int i) {
        r rVar = (r) l.a(l$a.c, i);
        if (rVar != null) {
            return new DSAParameterSpec(rVar.a(), rVar.b(), rVar.c());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final Set b() {
        return Collections.unmodifiableSet(this.k);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final Map c() {
        return Collections.unmodifiableMap(this.l);
    }
}
