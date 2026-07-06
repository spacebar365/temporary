package org.bouncycastle.jcajce.provider.drbg;

import java.security.PrivilegedAction;
import org.bouncycastle.b.m.e;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;

/* JADX INFO: loaded from: classes.dex */
final class DRBG$3 implements PrivilegedAction<e> {
    final /* synthetic */ String a;

    DRBG$3(String str) {
        this.a = str;
    }

    private e a() {
        try {
            return (e) ClassUtil.a(DRBG.class, this.a).newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("entropy source " + this.a + " not created: " + e.getMessage(), e);
        }
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ e run() {
        return a();
    }
}
