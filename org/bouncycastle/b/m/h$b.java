package org.bouncycastle.b.m;

import org.bouncycastle.b.r;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class h$b implements c {
    private final r a;
    private final byte[] b;
    private final byte[] c;
    private final int d;

    public h$b(r rVar, byte[] bArr, byte[] bArr2, int i) {
        this.a = rVar;
        this.b = bArr;
        this.c = bArr2;
        this.d = i;
    }

    @Override // org.bouncycastle.b.m.c
    public final org.bouncycastle.b.m.a.c a(d dVar) {
        return new org.bouncycastle.b.m.a.b(this.a, this.d, dVar, this.c, this.b);
    }
}
