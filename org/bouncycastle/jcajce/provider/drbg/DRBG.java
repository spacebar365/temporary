package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p099m.C1138g;
import org.bouncycastle.p083b.p099m.C1139h;
import org.bouncycastle.p083b.p099m.InterfaceC1135d;
import org.bouncycastle.p083b.p099m.InterfaceC1136e;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class DRBG {

    /* JADX INFO: renamed from: a */
    private static final String f5988a = DRBG.class.getName();

    /* JADX INFO: renamed from: b */
    private static final String[][] f5989b = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    /* JADX INFO: renamed from: c */
    private static final Object[] f5990c = m4377e();

    private static class CoreSecureRandom extends SecureRandom {
        CoreSecureRandom() {
            super((SecureRandomSpi) DRBG.f5990c[1], (Provider) DRBG.f5990c[0]);
        }
    }

    public static class Default extends SecureRandomSpi {

        /* JADX INFO: renamed from: a */
        private static final SecureRandom f5992a = DRBG.m4370a(true);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return f5992a.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            f5992a.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            f5992a.setSeed(bArr);
        }
    }

    private static class HybridRandomProvider extends Provider {
        protected HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    private static class HybridSecureRandom extends SecureRandom {

        /* JADX INFO: renamed from: a */
        private final AtomicBoolean f5993a;

        /* JADX INFO: renamed from: b */
        private final AtomicInteger f5994b;

        /* JADX INFO: renamed from: c */
        private final SecureRandom f5995c;

        /* JADX INFO: renamed from: d */
        private final C1138g f5996d;

        private class SignallingEntropySource implements InterfaceC1135d {

            /* JADX INFO: renamed from: b */
            private final int f5999b;

            /* JADX INFO: renamed from: c */
            private final AtomicReference f6000c = new AtomicReference();

            /* JADX INFO: renamed from: d */
            private final AtomicBoolean f6001d = new AtomicBoolean(false);

            private class EntropyGatherer implements Runnable {

                /* JADX INFO: renamed from: b */
                private final int f6003b;

                EntropyGatherer(int i) {
                    this.f6003b = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    SignallingEntropySource.this.f6000c.set(HybridSecureRandom.this.f5995c.generateSeed(this.f6003b));
                    HybridSecureRandom.this.f5993a.set(true);
                }
            }

            SignallingEntropySource(int i) {
                this.f5999b = (i + 7) / 8;
            }

            @Override // org.bouncycastle.p083b.p099m.InterfaceC1135d
            /* JADX INFO: renamed from: a */
            public final byte[] mo2732a() {
                byte[] bArrGenerateSeed = (byte[]) this.f6000c.getAndSet(null);
                if (bArrGenerateSeed == null || bArrGenerateSeed.length != this.f5999b) {
                    bArrGenerateSeed = HybridSecureRandom.this.f5995c.generateSeed(this.f5999b);
                } else {
                    this.f6001d.set(false);
                }
                if (!this.f6001d.getAndSet(true)) {
                    new Thread(new EntropyGatherer(this.f5999b)).start();
                }
                return bArrGenerateSeed;
            }

            @Override // org.bouncycastle.p083b.p099m.InterfaceC1135d
            /* JADX INFO: renamed from: b */
            public final int mo2733b() {
                return this.f5999b * 8;
            }
        }

        HybridSecureRandom() {
            super(null, new HybridRandomProvider());
            this.f5993a = new AtomicBoolean(false);
            this.f5994b = new AtomicInteger(0);
            this.f5995c = DRBG.m4376d();
            this.f5996d = new C1139h(new InterfaceC1136e() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.1
                @Override // org.bouncycastle.p083b.p099m.InterfaceC1136e
                /* JADX INFO: renamed from: a */
                public final InterfaceC1135d mo2719a(int i) {
                    return HybridSecureRandom.this.new SignallingEntropySource(i);
                }
            }).m2739a(C1560k.m4168d("Bouncy Castle Hybrid Entropy Source")).m2738a(new C0994g(new C0847x()), this.f5995c.generateSeed(32));
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.f5994b.getAndIncrement() > 20 && this.f5993a.getAndSet(false)) {
                this.f5994b.set(0);
                this.f5996d.m2736a();
            }
            this.f5996d.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
            if (this.f5996d != null) {
                this.f5996d.setSeed(j);
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            if (this.f5996d != null) {
                this.f5996d.setSeed(bArr);
            }
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("SecureRandom.DEFAULT", DRBG.f5988a + "$Default");
            configurableProvider.mo2853a("SecureRandom.NONCEANDIV", DRBG.f5988a + "$NonceAndIV");
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {

        /* JADX INFO: renamed from: a */
        private static final SecureRandom f6004a = DRBG.m4370a(false);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return f6004a.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            f6004a.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            f6004a.setSeed(bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4371a(byte[] bArr) {
        return C1535a.m4080a(C1560k.m4168d("Default"), bArr, AbstractC1556g.m4144a(Thread.currentThread().getId()), AbstractC1556g.m4144a(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m4374b(byte[] bArr) {
        return C1535a.m4080a(C1560k.m4168d("Nonce"), bArr, AbstractC1556g.m4151b(Thread.currentThread().getId()), AbstractC1556g.m4151b(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: e */
    private static final Object[] m4377e() {
        for (int i = 0; i < f5989b.length; i++) {
            String[] strArr = f5989b[i];
            try {
                return new Object[]{Class.forName(strArr[0]).newInstance(), Class.forName(strArr[1]).newInstance()};
            } catch (Throwable th) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static SecureRandom m4378f() {
        if (f5990c != null) {
            return new CoreSecureRandom();
        }
        try {
            return new URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception e) {
            return new SecureRandom();
        }
    }

    private static class URLSeededSecureRandom extends SecureRandom {

        /* JADX INFO: renamed from: a */
        private final InputStream f6005a;

        URLSeededSecureRandom(final URL url) {
            super(null, new HybridRandomProvider());
            this.f6005a = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException e) {
                        throw new InternalError("unable to open random source");
                    }
                }
            });
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            final byte[] bArr;
            synchronized (this) {
                bArr = new byte[i];
                final int i2 = 0;
                while (i2 != i) {
                    final int i3 = i - i2;
                    int iIntValue = ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.2
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.security.PrivilegedAction
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public Integer run() {
                            try {
                                return Integer.valueOf(URLSeededSecureRandom.this.f6005a.read(bArr, i2, i3));
                            } catch (IOException e) {
                                throw new InternalError("unable to read random source");
                            }
                        }
                    })).intValue();
                    if (iIntValue < 0) {
                        break;
                    }
                    i2 = iIntValue + i2;
                }
                if (i2 != i) {
                    throw new InternalError("unable to fully read random source");
                }
            }
            return bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ SecureRandom m4370a(boolean z) {
        if (System.getProperty("org.bouncycastle.drbg.entropysource") == null) {
            HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
            return new C1139h(hybridSecureRandom, true).m2739a(z ? m4371a(hybridSecureRandom.generateSeed(16)) : m4374b(hybridSecureRandom.generateSeed(16))).m2737a(new C0847x(), hybridSecureRandom.generateSeed(32), z);
        }
        final String property = System.getProperty("org.bouncycastle.drbg.entropysource");
        InterfaceC1136e interfaceC1136e = (InterfaceC1136e) AccessController.doPrivileged(new PrivilegedAction<InterfaceC1136e>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC1136e run() {
                try {
                    return (InterfaceC1136e) ClassUtil.m4466a(DRBG.class, property).newInstance();
                } catch (Exception e) {
                    throw new IllegalStateException("entropy source " + property + " not created: " + e.getMessage(), e);
                }
            }
        });
        InterfaceC1135d interfaceC1135dMo2719a = interfaceC1136e.mo2719a(128);
        return new C1139h(interfaceC1136e).m2739a(z ? m4371a(interfaceC1135dMo2719a.mo2732a()) : m4374b(interfaceC1135dMo2719a.mo2732a())).m2737a(new C0847x(), C1535a.m4095d(interfaceC1135dMo2719a.mo2732a(), interfaceC1135dMo2719a.mo2732a()), z);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ SecureRandom m4376d() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            /* JADX INFO: renamed from: a */
            private static Boolean m4379a() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
                } catch (Exception e) {
                    return Boolean.FALSE;
                }
            }

            @Override // java.security.PrivilegedAction
            public final /* synthetic */ Boolean run() {
                return m4379a();
            }
        })).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
            /* JADX INFO: renamed from: a */
            private static SecureRandom m4380a() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e) {
                    return DRBG.m4378f();
                }
            }

            @Override // java.security.PrivilegedAction
            public final /* synthetic */ SecureRandom run() {
                return m4380a();
            }
        }) : m4378f();
    }
}
