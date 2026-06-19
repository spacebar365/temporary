package org.bouncycastle.jcajce.provider.config;

import java.util.Map;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: loaded from: classes.dex */
public interface ConfigurableProvider {
    /* JADX INFO: renamed from: a */
    void mo2853a(String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo2854a(String str, Map<String, String> map);

    /* JADX INFO: renamed from: a */
    void mo2855a(String str, C0653p c0653p, String str2);

    /* JADX INFO: renamed from: a */
    void mo2856a(C0653p c0653p, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter);

    /* JADX INFO: renamed from: b */
    boolean mo2857b(String str, String str2);
}
