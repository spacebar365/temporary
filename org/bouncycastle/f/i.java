package org.bouncycastle.f;

import java.security.PrivilegedAction;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class i implements PrivilegedAction {
    final /* synthetic */ String a;

    i(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Map map = (Map) h.a().get();
        return map != null ? map.get(this.a) : System.getProperty(this.a);
    }
}
