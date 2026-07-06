package org.bouncycastle.b.n;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.k.ag;
import org.bouncycastle.b.k.ah;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class i$a extends ByteArrayOutputStream {
    private i$a() {
    }

    /* synthetic */ i$a(byte b) {
        this();
    }

    final synchronized boolean a(ah ahVar, byte[] bArr) {
        boolean zA;
        zA = org.bouncycastle.d.a.d.a.a(bArr, ahVar.b(), this.buf, this.count);
        reset();
        return zA;
    }

    final synchronized byte[] a(ag agVar, ah ahVar) {
        byte[] bArr;
        bArr = new byte[64];
        agVar.a(ahVar, this.buf, this.count, bArr);
        reset();
        return bArr;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized void reset() {
        org.bouncycastle.f.a.b(this.buf, 0, this.count);
        this.count = 0;
    }
}
