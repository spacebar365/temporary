package org.bouncycastle.jcajce.provider.symmetric.util;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.a.d.b;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.e;
import org.bouncycastle.b.e.r;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.c;
import org.bouncycastle.b.i.d;
import org.bouncycastle.b.i.l;
import org.bouncycastle.b.i.m;
import org.bouncycastle.b.i.p;
import org.bouncycastle.b.i.q;
import org.bouncycastle.b.i.s;
import org.bouncycastle.b.i.t;
import org.bouncycastle.b.i.u;
import org.bouncycastle.b.i.v;
import org.bouncycastle.b.j.g;
import org.bouncycastle.b.j.h;
import org.bouncycastle.b.k.a;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.o;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final Class e = ClassUtil.a(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private Class[] f;
    private e g;
    private BlockCipherProvider h;
    private BaseBlockCipher$GenericBlockCipher i;
    private be j;
    private a k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private PBEParameterSpec r;
    private String s;
    private String t;

    protected BaseBlockCipher(e eVar) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = eVar;
        this.i = new BaseBlockCipher$BufferedGenericBlockCipher(eVar);
    }

    protected BaseBlockCipher(e eVar, int i) {
        this(eVar, true, i);
    }

    protected BaseBlockCipher(e eVar, int i, int i2, int i3, int i4) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = eVar;
        this.m = i;
        this.n = i2;
        this.l = i3;
        this.o = i4;
        this.i = new BaseBlockCipher$BufferedGenericBlockCipher(eVar);
    }

    protected BaseBlockCipher(e eVar, boolean z, int i) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = eVar;
        this.q = z;
        this.i = new BaseBlockCipher$BufferedGenericBlockCipher(eVar);
        this.o = i / 8;
    }

    protected BaseBlockCipher(f fVar, int i) {
        this(fVar, true, i);
    }

    protected BaseBlockCipher(f fVar, boolean z, int i) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = fVar.a();
        this.i = new BaseBlockCipher$BufferedGenericBlockCipher(fVar);
        this.q = z;
        this.o = i / 8;
    }

    protected BaseBlockCipher(org.bouncycastle.b.i.a aVar) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = aVar.a();
        this.o = this.g.b();
        this.i = new BaseBlockCipher$AEADGenericBlockCipher(aVar);
    }

    protected BaseBlockCipher(org.bouncycastle.b.i.a aVar, byte b) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = aVar.a();
        this.q = false;
        this.o = 16;
        this.i = new BaseBlockCipher$AEADGenericBlockCipher(aVar);
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.m = -1;
        this.o = 0;
        this.q = true;
        this.r = null;
        this.s = null;
        this.t = null;
        this.g = blockCipherProvider.a();
        this.h = blockCipherProvider;
        this.i = new BaseBlockCipher$BufferedGenericBlockCipher(blockCipherProvider.a());
    }

    private static boolean b(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, ShortBufferException {
        int iA = 0;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                iA = this.i.a(bArr, i, i2, bArr2, i3);
            } catch (ac e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            } catch (o e3) {
                throw new IllegalBlockSizeException(e3.getMessage());
            }
        }
        return iA + this.i.a(bArr2, i3 + iA);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException {
        byte[] bArr2 = new byte[engineGetOutputSize(i2)];
        int iA = i2 != 0 ? this.i.a(bArr, i, i2, bArr2, 0) : 0;
        try {
            int iA2 = this.i.a(bArr2, iA) + iA;
            if (iA2 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[iA2];
            System.arraycopy(bArr2, 0, bArr3, 0, iA2);
            return bArr3;
        } catch (o e2) {
            throw new IllegalBlockSizeException(e2.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.g.b();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        if (this.k != null) {
            return this.k.d();
        }
        if (this.j != null) {
            return this.j.a();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.i.a(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.c == null) {
            if (this.r != null) {
                try {
                    this.c = a(this.s);
                    this.c.init(this.r);
                } catch (Exception e2) {
                    return null;
                }
            } else if (this.k != null) {
                try {
                    this.c = a("GCM");
                    this.c.init(new b(this.k.d(), this.k.b() / 8).k());
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            } else if (this.j != null) {
                String strA = this.i.c().a();
                if (strA.indexOf(47) >= 0) {
                    strA = strA.substring(0, strA.indexOf(47));
                }
                try {
                    this.c = a(strA);
                    this.c.init(new IvParameterSpec(this.j.a()));
                } catch (Exception e4) {
                    throw new RuntimeException(e4.toString());
                }
            }
        }
        return this.c;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                if (i2 == this.f.length) {
                    parameterSpec = null;
                    break;
                }
                if (this.f[i2] != null) {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(this.f[i2]);
                        break;
                    } catch (Exception e2) {
                        i2++;
                    }
                }
                i2++;
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, secureRandom);
        this.c = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new InvalidKeyException(e2.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        this.t = k.b(str);
        if (this.t.equals("ECB")) {
            this.o = 0;
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.g);
            return;
        }
        if (this.t.equals("CBC")) {
            this.o = this.g.b();
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new org.bouncycastle.b.i.b(this.g));
            return;
        }
        if (this.t.startsWith("OFB")) {
            this.o = this.g.b();
            if (this.t.length() == 3) {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new s(this.g, this.g.b() * 8));
                return;
            } else {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new s(this.g, Integer.parseInt(this.t.substring(3))));
                return;
            }
        }
        if (this.t.startsWith("CFB")) {
            this.o = this.g.b();
            if (this.t.length() == 3) {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new d(this.g, this.g.b() * 8));
                return;
            } else {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new d(this.g, Integer.parseInt(this.t.substring(3))));
                return;
            }
        }
        if (this.t.startsWith("PGP")) {
            boolean zEqualsIgnoreCase = this.t.equalsIgnoreCase("PGPCFBwithIV");
            this.o = this.g.b();
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new u(this.g, zEqualsIgnoreCase));
            return;
        }
        if (this.t.equalsIgnoreCase("OpenPGPCFB")) {
            this.o = 0;
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new t(this.g));
            return;
        }
        if (this.t.startsWith("SIC")) {
            this.o = this.g.b();
            if (this.o < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.q = false;
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new f(new v(this.g)));
            return;
        }
        if (this.t.startsWith("CTR")) {
            this.o = this.g.b();
            this.q = false;
            if (this.g instanceof r) {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new f(new p(this.g)));
                return;
            } else {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new f(new v(this.g)));
                return;
            }
        }
        if (this.t.startsWith("GOFB")) {
            this.o = this.g.b();
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new f(new m(this.g)));
            return;
        }
        if (this.t.startsWith("GCFB")) {
            this.o = this.g.b();
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new f(new org.bouncycastle.b.i.k(this.g)));
            return;
        }
        if (this.t.startsWith("CTS")) {
            this.o = this.g.b();
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new org.bouncycastle.b.i.e(new org.bouncycastle.b.i.b(this.g)));
            return;
        }
        if (this.t.startsWith("CCM")) {
            this.o = 12;
            if (this.g instanceof r) {
                this.i = new BaseBlockCipher$AEADGenericBlockCipher(new org.bouncycastle.b.i.o(this.g));
                return;
            } else {
                this.i = new BaseBlockCipher$AEADGenericBlockCipher(new c(this.g));
                return;
            }
        }
        if (this.t.startsWith("OCB")) {
            if (this.h == null) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
            this.o = 15;
            this.i = new BaseBlockCipher$AEADGenericBlockCipher(new org.bouncycastle.b.i.r(this.g, this.h.a()));
            return;
        }
        if (this.t.startsWith("EAX")) {
            this.o = this.g.b();
            this.i = new BaseBlockCipher$AEADGenericBlockCipher(new org.bouncycastle.b.i.f(this.g));
        } else {
            if (!this.t.startsWith("GCM")) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
            this.o = this.g.b();
            if (this.g instanceof r) {
                this.i = new BaseBlockCipher$AEADGenericBlockCipher(new q(this.g));
            } else {
                this.i = new BaseBlockCipher$AEADGenericBlockCipher(new l(this.g));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String strB = k.b(str);
        if (strB.equals("NOPADDING")) {
            if (this.i.b()) {
                this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new f(this.i.c()));
                return;
            }
            return;
        }
        if (strB.equals("WITHCTS") || strB.equals("CTSPADDING") || strB.equals("CS3PADDING")) {
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(new org.bouncycastle.b.i.e(this.i.c()));
            return;
        }
        this.p = true;
        if (b(this.t)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (strB.equals("PKCS5PADDING") || strB.equals("PKCS7PADDING")) {
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.i.c());
            return;
        }
        if (strB.equals("ZEROBYTEPADDING")) {
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.i.c(), new h());
            return;
        }
        if (strB.equals("ISO10126PADDING") || strB.equals("ISO10126-2PADDING")) {
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.i.c(), new org.bouncycastle.b.j.b());
            return;
        }
        if (strB.equals("X9.23PADDING") || strB.equals("X923PADDING")) {
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.i.c(), new g());
            return;
        }
        if (strB.equals("ISO7816-4PADDING") || strB.equals("ISO9797-1PADDING")) {
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.i.c(), new org.bouncycastle.b.j.c());
        } else {
            if (!strB.equals("TBCPADDING")) {
                throw new NoSuchPaddingException("Padding " + str + " unknown.");
            }
            this.i = new BaseBlockCipher$BufferedGenericBlockCipher(this.i.c(), new org.bouncycastle.b.j.f());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.i.b(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.i.a(bArr, i, i2, bArr2, i3);
        } catch (o e2) {
            throw new IllegalStateException(e2.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int iB = this.i.b(i2);
        if (iB <= 0) {
            this.i.a(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[iB];
        int iA = this.i.a(bArr, i, i2, bArr2, 0);
        if (iA == 0) {
            return null;
        }
        if (iA == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[iA];
        System.arraycopy(bArr2, 0, bArr3, 0, iA);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.i.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void engineInit(int r11, java.security.Key r12, java.security.spec.AlgorithmParameterSpec r13, java.security.SecureRandom r14) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }
}
