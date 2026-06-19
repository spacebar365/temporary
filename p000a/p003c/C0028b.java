package p000a.p003c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: a.c.b */
/* JADX INFO: compiled from: DcerpcBinding.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0028b {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f171a;

    /* JADX INFO: renamed from: b */
    private String f172b;

    /* JADX INFO: renamed from: d */
    private String f174d;

    /* JADX INFO: renamed from: g */
    private int f177g;

    /* JADX INFO: renamed from: h */
    private int f178h;

    /* JADX INFO: renamed from: c */
    private Map<String, Object> f173c = null;

    /* JADX INFO: renamed from: e */
    private String f175e = null;

    /* JADX INFO: renamed from: f */
    private C0041j f176f = null;

    static {
        HashMap map = new HashMap();
        f171a = map;
        map.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        f171a.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        f171a.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        f171a.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        f171a.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        f171a.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        f171a.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    C0028b(String str, String str2) {
        this.f172b = str;
        this.f174d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m131a() {
        return this.f174d;
    }

    /* JADX INFO: renamed from: b */
    public final String m133b() {
        return this.f175e;
    }

    /* JADX INFO: renamed from: c */
    final C0041j m134c() {
        return this.f176f;
    }

    /* JADX INFO: renamed from: d */
    final int m135d() {
        return this.f177g;
    }

    /* JADX INFO: renamed from: e */
    final int m136e() {
        return this.f178h;
    }

    /* JADX INFO: renamed from: a */
    final void m132a(String str, Object obj) throws C0036e {
        String str2;
        if (str.equals("endpoint")) {
            this.f175e = obj.toString();
            String lowerCase = this.f175e.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\") && (str2 = f171a.get(lowerCase.substring(6))) != null) {
                int iIndexOf = str2.indexOf(58);
                int iIndexOf2 = str2.indexOf(46, iIndexOf + 1);
                this.f176f = new C0041j(str2.substring(0, iIndexOf));
                this.f177g = Integer.parseInt(str2.substring(iIndexOf + 1, iIndexOf2));
                this.f178h = Integer.parseInt(str2.substring(iIndexOf2 + 1));
                return;
            }
            throw new C0036e("Bad endpoint: " + this.f175e);
        }
        if (this.f173c == null) {
            this.f173c = new HashMap();
        }
        this.f173c.put(str, obj);
    }

    /* JADX INFO: renamed from: a */
    final Object m130a(String str) {
        if (str.equals("endpoint")) {
            return this.f175e;
        }
        if (this.f173c != null) {
            return this.f173c.get(str);
        }
        return null;
    }

    public final String toString() {
        String str;
        String str2 = this.f172b + ":" + this.f174d + "[" + this.f175e;
        if (this.f173c != null) {
            Iterator<Map.Entry<String, Object>> it = this.f173c.entrySet().iterator();
            while (true) {
                str = str2;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Object> next = it.next();
                str2 = str + "," + next.getKey() + "=" + next.getValue();
            }
        } else {
            str = str2;
        }
        return str + "]";
    }
}
