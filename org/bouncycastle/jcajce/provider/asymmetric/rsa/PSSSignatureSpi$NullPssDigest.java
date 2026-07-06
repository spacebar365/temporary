package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.r;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi$NullPssDigest implements r {
    final /* synthetic */ PSSSignatureSpi a;
    private r c;
    private ByteArrayOutputStream b = new ByteArrayOutputStream();
    private boolean d = true;

    public PSSSignatureSpi$NullPssDigest(PSSSignatureSpi pSSSignatureSpi, r rVar) {
        this.a = pSSSignatureSpi;
        this.c = rVar;
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        byte[] byteArray = this.b.toByteArray();
        if (this.d) {
            System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
        } else {
            this.c.a(byteArray, 0, byteArray.length);
            this.c.a(bArr, i);
        }
        c();
        this.d = this.d ? false : true;
        return byteArray.length;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "NULL";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        this.b.write(b);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        this.b.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.c.b();
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.b.reset();
        this.c.c();
    }
}
