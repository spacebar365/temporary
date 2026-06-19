package p000a.p026e;

import p000a.EnumC0294r;

/* JADX INFO: renamed from: a.e.f */
/* JADX INFO: compiled from: NameServiceClientImpl.java */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C0188f {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f867a = new int[EnumC0294r.values().length];

    static {
        try {
            f867a[EnumC0294r.RESOLVER_LMHOSTS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f867a[EnumC0294r.RESOLVER_WINS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f867a[EnumC0294r.RESOLVER_BCAST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f867a[EnumC0294r.RESOLVER_DNS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
