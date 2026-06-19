package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p092h.C1000m;

/* JADX INFO: loaded from: classes.dex */
public final class SipHash {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new C0987h());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new C1000m());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new C1000m((byte) 0));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6136a = SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Mac.SIPHASH-2-4", f6136a + "$Mac24");
            configurableProvider.mo2853a("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
            configurableProvider.mo2853a("Mac.SIPHASH-4-8", f6136a + "$Mac48");
            configurableProvider.mo2853a("KeyGenerator.SIPHASH", f6136a + "$KeyGen");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }

    private SipHash() {
    }
}
