package a.g;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;

/* JADX INFO: compiled from: SmbResourceLocatorImpl.java */
/* JADX INFO: loaded from: classes.dex */
class ao implements ap, Cloneable {
    private static final org.c.b a = org.c.c.a((Class<?>) ao.class);
    private final URL b;
    private a.k c = null;
    private String d;
    private String e;
    private String f;
    private a.a[] g;
    private int h;
    private int i;
    private a.c j;

    protected /* synthetic */ Object clone() {
        return l();
    }

    public ao(a.c cVar, URL url) {
        this.j = cVar;
        this.b = url;
    }

    protected final ao l() {
        ao aoVar = new ao(this.j, this.b);
        aoVar.e = this.e;
        aoVar.f = this.f;
        aoVar.c = this.c;
        aoVar.d = this.d;
        if (this.g != null) {
            aoVar.g = new a.e.n[this.g.length];
            System.arraycopy(this.g, 0, aoVar.g, 0, this.g.length);
        }
        aoVar.h = this.h;
        aoVar.i = this.i;
        return aoVar;
    }

    final void a(a.ab abVar, String str) {
        boolean z;
        String strD = abVar.d();
        if (strD != null) {
            this.c = abVar.a();
        }
        int length = str.length() - 1;
        if (length < 0 || str.charAt(length) != '/') {
            z = false;
        } else {
            str = str.substring(0, length);
            z = true;
        }
        if (strD == null) {
            String[] strArrSplit = str.split("/");
            int i = abVar.e() != null ? 0 : 1;
            if (strArrSplit.length > i) {
                this.f = strArrSplit[i];
                i++;
            }
            if (strArrSplit.length > i) {
                String[] strArr = new String[strArrSplit.length - i];
                System.arraycopy(strArrSplit, i, strArr, 0, strArrSplit.length - i);
                this.d = "\\" + a.d.f.b.a("\\", strArr) + (z ? "\\" : "");
                this.e = "/" + this.f + "/" + a.d.f.b.a("/", strArr) + (z ? "/" : "");
                return;
            }
            this.d = "\\";
            if (this.f == null) {
                this.e = "/";
                return;
            } else {
                this.e = "/" + this.f + (z ? "/" : "");
                return;
            }
        }
        String strB = abVar.b();
        if (strB.equals("\\")) {
            this.d = "\\" + str.replace('/', '\\') + (z ? "\\" : "");
            this.e = abVar.c() + str + (z ? "/" : "");
            this.f = strD;
        } else {
            this.d = strB + str.replace('/', '\\') + (z ? "\\" : "");
            this.e = abVar.c() + str + (z ? "/" : "");
            this.f = strD;
        }
    }

    @Override // a.ab
    public final a.k a() {
        return this.c;
    }

    public final String m() {
        String strC = c();
        String strD = d();
        if (strC.length() > 1) {
            int length = strC.length() - 2;
            while (strC.charAt(length) != '/') {
                length--;
            }
            return strC.substring(length + 1);
        }
        if (strD != null) {
            return strD + '/';
        }
        if (this.b.getHost().length() > 0) {
            return this.b.getHost() + '/';
        }
        return "smb://";
    }

    public final String n() {
        return this.b.toString();
    }

    @Override // a.ab
    public final String b() {
        if (this.d == null) {
            t();
        }
        return this.d;
    }

    @Override // a.ab
    public final String c() {
        if (this.d == null) {
            t();
        }
        return this.e;
    }

    @Override // a.ab
    public final String d() {
        if (this.d == null) {
            t();
        }
        return this.f;
    }

    public final String o() {
        return this.c != null ? this.c.a() : e();
    }

    @Override // a.ab
    public final String e() {
        String host = this.b.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    public final int p() {
        return this.b.getPort();
    }

    @Override // a.ab
    public final URL f() {
        return this.b;
    }

    public final boolean q() {
        return this.j.a().T() && !this.j.g().b() && h();
    }

    @Override // a.ab
    public final boolean h() {
        if (d() != null && !"IPC$".equals(d())) {
            return false;
        }
        if (a.c()) {
            a.b("Share is IPC " + this.f);
        }
        return true;
    }

    final void a(int i) {
        this.i = i;
    }

    @Override // a.ab
    public final int i() {
        int iE;
        if (this.i == 0) {
            if (b().length() > 1) {
                this.i = 1;
            } else if (d() != null) {
                if (d().equals("IPC$")) {
                    this.i = 16;
                } else {
                    this.i = 8;
                }
            } else if (this.b.getAuthority() == null || this.b.getAuthority().isEmpty()) {
                this.i = 2;
            } else {
                try {
                    a.p pVar = (a.p) g().a(a.p.class);
                    if (pVar != null && ((iE = pVar.e()) == 29 || iE == 27)) {
                        this.i = 2;
                        return this.i;
                    }
                } catch (a.d e) {
                    if (!(e.getCause() instanceof UnknownHostException)) {
                        throw e;
                    }
                    a.b("Unknown host", e);
                }
                this.i = 4;
            }
        }
        return this.i;
    }

    @Override // a.ab
    public final boolean j() {
        int iE;
        if (this.i == 2 || this.b.getHost().length() == 0) {
            this.i = 2;
            return true;
        }
        if (d() == null) {
            a.p pVar = (a.p) g().a(a.p.class);
            if (pVar != null && ((iE = pVar.e()) == 29 || iE == 27)) {
                this.i = 2;
                return true;
            }
            this.i = 4;
        }
        return false;
    }

    @Override // a.ab
    public final a.a g() {
        return this.h == 0 ? s() : this.g[this.h - 1];
    }

    private static String a(String str, String str2) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < charArray.length) {
            char c = charArray[i3];
            if (c == '&') {
                if (i > i2 && new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
                    int i4 = i + 1;
                    return new String(charArray, i4, i3 - i4);
                }
                i2 = i3 + 1;
            } else if (c == '=') {
                i = i3;
            }
            i3++;
            i2 = i2;
        }
        if (i > i2 && new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
            int i5 = i + 1;
            return new String(charArray, i5, charArray.length - i5);
        }
        return null;
    }

    private a.a s() throws a.d {
        this.h = 0;
        if (this.g == null) {
            String host = this.b.getHost();
            String path = this.b.getPath();
            String query = this.b.getQuery();
            try {
                if (query != null) {
                    String strA = a(query, "server");
                    if (strA != null && strA.length() > 0) {
                        this.g = new a.e.n[1];
                        this.g[0] = this.j.b().c(strA);
                    }
                    String strA2 = a(query, "address");
                    if (strA2 != null && strA2.length() > 0) {
                        byte[] address = InetAddress.getByName(strA2).getAddress();
                        this.g = new a.e.n[1];
                        this.g[0] = new a.e.n(InetAddress.getByAddress(host, address));
                    }
                } else if (host.length() == 0) {
                    try {
                        a.p pVarA = this.j.b().a("\u0001\u0002__MSBROWSE__\u0002");
                        this.g = new a.e.n[1];
                        this.g[0] = this.j.b().c(pVarA.b());
                    } catch (UnknownHostException e) {
                        a.b("Unknown host", e);
                        if (this.j.a().z() == null) {
                            throw e;
                        }
                        this.g = this.j.b().a(this.j.a().z(), true);
                    }
                } else if (path.length() == 0 || path.equals("/")) {
                    this.g = this.j.b().a(host, true);
                } else {
                    this.g = this.j.b().a(host, false);
                }
            } catch (UnknownHostException e2) {
                throw new a.d("Failed to lookup address for name ".concat(String.valueOf(host)), e2);
            }
        }
        if (this.h >= this.g.length) {
            return null;
        }
        a.a[] aVarArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return aVarArr[i];
    }

    @Override // a.ab
    public final boolean k() {
        return d() == null && b().length() <= 1;
    }

    final boolean r() {
        return b().length() <= 1;
    }

    private synchronized void t() {
        int i;
        char[] charArray = this.b.getPath().toCharArray();
        char[] cArr = new char[charArray.length];
        int length = charArray.length;
        int i2 = 0;
        char c = 0;
        int i3 = 0;
        while (i2 < length) {
            switch (c) {
                case 0:
                    if (charArray[i2] != '/') {
                        throw new a.u("Invalid smb: URL: " + this.b);
                    }
                    i = i3 + 1;
                    cArr[i3] = charArray[i2];
                    c = 1;
                    i2++;
                    i3 = i;
                    break;
                    break;
                case 1:
                    if (charArray[i2] != '/') {
                        if (charArray[i2] == '.' && (i2 + 1 >= length || charArray[i2 + 1] == '/')) {
                            i2++;
                            i = i3;
                        } else if (i2 + 1 < length && charArray[i2] == '.' && charArray[i2 + 1] == '.' && (i2 + 2 >= length || charArray[i2 + 2] == '/')) {
                            i2 += 2;
                            if (i3 != 1) {
                                while (true) {
                                    i = i3 - 1;
                                    if (i > 1 && cArr[i - 1] != '/') {
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        } else {
                            c = 2;
                        }
                        i2++;
                        i3 = i;
                        break;
                    } else {
                        i = i3;
                    }
                    i2++;
                    i3 = i;
                case 2:
                    if (charArray[i2] == '/') {
                        c = 1;
                    }
                    i = i3 + 1;
                    cArr[i3] = charArray[i2];
                    i2++;
                    i3 = i;
                    break;
                default:
                    i = i3;
                    i2++;
                    i3 = i;
                    break;
            }
        }
        this.e = new String(cArr, 0, i3);
        if (i3 > 1) {
            int i4 = i3 - 1;
            int iIndexOf = this.e.indexOf(47, 1);
            if (iIndexOf < 0) {
                this.f = this.e.substring(1);
                this.d = "\\";
            } else if (iIndexOf == i4) {
                this.f = this.e.substring(1, iIndexOf);
                this.d = "\\";
            } else {
                this.f = this.e.substring(1, iIndexOf);
                this.d = this.e.substring(iIndexOf, i4 + 1).replace('/', '\\');
            }
        } else {
            this.e = "/";
            this.f = null;
            this.d = "\\";
        }
    }

    public int hashCode() {
        int iHashCode;
        try {
            iHashCode = g().hashCode();
        } catch (a.d e) {
            iHashCode = e().toUpperCase().hashCode();
        }
        return iHashCode + c().toUpperCase().hashCode();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        String path = this.b.getPath();
        String path2 = aoVar.b.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path2.lastIndexOf(47);
        int length = path.length() - iLastIndexOf;
        int length2 = path2.length() - iLastIndexOf2;
        if ((length <= 1 || path.charAt(iLastIndexOf + 1) != '.') && ((length2 <= 1 || path2.charAt(iLastIndexOf2 + 1) != '.') && (length != length2 || !path.regionMatches(true, iLastIndexOf, path2, iLastIndexOf2, length)))) {
            z = false;
        }
        if (!z || !c().equalsIgnoreCase(aoVar.c())) {
            return false;
        }
        try {
            return g().equals(aoVar.g());
        } catch (a.d e) {
            a.b("Unknown host", e);
            return e().equalsIgnoreCase(aoVar.e());
        }
    }

    public final String a(a.k kVar, String str) {
        if (Objects.equals(this.c, kVar)) {
            return this.d;
        }
        this.c = kVar;
        String strB = b();
        int iD = kVar.d();
        if (iD < 0) {
            a.d("Path consumed out of range ".concat(String.valueOf(iD)));
            iD = 0;
        } else if (iD > this.d.length()) {
            a.d("Path consumed out of range ".concat(String.valueOf(iD)));
            iD = strB.length();
        }
        if (a.c()) {
            a.b("UNC is '" + strB + "'");
            a.b("Consumed '" + strB.substring(0, iD) + "'");
        }
        String strSubstring = strB.substring(iD);
        if (a.c()) {
            a.b("Remaining '" + strSubstring + "'");
        }
        if (strSubstring.equals("") || strSubstring.equals("\\")) {
            strSubstring = "\\";
            this.i = 8;
        }
        if (!kVar.e().isEmpty()) {
            strSubstring = "\\" + kVar.e() + strSubstring;
        }
        if (strSubstring.charAt(0) != '\\') {
            a.d("No slash at start of remaining DFS path ".concat(String.valueOf(strSubstring)));
        }
        this.d = strSubstring;
        if (kVar.c() != null && !kVar.c().isEmpty()) {
            this.f = kVar.c();
        }
        if (str != null && str.endsWith("\\") && !strSubstring.endsWith("\\")) {
            return strSubstring + "\\";
        }
        return strSubstring;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.b.toString());
        sb.append('[');
        if (this.d != null) {
            sb.append("unc=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append("canon=");
            sb.append(this.e);
        }
        if (this.c != null) {
            sb.append("dfsReferral=");
            sb.append(this.c);
        }
        sb.append(']');
        return sb.toString();
    }
}
