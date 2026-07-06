package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.b.d;
import org.bouncycastle.b.b.k;
import org.bouncycastle.b.b.m;
import org.bouncycastle.b.b.p;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.b.t;
import org.bouncycastle.b.b.x;
import org.bouncycastle.b.f.u;
import org.bouncycastle.b.f.v;
import org.bouncycastle.b.f.w;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.c;
import org.bouncycastle.b.o.a;

/* JADX INFO: loaded from: classes.dex */
public class PBE$Util {
    public static i a(SecretKey secretKey, int i, int i2, PBEParameterSpec pBEParameterSpec) {
        ad adVarA = a(2, i);
        byte[] encoded = secretKey.getEncoded();
        adVarA.a(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        i iVarB = adVarA.b(i2);
        for (int i3 = 0; i3 != encoded.length; i3++) {
            encoded[i3] = 0;
        }
        return iVarB;
    }

    public static i a(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
        ad adVarA = a(i, i2);
        byte[] bArrA = a(i, pBEKeySpec);
        adVarA.a(bArrA, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
        i iVarB = adVarA.b(i3);
        for (int i4 = 0; i4 != bArrA.length; i4++) {
            bArrA[i4] = 0;
        }
        return iVarB;
    }

    public static i a(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
        ad adVarA = a(i, i2);
        byte[] bArrA = a(i, pBEKeySpec);
        adVarA.a(bArrA, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
        i iVarA = i4 != 0 ? adVarA.a(i3, i4) : adVarA.a(i3);
        for (int i5 = 0; i5 != bArrA.length; i5++) {
            bArrA[i5] = 0;
        }
        return iVarA;
    }

    public static i a(byte[] bArr, int i, int i2, int i3, int i4, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        ad adVarA = a(i, i2);
        adVarA.a(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        i iVarA = i4 != 0 ? adVarA.a(i3, i4) : adVarA.a(i3);
        if (str.startsWith("DES")) {
            if (iVarA instanceof be) {
                c.a(((ba) ((be) iVarA).b()).a());
            } else {
                c.a(((ba) iVarA).a());
            }
        }
        return iVarA;
    }

    private static byte[] a(int i, PBEKeySpec pBEKeySpec) {
        return i == 2 ? ad.c(pBEKeySpec.getPassword()) : (i == 5 || i == 4) ? ad.b(pBEKeySpec.getPassword()) : ad.a(pBEKeySpec.getPassword());
    }

    private static ad a(int i, int i2) {
        if (i == 0 || i == 4) {
            switch (i2) {
                case 0:
                    return new w(new m());
                case 1:
                    return new w(new s());
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                case 5:
                    return new w(new k());
            }
        }
        if (i != 1 && i != 5) {
            if (i != 2) {
                return new u();
            }
            switch (i2) {
                case 0:
                    return new v(new m());
                case 1:
                    return new v(new s());
                case 2:
                    return new v(new p());
                case 3:
                    return new v(new org.bouncycastle.b.b.ad());
                case 4:
                    return new v(new org.bouncycastle.b.b.u());
                case 5:
                    return new v(new k());
                case 6:
                    return new v(new d());
                case 7:
                    return new v(new t());
                case 8:
                    return new v(new org.bouncycastle.b.b.v());
                case 9:
                    return new v(new x());
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE encryption.");
            }
        }
        switch (i2) {
            case 0:
                return new org.bouncycastle.b.f.x(new m());
            case 1:
                return new org.bouncycastle.b.f.x(new s());
            case 2:
                return new org.bouncycastle.b.f.x(new p());
            case 3:
                return new org.bouncycastle.b.f.x(new org.bouncycastle.b.b.ad());
            case 4:
                return new org.bouncycastle.b.f.x(new org.bouncycastle.b.b.u());
            case 5:
                return new org.bouncycastle.b.f.x(new k());
            case 6:
                return new org.bouncycastle.b.f.x(new d());
            case 7:
                return new org.bouncycastle.b.f.x(new t());
            case 8:
                return new org.bouncycastle.b.f.x(new org.bouncycastle.b.b.v());
            case 9:
                return new org.bouncycastle.b.f.x(new x());
            case 10:
                return new org.bouncycastle.b.f.x(a.c());
            case 11:
                return new org.bouncycastle.b.f.x(a.d());
            case 12:
                return new org.bouncycastle.b.f.x(a.e());
            case 13:
                return new org.bouncycastle.b.f.x(a.f());
            default:
                throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
        }
    }

    public static i a(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        ad adVarA = a(bCPBEKey.c, bCPBEKey.d);
        byte[] encoded = bCPBEKey.getEncoded();
        if (bCPBEKey.i) {
            encoded = new byte[2];
        }
        adVarA.a(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        i iVarA = bCPBEKey.f != 0 ? adVarA.a(bCPBEKey.e, bCPBEKey.f) : adVarA.a(bCPBEKey.e);
        if (str.startsWith("DES")) {
            if (iVarA instanceof be) {
                c.a(((ba) ((be) iVarA).b()).a());
            } else {
                c.a(((ba) iVarA).a());
            }
        }
        return iVarA;
    }

    public static i a(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        ad adVarA = a(bCPBEKey.c, bCPBEKey.d);
        adVarA.a(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        return adVarA.b(bCPBEKey.e);
    }
}
