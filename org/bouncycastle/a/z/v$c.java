package org.bouncycastle.a.z;

import java.util.Enumeration;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class v$c implements Enumeration {
    final /* synthetic */ v a;
    private final Enumeration b;

    v$c(v vVar, Enumeration enumeration) {
        this.a = vVar;
        this.b = enumeration;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return v$a.a(this.b.nextElement());
    }
}
