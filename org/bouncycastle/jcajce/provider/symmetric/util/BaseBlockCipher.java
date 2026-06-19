package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.p054a.p059d.C0615b;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p089e.C0941r;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1018c;
import org.bouncycastle.p083b.p093i.C1019d;
import org.bouncycastle.p083b.p093i.C1020e;
import org.bouncycastle.p083b.p093i.C1021f;
import org.bouncycastle.p083b.p093i.C1026k;
import org.bouncycastle.p083b.p093i.C1027l;
import org.bouncycastle.p083b.p093i.C1028m;
import org.bouncycastle.p083b.p093i.C1030o;
import org.bouncycastle.p083b.p093i.C1031p;
import org.bouncycastle.p083b.p093i.C1032q;
import org.bouncycastle.p083b.p093i.C1033r;
import org.bouncycastle.p083b.p093i.C1034s;
import org.bouncycastle.p083b.p093i.C1035t;
import org.bouncycastle.p083b.p093i.C1036u;
import org.bouncycastle.p083b.p093i.C1037v;
import org.bouncycastle.p083b.p093i.InterfaceC1004a;
import org.bouncycastle.p083b.p096j.C1040b;
import org.bouncycastle.p083b.p096j.C1041c;
import org.bouncycastle.p083b.p096j.C1043e;
import org.bouncycastle.p083b.p096j.C1044f;
import org.bouncycastle.p083b.p096j.C1045g;
import org.bouncycastle.p083b.p096j.C1046h;
import org.bouncycastle.p083b.p096j.InterfaceC1039a;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {

    /* JADX INFO: renamed from: e */
    private static final Class f6159e = ClassUtil.m4466a(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");

    /* JADX INFO: renamed from: f */
    private Class[] f6160f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0890e f6161g;

    /* JADX INFO: renamed from: h */
    private BlockCipherProvider f6162h;

    /* JADX INFO: renamed from: i */
    private GenericBlockCipher f6163i;

    /* JADX INFO: renamed from: j */
    private C1080be f6164j;

    /* JADX INFO: renamed from: k */
    private C1048a f6165k;

    /* JADX INFO: renamed from: l */
    private int f6166l;

    /* JADX INFO: renamed from: m */
    private int f6167m;

    /* JADX INFO: renamed from: n */
    private int f6168n;

    /* JADX INFO: renamed from: o */
    private int f6169o;

    /* JADX INFO: renamed from: p */
    private boolean f6170p;

    /* JADX INFO: renamed from: q */
    private boolean f6171q;

    /* JADX INFO: renamed from: r */
    private PBEParameterSpec f6172r;

    /* JADX INFO: renamed from: s */
    private String f6173s;

    /* JADX INFO: renamed from: t */
    private String f6174t;

    private static class AEADGenericBlockCipher implements GenericBlockCipher {

        /* JADX INFO: renamed from: a */
        private static final Constructor f6175a;

        /* JADX INFO: renamed from: b */
        private InterfaceC1004a f6176b;

        static {
            Class clsM4466a = ClassUtil.m4466a(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            if (clsM4466a != null) {
                f6175a = m4451a(clsM4466a);
            } else {
                f6175a = null;
            }
        }

        AEADGenericBlockCipher(InterfaceC1004a interfaceC1004a) {
            this.f6176b = interfaceC1004a;
        }

        /* JADX INFO: renamed from: a */
        private static Constructor m4451a(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception e) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final int mo4453a(int i) {
            return this.f6176b.mo2478b(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final int mo4454a(byte[] bArr, int i) throws BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.f6176b.mo2473a(bArr, i);
            } catch (C1179v e) {
                if (f6175a != null) {
                    try {
                        badPaddingException = (BadPaddingException) f6175a.newInstance(e.getMessage());
                    } catch (Exception e2) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final int mo4455a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.f6176b.mo2474a(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final String mo4456a() {
            return this.f6176b.mo2475a().mo2123a();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final void mo4457a(boolean z, InterfaceC1003i interfaceC1003i) {
            this.f6176b.mo2476a(z, interfaceC1003i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final void mo4458a(byte[] bArr, int i, int i2) {
            this.f6176b.mo2477a(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: b */
        public final int mo4459b(int i) {
            return this.f6176b.mo2472a(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: b */
        public final boolean mo4460b() {
            return false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: c */
        public final InterfaceC0890e mo4461c() {
            return this.f6176b.mo2475a();
        }
    }

    private static class BufferedGenericBlockCipher implements GenericBlockCipher {

        /* JADX INFO: renamed from: a */
        private C0950f f6177a;

        BufferedGenericBlockCipher(InterfaceC0890e interfaceC0890e) {
            this.f6177a = new C1043e(interfaceC0890e);
        }

        BufferedGenericBlockCipher(InterfaceC0890e interfaceC0890e, InterfaceC1039a interfaceC1039a) {
            this.f6177a = new C1043e(interfaceC0890e, interfaceC1039a);
        }

        BufferedGenericBlockCipher(C0950f c0950f) {
            this.f6177a = c0950f;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final int mo4453a(int i) {
            return this.f6177a.mo2405b(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final int mo4454a(byte[] bArr, int i) throws BadPaddingException {
            try {
                return this.f6177a.mo2400a(bArr, i);
            } catch (C1179v e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final int mo4455a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.f6177a.mo2401a(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final String mo4456a() {
            return this.f6177a.m2402a().mo2123a();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final void mo4457a(boolean z, InterfaceC1003i interfaceC1003i) {
            this.f6177a.mo2403a(z, interfaceC1003i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: a */
        public final void mo4458a(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: b */
        public final int mo4459b(int i) {
            return this.f6177a.mo2399a(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: b */
        public final boolean mo4460b() {
            return !(this.f6177a instanceof C1020e);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        /* JADX INFO: renamed from: c */
        public final InterfaceC0890e mo4461c() {
            return this.f6177a.m2402a();
        }
    }

    private interface GenericBlockCipher {
        /* JADX INFO: renamed from: a */
        int mo4453a(int i);

        /* JADX INFO: renamed from: a */
        int mo4454a(byte[] bArr, int i);

        /* JADX INFO: renamed from: a */
        int mo4455a(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        /* JADX INFO: renamed from: a */
        String mo4456a();

        /* JADX INFO: renamed from: a */
        void mo4457a(boolean z, InterfaceC1003i interfaceC1003i);

        /* JADX INFO: renamed from: a */
        void mo4458a(byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: b */
        int mo4459b(int i);

        /* JADX INFO: renamed from: b */
        boolean mo4460b();

        /* JADX INFO: renamed from: c */
        InterfaceC0890e mo4461c();
    }

    protected BaseBlockCipher(InterfaceC0890e interfaceC0890e) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = interfaceC0890e;
        this.f6163i = new BufferedGenericBlockCipher(interfaceC0890e);
    }

    protected BaseBlockCipher(InterfaceC0890e interfaceC0890e, int i) {
        this(interfaceC0890e, true, i);
    }

    protected BaseBlockCipher(InterfaceC0890e interfaceC0890e, int i, int i2, int i3, int i4) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = interfaceC0890e;
        this.f6167m = i;
        this.f6168n = i2;
        this.f6166l = i3;
        this.f6169o = i4;
        this.f6163i = new BufferedGenericBlockCipher(interfaceC0890e);
    }

    protected BaseBlockCipher(InterfaceC0890e interfaceC0890e, boolean z, int i) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = interfaceC0890e;
        this.f6171q = z;
        this.f6163i = new BufferedGenericBlockCipher(interfaceC0890e);
        this.f6169o = i / 8;
    }

    protected BaseBlockCipher(C0950f c0950f, int i) {
        this(c0950f, true, i);
    }

    protected BaseBlockCipher(C0950f c0950f, boolean z, int i) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = c0950f.m2402a();
        this.f6163i = new BufferedGenericBlockCipher(c0950f);
        this.f6171q = z;
        this.f6169o = i / 8;
    }

    protected BaseBlockCipher(InterfaceC1004a interfaceC1004a) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = interfaceC1004a.mo2475a();
        this.f6169o = this.f6161g.mo2125b();
        this.f6163i = new AEADGenericBlockCipher(interfaceC1004a);
    }

    protected BaseBlockCipher(InterfaceC1004a interfaceC1004a, byte b) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = interfaceC1004a.mo2475a();
        this.f6171q = false;
        this.f6169o = 16;
        this.f6163i = new AEADGenericBlockCipher(interfaceC1004a);
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.f6160f = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, f6159e, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.f6167m = -1;
        this.f6169o = 0;
        this.f6171q = true;
        this.f6172r = null;
        this.f6173s = null;
        this.f6174t = null;
        this.f6161g = blockCipherProvider.mo4430a();
        this.f6162h = blockCipherProvider;
        this.f6163i = new BufferedGenericBlockCipher(blockCipherProvider.mo4430a());
    }

    /* JADX INFO: renamed from: b */
    private static boolean m4450b(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, ShortBufferException {
        int iMo4455a = 0;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                iMo4455a = this.f6163i.mo4455a(bArr, i, i2, bArr2, i3);
            } catch (C0803ac e) {
                throw new IllegalBlockSizeException(e.getMessage());
            } catch (C1163o e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            }
        }
        return iMo4455a + this.f6163i.mo4454a(bArr2, i3 + iMo4455a);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException {
        byte[] bArr2 = new byte[engineGetOutputSize(i2)];
        int iMo4455a = i2 != 0 ? this.f6163i.mo4455a(bArr, i, i2, bArr2, 0) : 0;
        try {
            int iMo4454a = this.f6163i.mo4454a(bArr2, iMo4455a) + iMo4455a;
            if (iMo4454a == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[iMo4454a];
            System.arraycopy(bArr2, 0, bArr3, 0, iMo4454a);
            return bArr3;
        } catch (C1163o e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.f6161g.mo2125b();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        if (this.f6165k != null) {
            return this.f6165k.m2561d();
        }
        if (this.f6164j != null) {
            return this.f6164j.m2611a();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.f6163i.mo4453a(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f6200c == null) {
            if (this.f6172r != null) {
                try {
                    this.f6200c = m4463a(this.f6173s);
                    this.f6200c.init(this.f6172r);
                } catch (Exception e) {
                    return null;
                }
            } else if (this.f6165k != null) {
                try {
                    this.f6200c = m4463a("GCM");
                    this.f6200c.init(new C0615b(this.f6165k.m2561d(), this.f6165k.m2559b() / 8).mo1578k());
                } catch (Exception e2) {
                    throw new RuntimeException(e2.toString());
                }
            } else if (this.f6164j != null) {
                String strMo2123a = this.f6163i.mo4461c().mo2123a();
                if (strMo2123a.indexOf(47) >= 0) {
                    strMo2123a = strMo2123a.substring(0, strMo2123a.indexOf(47));
                }
                try {
                    this.f6200c = m4463a(strMo2123a);
                    this.f6200c.init(new IvParameterSpec(this.f6164j.m2611a()));
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        }
        return this.f6200c;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                if (i2 == this.f6160f.length) {
                    parameterSpec = null;
                    break;
                }
                if (this.f6160f[i2] != null) {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(this.f6160f[i2]);
                        break;
                    } catch (Exception e) {
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
        this.f6200c = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        this.f6174t = C1560k.m4163b(str);
        if (this.f6174t.equals("ECB")) {
            this.f6169o = 0;
            this.f6163i = new BufferedGenericBlockCipher(this.f6161g);
            return;
        }
        if (this.f6174t.equals("CBC")) {
            this.f6169o = this.f6161g.mo2125b();
            this.f6163i = new BufferedGenericBlockCipher(new C1010b(this.f6161g));
            return;
        }
        if (this.f6174t.startsWith("OFB")) {
            this.f6169o = this.f6161g.mo2125b();
            if (this.f6174t.length() == 3) {
                this.f6163i = new BufferedGenericBlockCipher(new C1034s(this.f6161g, this.f6161g.mo2125b() * 8));
                return;
            } else {
                this.f6163i = new BufferedGenericBlockCipher(new C1034s(this.f6161g, Integer.parseInt(this.f6174t.substring(3))));
                return;
            }
        }
        if (this.f6174t.startsWith("CFB")) {
            this.f6169o = this.f6161g.mo2125b();
            if (this.f6174t.length() == 3) {
                this.f6163i = new BufferedGenericBlockCipher(new C1019d(this.f6161g, this.f6161g.mo2125b() * 8));
                return;
            } else {
                this.f6163i = new BufferedGenericBlockCipher(new C1019d(this.f6161g, Integer.parseInt(this.f6174t.substring(3))));
                return;
            }
        }
        if (this.f6174t.startsWith("PGP")) {
            boolean zEqualsIgnoreCase = this.f6174t.equalsIgnoreCase("PGPCFBwithIV");
            this.f6169o = this.f6161g.mo2125b();
            this.f6163i = new BufferedGenericBlockCipher(new C1036u(this.f6161g, zEqualsIgnoreCase));
            return;
        }
        if (this.f6174t.equalsIgnoreCase("OpenPGPCFB")) {
            this.f6169o = 0;
            this.f6163i = new BufferedGenericBlockCipher(new C1035t(this.f6161g));
            return;
        }
        if (this.f6174t.startsWith("SIC")) {
            this.f6169o = this.f6161g.mo2125b();
            if (this.f6169o < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.f6171q = false;
            this.f6163i = new BufferedGenericBlockCipher(new C0950f(new C1037v(this.f6161g)));
            return;
        }
        if (this.f6174t.startsWith("CTR")) {
            this.f6169o = this.f6161g.mo2125b();
            this.f6171q = false;
            if (this.f6161g instanceof C0941r) {
                this.f6163i = new BufferedGenericBlockCipher(new C0950f(new C1031p(this.f6161g)));
                return;
            } else {
                this.f6163i = new BufferedGenericBlockCipher(new C0950f(new C1037v(this.f6161g)));
                return;
            }
        }
        if (this.f6174t.startsWith("GOFB")) {
            this.f6169o = this.f6161g.mo2125b();
            this.f6163i = new BufferedGenericBlockCipher(new C0950f(new C1028m(this.f6161g)));
            return;
        }
        if (this.f6174t.startsWith("GCFB")) {
            this.f6169o = this.f6161g.mo2125b();
            this.f6163i = new BufferedGenericBlockCipher(new C0950f(new C1026k(this.f6161g)));
            return;
        }
        if (this.f6174t.startsWith("CTS")) {
            this.f6169o = this.f6161g.mo2125b();
            this.f6163i = new BufferedGenericBlockCipher(new C1020e(new C1010b(this.f6161g)));
            return;
        }
        if (this.f6174t.startsWith("CCM")) {
            this.f6169o = 12;
            if (this.f6161g instanceof C0941r) {
                this.f6163i = new AEADGenericBlockCipher(new C1030o(this.f6161g));
                return;
            } else {
                this.f6163i = new AEADGenericBlockCipher(new C1018c(this.f6161g));
                return;
            }
        }
        if (this.f6174t.startsWith("OCB")) {
            if (this.f6162h == null) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
            this.f6169o = 15;
            this.f6163i = new AEADGenericBlockCipher(new C1033r(this.f6161g, this.f6162h.mo4430a()));
            return;
        }
        if (this.f6174t.startsWith("EAX")) {
            this.f6169o = this.f6161g.mo2125b();
            this.f6163i = new AEADGenericBlockCipher(new C1021f(this.f6161g));
        } else {
            if (!this.f6174t.startsWith("GCM")) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
            this.f6169o = this.f6161g.mo2125b();
            if (this.f6161g instanceof C0941r) {
                this.f6163i = new AEADGenericBlockCipher(new C1032q(this.f6161g));
            } else {
                this.f6163i = new AEADGenericBlockCipher(new C1027l(this.f6161g));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String strM4163b = C1560k.m4163b(str);
        if (strM4163b.equals("NOPADDING")) {
            if (this.f6163i.mo4460b()) {
                this.f6163i = new BufferedGenericBlockCipher(new C0950f(this.f6163i.mo4461c()));
                return;
            }
            return;
        }
        if (strM4163b.equals("WITHCTS") || strM4163b.equals("CTSPADDING") || strM4163b.equals("CS3PADDING")) {
            this.f6163i = new BufferedGenericBlockCipher(new C1020e(this.f6163i.mo4461c()));
            return;
        }
        this.f6170p = true;
        if (m4450b(this.f6174t)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (strM4163b.equals("PKCS5PADDING") || strM4163b.equals("PKCS7PADDING")) {
            this.f6163i = new BufferedGenericBlockCipher(this.f6163i.mo4461c());
            return;
        }
        if (strM4163b.equals("ZEROBYTEPADDING")) {
            this.f6163i = new BufferedGenericBlockCipher(this.f6163i.mo4461c(), new C1046h());
            return;
        }
        if (strM4163b.equals("ISO10126PADDING") || strM4163b.equals("ISO10126-2PADDING")) {
            this.f6163i = new BufferedGenericBlockCipher(this.f6163i.mo4461c(), new C1040b());
            return;
        }
        if (strM4163b.equals("X9.23PADDING") || strM4163b.equals("X923PADDING")) {
            this.f6163i = new BufferedGenericBlockCipher(this.f6163i.mo4461c(), new C1045g());
            return;
        }
        if (strM4163b.equals("ISO7816-4PADDING") || strM4163b.equals("ISO9797-1PADDING")) {
            this.f6163i = new BufferedGenericBlockCipher(this.f6163i.mo4461c(), new C1041c());
        } else {
            if (!strM4163b.equals("TBCPADDING")) {
                throw new NoSuchPaddingException("Padding " + str + " unknown.");
            }
            this.f6163i = new BufferedGenericBlockCipher(this.f6163i.mo4461c(), new C1044f());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.f6163i.mo4459b(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.f6163i.mo4455a(bArr, i, i2, bArr2, i3);
        } catch (C1163o e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int iMo4459b = this.f6163i.mo4459b(i2);
        if (iMo4459b <= 0) {
            this.f6163i.mo4455a(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[iMo4459b];
        int iMo4455a = this.f6163i.mo4455a(bArr, i, i2, bArr2, 0);
        if (iMo4455a == 0) {
            return null;
        }
        if (iMo4455a == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[iMo4455a];
        System.arraycopy(bArr2, 0, bArr3, 0, iMo4455a);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.f6163i.mo4458a(bArr, i, i2);
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
