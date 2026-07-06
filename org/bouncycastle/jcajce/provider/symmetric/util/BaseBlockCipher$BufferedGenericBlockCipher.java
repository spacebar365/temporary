package org.bouncycastle.jcajce.provider.symmetric.util;

import javax.crypto.BadPaddingException;
import org.bouncycastle.b.e;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i;
import org.bouncycastle.b.j.a;
import org.bouncycastle.b.v;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class BaseBlockCipher$BufferedGenericBlockCipher implements BaseBlockCipher$GenericBlockCipher {
    private f a;

    BaseBlockCipher$BufferedGenericBlockCipher(e eVar) {
        this.a = new org.bouncycastle.b.j.e(eVar);
    }

    BaseBlockCipher$BufferedGenericBlockCipher(e eVar, a aVar) {
        this.a = new org.bouncycastle.b.j.e(eVar, aVar);
    }

    BaseBlockCipher$BufferedGenericBlockCipher(f fVar) {
        this.a = fVar;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int a(int i) {
        return this.a.b(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int a(byte[] bArr, int i) throws BadPaddingException {
        try {
            return this.a.a(bArr, i);
        } catch (v e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.a.a(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final String a() {
        return this.a.a().a();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final void a(boolean z, i iVar) {
        this.a.a(z, iVar);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final void a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("AAD is not supported in the current mode.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final int b(int i) {
        return this.a.a(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final boolean b() {
        return !(this.a instanceof org.bouncycastle.b.i.e);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher
    public final e c() {
        return this.a.a();
    }
}
