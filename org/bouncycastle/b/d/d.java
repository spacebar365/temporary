package org.bouncycastle.b.d;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
final class d implements PrivilegedAction {
    final /* synthetic */ c a;

    d(c cVar) {
        this.a = cVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty("org.bouncycastle.pkcs1.strict");
    }
}
