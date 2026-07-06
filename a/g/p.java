package a.g;

/* JADX INFO: compiled from: NtlmAuthenticator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    private static p a;
    private String b;
    private ab c;

    public static p a() {
        return a;
    }

    public static s a(p pVar, String str, ab abVar) {
        if (pVar != null) {
            synchronized (pVar) {
                pVar.b = str;
                pVar.c = abVar;
            }
        }
        return null;
    }
}
