package org.bouncycastle.b.n;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.k.aj;
import org.bouncycastle.b.k.ak;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class j$a extends ByteArrayOutputStream {
    private j$a() {
    }

    /* synthetic */ j$a(byte b) {
        this();
    }

    final synchronized boolean a(ak akVar, byte[] bArr, byte[] bArr2) {
        boolean zA;
        zA = org.bouncycastle.d.a.d.b.a(bArr2, akVar.b(), bArr, this.buf, this.count);
        reset();
        return zA;
    }

    final synchronized byte[] a(aj ajVar, ak akVar, byte[] bArr) {
        byte[] bArr2;
        bArr2 = new byte[114];
        ajVar.a(akVar, bArr, this.buf, this.count, bArr2);
        reset();
        return bArr2;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized void reset() {
        org.bouncycastle.f.a.b(this.buf, 0, this.count);
        this.count = 0;
    }
}
