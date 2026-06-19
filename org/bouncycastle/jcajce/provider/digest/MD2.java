package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0834k;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class MD2 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0834k());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0834k((C0834k) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0834k()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD2", 128, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5971a = MD2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.MD2", f5971a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0674n.f2619H, "MD2");
            m4367a(configurableProvider, "MD2", f5971a + "$HashMac", f5971a + "$KeyGenerator");
        }
    }

    private MD2() {
    }
}
