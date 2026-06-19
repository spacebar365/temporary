package p000a.p029g;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.C0297u;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0004ab;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0287k;
import p000a.InterfaceC0292p;
import p000a.p006d.p025f.C0174b;
import p000a.p026e.C0196n;

/* JADX INFO: renamed from: a.g.ao */
/* JADX INFO: compiled from: SmbResourceLocatorImpl.java */
/* JADX INFO: loaded from: classes.dex */
class C0225ao implements InterfaceC0226ap, Cloneable {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1031a = C1620c.m4563a((Class<?>) C0225ao.class);

    /* JADX INFO: renamed from: b */
    private final URL f1032b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0287k f1033c = null;

    /* JADX INFO: renamed from: d */
    private String f1034d;

    /* JADX INFO: renamed from: e */
    private String f1035e;

    /* JADX INFO: renamed from: f */
    private String f1036f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0000a[] f1037g;

    /* JADX INFO: renamed from: h */
    private int f1038h;

    /* JADX INFO: renamed from: i */
    private int f1039i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0016c f1040j;

    public C0225ao(InterfaceC0016c interfaceC0016c, URL url) {
        this.f1040j = interfaceC0016c;
        this.f1032b = url;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C0225ao clone() {
        C0225ao c0225ao = new C0225ao(this.f1040j, this.f1032b);
        c0225ao.f1035e = this.f1035e;
        c0225ao.f1036f = this.f1036f;
        c0225ao.f1033c = this.f1033c;
        c0225ao.f1034d = this.f1034d;
        if (this.f1037g != null) {
            c0225ao.f1037g = new C0196n[this.f1037g.length];
            System.arraycopy(this.f1037g, 0, c0225ao.f1037g, 0, this.f1037g.length);
        }
        c0225ao.f1038h = this.f1038h;
        c0225ao.f1039i = this.f1039i;
        return c0225ao;
    }

    /* JADX INFO: renamed from: a */
    final void m676a(InterfaceC0004ab interfaceC0004ab, String str) {
        boolean z;
        String strMo87d = interfaceC0004ab.mo87d();
        if (strMo87d != null) {
            this.f1033c = interfaceC0004ab.mo84a();
        }
        int length = str.length() - 1;
        if (length < 0 || str.charAt(length) != '/') {
            z = false;
        } else {
            str = str.substring(0, length);
            z = true;
        }
        if (strMo87d == null) {
            String[] strArrSplit = str.split("/");
            int i = interfaceC0004ab.mo88e() != null ? 0 : 1;
            if (strArrSplit.length > i) {
                this.f1036f = strArrSplit[i];
                i++;
            }
            if (strArrSplit.length > i) {
                String[] strArr = new String[strArrSplit.length - i];
                System.arraycopy(strArrSplit, i, strArr, 0, strArrSplit.length - i);
                this.f1034d = "\\" + C0174b.m518a("\\", strArr) + (z ? "\\" : "");
                this.f1035e = "/" + this.f1036f + "/" + C0174b.m518a("/", strArr) + (z ? "/" : "");
                return;
            }
            this.f1034d = "\\";
            if (this.f1036f == null) {
                this.f1035e = "/";
                return;
            } else {
                this.f1035e = "/" + this.f1036f + (z ? "/" : "");
                return;
            }
        }
        String strMo85b = interfaceC0004ab.mo85b();
        if (strMo85b.equals("\\")) {
            this.f1034d = "\\" + str.replace('/', '\\') + (z ? "\\" : "");
            this.f1035e = interfaceC0004ab.mo86c() + str + (z ? "/" : "");
            this.f1036f = strMo87d;
        } else {
            this.f1034d = strMo85b + str.replace('/', '\\') + (z ? "\\" : "");
            this.f1035e = interfaceC0004ab.mo86c() + str + (z ? "/" : "");
            this.f1036f = strMo87d;
        }
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: a */
    public final InterfaceC0287k mo84a() {
        return this.f1033c;
    }

    /* JADX INFO: renamed from: m */
    public final String m678m() {
        String strMo86c = mo86c();
        String strMo87d = mo87d();
        if (strMo86c.length() > 1) {
            int length = strMo86c.length() - 2;
            while (strMo86c.charAt(length) != '/') {
                length--;
            }
            return strMo86c.substring(length + 1);
        }
        if (strMo87d != null) {
            return strMo87d + '/';
        }
        if (this.f1032b.getHost().length() > 0) {
            return this.f1032b.getHost() + '/';
        }
        return "smb://";
    }

    /* JADX INFO: renamed from: n */
    public final String m679n() {
        return this.f1032b.toString();
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: b */
    public final String mo85b() {
        if (this.f1034d == null) {
            m673t();
        }
        return this.f1034d;
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: c */
    public final String mo86c() {
        if (this.f1034d == null) {
            m673t();
        }
        return this.f1035e;
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: d */
    public final String mo87d() {
        if (this.f1034d == null) {
            m673t();
        }
        return this.f1036f;
    }

    /* JADX INFO: renamed from: o */
    public final String m680o() {
        return this.f1033c != null ? this.f1033c.mo176a() : mo88e();
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: e */
    public final String mo88e() {
        String host = this.f1032b.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    /* JADX INFO: renamed from: p */
    public final int m681p() {
        return this.f1032b.getPort();
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: f */
    public final URL mo89f() {
        return this.f1032b;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m682q() {
        return this.f1040j.mo114a().mo25T() && !this.f1040j.mo109g().mo899b() && mo91h();
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: h */
    public final boolean mo91h() {
        if (mo87d() != null && !"IPC$".equals(mo87d())) {
            return false;
        }
        if (f1031a.mo4539c()) {
            f1031a.mo4534b("Share is IPC " + this.f1036f);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    final void m675a(int i) {
        this.f1039i = i;
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: i */
    public final int mo92i() {
        int iMo569e;
        if (this.f1039i == 0) {
            if (mo85b().length() > 1) {
                this.f1039i = 1;
            } else if (mo87d() != null) {
                if (mo87d().equals("IPC$")) {
                    this.f1039i = 16;
                } else {
                    this.f1039i = 8;
                }
            } else if (this.f1032b.getAuthority() == null || this.f1032b.getAuthority().isEmpty()) {
                this.f1039i = 2;
            } else {
                try {
                    InterfaceC0292p interfaceC0292p = (InterfaceC0292p) mo90g().mo0a(InterfaceC0292p.class);
                    if (interfaceC0292p != null && ((iMo569e = interfaceC0292p.mo569e()) == 29 || iMo569e == 27)) {
                        this.f1039i = 2;
                        return this.f1039i;
                    }
                } catch (C0044d e) {
                    if (!(e.getCause() instanceof UnknownHostException)) {
                        throw e;
                    }
                    f1031a.mo4535b("Unknown host", e);
                }
                this.f1039i = 4;
            }
        }
        return this.f1039i;
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: j */
    public final boolean mo93j() {
        int iMo569e;
        if (this.f1039i == 2 || this.f1032b.getHost().length() == 0) {
            this.f1039i = 2;
            return true;
        }
        if (mo87d() == null) {
            InterfaceC0292p interfaceC0292p = (InterfaceC0292p) mo90g().mo0a(InterfaceC0292p.class);
            if (interfaceC0292p != null && ((iMo569e = interfaceC0292p.mo569e()) == 29 || iMo569e == 27)) {
                this.f1039i = 2;
                return true;
            }
            this.f1039i = 4;
        }
        return false;
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: g */
    public final InterfaceC0000a mo90g() {
        return this.f1038h == 0 ? m672s() : this.f1037g[this.f1038h - 1];
    }

    /* JADX INFO: renamed from: a */
    private static String m671a(String str, String str2) {
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

    /* JADX INFO: renamed from: s */
    private InterfaceC0000a m672s() throws C0044d {
        this.f1038h = 0;
        if (this.f1037g == null) {
            String host = this.f1032b.getHost();
            String path = this.f1032b.getPath();
            String query = this.f1032b.getQuery();
            try {
                if (query != null) {
                    String strM671a = m671a(query, "server");
                    if (strM671a != null && strM671a.length() > 0) {
                        this.f1037g = new C0196n[1];
                        this.f1037g[0] = this.f1040j.mo115b().mo561c(strM671a);
                    }
                    String strM671a2 = m671a(query, "address");
                    if (strM671a2 != null && strM671a2.length() > 0) {
                        byte[] address = InetAddress.getByName(strM671a2).getAddress();
                        this.f1037g = new C0196n[1];
                        this.f1037g[0] = new C0196n(InetAddress.getByAddress(host, address));
                    }
                } else if (host.length() == 0) {
                    try {
                        InterfaceC0292p interfaceC0292pMo555a = this.f1040j.mo115b().mo555a("\u0001\u0002__MSBROWSE__\u0002");
                        this.f1037g = new C0196n[1];
                        this.f1037g[0] = this.f1040j.mo115b().mo561c(interfaceC0292pMo555a.mo3b());
                    } catch (UnknownHostException e) {
                        f1031a.mo4535b("Unknown host", e);
                        if (this.f1040j.mo114a().mo81z() == null) {
                            throw e;
                        }
                        this.f1037g = this.f1040j.mo115b().mo558a(this.f1040j.mo114a().mo81z(), true);
                    }
                } else if (path.length() == 0 || path.equals("/")) {
                    this.f1037g = this.f1040j.mo115b().mo558a(host, true);
                } else {
                    this.f1037g = this.f1040j.mo115b().mo558a(host, false);
                }
            } catch (UnknownHostException e2) {
                throw new C0044d("Failed to lookup address for name ".concat(String.valueOf(host)), e2);
            }
        }
        if (this.f1038h >= this.f1037g.length) {
            return null;
        }
        InterfaceC0000a[] interfaceC0000aArr = this.f1037g;
        int i = this.f1038h;
        this.f1038h = i + 1;
        return interfaceC0000aArr[i];
    }

    @Override // p000a.InterfaceC0004ab
    /* JADX INFO: renamed from: k */
    public final boolean mo94k() {
        return mo87d() == null && mo85b().length() <= 1;
    }

    /* JADX INFO: renamed from: r */
    final boolean m683r() {
        return mo85b().length() <= 1;
    }

    /* JADX INFO: renamed from: t */
    private synchronized void m673t() {
        int i;
        char[] charArray = this.f1032b.getPath().toCharArray();
        char[] cArr = new char[charArray.length];
        int length = charArray.length;
        int i2 = 0;
        char c = 0;
        int i3 = 0;
        while (i2 < length) {
            switch (c) {
                case 0:
                    if (charArray[i2] != '/') {
                        throw new C0297u("Invalid smb: URL: " + this.f1032b);
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
        this.f1035e = new String(cArr, 0, i3);
        if (i3 > 1) {
            int i4 = i3 - 1;
            int iIndexOf = this.f1035e.indexOf(47, 1);
            if (iIndexOf < 0) {
                this.f1036f = this.f1035e.substring(1);
                this.f1034d = "\\";
            } else if (iIndexOf == i4) {
                this.f1036f = this.f1035e.substring(1, iIndexOf);
                this.f1034d = "\\";
            } else {
                this.f1036f = this.f1035e.substring(1, iIndexOf);
                this.f1034d = this.f1035e.substring(iIndexOf, i4 + 1).replace('/', '\\');
            }
        } else {
            this.f1035e = "/";
            this.f1036f = null;
            this.f1034d = "\\";
        }
    }

    public int hashCode() {
        int iHashCode;
        try {
            iHashCode = mo90g().hashCode();
        } catch (C0044d e) {
            iHashCode = mo88e().toUpperCase().hashCode();
        }
        return iHashCode + mo86c().toUpperCase().hashCode();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (!(obj instanceof C0225ao)) {
            return false;
        }
        C0225ao c0225ao = (C0225ao) obj;
        String path = this.f1032b.getPath();
        String path2 = c0225ao.f1032b.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path2.lastIndexOf(47);
        int length = path.length() - iLastIndexOf;
        int length2 = path2.length() - iLastIndexOf2;
        if ((length <= 1 || path.charAt(iLastIndexOf + 1) != '.') && ((length2 <= 1 || path2.charAt(iLastIndexOf2 + 1) != '.') && (length != length2 || !path.regionMatches(true, iLastIndexOf, path2, iLastIndexOf2, length)))) {
            z = false;
        }
        if (!z || !mo86c().equalsIgnoreCase(c0225ao.mo86c())) {
            return false;
        }
        try {
            return mo90g().equals(c0225ao.mo90g());
        } catch (C0044d e) {
            f1031a.mo4535b("Unknown host", e);
            return mo88e().equalsIgnoreCase(c0225ao.mo88e());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m674a(InterfaceC0287k interfaceC0287k, String str) {
        if (Objects.equals(this.f1033c, interfaceC0287k)) {
            return this.f1034d;
        }
        this.f1033c = interfaceC0287k;
        String strMo85b = mo85b();
        int iMo185d = interfaceC0287k.mo185d();
        if (iMo185d < 0) {
            f1031a.mo4540d("Path consumed out of range ".concat(String.valueOf(iMo185d)));
            iMo185d = 0;
        } else if (iMo185d > this.f1034d.length()) {
            f1031a.mo4540d("Path consumed out of range ".concat(String.valueOf(iMo185d)));
            iMo185d = strMo85b.length();
        }
        if (f1031a.mo4539c()) {
            f1031a.mo4534b("UNC is '" + strMo85b + "'");
            f1031a.mo4534b("Consumed '" + strMo85b.substring(0, iMo185d) + "'");
        }
        String strSubstring = strMo85b.substring(iMo185d);
        if (f1031a.mo4539c()) {
            f1031a.mo4534b("Remaining '" + strSubstring + "'");
        }
        if (strSubstring.equals("") || strSubstring.equals("\\")) {
            strSubstring = "\\";
            this.f1039i = 8;
        }
        if (!interfaceC0287k.mo187e().isEmpty()) {
            strSubstring = "\\" + interfaceC0287k.mo187e() + strSubstring;
        }
        if (strSubstring.charAt(0) != '\\') {
            f1031a.mo4540d("No slash at start of remaining DFS path ".concat(String.valueOf(strSubstring)));
        }
        this.f1034d = strSubstring;
        if (interfaceC0287k.mo183c() != null && !interfaceC0287k.mo183c().isEmpty()) {
            this.f1036f = interfaceC0287k.mo183c();
        }
        if (str != null && str.endsWith("\\") && !strSubstring.endsWith("\\")) {
            return strSubstring + "\\";
        }
        return strSubstring;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f1032b.toString());
        sb.append('[');
        if (this.f1034d != null) {
            sb.append("unc=");
            sb.append(this.f1034d);
        }
        if (this.f1035e != null) {
            sb.append("canon=");
            sb.append(this.f1035e);
        }
        if (this.f1033c != null) {
            sb.append("dfsReferral=");
            sb.append(this.f1033c);
        }
        sb.append(']');
        return sb.toString();
    }
}
