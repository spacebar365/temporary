package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
final class ClassUtil$1 implements PrivilegedAction {
    final /* synthetic */ String a;

    ClassUtil$1(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return Class.forName(this.a);
        } catch (Exception e) {
            return null;
        }
    }
}
