package org.bouncycastle.b;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Permission {
    private final Set<String> a;

    public k(String str) {
        super(str);
        this.a = new HashSet();
        this.a.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && this.a.equals(((k) obj).a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (permission instanceof k) {
            k kVar = (k) permission;
            if (getName().equals(kVar.getName()) || this.a.containsAll(kVar.a)) {
                return true;
            }
        }
        return false;
    }
}
