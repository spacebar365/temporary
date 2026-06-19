package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.p054a.p066k.InterfaceC0637a;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class SHA1 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0842s());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0842s((C0842s) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0842s()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", 160, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5978a = SHA1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SHA-1", f5978a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA", "SHA-1");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0659b.f2575i, "SHA-1");
            m4367a(configurableProvider, "SHA1", f5978a + "$HashMac", f5978a + "$KeyGenerator");
            m4368a(configurableProvider, "SHA1", InterfaceC0674n.f2622K);
            m4368a(configurableProvider, "SHA1", InterfaceC0637a.f2385o);
            configurableProvider.mo2853a("Mac.PBEWITHHMACSHA", f5978a + "$SHA1Mac");
            configurableProvider.mo2853a("Mac.PBEWITHHMACSHA1", f5978a + "$SHA1Mac");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0659b.f2575i, "PBEWITHHMACSHA1");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0659b.f2575i, "PBEWITHHMACSHA");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHHMACSHA1", f5978a + "$PBEWithMacKeyFactory");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new C0994g(new C0842s()));
        }
    }

    private SHA1() {
    }
}
