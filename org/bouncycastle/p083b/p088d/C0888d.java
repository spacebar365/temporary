package org.bouncycastle.p083b.p088d;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: org.bouncycastle.b.d.d */
/* JADX INFO: loaded from: classes.dex */
final class C0888d implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0887c f3644a;

    C0888d(C0887c c0887c) {
        this.f3644a = c0887c;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty("org.bouncycastle.pkcs1.strict");
    }
}
