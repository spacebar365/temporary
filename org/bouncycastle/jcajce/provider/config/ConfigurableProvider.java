package org.bouncycastle.jcajce.provider.config;

import java.util.Map;
import org.bouncycastle.a.p;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes.dex */
public interface ConfigurableProvider {
    void a(String str, String str2);

    void a(String str, Map<String, String> map);

    void a(String str, p pVar, String str2);

    void a(p pVar, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter);

    boolean b(String str, String str2);
}
