package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;
import org.bouncycastle.b.e;
import org.bouncycastle.b.i;
import org.bouncycastle.b.i.a;
import org.bouncycastle.b.v;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class BaseBlockCipher$AEADGenericBlockCipher implements BaseBlockCipher$GenericBlockCipher {
    private static final Constructor a;
    private a b;

    static {
        Class clsA = ClassUtil.a(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
        if (clsA != null) {
            a = a(clsA);
        } else {
            a = null;
        }
    }

    BaseBlockCipher$AEADGenericBlockCipher(a aVar) {
        this.b = aVar;
    }

    private static Constructor a(Class cls) {
        try {
            return cls.getConstructor(String.class);
        } catch (Exception e) {
            return null;
        }
    }

    static /* synthetic */ a a(BaseBlockCipher$AEADGenericBlockCipher baseBlockCipher$AEADGenericBlockCipher) {
        return baseBlockCipher$AEADGenericBlockCipher.b;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int a(int i) {
        return this.b.b(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int a(byte[] bArr, int i) throws BadPaddingException {
        BadPaddingException badPaddingException;
        try {
            return this.b.a(bArr, i);
        } catch (v e) {
            if (a != null) {
                try {
                    badPaddingException = (BadPaddingException) a.newInstance(e.getMessage());
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.b.a(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final String a() {
        return this.b.a().a();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final void a(boolean z, i iVar) {
        this.b.a(z, iVar);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final void a(byte[] bArr, int i, int i2) {
        this.b.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int b(int i) {
        return this.b.a(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final boolean b() {
        return false;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final e c() {
        return this.b.a();
    }
}
