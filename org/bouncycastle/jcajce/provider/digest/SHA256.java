package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class SHA256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0844u());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0844u((C0844u) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0844u()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", 256, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5980a = SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SHA-256", f5980a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA256", "SHA-256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0652b.f2490c, "SHA-256");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHHMACSHA256", f5980a + "$PBEWithMacKeyFactory");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0652b.f2490c, "PBEWITHHMACSHA256");
            configurableProvider.mo2853a("Mac.PBEWITHHMACSHA256", f5980a + "$HashMac");
            m4367a(configurableProvider, "SHA256", f5980a + "$HashMac", f5980a + "$KeyGenerator");
            m4368a(configurableProvider, "SHA256", InterfaceC0674n.f2624M);
            m4368a(configurableProvider, "SHA256", InterfaceC0652b.f2490c);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
        }
    }

    private SHA256() {
    }
}
