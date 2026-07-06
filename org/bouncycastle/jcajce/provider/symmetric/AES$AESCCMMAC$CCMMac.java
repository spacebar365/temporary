package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.a;
import org.bouncycastle.b.i;
import org.bouncycastle.b.i.c;
import org.bouncycastle.b.v;
import org.bouncycastle.b.z;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class AES$AESCCMMAC$CCMMac implements z {
    private final c a;
    private int b;

    private AES$AESCCMMAC$CCMMac() {
        this.a = new c(new a());
        this.b = 8;
    }

    /* synthetic */ AES$AESCCMMAC$CCMMac(byte b) {
        this();
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        try {
            return this.a.a(bArr, 0);
        } catch (v e) {
            throw new IllegalStateException("exception on doFinal(): " + e.toString());
        }
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.a.c() + "Mac";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.z
    public final void a(i iVar) {
        this.a.a(true, iVar);
        this.b = this.a.b().length;
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.a.d();
    }
}
