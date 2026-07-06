package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bs extends a {
    bs(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // org.bouncycastle.a.a, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        sVar.a(this.a ? 96 : 64, this.b, this.c);
    }
}
