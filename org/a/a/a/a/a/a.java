package org.a.a.a.a.a;

/* JADX INFO: compiled from: CompositeFileEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends org.a.a.a.a.i {
    private final org.a.a.a.a.h[] a;
    private org.a.a.a.a.h b = null;

    public a(org.a.a.a.a.h[] hVarArr) {
        this.a = hVarArr;
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        if (this.b != null) {
            org.a.a.a.a.g gVarA = this.b.a(str);
            if (gVarA != null) {
                return gVarA;
            }
        } else {
            for (org.a.a.a.a.h hVar : this.a) {
                org.a.a.a.a.g gVarA2 = hVar.a(str);
                if (gVarA2 != null) {
                    this.b = hVar;
                    return gVarA2;
                }
            }
        }
        return null;
    }
}
