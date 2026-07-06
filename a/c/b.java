package a.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;

/* JADX INFO: compiled from: DcerpcBinding.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final Map<String, String> a;
    private String b;
    private String d;
    private int g;
    private int h;
    private Map<String, Object> c = null;
    private String e = null;
    private j f = null;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        a.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        a.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        a.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        a.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        a.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        a.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    b(String str, String str2) {
        this.b = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    final j c() {
        return this.f;
    }

    final int d() {
        return this.g;
    }

    final int e() {
        return this.h;
    }

    final void a(String str, Object obj) throws e {
        String str2;
        if (str.equals("endpoint")) {
            this.e = obj.toString();
            String lowerCase = this.e.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\") && (str2 = a.get(lowerCase.substring(6))) != null) {
                int iIndexOf = str2.indexOf(58);
                int iIndexOf2 = str2.indexOf(46, iIndexOf + 1);
                this.f = new j(str2.substring(0, iIndexOf));
                this.g = Integer.parseInt(str2.substring(iIndexOf + 1, iIndexOf2));
                this.h = Integer.parseInt(str2.substring(iIndexOf2 + 1));
                return;
            }
            throw new e("Bad endpoint: " + this.e);
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, obj);
    }

    final Object a(String str) {
        if (str.equals("endpoint")) {
            return this.e;
        }
        if (this.c != null) {
            return this.c.get(str);
        }
        return null;
    }

    public final String toString() {
        String str;
        String str2 = this.b + ":" + this.d + "[" + this.e;
        if (this.c != null) {
            Iterator<Map$Entry<String, Object>> it = this.c.entrySet().iterator();
            while (true) {
                str = str2;
                if (!it.hasNext()) {
                    break;
                }
                Map$Entry<String, Object> next = it.next();
                str2 = str + "," + next.getKey() + "=" + next.getValue();
            }
        } else {
            str = str2;
        }
        return str + "]";
    }
}
