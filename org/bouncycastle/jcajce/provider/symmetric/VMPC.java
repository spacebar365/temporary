package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0922bd;
import org.bouncycastle.p083b.p092h.C1002o;

/* JADX INFO: loaded from: classes.dex */
public final class VMPC {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0922bd(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC", 128, new C0987h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C1002o());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6143a = VMPC.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.VMPC", f6143a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.VMPC", f6143a + "$KeyGen");
            configurableProvider.mo2853a("Mac.VMPCMAC", f6143a + "$Mac");
            configurableProvider.mo2853a("Alg.Alias.Mac.VMPC", "VMPCMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }

    private VMPC() {
    }
}
