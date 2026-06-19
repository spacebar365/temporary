package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0999l;

/* JADX INFO: loaded from: classes.dex */
public class Poly1305 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new C0978y());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C0999l());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6119a = Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Mac.POLY1305", f6119a + "$Mac");
            configurableProvider.mo2853a("KeyGenerator.POLY1305", f6119a + "$KeyGen");
        }
    }

    private Poly1305() {
    }
}
