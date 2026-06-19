package p000a;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: a.m */
/* JADX INFO: compiled from: DialectVersion.java */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0289m {
    SMB1,
    SMB202(514),
    SMB210(528),
    SMB300(768),
    SMB302(770),
    SMB311(785);


    /* JADX INFO: renamed from: g */
    private final boolean f1262g;

    /* JADX INFO: renamed from: h */
    private final int f1263h;

    EnumC0289m(String str) {
        this.f1262g = false;
        this.f1263h = -1;
    }

    EnumC0289m(int i) {
        this.f1262g = true;
        this.f1263h = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m960a() {
        return this.f1262g;
    }

    /* JADX INFO: renamed from: b */
    public final int m962b() {
        if (!this.f1262g) {
            throw new UnsupportedOperationException();
        }
        return this.f1263h;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m961a(EnumC0289m enumC0289m) {
        return ordinal() >= enumC0289m.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m963b(EnumC0289m enumC0289m) {
        return ordinal() <= enumC0289m.ordinal();
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0289m m958a(EnumC0289m enumC0289m, EnumC0289m enumC0289m2) {
        return enumC0289m.m961a(enumC0289m2) ? enumC0289m : enumC0289m2;
    }

    /* JADX INFO: renamed from: b */
    public static Set<EnumC0289m> m959b(EnumC0289m enumC0289m, EnumC0289m enumC0289m2) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC0289m.class);
        for (EnumC0289m enumC0289m3 : values()) {
            if ((enumC0289m == null || enumC0289m3.m961a(enumC0289m)) && (enumC0289m2 == null || enumC0289m3.m963b(enumC0289m2))) {
                enumSetNoneOf.add(enumC0289m3);
            }
        }
        return enumSetNoneOf;
    }
}
