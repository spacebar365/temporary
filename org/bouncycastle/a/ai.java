package org.bouncycastle.a;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
final class ai implements Enumeration {
    int a = 0;
    final /* synthetic */ ah b;

    ai(ah ahVar) {
        this.b = ahVar;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a < ah.a(this.b).length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        q[] qVarArrA = ah.a(this.b);
        int i = this.a;
        this.a = i + 1;
        return qVarArrA[i];
    }
}
