package a.d.a;

import a.k;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: DfsReferralDataImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements b {
    private static final org.c.b a = org.c.c.a((Class<?>) a.class);
    private int b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private long h;
    private int i;
    private boolean j;
    private a k = this;
    private Map<String, b> l;
    private String m;
    private String n;
    private boolean o;

    @Override // a.k
    public final <T extends k> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // a.k
    public final long f() {
        return this.h;
    }

    @Override // a.k
    public final int d() {
        return this.b;
    }

    @Override // a.k
    public final String b() {
        return this.n;
    }

    public final void a(String str) {
        this.n = str;
    }

    @Override // a.k
    public final String h() {
        return this.f;
    }

    @Override // a.d.a.b
    public final void b(String str) {
        this.f = str;
    }

    @Override // a.d.a.b
    public final void c(String str) {
        this.m = str;
    }

    @Override // a.k
    public final String a() {
        return this.d;
    }

    @Override // a.k
    public final String c() {
        return this.e;
    }

    @Override // a.k
    public final String e() {
        return this.g;
    }

    public final int i() {
        return this.i;
    }

    @Override // a.d.a.b
    public final void a(Map<String, b> map) {
        this.l = map;
    }

    @Override // a.d.a.b
    public final void j() {
        if (this.l != null && this.m != null) {
            this.l.put(this.m, this);
        }
    }

    @Override // a.d.a.b
    public final void a(b bVar) {
        a aVar = (a) bVar;
        aVar.k = this.k;
        this.k = aVar;
    }

    @Override // a.d.a.b
    public final void a(int i) {
        if (i > this.b) {
            throw new IllegalArgumentException("Stripping more than consumed");
        }
        this.b -= i;
    }

    @Override // a.d.a.b
    public final boolean k() {
        return this.j;
    }

    public final void l() {
        this.o = true;
    }

    @Override // a.d.a.b
    public final boolean m() {
        return this.o;
    }

    public String toString() {
        return "DfsReferralData[pathConsumed=" + this.b + ",server=" + this.d + ",share=" + this.e + ",link=" + this.f + ",path=" + this.g + ",ttl=" + this.c + ",expiration=" + this.h + ",remain=" + (this.h - System.currentTimeMillis()) + "]";
    }

    public int hashCode() {
        return Objects.hash(this.d, this.e, this.g, Integer.valueOf(this.b));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.d, kVar.a()) && Objects.equals(this.e, kVar.c()) && Objects.equals(this.g, kVar.e()) && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(kVar.d()));
    }

    public static a a(e eVar, String str, long j, int i) {
        a aVar = new a();
        String[] strArr = new String[4];
        aVar.c = eVar.g;
        aVar.i = eVar.d;
        aVar.h = j;
        if ((aVar.i & 2) != 2) {
            if (a.c()) {
                a.b("Node " + eVar.i + " path " + str + " remain " + str.substring(i) + " path consumed " + i);
            }
            a(eVar.i, strArr);
            aVar.d = strArr[1];
            aVar.e = strArr[2];
            aVar.g = strArr[3];
            aVar.b = i;
            if (str.charAt(i - 1) == '\\') {
                if (a.c()) {
                    a.b("Server consumed trailing slash of request path, adjusting");
                }
                aVar.b--;
            }
            if (a.c()) {
                a.b("Request " + str + " ref path " + aVar.g + " consumed " + aVar.b + ": " + str.substring(0, i));
            }
        } else {
            String[] strArr2 = eVar.k;
            if (strArr2.length > 0) {
                aVar.d = strArr2[0].substring(1).toLowerCase();
            } else {
                aVar.d = eVar.j.substring(1).toLowerCase();
            }
            if (a.c()) {
                a.b("Server " + aVar.d + " path " + str + " remain " + str.substring(i) + " path consumed " + i);
            }
            aVar.b = i;
        }
        return aVar;
    }

    @Override // a.d.a.b
    public final b a(k kVar) {
        a aVar = new a();
        aVar.d = kVar.a();
        aVar.e = kVar.c();
        aVar.h = kVar.f();
        aVar.g = kVar.e();
        aVar.b = this.b + kVar.d();
        if (this.g != null) {
            aVar.b -= this.g != null ? this.g.length() + 1 : 0;
        }
        aVar.n = kVar.b();
        return aVar;
    }

    private static int a(String str, String[] strArr) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 == 3) {
                strArr[3] = str.substring(i2);
                break;
            }
            if (i3 == length || str.charAt(i3) == '\\') {
                strArr[i4] = str.substring(i2, i3);
                i++;
                i2 = i3 + 1;
                i4++;
            }
            int i5 = i3 + 1;
            if (i3 >= length) {
                while (i4 < 4) {
                    strArr[i4] = "";
                    i4++;
                }
            } else {
                i3 = i5;
            }
        }
        return i;
    }

    public final void d(String str) {
        String str2 = this.d;
        if (str2.indexOf(46) < 0 && str2.toUpperCase(Locale.ROOT).equals(str2)) {
            String str3 = str2 + "." + str;
            if (a.c()) {
                a.b(String.format("Applying DFS netbios name hack %s -> %s ", str2, str3));
            }
            this.d = str3;
        }
    }

    @Override // a.d.a.b
    public final void e(String str) {
        String str2 = this.d;
        if (str2.indexOf(46) < 0 && str2.toUpperCase(Locale.ROOT).equals(str2)) {
            if (str.startsWith(str2.toLowerCase(Locale.ROOT) + ".")) {
                if (a.c()) {
                    a.b("Adjusting server name " + str2 + " to " + str);
                }
                this.d = str;
                return;
            }
            a.d("Have unmappable netbios name ".concat(String.valueOf(str2)));
        }
    }

    @Override // a.d.a.b
    public final /* bridge */ /* synthetic */ b n() {
        return this.k;
    }

    @Override // a.k
    public final /* bridge */ /* synthetic */ k g() {
        return this.k;
    }
}
