package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;
import org.bouncycastle.b.a.a.b;
import org.bouncycastle.b.a.a.c;
import org.bouncycastle.b.k.az;
import org.bouncycastle.f.a;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, p> d = new HashMap();
    private static final Map<String, Integer> e = new HashMap();
    private static final Map<String, String> f = new HashMap();
    private static final Hashtable g = new Hashtable();
    private static final Hashtable h = new Hashtable();
    protected final String a;
    protected final org.bouncycastle.b.p b;
    protected byte[] c;

    public BaseAgreementSpi(String str, org.bouncycastle.b.p pVar) {
        this.a = str;
        this.b = pVar;
    }

    protected static byte[] a(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        byte[] bArr2 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        return bArr2;
    }

    private byte[] a(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        if (this.b == null) {
            if (i <= 0) {
                return bArr;
            }
            byte[] bArr2 = new byte[i / 8];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            a.d(bArr);
            return bArr2;
        }
        if (i < 0) {
            throw new NoSuchAlgorithmException("unknown algorithm encountered: ".concat(String.valueOf(str)));
        }
        byte[] bArr3 = new byte[i / 8];
        if (!(this.b instanceof c)) {
            this.b.a(new az(bArr, this.c));
        } else {
            if (str == null) {
                throw new NoSuchAlgorithmException("algorithm OID is null");
            }
            try {
                this.b.a(new b(new p(str), i, bArr, this.c));
            } catch (IllegalArgumentException e2) {
                throw new NoSuchAlgorithmException("no OID for algorithm: ".concat(String.valueOf(str)));
            }
        }
        this.b.a(bArr3, 0, bArr3.length);
        a.d(bArr);
        return bArr3;
    }

    protected abstract byte[] a();

    @Override // javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) throws ShortBufferException {
        byte[] bArrEngineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i < bArrEngineGenerateSecret.length) {
            throw new ShortBufferException(this.a + " key agreement: need " + bArrEngineGenerateSecret.length + " bytes");
        }
        System.arraycopy(bArrEngineGenerateSecret, 0, bArr, i, bArrEngineGenerateSecret.length);
        return bArrEngineGenerateSecret.length;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        if (this.b == null) {
            return a();
        }
        byte[] bArrA = a();
        try {
            return a(bArrA, null, bArrA.length * 8);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        int iIntValue;
        String strSubstring;
        String strB = k.b(str);
        String strB2 = g.containsKey(strB) ? ((p) g.get(strB)).b() : str;
        if (strB2.indexOf(91) > 0) {
            iIntValue = Integer.parseInt(strB2.substring(strB2.indexOf(91) + 1, strB2.indexOf(93)));
        } else {
            String strB3 = k.b(strB2);
            iIntValue = !e.containsKey(strB3) ? -1 : e.get(strB3).intValue();
        }
        byte[] bArrA = a(a(), strB2, iIntValue);
        if (str.indexOf(91) > 0) {
            strSubstring = str.substring(0, str.indexOf(91));
        } else if (str.startsWith(org.bouncycastle.a.o.b.s.b())) {
            strSubstring = "AES";
        } else if (str.startsWith(org.bouncycastle.a.j.a.i.b())) {
            strSubstring = "Serpent";
        } else {
            strSubstring = f.get(k.b(str));
            if (strSubstring == null) {
                strSubstring = str;
            }
        }
        if (h.containsKey(strSubstring)) {
            org.bouncycastle.b.k.c.a(bArrA);
        }
        return new SecretKeySpec(bArrA, strSubstring);
    }

    static {
        e.put("DES", 64);
        e.put("DESEDE", 192);
        e.put("BLOWFISH", 128);
        e.put("AES", 256);
        e.put(org.bouncycastle.a.o.b.t.b(), 128);
        e.put(org.bouncycastle.a.o.b.B.b(), 192);
        e.put(org.bouncycastle.a.o.b.J.b(), 256);
        e.put(org.bouncycastle.a.o.b.u.b(), 128);
        e.put(org.bouncycastle.a.o.b.C.b(), 192);
        e.put(org.bouncycastle.a.o.b.K.b(), 256);
        e.put(org.bouncycastle.a.o.b.w.b(), 128);
        e.put(org.bouncycastle.a.o.b.E.b(), 192);
        e.put(org.bouncycastle.a.o.b.M.b(), 256);
        e.put(org.bouncycastle.a.o.b.v.b(), 128);
        e.put(org.bouncycastle.a.o.b.D.b(), 192);
        e.put(org.bouncycastle.a.o.b.L.b(), 256);
        e.put(org.bouncycastle.a.o.b.x.b(), 128);
        e.put(org.bouncycastle.a.o.b.F.b(), 192);
        e.put(org.bouncycastle.a.o.b.N.b(), 256);
        e.put(org.bouncycastle.a.o.b.z.b(), 128);
        e.put(org.bouncycastle.a.o.b.H.b(), 192);
        e.put(org.bouncycastle.a.o.b.P.b(), 256);
        e.put(org.bouncycastle.a.o.b.y.b(), 128);
        e.put(org.bouncycastle.a.o.b.G.b(), 192);
        e.put(org.bouncycastle.a.o.b.O.b(), 256);
        e.put(org.bouncycastle.a.q.a.d.b(), 128);
        e.put(org.bouncycastle.a.q.a.e.b(), 192);
        e.put(org.bouncycastle.a.q.a.f.b(), 256);
        e.put(org.bouncycastle.a.m.a.d.b(), 128);
        e.put(n.bK.b(), 192);
        e.put(n.D.b(), 192);
        e.put(org.bouncycastle.a.r.b.e.b(), 64);
        e.put(org.bouncycastle.a.f.a.f.b(), 256);
        e.put(org.bouncycastle.a.f.a.d.b(), 256);
        e.put(org.bouncycastle.a.f.a.e.b(), 256);
        e.put(n.K.b(), 160);
        e.put(n.M.b(), 256);
        e.put(n.N.b(), 384);
        e.put(n.O.b(), 512);
        d.put("DESEDE", n.D);
        d.put("AES", org.bouncycastle.a.o.b.K);
        d.put("CAMELLIA", org.bouncycastle.a.q.a.c);
        d.put("SEED", org.bouncycastle.a.m.a.a);
        d.put("DES", org.bouncycastle.a.r.b.e);
        f.put(org.bouncycastle.a.n.c.u.b(), "CAST5");
        f.put(org.bouncycastle.a.n.c.v.b(), "IDEA");
        f.put(org.bouncycastle.a.n.c.y.b(), "Blowfish");
        f.put(org.bouncycastle.a.n.c.z.b(), "Blowfish");
        f.put(org.bouncycastle.a.n.c.A.b(), "Blowfish");
        f.put(org.bouncycastle.a.n.c.B.b(), "Blowfish");
        f.put(org.bouncycastle.a.r.b.d.b(), "DES");
        f.put(org.bouncycastle.a.r.b.e.b(), "DES");
        f.put(org.bouncycastle.a.r.b.g.b(), "DES");
        f.put(org.bouncycastle.a.r.b.f.b(), "DES");
        f.put(org.bouncycastle.a.r.b.h.b(), "DESede");
        f.put(n.D.b(), "DESede");
        f.put(n.bK.b(), "DESede");
        f.put(n.bL.b(), "RC2");
        f.put(n.K.b(), "HmacSHA1");
        f.put(n.L.b(), "HmacSHA224");
        f.put(n.M.b(), "HmacSHA256");
        f.put(n.N.b(), "HmacSHA384");
        f.put(n.O.b(), "HmacSHA512");
        f.put(org.bouncycastle.a.q.a.a.b(), "Camellia");
        f.put(org.bouncycastle.a.q.a.b.b(), "Camellia");
        f.put(org.bouncycastle.a.q.a.c.b(), "Camellia");
        f.put(org.bouncycastle.a.q.a.d.b(), "Camellia");
        f.put(org.bouncycastle.a.q.a.e.b(), "Camellia");
        f.put(org.bouncycastle.a.q.a.f.b(), "Camellia");
        f.put(org.bouncycastle.a.m.a.d.b(), "SEED");
        f.put(org.bouncycastle.a.m.a.a.b(), "SEED");
        f.put(org.bouncycastle.a.m.a.b.b(), "SEED");
        f.put(org.bouncycastle.a.f.a.f.b(), "GOST28147");
        f.put(org.bouncycastle.a.o.b.x.b(), "AES");
        f.put(org.bouncycastle.a.o.b.z.b(), "AES");
        f.put(org.bouncycastle.a.o.b.z.b(), "AES");
        g.put("DESEDE", n.D);
        g.put("AES", org.bouncycastle.a.o.b.K);
        g.put("DES", org.bouncycastle.a.r.b.e);
        h.put("DES", "DES");
        h.put("DESEDE", "DES");
        h.put(org.bouncycastle.a.r.b.e.b(), "DES");
        h.put(n.D.b(), "DES");
        h.put(n.bK.b(), "DES");
    }
}
