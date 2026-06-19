package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0947x;

/* JADX INFO: loaded from: classes.dex */
public final class Grain128 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0947x(), 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grain128", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6102a = Grain128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.Grain128", f6102a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.Grain128", f6102a + "$KeyGen");
        }
    }

    private Grain128() {
    }
}
