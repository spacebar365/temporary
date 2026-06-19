package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0843t());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0843t((C0843t) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0843t()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5979a = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SHA-224", f5979a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA224", "SHA-224");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0652b.f2493f, "SHA-224");
            configurableProvider.mo2853a("Mac.PBEWITHHMACSHA224", f5979a + "$HashMac");
            m4367a(configurableProvider, "SHA224", f5979a + "$HashMac", f5979a + "$KeyGenerator");
            m4368a(configurableProvider, "SHA224", InterfaceC0674n.f2623L);
        }
    }

    private SHA224() {
    }
}
