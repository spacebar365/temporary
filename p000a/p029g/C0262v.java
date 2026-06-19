package p000a.p029g;

import java.io.IOException;
import java.util.StringTokenizer;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0298v;
import p000a.p003c.C0043l;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.g.v */
/* JADX INFO: compiled from: SID.java */
/* JADX INFO: loaded from: classes.dex */
public class C0262v extends C0043l.b implements InterfaceC0298v {

    /* JADX INFO: renamed from: f */
    public static C0262v f1217f;

    /* JADX INFO: renamed from: g */
    public static C0262v f1218g;

    /* JADX INFO: renamed from: h */
    public static C0262v f1219h;

    /* JADX INFO: renamed from: i */
    int f1221i;

    /* JADX INFO: renamed from: j */
    String f1222j = null;

    /* JADX INFO: renamed from: k */
    String f1223k = null;

    /* JADX INFO: renamed from: l */
    String f1224l = null;

    /* JADX INFO: renamed from: m */
    InterfaceC0016c f1225m = null;

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f1220n = C1620c.m4563a((Class<?>) C0262v.class);

    /* JADX INFO: renamed from: e */
    static final String[] f1216e = {"0", "User", "Domain group", "Domain", "Local group", "Builtin group", "Deleted", "Invalid", "Unknown"};

    static {
        f1217f = null;
        f1218g = null;
        f1219h = null;
        try {
            f1217f = new C0262v("S-1-1-0");
            f1218g = new C0262v("S-1-3-0");
            f1219h = new C0262v("S-1-5-18");
        } catch (C0214ad e) {
            f1220n.mo4544e("Failed to create builtin SIDs", e);
        }
    }

    public C0262v(byte[] bArr, int i) {
        int i2 = i + 1;
        this.f209a = bArr[i];
        int i3 = i2 + 1;
        this.f210b = bArr[i2];
        this.f211c = new byte[6];
        System.arraycopy(bArr, i3, this.f211c, 0, 6);
        int i4 = i3 + 6;
        if (this.f210b > 100) {
            throw new C0297u("Invalid SID sub_authority_count");
        }
        this.f212d = new int[this.f210b];
        for (int i5 = 0; i5 < this.f210b; i5++) {
            this.f212d[i5] = C0173a.m511b(bArr, i4);
            i4 += 4;
        }
    }

    private C0262v(String str) throws C0214ad {
        long j;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        if (stringTokenizer.countTokens() < 3 || !stringTokenizer.nextToken().equals("S")) {
            throw new C0214ad("Bad textual SID format: ".concat(String.valueOf(str)));
        }
        this.f209a = Byte.parseByte(stringTokenizer.nextToken());
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.startsWith("0x")) {
            j = Long.parseLong(strNextToken.substring(2), 16);
        } else {
            j = Long.parseLong(strNextToken);
        }
        this.f211c = new byte[6];
        int i = 5;
        while (j > 0) {
            this.f211c[i] = (byte) (j % 256);
            j >>= 8;
            i--;
        }
        this.f210b = (byte) stringTokenizer.countTokens();
        if (this.f210b > 0) {
            this.f212d = new int[this.f210b];
            for (int i2 = 0; i2 < this.f210b; i2++) {
                this.f212d[i2] = (int) (Long.parseLong(stringTokenizer.nextToken()) & 4294967295L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.InterfaceC0298v
    /* JADX INFO: renamed from: a */
    public final <T> T mo911a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    public int hashCode() {
        int i = this.f211c[5];
        for (int i2 = 0; i2 < this.f210b; i2++) {
            i += 65599 * this.f212d[i2];
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0262v) {
            C0262v c0262v = (C0262v) obj;
            if (c0262v == this) {
                return true;
            }
            if (c0262v.f210b == this.f210b) {
                int i = this.f210b;
                while (true) {
                    int i2 = i - 1;
                    if (i > 0) {
                        if (c0262v.f212d[i2] != this.f212d[i2]) {
                            return false;
                        }
                        i = i2;
                    } else {
                        for (int i3 = 0; i3 < 6; i3++) {
                            if (c0262v.f211c[i3] != this.f211c[i3]) {
                                return false;
                            }
                        }
                        return c0262v.f209a == this.f209a;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String str;
        String str2 = "S-" + (this.f209a & 255) + "-";
        if (this.f211c[0] != 0 || this.f211c[1] != 0) {
            str = (str2 + "0x") + C0284e.m949a(this.f211c, 0, 6);
        } else {
            int i = 5;
            long j = 0;
            long j2 = 0;
            while (i > 1) {
                j += (((long) this.f211c[i]) & 255) << ((int) j2);
                i--;
                j2 = 8 + j2;
            }
            str = str2 + j;
        }
        String str3 = str;
        for (int i2 = 0; i2 < this.f210b; i2++) {
            str3 = str3 + "-" + (((long) this.f212d[i2]) & 4294967295L);
        }
        return str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m912a() {
        if (this.f1224l != null && this.f1224l != null) {
            try {
                String str = this.f1224l;
                InterfaceC0016c interfaceC0016c = this.f1225m;
                interfaceC0016c.mo119f().mo914a(interfaceC0016c, str, new C0262v[]{this});
            } catch (IOException e) {
                f1220n.mo4535b("Failed to resolve SID", e);
            } finally {
                this.f1224l = null;
                this.f1225m = null;
            }
        }
        if (this.f1222j != null) {
            if (this.f1221i == 3) {
                return this.f1222j;
            }
            if (this.f1221i == 5 || this.f1222j.equals("BUILTIN")) {
                if (this.f1221i == 8) {
                    return toString();
                }
                return this.f1223k;
            }
            return this.f1222j + "\\" + this.f1223k;
        }
        return toString();
    }
}
