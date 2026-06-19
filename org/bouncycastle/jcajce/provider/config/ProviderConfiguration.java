package org.bouncycastle.jcajce.provider.config;

import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.p103c.p106c.C1208e;

/* JADX INFO: loaded from: classes.dex */
public interface ProviderConfiguration {
    /* JADX INFO: renamed from: a */
    DHParameterSpec mo2858a(int i);

    /* JADX INFO: renamed from: a */
    C1208e mo2859a();

    /* JADX INFO: renamed from: b */
    DSAParameterSpec mo2860b(int i);

    /* JADX INFO: renamed from: b */
    Set mo2861b();

    /* JADX INFO: renamed from: c */
    Map mo2862c();
}
