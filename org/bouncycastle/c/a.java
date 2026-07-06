package org.bouncycastle.c;

import org.bouncycastle.a.p;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.c.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static c a(String str) {
        y yVarA = org.bouncycastle.a.f.b.a(str);
        if (yVarA == null) {
            try {
                yVarA = org.bouncycastle.a.f.b.a(new p(str));
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
        if (yVarA == null) {
            return null;
        }
        return new c(str, yVarA.a(), yVarA.b(), yVarA.c(), yVarA.d(), yVarA.f());
    }
}
