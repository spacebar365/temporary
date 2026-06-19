package p000a.p029g;

/* JADX INFO: renamed from: a.g.p */
/* JADX INFO: compiled from: NtlmAuthenticator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0256p {

    /* JADX INFO: renamed from: a */
    private static AbstractC0256p f1176a;

    /* JADX INFO: renamed from: b */
    private String f1177b;

    /* JADX INFO: renamed from: c */
    private C0212ab f1178c;

    /* JADX INFO: renamed from: a */
    public static AbstractC0256p m883a() {
        return f1176a;
    }

    /* JADX INFO: renamed from: a */
    public static C0259s m884a(AbstractC0256p abstractC0256p, String str, C0212ab c0212ab) {
        if (abstractC0256p != null) {
            synchronized (abstractC0256p) {
                abstractC0256p.f1177b = str;
                abstractC0256p.f1178c = c0212ab;
            }
        }
        return null;
    }
}
