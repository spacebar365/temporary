package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class TLSKDF {

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6139a = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("SecretKeyFactory.TLS10KDF", f6139a + "$TLS10");
            configurableProvider.mo2853a("SecretKeyFactory.TLS11KDF", f6139a + "$TLS11");
            configurableProvider.mo2853a("SecretKeyFactory.TLS12WITHSHA256KDF", f6139a + "$TLS12withSHA256");
            configurableProvider.mo2853a("SecretKeyFactory.TLS12WITHSHA384KDF", f6139a + "$TLS12withSHA384");
            configurableProvider.mo2853a("SecretKeyFactory.TLS12WITHSHA512KDF", f6139a + "$TLS12withSHA512");
        }
    }

    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(TLSKDF.m4446a((TLSKeyMaterialSpec) keySpec), this.f6188a);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(TLSKDF.m4446a((TLSKeyMaterialSpec) keySpec), this.f6188a);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new C0994g(new C0844u()));
        }
    }

    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new C0994g(new C0845v()));
        }
    }

    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new C0994g(new C0847x()));
        }
    }

    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        protected TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m4447b(InterfaceC1183z interfaceC1183z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        interfaceC1183z.mo2449a(new C1076ba(bArr));
        int iMo2451b = interfaceC1183z.mo2451b();
        int length = ((bArr3.length + iMo2451b) - 1) / iMo2451b;
        byte[] bArr4 = new byte[interfaceC1183z.mo2451b()];
        byte[] bArr5 = new byte[interfaceC1183z.mo2451b()];
        int i = 0;
        byte[] bArr6 = bArr2;
        while (i < length) {
            interfaceC1183z.mo2450a(bArr6, 0, bArr6.length);
            interfaceC1183z.mo2446a(bArr4, 0);
            interfaceC1183z.mo2450a(bArr4, 0, bArr4.length);
            interfaceC1183z.mo2450a(bArr2, 0, bArr2.length);
            interfaceC1183z.mo2446a(bArr5, 0);
            System.arraycopy(bArr5, 0, bArr3, iMo2451b * i, Math.min(iMo2451b, bArr3.length - (iMo2451b * i)));
            i++;
            bArr6 = bArr4;
        }
    }

    public static class TLS12 extends TLSKeyMaterialFactory {

        /* JADX INFO: renamed from: c */
        private final InterfaceC1183z f6140c;

        protected TLS12(String str, InterfaceC1183z interfaceC1183z) {
            super(str);
            this.f6140c = interfaceC1183z;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof TLSKeyMaterialSpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            TLSKeyMaterialSpec tLSKeyMaterialSpec = (TLSKeyMaterialSpec) keySpec;
            InterfaceC1183z interfaceC1183z = this.f6140c;
            byte[] bArrM4095d = C1535a.m4095d(C1560k.m4168d(tLSKeyMaterialSpec.m4513a()), tLSKeyMaterialSpec.m4516d());
            byte[] bArrM4515c = tLSKeyMaterialSpec.m4515c();
            byte[] bArr = new byte[tLSKeyMaterialSpec.m4514b()];
            TLSKDF.m4447b(interfaceC1183z, bArrM4515c, bArrM4095d, bArr);
            return new SecretKeySpec(bArr, this.f6188a);
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ byte[] m4446a(TLSKeyMaterialSpec tLSKeyMaterialSpec) {
        C0994g c0994g = new C0994g(new C0836m());
        C0994g c0994g2 = new C0994g(new C0842s());
        byte[] bArrM4095d = C1535a.m4095d(C1560k.m4168d(tLSKeyMaterialSpec.m4513a()), tLSKeyMaterialSpec.m4516d());
        byte[] bArrM4515c = tLSKeyMaterialSpec.m4515c();
        int length = (bArrM4515c.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrM4515c, 0, bArr, 0, length);
        System.arraycopy(bArrM4515c, bArrM4515c.length - length, bArr2, 0, length);
        int iM4514b = tLSKeyMaterialSpec.m4514b();
        byte[] bArr3 = new byte[iM4514b];
        byte[] bArr4 = new byte[iM4514b];
        m4447b(c0994g, bArr, bArrM4095d, bArr3);
        m4447b(c0994g2, bArr2, bArrM4095d, bArr4);
        for (int i = 0; i < iM4514b; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr4[i]);
        }
        return bArr3;
    }
}
