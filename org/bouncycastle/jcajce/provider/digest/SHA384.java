package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p092h.C0998k;

/* JADX INFO: loaded from: classes.dex */
public class SHA384 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0845v());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0845v((C0845v) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0845v()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", 384, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5982a = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SHA-384", f5982a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA384", "SHA-384");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0652b.f2491d, "SHA-384");
            configurableProvider.mo2853a("Mac.OLDHMACSHA384", f5982a + "$OldSHA384");
            configurableProvider.mo2853a("Mac.PBEWITHHMACSHA384", f5982a + "$HashMac");
            m4367a(configurableProvider, "SHA384", f5982a + "$HashMac", f5982a + "$KeyGenerator");
            m4368a(configurableProvider, "SHA384", InterfaceC0674n.f2625N);
        }
    }

    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new C0998k(new C0845v()));
        }
    }

    private SHA384() {
    }
}
