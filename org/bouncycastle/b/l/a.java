package org.bouncycastle.b.l;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.k;
import org.bouncycastle.b.y;

/* JADX INFO: loaded from: classes.dex */
public final class a implements y {
    private i a;

    public a(i iVar) {
        this.a = iVar;
    }

    @Override // org.bouncycastle.b.y
    public final org.bouncycastle.b.k.b a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[(this.a.a().bitLength() + 7) / 8];
        org.bouncycastle.f.b.a.a(inputStream, bArr, 0, bArr.length);
        return new k(new BigInteger(1, bArr), this.a);
    }
}
