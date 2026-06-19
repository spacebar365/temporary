package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.SkeinParameterSpec;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1084bi;
import org.bouncycastle.p083b.p097k.C1090bo;

/* JADX INFO: loaded from: classes.dex */
public class BaseMac extends MacSpi implements PBE {

    /* JADX INFO: renamed from: a */
    private static final Class f6183a = ClassUtil.m4466a(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");

    /* JADX INFO: renamed from: b */
    private InterfaceC1183z f6184b;

    /* JADX INFO: renamed from: c */
    private int f6185c;

    /* JADX INFO: renamed from: d */
    private int f6186d;

    /* JADX INFO: renamed from: e */
    private int f6187e;

    protected BaseMac(InterfaceC1183z interfaceC1183z) {
        this.f6185c = 2;
        this.f6186d = 1;
        this.f6187e = 160;
        this.f6184b = interfaceC1183z;
    }

    protected BaseMac(InterfaceC1183z interfaceC1183z, int i, int i2) {
        this.f6185c = 2;
        this.f6186d = 1;
        this.f6187e = 160;
        this.f6184b = interfaceC1183z;
        this.f6185c = 2;
        this.f6186d = i;
        this.f6187e = i2;
    }

    /* JADX INFO: renamed from: a */
    private static Hashtable m4462a(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.f6184b.mo2446a(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.f6184b.mo2451b();
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.f6184b.mo2452c();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        this.f6184b.mo2448a(b);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f6184b.mo2450a(bArr, i, i2);
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i;
        InterfaceC1003i interfaceC1003iM4468a;
        if (key == null) {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof PKCS12Key) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        pBEParameterSpec = new PBEParameterSpec(((PBEKey) secretKey).getSalt(), ((PBEKey) secretKey).getIterationCount());
                    }
                    int i2 = 1;
                    if (this.f6184b.mo2447a().startsWith("GOST")) {
                        i = 256;
                        i2 = 6;
                    } else if (!(this.f6184b instanceof C0994g) || this.f6184b.mo2447a().startsWith("SHA-1")) {
                        i = 160;
                    } else if (this.f6184b.mo2447a().startsWith("SHA-224")) {
                        i = 224;
                        i2 = 7;
                    } else if (this.f6184b.mo2447a().startsWith("SHA-256")) {
                        i = 256;
                        i2 = 4;
                    } else if (this.f6184b.mo2447a().startsWith("SHA-384")) {
                        i = 384;
                        i2 = 8;
                    } else if (this.f6184b.mo2447a().startsWith("SHA-512")) {
                        i = 512;
                        i2 = 9;
                    } else {
                        if (!this.f6184b.mo2447a().startsWith("RIPEMD160")) {
                            throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.f6184b.mo2447a());
                        }
                        i = 160;
                        i2 = 2;
                    }
                    interfaceC1003iM4468a = PBE.Util.m4468a(secretKey, i2, i, pBEParameterSpec);
                } catch (Exception e) {
                    throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                }
            } catch (Exception e2) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.f6153g != null) {
                interfaceC1003iM4468a = bCPBEKey.f6153g;
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                interfaceC1003iM4468a = PBE.Util.m4471a(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec.getClass().getName());
            }
            interfaceC1003iM4468a = new C1076ba(key.getEncoded());
        }
        C1076ba c1076ba = interfaceC1003iM4468a instanceof C1080be ? (C1076ba) ((C1080be) interfaceC1003iM4468a).m2612b() : (C1076ba) interfaceC1003iM4468a;
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            interfaceC1003iM4468a = new C1048a(c1076ba, aEADParameterSpec.m4482a(), aEADParameterSpec.getIV(), aEADParameterSpec.m4483b());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            interfaceC1003iM4468a = new C1080be(c1076ba, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            interfaceC1003iM4468a = new C1080be(new C1084bi(c1076ba.m2603a(), ((RC2ParameterSpec) algorithmParameterSpec).getEffectiveKeyBits()), ((RC2ParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            interfaceC1003iM4468a = new C1090bo.a(m4462a(((SkeinParameterSpec) algorithmParameterSpec).m4512a())).m2635a(c1076ba.m2603a()).m2636a();
        } else if (algorithmParameterSpec == null) {
            interfaceC1003iM4468a = new C1076ba(key.getEncoded());
        } else if (f6183a != null && f6183a.isAssignableFrom(algorithmParameterSpec.getClass())) {
            try {
                interfaceC1003iM4468a = new C1048a(c1076ba, ((Integer) f6183a.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) f6183a.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
            } catch (Exception e3) {
                throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
            }
        } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
        }
        try {
            this.f6184b.mo2449a(interfaceC1003iM4468a);
        } catch (Exception e4) {
            throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + e4.getMessage());
        }
    }
}
