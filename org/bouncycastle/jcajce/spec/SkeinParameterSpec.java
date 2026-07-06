package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SkeinParameterSpec implements AlgorithmParameterSpec {
    private Map a;

    public SkeinParameterSpec() {
        this(new HashMap());
    }

    private SkeinParameterSpec(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public final Map a() {
        return this.a;
    }
}
