package org.bouncycastle.b.m;

import org.bouncycastle.b.z;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class h$a implements c {
    private final z a;
    private final byte[] b;
    private final byte[] c;
    private final int d;

    public h$a(z zVar, byte[] bArr, byte[] bArr2, int i) {
        this.a = zVar;
        this.b = bArr;
        this.c = bArr2;
        this.d = i;
    }

    @Override // org.bouncycastle.b.m.c
    public final org.bouncycastle.b.m.a.c a(d dVar) {
        return new org.bouncycastle.b.m.a.a(this.a, this.d, dVar, this.c, this.b);
    }
}
