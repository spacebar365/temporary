package org.a.a.a;

import java.util.EventObject;

/* JADX INFO: compiled from: ProtocolCommandEvent.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends EventObject {
    private final int a;
    private final boolean b;
    private final String c;
    private final String d;

    public b(Object obj, String str, String str2) {
        super(obj);
        this.a = 0;
        this.c = str2;
        this.b = true;
        this.d = str;
    }

    public b(Object obj, int i, String str) {
        super(obj);
        this.a = i;
        this.c = str;
        this.b = false;
        this.d = null;
    }
}
