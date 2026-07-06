package org.bouncycastle.a.n;

import org.bouncycastle.a.au;

/* JADX INFO: loaded from: classes.dex */
public final class d extends au {
    public d(au auVar) {
        super(auVar.d(), auVar.f());
    }

    @Override // org.bouncycastle.a.c
    public final String toString() {
        return "NetscapeCertType: 0x" + Integer.toHexString(this.a[0] & 255);
    }
}
