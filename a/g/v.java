package a.g;

import a.c.l$b;
import java.io.IOException;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: SID.java */
/* JADX INFO: loaded from: classes.dex */
public class v extends l$b implements a.v {
    public static v f;
    public static v g;
    public static v h;
    int i;
    String j = null;
    String k = null;
    String l = null;
    a.c m = null;
    private static final org.c.b n = org.c.c.a((Class<?>) v.class);
    static final String[] e = {"0", "User", "Domain group", "Domain", "Local group", "Builtin group", "Deleted", "Invalid", "Unknown"};

    static {
        f = null;
        g = null;
        h = null;
        try {
            f = new v("S-1-1-0");
            g = new v("S-1-3-0");
            h = new v("S-1-5-18");
        } catch (ad e2) {
            n.e("Failed to create builtin SIDs", e2);
        }
    }

    public v(byte[] bArr, int i) {
        int i2 = i + 1;
        this.a = bArr[i];
        int i3 = i2 + 1;
        this.b = bArr[i2];
        this.c = new byte[6];
        System.arraycopy(bArr, i3, this.c, 0, 6);
        int i4 = i3 + 6;
        if (this.b > 100) {
            throw new a.u("Invalid SID sub_authority_count");
        }
        this.d = new int[this.b];
        for (int i5 = 0; i5 < this.b; i5++) {
            this.d[i5] = a.d.f.a.b(bArr, i4);
            i4 += 4;
        }
    }

    private v(String str) throws ad {
        long j;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        if (stringTokenizer.countTokens() < 3 || !stringTokenizer.nextToken().equals("S")) {
            throw new ad("Bad textual SID format: ".concat(String.valueOf(str)));
        }
        this.a = Byte.parseByte(stringTokenizer.nextToken());
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.startsWith("0x")) {
            j = Long.parseLong(strNextToken.substring(2), 16);
        } else {
            j = Long.parseLong(strNextToken);
        }
        this.c = new byte[6];
        int i = 5;
        while (j > 0) {
            this.c[i] = (byte) (j % 256);
            j >>= 8;
            i--;
        }
        this.b = (byte) stringTokenizer.countTokens();
        if (this.b > 0) {
            this.d = new int[this.b];
            for (int i2 = 0; i2 < this.b; i2++) {
                this.d[i2] = (int) (Long.parseLong(stringTokenizer.nextToken()) & 4294967295L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.v
    public final <T> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    public int hashCode() {
        int i = this.c[5];
        for (int i2 = 0; i2 < this.b; i2++) {
            i += 65599 * this.d[i2];
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (vVar == this) {
                return true;
            }
            if (vVar.b == this.b) {
                int i = this.b;
                while (true) {
                    int i2 = i - 1;
                    if (i > 0) {
                        if (vVar.d[i2] != this.d[i2]) {
                            return false;
                        }
                        i = i2;
                    } else {
                        for (int i3 = 0; i3 < 6; i3++) {
                            if (vVar.c[i3] != this.c[i3]) {
                                return false;
                            }
                        }
                        return vVar.a == this.a;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String str;
        String str2 = "S-" + (this.a & 255) + "-";
        if (this.c[0] != 0 || this.c[1] != 0) {
            str = (str2 + "0x") + a.i.e.a(this.c, 0, 6);
        } else {
            int i = 5;
            long j = 0;
            long j2 = 0;
            while (i > 1) {
                j += (((long) this.c[i]) & 255) << ((int) j2);
                i--;
                j2 = 8 + j2;
            }
            str = str2 + j;
        }
        String str3 = str;
        for (int i2 = 0; i2 < this.b; i2++) {
            str3 = str3 + "-" + (((long) this.d[i2]) & 4294967295L);
        }
        return str3;
    }

    public final String a() {
        if (this.l != null && this.l != null) {
            try {
                String str = this.l;
                a.c cVar = this.m;
                cVar.f().a(cVar, str, new v[]{this});
            } catch (IOException e2) {
                n.b("Failed to resolve SID", e2);
            } finally {
                this.l = null;
                this.m = null;
            }
        }
        if (this.j != null) {
            if (this.i == 3) {
                return this.j;
            }
            if (this.i == 5 || this.j.equals("BUILTIN")) {
                if (this.i == 8) {
                    return toString();
                }
                return this.k;
            }
            return this.j + "\\" + this.k;
        }
        return toString();
    }
}
