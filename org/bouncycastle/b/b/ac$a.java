package org.bouncycastle.b.b;

import org.bouncycastle.b.e.ba;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class ac$a {
    private byte[] a = new byte[32];

    public ac$a(long j) {
        this.a[0] = 83;
        this.a[1] = 72;
        this.a[2] = 65;
        this.a[3] = 51;
        this.a[4] = 1;
        this.a[5] = 0;
        ba.a(j, this.a, 8);
    }

    public final byte[] a() {
        return this.a;
    }
}
