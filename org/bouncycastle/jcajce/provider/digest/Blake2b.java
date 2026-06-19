package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p083b.p086b.C0819a;

/* JADX INFO: loaded from: classes.dex */
public class Blake2b {

    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new C0819a(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.f5965a = new C0819a((C0819a) this.f5965a);
            return blake2b160;
        }
    }

    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new C0819a(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.f5965a = new C0819a((C0819a) this.f5965a);
            return blake2b256;
        }
    }

    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new C0819a(384));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.f5965a = new C0819a((C0819a) this.f5965a);
            return blake2b384;
        }
    }

    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new C0819a(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.f5965a = new C0819a((C0819a) this.f5965a);
            return blake2b512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5966a = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.BLAKE2B-512", f5966a + "$Blake2b512");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2414G, "BLAKE2B-512");
            configurableProvider.mo2853a("MessageDigest.BLAKE2B-384", f5966a + "$Blake2b384");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2413F, "BLAKE2B-384");
            configurableProvider.mo2853a("MessageDigest.BLAKE2B-256", f5966a + "$Blake2b256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2412E, "BLAKE2B-256");
            configurableProvider.mo2853a("MessageDigest.BLAKE2B-160", f5966a + "$Blake2b160");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2411D, "BLAKE2B-160");
        }
    }

    private Blake2b() {
    }
}
