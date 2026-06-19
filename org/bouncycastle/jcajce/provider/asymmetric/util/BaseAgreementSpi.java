package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p065j.InterfaceC0635a;
import org.bouncycastle.p054a.p068m.InterfaceC0641a;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p072q.InterfaceC0656a;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.p084a.p085a.C0789b;
import org.bouncycastle.p083b.p084a.p085a.C0790c;
import org.bouncycastle.p083b.p097k.C1074az;
import org.bouncycastle.p083b.p097k.C1100c;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {

    /* JADX INFO: renamed from: d */
    private static final Map<String, C0653p> f5899d = new HashMap();

    /* JADX INFO: renamed from: e */
    private static final Map<String, Integer> f5900e = new HashMap();

    /* JADX INFO: renamed from: f */
    private static final Map<String, String> f5901f = new HashMap();

    /* JADX INFO: renamed from: g */
    private static final Hashtable f5902g = new Hashtable();

    /* JADX INFO: renamed from: h */
    private static final Hashtable f5903h = new Hashtable();

    /* JADX INFO: renamed from: a */
    protected final String f5904a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC1173p f5905b;

    /* JADX INFO: renamed from: c */
    protected byte[] f5906c;

    public BaseAgreementSpi(String str, InterfaceC1173p interfaceC1173p) {
        this.f5904a = str;
        this.f5905b = interfaceC1173p;
    }

    /* JADX INFO: renamed from: a */
    protected static byte[] m4301a(byte[] bArr) {
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

    /* JADX INFO: renamed from: a */
    private byte[] m4302a(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        if (this.f5905b == null) {
            if (i <= 0) {
                return bArr;
            }
            byte[] bArr2 = new byte[i / 8];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            C1535a.m4094d(bArr);
            return bArr2;
        }
        if (i < 0) {
            throw new NoSuchAlgorithmException("unknown algorithm encountered: ".concat(String.valueOf(str)));
        }
        byte[] bArr3 = new byte[i / 8];
        if (!(this.f5905b instanceof C0790c)) {
            this.f5905b.mo1877a(new C1074az(bArr, this.f5906c));
        } else {
            if (str == null) {
                throw new NoSuchAlgorithmException("algorithm OID is null");
            }
            try {
                this.f5905b.mo1877a(new C0789b(new C0653p(str), i, bArr, this.f5906c));
            } catch (IllegalArgumentException e) {
                throw new NoSuchAlgorithmException("no OID for algorithm: ".concat(String.valueOf(str)));
            }
        }
        this.f5905b.mo1876a(bArr3, 0, bArr3.length);
        C1535a.m4094d(bArr);
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    protected abstract byte[] mo4204a();

    @Override // javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) throws ShortBufferException {
        byte[] bArrEngineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i < bArrEngineGenerateSecret.length) {
            throw new ShortBufferException(this.f5904a + " key agreement: need " + bArrEngineGenerateSecret.length + " bytes");
        }
        System.arraycopy(bArrEngineGenerateSecret, 0, bArr, i, bArrEngineGenerateSecret.length);
        return bArrEngineGenerateSecret.length;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        if (this.f5905b == null) {
            return mo4204a();
        }
        byte[] bArrMo4204a = mo4204a();
        try {
            return m4302a(bArrMo4204a, null, bArrMo4204a.length * 8);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        int iIntValue;
        String strSubstring;
        String strM4163b = C1560k.m4163b(str);
        String strM1593b = f5902g.containsKey(strM4163b) ? ((C0653p) f5902g.get(strM4163b)).m1593b() : str;
        if (strM1593b.indexOf(91) > 0) {
            iIntValue = Integer.parseInt(strM1593b.substring(strM1593b.indexOf(91) + 1, strM1593b.indexOf(93)));
        } else {
            String strM4163b2 = C1560k.m4163b(strM1593b);
            iIntValue = !f5900e.containsKey(strM4163b2) ? -1 : f5900e.get(strM4163b2).intValue();
        }
        byte[] bArrM4302a = m4302a(mo4204a(), strM1593b, iIntValue);
        if (str.indexOf(91) > 0) {
            strSubstring = str.substring(0, str.indexOf(91));
        } else if (str.startsWith(InterfaceC0652b.f2506s.m1593b())) {
            strSubstring = "AES";
        } else if (str.startsWith(InterfaceC0635a.f2353i.m1593b())) {
            strSubstring = "Serpent";
        } else {
            strSubstring = f5901f.get(C1560k.m4163b(str));
            if (strSubstring == null) {
                strSubstring = str;
            }
        }
        if (f5903h.containsKey(strSubstring)) {
            C1100c.m2653a(bArrM4302a);
        }
        return new SecretKeySpec(bArrM4302a, strSubstring);
    }

    static {
        f5900e.put("DES", 64);
        f5900e.put("DESEDE", 192);
        f5900e.put("BLOWFISH", 128);
        f5900e.put("AES", 256);
        f5900e.put(InterfaceC0652b.f2507t.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2454B.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2462J.m1593b(), 256);
        f5900e.put(InterfaceC0652b.f2508u.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2455C.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2463K.m1593b(), 256);
        f5900e.put(InterfaceC0652b.f2510w.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2457E.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2465M.m1593b(), 256);
        f5900e.put(InterfaceC0652b.f2509v.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2456D.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2464L.m1593b(), 256);
        f5900e.put(InterfaceC0652b.f2511x.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2458F.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2466N.m1593b(), 256);
        f5900e.put(InterfaceC0652b.f2513z.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2460H.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2468P.m1593b(), 256);
        f5900e.put(InterfaceC0652b.f2512y.m1593b(), 128);
        f5900e.put(InterfaceC0652b.f2459G.m1593b(), 192);
        f5900e.put(InterfaceC0652b.f2467O.m1593b(), 256);
        f5900e.put(InterfaceC0656a.f2562d.m1593b(), 128);
        f5900e.put(InterfaceC0656a.f2563e.m1593b(), 192);
        f5900e.put(InterfaceC0656a.f2564f.m1593b(), 256);
        f5900e.put(InterfaceC0641a.f2403d.m1593b(), 128);
        f5900e.put(InterfaceC0674n.f2700bK.m1593b(), 192);
        f5900e.put(InterfaceC0674n.f2615D.m1593b(), 192);
        f5900e.put(InterfaceC0659b.f2571e.m1593b(), 64);
        f5900e.put(InterfaceC0619a.f2198f.m1593b(), 256);
        f5900e.put(InterfaceC0619a.f2196d.m1593b(), 256);
        f5900e.put(InterfaceC0619a.f2197e.m1593b(), 256);
        f5900e.put(InterfaceC0674n.f2622K.m1593b(), 160);
        f5900e.put(InterfaceC0674n.f2624M.m1593b(), 256);
        f5900e.put(InterfaceC0674n.f2625N.m1593b(), 384);
        f5900e.put(InterfaceC0674n.f2626O.m1593b(), 512);
        f5899d.put("DESEDE", InterfaceC0674n.f2615D);
        f5899d.put("AES", InterfaceC0652b.f2463K);
        f5899d.put("CAMELLIA", InterfaceC0656a.f2561c);
        f5899d.put("SEED", InterfaceC0641a.f2400a);
        f5899d.put("DES", InterfaceC0659b.f2571e);
        f5901f.put(InterfaceC0645c.f2440u.m1593b(), "CAST5");
        f5901f.put(InterfaceC0645c.f2441v.m1593b(), "IDEA");
        f5901f.put(InterfaceC0645c.f2444y.m1593b(), "Blowfish");
        f5901f.put(InterfaceC0645c.f2445z.m1593b(), "Blowfish");
        f5901f.put(InterfaceC0645c.f2408A.m1593b(), "Blowfish");
        f5901f.put(InterfaceC0645c.f2409B.m1593b(), "Blowfish");
        f5901f.put(InterfaceC0659b.f2570d.m1593b(), "DES");
        f5901f.put(InterfaceC0659b.f2571e.m1593b(), "DES");
        f5901f.put(InterfaceC0659b.f2573g.m1593b(), "DES");
        f5901f.put(InterfaceC0659b.f2572f.m1593b(), "DES");
        f5901f.put(InterfaceC0659b.f2574h.m1593b(), "DESede");
        f5901f.put(InterfaceC0674n.f2615D.m1593b(), "DESede");
        f5901f.put(InterfaceC0674n.f2700bK.m1593b(), "DESede");
        f5901f.put(InterfaceC0674n.f2701bL.m1593b(), "RC2");
        f5901f.put(InterfaceC0674n.f2622K.m1593b(), "HmacSHA1");
        f5901f.put(InterfaceC0674n.f2623L.m1593b(), "HmacSHA224");
        f5901f.put(InterfaceC0674n.f2624M.m1593b(), "HmacSHA256");
        f5901f.put(InterfaceC0674n.f2625N.m1593b(), "HmacSHA384");
        f5901f.put(InterfaceC0674n.f2626O.m1593b(), "HmacSHA512");
        f5901f.put(InterfaceC0656a.f2559a.m1593b(), "Camellia");
        f5901f.put(InterfaceC0656a.f2560b.m1593b(), "Camellia");
        f5901f.put(InterfaceC0656a.f2561c.m1593b(), "Camellia");
        f5901f.put(InterfaceC0656a.f2562d.m1593b(), "Camellia");
        f5901f.put(InterfaceC0656a.f2563e.m1593b(), "Camellia");
        f5901f.put(InterfaceC0656a.f2564f.m1593b(), "Camellia");
        f5901f.put(InterfaceC0641a.f2403d.m1593b(), "SEED");
        f5901f.put(InterfaceC0641a.f2400a.m1593b(), "SEED");
        f5901f.put(InterfaceC0641a.f2401b.m1593b(), "SEED");
        f5901f.put(InterfaceC0619a.f2198f.m1593b(), "GOST28147");
        f5901f.put(InterfaceC0652b.f2511x.m1593b(), "AES");
        f5901f.put(InterfaceC0652b.f2513z.m1593b(), "AES");
        f5901f.put(InterfaceC0652b.f2513z.m1593b(), "AES");
        f5902g.put("DESEDE", InterfaceC0674n.f2615D);
        f5902g.put("AES", InterfaceC0652b.f2463K);
        f5902g.put("DES", InterfaceC0659b.f2571e);
        f5903h.put("DES", "DES");
        f5903h.put("DESEDE", "DES");
        f5903h.put(InterfaceC0659b.f2571e.m1593b(), "DES");
        f5903h.put(InterfaceC0674n.f2615D.m1593b(), "DES");
        f5903h.put(InterfaceC0674n.f2700bK.m1593b(), "DES");
    }
}
