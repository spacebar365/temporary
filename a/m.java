package a;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: DialectVersion.java */
/* JADX INFO: loaded from: classes.dex */
public enum m {
    a,
    b(514),
    c(528),
    d(768),
    e(770),
    f(785);

    private final boolean g;
    private final int h;

    m(String str) {
        this.g = false;
        this.h = -1;
    }

    m(int i2) {
        this.g = true;
        this.h = i2;
    }

    public final boolean a() {
        return this.g;
    }

    public final int b() {
        if (!this.g) {
            throw new UnsupportedOperationException();
        }
        return this.h;
    }

    public final boolean a(m mVar) {
        return ordinal() >= mVar.ordinal();
    }

    public final boolean b(m mVar) {
        return ordinal() <= mVar.ordinal();
    }

    public static m a(m mVar, m mVar2) {
        return mVar.a(mVar2) ? mVar : mVar2;
    }

    public static Set<m> b(m mVar, m mVar2) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(m.class);
        for (m mVar3 : values()) {
            if ((mVar == null || mVar3.a(mVar)) && (mVar2 == null || mVar3.b(mVar2))) {
                enumSetNoneOf.add(mVar3);
            }
        }
        return enumSetNoneOf;
    }
}
