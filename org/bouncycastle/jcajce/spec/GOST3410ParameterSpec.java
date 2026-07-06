package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.f.b;
import org.bouncycastle.a.p;
import org.bouncycastle.a.t.a;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410ParameterSpec implements AlgorithmParameterSpec {
    private final p a;
    private final p b;
    private final p c;

    private GOST3410ParameterSpec(p pVar, p pVar2) {
        this.a = pVar;
        this.b = pVar2;
        this.c = null;
    }

    public final p a() {
        return this.a;
    }

    public final p b() {
        return this.b;
    }

    public final p c() {
        return this.c;
    }

    public GOST3410ParameterSpec(String str) {
        this(b.b(str), str.indexOf("12-512") > 0 ? a.d : str.indexOf("12-256") > 0 ? a.c : org.bouncycastle.a.f.a.p);
    }
}
