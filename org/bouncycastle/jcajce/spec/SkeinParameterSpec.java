package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SkeinParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private Map f6267a;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private Map f6268a = new HashMap();
    }

    public SkeinParameterSpec() {
        this(new HashMap());
    }

    private SkeinParameterSpec(Map map) {
        this.f6267a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public final Map m4512a() {
        return this.f6267a;
    }
}
