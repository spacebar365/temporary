package org.bouncycastle.jcajce.provider.drbg;

import java.net.URL;
import java.security.AccessController;
import java.security.SecureRandom;
import java.security.Security;
import org.bouncycastle.b.b.x;
import org.bouncycastle.b.m.d;
import org.bouncycastle.b.m.e;
import org.bouncycastle.b.m.h;
import org.bouncycastle.f.a;
import org.bouncycastle.f.g;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public class DRBG {
    private static final String a = DRBG.class.getName();
    private static final String[][] b = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    private static final Object[] c = e();

    private static byte[] a(byte[] bArr) {
        return a.a(k.d("Default"), bArr, g.a(Thread.currentThread().getId()), g.a(System.currentTimeMillis()));
    }

    static /* synthetic */ Object[] a() {
        return c;
    }

    static /* synthetic */ SecureRandom b() {
        return f();
    }

    private static byte[] b(byte[] bArr) {
        return a.a(k.d("Nonce"), bArr, g.b(Thread.currentThread().getId()), g.b(System.currentTimeMillis()));
    }

    static /* synthetic */ String c() {
        return a;
    }

    private static final Object[] e() {
        for (int i = 0; i < b.length; i++) {
            String[] strArr = b[i];
            try {
                return new Object[]{Class.forName(strArr[0]).newInstance(), Class.forName(strArr[1]).newInstance()};
            } catch (Throwable th) {
            }
        }
        return null;
    }

    private static SecureRandom f() {
        if (c != null) {
            return new DRBG$CoreSecureRandom();
        }
        try {
            return new DRBG$URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception e) {
            return new SecureRandom();
        }
    }

    static /* synthetic */ SecureRandom a(boolean z) {
        if (System.getProperty("org.bouncycastle.drbg.entropysource") == null) {
            DRBG$HybridSecureRandom dRBG$HybridSecureRandom = new DRBG$HybridSecureRandom();
            return new h(dRBG$HybridSecureRandom, true).a(z ? a(dRBG$HybridSecureRandom.generateSeed(16)) : b(dRBG$HybridSecureRandom.generateSeed(16))).a(new x(), dRBG$HybridSecureRandom.generateSeed(32), z);
        }
        e eVar = (e) AccessController.doPrivileged(new DRBG$3(System.getProperty("org.bouncycastle.drbg.entropysource")));
        d dVarA = eVar.a(128);
        return new h(eVar).a(z ? a(dVarA.a()) : b(dVarA.a())).a(new x(), a.d(dVarA.a(), dVarA.a()), z);
    }

    static /* synthetic */ SecureRandom d() {
        return ((Boolean) AccessController.doPrivileged(new DRBG$1())).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new DRBG$2()) : f();
    }
}
