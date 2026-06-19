package org.bouncycastle.p083b.p088d;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: org.bouncycastle.b.d.e */
/* JADX INFO: loaded from: classes.dex */
final class C0889e implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0887c f3645a;

    C0889e(C0887c c0887c) {
        this.f3645a = c0887c;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty("org.bouncycastle.pkcs1.not_strict");
    }
}
