package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
public final class l$a {
    public static final l$a a = new l$a("ecImplicitlyCA", org.bouncycastle.a.aa.ad.class);
    public static final l$a b = new l$a("dhDefaultParams", org.bouncycastle.b.k.i.class);
    public static final l$a c = new l$a("dsaDefaultParams", org.bouncycastle.b.k.r.class);
    private final String d;
    private final Class e;

    private l$a(String str, Class cls) {
        this.d = str;
        this.e = cls;
    }

    static /* synthetic */ String a(l$a l_a) {
        return l_a.d;
    }

    static /* synthetic */ Class b(l$a l_a) {
        return l_a.e;
    }
}
