package org.bouncycastle.f.b.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    private static final List a = Collections.unmodifiableList(new ArrayList());
    private String b;
    private List c;
    private byte[] d;

    private c(String str, List list, byte[] bArr) {
        this.b = str;
        this.c = Collections.unmodifiableList(list);
        this.d = bArr;
    }

    public c(String str, byte[] bArr) {
        this(str, a, bArr);
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final byte[] c() {
        return this.d;
    }

    @Override // org.bouncycastle.f.b.a.d
    public final c d() {
        return this;
    }
}
