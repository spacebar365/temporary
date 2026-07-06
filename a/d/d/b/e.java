package a.d.d.b;

import a.g.j;
import java.util.Objects;

/* JADX INFO: compiled from: SmbShareInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements j {
    protected String b;
    protected int c;
    protected String d;

    public e() {
    }

    public e(String str) {
        this.b = str;
        this.c = 0;
        this.d = null;
    }

    @Override // a.g.j
    public final String a() {
        return this.b;
    }

    @Override // a.g.j
    public final int c() {
        return 0;
    }

    @Override // a.g.j
    public final int b() {
        switch (this.c & 65535) {
            case 1:
                return 32;
            case 2:
            default:
                return 8;
            case 3:
                return 16;
        }
    }

    @Override // a.g.j
    public final int e() {
        return 17;
    }

    @Override // a.g.j
    public final long f() {
        return 0L;
    }

    @Override // a.g.j
    public final long g() {
        return 0L;
    }

    @Override // a.g.j
    public final long h() {
        return 0L;
    }

    @Override // a.g.j
    public final long i() {
        return 0L;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return Objects.equals(this.b, ((e) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.b);
    }

    public String toString() {
        return new String("SmbShareInfo[netName=" + this.b + ",type=0x" + a.i.e.a(this.c, 8) + ",remark=" + this.d + "]");
    }
}
