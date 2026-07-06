package org.bouncycastle.f;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
final class l implements PrivilegedAction<String> {
    l() {
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ String run() {
        return System.getProperty("line.separator");
    }
}
