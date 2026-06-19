package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.p054a.p064i.InterfaceC0633d;
import org.bouncycastle.p083b.p086b.C0820aa;

/* JADX INFO: loaded from: classes.dex */
public class SM3 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0820aa());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0820aa((C0820aa) this.f5965a);
            return digest;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5984a = SM3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SM3", f5984a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SM3", "SM3");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0633d.f2303ab, "SM3");
        }
    }

    private SM3() {
    }
}
