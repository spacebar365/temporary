package org.bouncycastle.c.b;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
final class b implements PrivilegedAction {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        a.a(this.a);
        return null;
    }
}
