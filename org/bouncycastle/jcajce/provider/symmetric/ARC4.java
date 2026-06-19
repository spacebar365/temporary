package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0898ag;

/* JADX INFO: loaded from: classes.dex */
public final class ARC4 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0898ag(), 0);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("RC4", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6070a = ARC4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.ARC4", f6070a + "$Base");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2617F, "ARC4");
            configurableProvider.mo2853a("Alg.Alias.Cipher.ARCFOUR", "ARC4");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RC4", "ARC4");
            configurableProvider.mo2853a("KeyGenerator.ARC4", f6070a + "$KeyGen");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.RC4", "ARC4");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND128BITRC4", f6070a + "$PBEWithSHAAnd128BitKeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND40BITRC4", f6070a + "$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2693bD, "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2694bE, "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND128BITRC4", f6070a + "$PBEWithSHAAnd128Bit");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND40BITRC4", f6070a + "$PBEWithSHAAnd40Bit");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0674n.f2693bD, "PBEWITHSHAAND128BITRC4");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0674n.f2694bE, "PBEWITHSHAAND40BITRC4");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2693bD, "PBEWITHSHAAND128BITRC4");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2694bE, "PBEWITHSHAAND40BITRC4");
        }
    }

    public static class PBEWithSHAAnd128Bit extends BaseStreamCipher {
        public PBEWithSHAAnd128Bit() {
            super(new C0898ag(), 0, 128, 1);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", InterfaceC0674n.f2693bD, true, 2, 1, 128, 0);
        }
    }

    public static class PBEWithSHAAnd40Bit extends BaseStreamCipher {
        public PBEWithSHAAnd40Bit() {
            super(new C0898ag(), 0, 40, 1);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", InterfaceC0674n.f2693bD, true, 2, 1, 40, 0);
        }
    }

    private ARC4() {
    }
}
