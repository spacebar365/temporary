package org.bouncycastle.p103c.p105b;

import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p103c.p106c.C1208e;

/* JADX INFO: renamed from: org.bouncycastle.c.b.c */
/* JADX INFO: loaded from: classes.dex */
final class C1202c implements ProviderConfiguration {

    /* JADX INFO: renamed from: a */
    private static Permission f4689a = new ProviderConfigurationPermission("BC", "threadLocalEcImplicitlyCa");

    /* JADX INFO: renamed from: b */
    private static Permission f4690b = new ProviderConfigurationPermission("BC", "ecImplicitlyCa");

    /* JADX INFO: renamed from: c */
    private static Permission f4691c = new ProviderConfigurationPermission("BC", "threadLocalDhDefaultParams");

    /* JADX INFO: renamed from: d */
    private static Permission f4692d = new ProviderConfigurationPermission("BC", "DhDefaultParams");

    /* JADX INFO: renamed from: e */
    private static Permission f4693e = new ProviderConfigurationPermission("BC", "acceptableEcCurves");

    /* JADX INFO: renamed from: f */
    private static Permission f4694f = new ProviderConfigurationPermission("BC", "additionalEcParameters");

    /* JADX INFO: renamed from: i */
    private volatile C1208e f4697i;

    /* JADX INFO: renamed from: j */
    private volatile Object f4698j;

    /* JADX INFO: renamed from: g */
    private ThreadLocal f4695g = new ThreadLocal();

    /* JADX INFO: renamed from: h */
    private ThreadLocal f4696h = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    private volatile Set f4699k = new HashSet();

    /* JADX INFO: renamed from: l */
    private volatile Map f4700l = new HashMap();

    C1202c() {
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    /* JADX INFO: renamed from: a */
    public final DHParameterSpec mo2858a(int i) {
        Object obj = this.f4696h.get();
        if (obj == null) {
            obj = this.f4698j;
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
        C1106i c1106i = (C1106i) C1124l.m2708a(C1124l.a.f4522b, i);
        if (c1106i != null) {
            return new DHDomainParameterSpec(c1106i);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    /* JADX INFO: renamed from: a */
    public final C1208e mo2859a() {
        C1208e c1208e = (C1208e) this.f4695g.get();
        return c1208e != null ? c1208e : this.f4697i;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    /* JADX INFO: renamed from: b */
    public final DSAParameterSpec mo2860b(int i) {
        C1115r c1115r = (C1115r) C1124l.m2708a(C1124l.a.f4523c, i);
        if (c1115r != null) {
            return new DSAParameterSpec(c1115r.m2686a(), c1115r.m2687b(), c1115r.m2688c());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    /* JADX INFO: renamed from: b */
    public final Set mo2861b() {
        return Collections.unmodifiableSet(this.f4699k);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    /* JADX INFO: renamed from: c */
    public final Map mo2862c() {
        return Collections.unmodifiableMap(this.f4700l);
    }
}
