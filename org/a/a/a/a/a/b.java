package org.a.a.a.a.a;

import java.util.Calendar;

/* JADX INFO: compiled from: ConfigurableFTPFileEntryParserImpl.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends n implements org.a.a.a.a.a {
    private final e b;

    protected abstract org.a.a.a.a.d a();

    public b(String str) {
        super(str);
        this.b = new f();
    }

    public b(String str, byte b) {
        super(str, (byte) 0);
        this.b = new f();
    }

    public final Calendar b(String str) {
        return this.b.a(str);
    }

    @Override // org.a.a.a.a.a
    public final void a(org.a.a.a.a.d dVar) {
        if (this.b instanceof org.a.a.a.a.a) {
            org.a.a.a.a.d dVarA = a();
            if (dVar != null) {
                if (dVar.b() == null) {
                    dVar.a(dVarA.b());
                }
                if (dVar.c() == null) {
                    dVar.b(dVarA.c());
                }
                ((org.a.a.a.a.a) this.b).a(dVar);
                return;
            }
            ((org.a.a.a.a.a) this.b).a(dVarA);
        }
    }
}
