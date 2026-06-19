package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p086b.C0823ad;
import org.bouncycastle.p083b.p086b.C0827d;
import org.bouncycastle.p083b.p086b.C0834k;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p090f.C0974u;
import org.bouncycastle.p083b.p090f.C0975v;
import org.bouncycastle.p083b.p090f.C0976w;
import org.bouncycastle.p083b.p090f.C0977x;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1100c;
import org.bouncycastle.p083b.p102o.C1164a;

/* JADX INFO: loaded from: classes.dex */
public interface PBE {

    public static class Util {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1003i m4468a(SecretKey secretKey, int i, int i2, PBEParameterSpec pBEParameterSpec) {
            AbstractC0804ad abstractC0804adM4467a = m4467a(2, i);
            byte[] encoded = secretKey.getEncoded();
            abstractC0804adM4467a.m1899a(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC1003i interfaceC1003iMo1900b = abstractC0804adM4467a.mo1900b(i2);
            for (int i3 = 0; i3 != encoded.length; i3++) {
                encoded[i3] = 0;
            }
            return interfaceC1003iMo1900b;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1003i m4469a(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            AbstractC0804ad abstractC0804adM4467a = m4467a(i, i2);
            byte[] bArrM4474a = m4474a(i, pBEKeySpec);
            abstractC0804adM4467a.m1899a(bArrM4474a, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            InterfaceC1003i interfaceC1003iMo1900b = abstractC0804adM4467a.mo1900b(i3);
            for (int i4 = 0; i4 != bArrM4474a.length; i4++) {
                bArrM4474a[i4] = 0;
            }
            return interfaceC1003iMo1900b;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1003i m4470a(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            AbstractC0804ad abstractC0804adM4467a = m4467a(i, i2);
            byte[] bArrM4474a = m4474a(i, pBEKeySpec);
            abstractC0804adM4467a.m1899a(bArrM4474a, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            InterfaceC1003i interfaceC1003iMo1898a = i4 != 0 ? abstractC0804adM4467a.mo1898a(i3, i4) : abstractC0804adM4467a.mo1897a(i3);
            for (int i5 = 0; i5 != bArrM4474a.length; i5++) {
                bArrM4474a[i5] = 0;
            }
            return interfaceC1003iMo1898a;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1003i m4473a(byte[] bArr, int i, int i2, int i3, int i4, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC0804ad abstractC0804adM4467a = m4467a(i, i2);
            abstractC0804adM4467a.m1899a(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC1003i interfaceC1003iMo1898a = i4 != 0 ? abstractC0804adM4467a.mo1898a(i3, i4) : abstractC0804adM4467a.mo1897a(i3);
            if (str.startsWith("DES")) {
                if (interfaceC1003iMo1898a instanceof C1080be) {
                    C1100c.m2653a(((C1076ba) ((C1080be) interfaceC1003iMo1898a).m2612b()).m2603a());
                } else {
                    C1100c.m2653a(((C1076ba) interfaceC1003iMo1898a).m2603a());
                }
            }
            return interfaceC1003iMo1898a;
        }

        /* JADX INFO: renamed from: a */
        private static byte[] m4474a(int i, PBEKeySpec pBEKeySpec) {
            return i == 2 ? AbstractC0804ad.m1896c(pBEKeySpec.getPassword()) : (i == 5 || i == 4) ? AbstractC0804ad.m1895b(pBEKeySpec.getPassword()) : AbstractC0804ad.m1894a(pBEKeySpec.getPassword());
        }

        /* JADX INFO: renamed from: a */
        private static AbstractC0804ad m4467a(int i, int i2) {
            if (i == 0 || i == 4) {
                switch (i2) {
                    case 0:
                        return new C0976w(new C0836m());
                    case 1:
                        return new C0976w(new C0842s());
                    case 2:
                    case 3:
                    case 4:
                    default:
                        throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                    case 5:
                        return new C0976w(new C0834k());
                }
            }
            if (i != 1 && i != 5) {
                if (i != 2) {
                    return new C0974u();
                }
                switch (i2) {
                    case 0:
                        return new C0975v(new C0836m());
                    case 1:
                        return new C0975v(new C0842s());
                    case 2:
                        return new C0975v(new C0839p());
                    case 3:
                        return new C0975v(new C0823ad());
                    case 4:
                        return new C0975v(new C0844u());
                    case 5:
                        return new C0975v(new C0834k());
                    case 6:
                        return new C0975v(new C0827d());
                    case 7:
                        return new C0975v(new C0843t());
                    case 8:
                        return new C0975v(new C0845v());
                    case 9:
                        return new C0975v(new C0847x());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
            switch (i2) {
                case 0:
                    return new C0977x(new C0836m());
                case 1:
                    return new C0977x(new C0842s());
                case 2:
                    return new C0977x(new C0839p());
                case 3:
                    return new C0977x(new C0823ad());
                case 4:
                    return new C0977x(new C0844u());
                case 5:
                    return new C0977x(new C0834k());
                case 6:
                    return new C0977x(new C0827d());
                case 7:
                    return new C0977x(new C0843t());
                case 8:
                    return new C0977x(new C0845v());
                case 9:
                    return new C0977x(new C0847x());
                case 10:
                    return new C0977x(C1164a.m2784c());
                case 11:
                    return new C0977x(C1164a.m2785d());
                case 12:
                    return new C0977x(C1164a.m2786e());
                case 13:
                    return new C0977x(C1164a.m2787f());
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1003i m4472a(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC0804ad abstractC0804adM4467a = m4467a(bCPBEKey.f6149c, bCPBEKey.f6150d);
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.f6155i) {
                encoded = new byte[2];
            }
            abstractC0804adM4467a.m1899a(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC1003i interfaceC1003iMo1898a = bCPBEKey.f6152f != 0 ? abstractC0804adM4467a.mo1898a(bCPBEKey.f6151e, bCPBEKey.f6152f) : abstractC0804adM4467a.mo1897a(bCPBEKey.f6151e);
            if (str.startsWith("DES")) {
                if (interfaceC1003iMo1898a instanceof C1080be) {
                    C1100c.m2653a(((C1076ba) ((C1080be) interfaceC1003iMo1898a).m2612b()).m2603a());
                } else {
                    C1100c.m2653a(((C1076ba) interfaceC1003iMo1898a).m2603a());
                }
            }
            return interfaceC1003iMo1898a;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1003i m4471a(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC0804ad abstractC0804adM4467a = m4467a(bCPBEKey.f6149c, bCPBEKey.f6150d);
            abstractC0804adM4467a.m1899a(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return abstractC0804adM4467a.mo1900b(bCPBEKey.f6151e);
        }
    }
}
