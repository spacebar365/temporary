package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.p054a.p065j.InterfaceC0635a;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0913av;
import org.bouncycastle.p083b.p089e.C0920bb;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1019d;
import org.bouncycastle.p083b.p093i.C1027l;
import org.bouncycastle.p083b.p093i.C1034s;

/* JADX INFO: loaded from: classes.dex */
public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0913av()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new C0950f(new C1019d(new C0913av(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0913av();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new C0987h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6134a = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.Serpent", f6134a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.Serpent", f6134a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.Serpent", f6134a + "$AlgParams");
            configurableProvider.mo2853a("Cipher.Tnepres", f6134a + "$TECB");
            configurableProvider.mo2853a("KeyGenerator.Tnepres", f6134a + "$TKeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.Tnepres", f6134a + "$TAlgParams");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2354j, f6134a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2358n, f6134a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2362r, f6134a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2355k, f6134a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2359o, f6134a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2363s, f6134a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2357m, f6134a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2361q, f6134a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2365u, f6134a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2356l, f6134a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2360p, f6134a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0635a.f2364t, f6134a + "$OFB");
            m4443b(configurableProvider, "SERPENT", f6134a + "$SerpentGMAC", f6134a + "$KeyGen");
            m4443b(configurableProvider, "TNEPRES", f6134a + "$TSerpentGMAC", f6134a + "$TKeyGen");
            m4444c(configurableProvider, "SERPENT", f6134a + "$Poly1305", f6134a + "$Poly1305KeyGen");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C0950f(new C1034s(new C0913av(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0913av()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new C0978y());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new C0992e(new C1027l(new C0913av())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0920bb();
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new C0987h());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new C0992e(new C1027l(new C0920bb())));
        }
    }

    private Serpent() {
    }
}
