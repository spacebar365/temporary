package org.bouncycastle.p142f;

import java.security.PrivilegedAction;
import java.util.Map;

/* JADX INFO: renamed from: org.bouncycastle.f.i */
/* JADX INFO: loaded from: classes.dex */
final class C1558i implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f5513a;

    C1558i(String str) {
        this.f5513a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Map map = (Map) C1557h.f5512a.get();
        return map != null ? map.get(this.f5513a) : System.getProperty(this.f5513a);
    }
}
