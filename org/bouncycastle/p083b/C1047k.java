package org.bouncycastle.p083b;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: org.bouncycastle.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1047k extends Permission {

    /* JADX INFO: renamed from: a */
    private final Set<String> f4372a;

    public C1047k(String str) {
        super(str);
        this.f4372a = new HashSet();
        this.f4372a.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1047k) && this.f4372a.equals(((C1047k) obj).f4372a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.f4372a.toString();
    }

    public final int hashCode() {
        return this.f4372a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (permission instanceof C1047k) {
            C1047k c1047k = (C1047k) permission;
            if (getName().equals(c1047k.getName()) || this.f4372a.containsAll(c1047k.f4372a)) {
                return true;
            }
        }
        return false;
    }
}
