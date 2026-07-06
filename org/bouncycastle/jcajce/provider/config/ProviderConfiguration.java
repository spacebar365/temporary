package org.bouncycastle.jcajce.provider.config;

import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.c.c.e;

/* JADX INFO: loaded from: classes.dex */
public interface ProviderConfiguration {
    DHParameterSpec a(int i);

    e a();

    DSAParameterSpec b(int i);

    Set b();

    Map c();
}
