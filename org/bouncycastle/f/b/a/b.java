package org.bouncycastle.f.b.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private String a;
    private String b;

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    private static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar == this || (a(this.a, bVar.a) && a(this.b, bVar.b));
    }

    public final int hashCode() {
        return a(this.a) + (a(this.b) * 31);
    }
}
