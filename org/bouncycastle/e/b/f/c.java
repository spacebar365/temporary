package org.bouncycastle.e.b.f;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.z.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(org.bouncycastle.e.a.e.X, new c$b((byte) 0));
        a.put(org.bouncycastle.e.a.e.Y, new c$b((byte) 0));
        a.put(org.bouncycastle.e.a.e.Z, new c$b((byte) 0));
        a.put(org.bouncycastle.e.a.e.aa, new c$b((byte) 0));
        a.put(org.bouncycastle.e.a.e.ab, new c$b((byte) 0));
        a.put(org.bouncycastle.e.a.e.r, new c$c((byte) 0));
        a.put(org.bouncycastle.e.a.e.v, new c$a((byte) 0));
        a.put(org.bouncycastle.e.a.e.w, new c$e((byte) 0));
        a.put(org.bouncycastle.e.a.e.F, new c$f((byte) 0));
    }

    public static org.bouncycastle.b.k.b a(u uVar) throws IOException {
        org.bouncycastle.a.z.a aVarA = uVar.a();
        c$d c_d = (c$d) a.get(aVarA.a());
        if (c_d != null) {
            return c_d.a(uVar);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + aVarA.a());
    }
}
