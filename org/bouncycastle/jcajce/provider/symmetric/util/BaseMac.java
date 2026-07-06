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
import org.bouncycastle.b.h.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.a;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.bi;
import org.bouncycastle.b.k.bo$a;
import org.bouncycastle.b.z;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.SkeinParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class BaseMac extends MacSpi implements PBE {
    private static final Class a = ClassUtil.a(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");
    private z b;
    private int c;
    private int d;
    private int e;

    protected BaseMac(z zVar) {
        this.c = 2;
        this.d = 1;
        this.e = 160;
        this.b = zVar;
    }

    protected BaseMac(z zVar, int i, int i2) {
        this.c = 2;
        this.d = 1;
        this.e = 160;
        this.b = zVar;
        this.c = 2;
        this.d = i;
        this.e = i2;
    }

    private static Hashtable a(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.b.a(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.b.b();
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.b.c();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        this.b.a(b);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.b.a(bArr, i, i2);
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i;
        i iVarA;
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
                    if (this.b.a().startsWith("GOST")) {
                        i = 256;
                        i2 = 6;
                    } else if (!(this.b instanceof g) || this.b.a().startsWith("SHA-1")) {
                        i = 160;
                    } else if (this.b.a().startsWith("SHA-224")) {
                        i = 224;
                        i2 = 7;
                    } else if (this.b.a().startsWith("SHA-256")) {
                        i = 256;
                        i2 = 4;
                    } else if (this.b.a().startsWith("SHA-384")) {
                        i = 384;
                        i2 = 8;
                    } else if (this.b.a().startsWith("SHA-512")) {
                        i = 512;
                        i2 = 9;
                    } else {
                        if (!this.b.a().startsWith("RIPEMD160")) {
                            throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.b.a());
                        }
                        i = 160;
                        i2 = 2;
                    }
                    iVarA = PBE$Util.a(secretKey, i2, i, pBEParameterSpec);
                } catch (Exception e) {
                    throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                }
            } catch (Exception e2) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.g != null) {
                iVarA = bCPBEKey.g;
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                iVarA = PBE$Util.a(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec.getClass().getName());
            }
            iVarA = new ba(key.getEncoded());
        }
        ba baVar = iVarA instanceof be ? (ba) ((be) iVarA).b() : (ba) iVarA;
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            iVarA = new a(baVar, aEADParameterSpec.a(), aEADParameterSpec.getIV(), aEADParameterSpec.b());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            iVarA = new be(baVar, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            iVarA = new be(new bi(baVar.a(), ((RC2ParameterSpec) algorithmParameterSpec).getEffectiveKeyBits()), ((RC2ParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            iVarA = new bo$a(a(((SkeinParameterSpec) algorithmParameterSpec).a())).a(baVar.a()).a();
        } else if (algorithmParameterSpec == null) {
            iVarA = new ba(key.getEncoded());
        } else if (a != null && a.isAssignableFrom(algorithmParameterSpec.getClass())) {
            try {
                iVarA = new a(baVar, ((Integer) a.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) a.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
            } catch (Exception e3) {
                throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
            }
        } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
        }
        try {
            this.b.a(iVarA);
        } catch (Exception e4) {
            throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + e4.getMessage());
        }
    }
}
