package p000a.p006d.p007a;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0287k;

/* JADX INFO: renamed from: a.d.a.a */
/* JADX INFO: compiled from: DfsReferralDataImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class C0046a implements InterfaceC0047b {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f222a = C1620c.m4563a((Class<?>) C0046a.class);

    /* JADX INFO: renamed from: b */
    private int f223b;

    /* JADX INFO: renamed from: c */
    private long f224c;

    /* JADX INFO: renamed from: d */
    private String f225d;

    /* JADX INFO: renamed from: e */
    private String f226e;

    /* JADX INFO: renamed from: f */
    private String f227f;

    /* JADX INFO: renamed from: g */
    private String f228g;

    /* JADX INFO: renamed from: h */
    private long f229h;

    /* JADX INFO: renamed from: i */
    private int f230i;

    /* JADX INFO: renamed from: j */
    private boolean f231j;

    /* JADX INFO: renamed from: k */
    private C0046a f232k = this;

    /* JADX INFO: renamed from: l */
    private Map<String, InterfaceC0047b> f233l;

    /* JADX INFO: renamed from: m */
    private String f234m;

    /* JADX INFO: renamed from: n */
    private String f235n;

    /* JADX INFO: renamed from: o */
    private boolean f236o;

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0287k> T mo175a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: f */
    public final long mo189f() {
        return this.f229h;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: d */
    public final int mo185d() {
        return this.f223b;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: b */
    public final String mo181b() {
        return this.f235n;
    }

    /* JADX INFO: renamed from: a */
    public final void m179a(String str) {
        this.f235n = str;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: h */
    public final String mo191h() {
        return this.f227f;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: b */
    public final void mo182b(String str) {
        this.f227f = str;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: c */
    public final void mo184c(String str) {
        this.f234m = str;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: a */
    public final String mo176a() {
        return this.f225d;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: c */
    public final String mo183c() {
        return this.f226e;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: e */
    public final String mo187e() {
        return this.f228g;
    }

    /* JADX INFO: renamed from: i */
    public final int m192i() {
        return this.f230i;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: a */
    public final void mo180a(Map<String, InterfaceC0047b> map) {
        this.f233l = map;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: j */
    public final void mo193j() {
        if (this.f233l != null && this.f234m != null) {
            this.f233l.put(this.f234m, this);
        }
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: a */
    public final void mo178a(InterfaceC0047b interfaceC0047b) {
        C0046a c0046a = (C0046a) interfaceC0047b;
        c0046a.f232k = this.f232k;
        this.f232k = c0046a;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: a */
    public final void mo177a(int i) {
        if (i > this.f223b) {
            throw new IllegalArgumentException("Stripping more than consumed");
        }
        this.f223b -= i;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: k */
    public final boolean mo194k() {
        return this.f231j;
    }

    /* JADX INFO: renamed from: l */
    public final void m195l() {
        this.f236o = true;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: m */
    public final boolean mo196m() {
        return this.f236o;
    }

    public String toString() {
        return "DfsReferralData[pathConsumed=" + this.f223b + ",server=" + this.f225d + ",share=" + this.f226e + ",link=" + this.f227f + ",path=" + this.f228g + ",ttl=" + this.f224c + ",expiration=" + this.f229h + ",remain=" + (this.f229h - System.currentTimeMillis()) + "]";
    }

    public int hashCode() {
        return Objects.hash(this.f225d, this.f226e, this.f228g, Integer.valueOf(this.f223b));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0287k)) {
            return false;
        }
        InterfaceC0287k interfaceC0287k = (InterfaceC0287k) obj;
        return Objects.equals(this.f225d, interfaceC0287k.mo176a()) && Objects.equals(this.f226e, interfaceC0287k.mo183c()) && Objects.equals(this.f228g, interfaceC0287k.mo187e()) && Objects.equals(Integer.valueOf(this.f223b), Integer.valueOf(interfaceC0287k.mo185d()));
    }

    /* JADX INFO: renamed from: a */
    public static C0046a m173a(C0050e c0050e, String str, long j, int i) {
        C0046a c0046a = new C0046a();
        String[] strArr = new String[4];
        c0046a.f224c = c0050e.f249g;
        c0046a.f230i = c0050e.f246d;
        c0046a.f229h = j;
        if ((c0046a.f230i & 2) != 2) {
            if (f222a.mo4539c()) {
                f222a.mo4534b("Node " + c0050e.f251i + " path " + str + " remain " + str.substring(i) + " path consumed " + i);
            }
            m172a(c0050e.f251i, strArr);
            c0046a.f225d = strArr[1];
            c0046a.f226e = strArr[2];
            c0046a.f228g = strArr[3];
            c0046a.f223b = i;
            if (str.charAt(i - 1) == '\\') {
                if (f222a.mo4539c()) {
                    f222a.mo4534b("Server consumed trailing slash of request path, adjusting");
                }
                c0046a.f223b--;
            }
            if (f222a.mo4539c()) {
                f222a.mo4534b("Request " + str + " ref path " + c0046a.f228g + " consumed " + c0046a.f223b + ": " + str.substring(0, i));
            }
        } else {
            String[] strArr2 = c0050e.f253k;
            if (strArr2.length > 0) {
                c0046a.f225d = strArr2[0].substring(1).toLowerCase();
            } else {
                c0046a.f225d = c0050e.f252j.substring(1).toLowerCase();
            }
            if (f222a.mo4539c()) {
                f222a.mo4534b("Server " + c0046a.f225d + " path " + str + " remain " + str.substring(i) + " path consumed " + i);
            }
            c0046a.f223b = i;
        }
        return c0046a;
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: a */
    public final InterfaceC0047b mo174a(InterfaceC0287k interfaceC0287k) {
        C0046a c0046a = new C0046a();
        c0046a.f225d = interfaceC0287k.mo176a();
        c0046a.f226e = interfaceC0287k.mo183c();
        c0046a.f229h = interfaceC0287k.mo189f();
        c0046a.f228g = interfaceC0287k.mo187e();
        c0046a.f223b = this.f223b + interfaceC0287k.mo185d();
        if (this.f228g != null) {
            c0046a.f223b -= this.f228g != null ? this.f228g.length() + 1 : 0;
        }
        c0046a.f235n = interfaceC0287k.mo181b();
        return c0046a;
    }

    /* JADX INFO: renamed from: a */
    private static int m172a(String str, String[] strArr) {
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

    /* JADX INFO: renamed from: d */
    public final void m186d(String str) {
        String str2 = this.f225d;
        if (str2.indexOf(46) < 0 && str2.toUpperCase(Locale.ROOT).equals(str2)) {
            String str3 = str2 + "." + str;
            if (f222a.mo4539c()) {
                f222a.mo4534b(String.format("Applying DFS netbios name hack %s -> %s ", str2, str3));
            }
            this.f225d = str3;
        }
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: e */
    public final void mo188e(String str) {
        String str2 = this.f225d;
        if (str2.indexOf(46) < 0 && str2.toUpperCase(Locale.ROOT).equals(str2)) {
            if (str.startsWith(str2.toLowerCase(Locale.ROOT) + ".")) {
                if (f222a.mo4539c()) {
                    f222a.mo4534b("Adjusting server name " + str2 + " to " + str);
                }
                this.f225d = str;
                return;
            }
            f222a.mo4540d("Have unmappable netbios name ".concat(String.valueOf(str2)));
        }
    }

    @Override // p000a.p006d.p007a.InterfaceC0047b
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ InterfaceC0047b mo197n() {
        return this.f232k;
    }

    @Override // p000a.InterfaceC0287k
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC0287k mo190g() {
        return this.f232k;
    }
}
