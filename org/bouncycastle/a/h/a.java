package org.bouncycastle.a.h;

import org.bouncycastle.a.p;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;

    static {
        p pVar = new p("1.3.101");
        a = pVar;
        b = pVar.b("110").c();
        c = a.b("111").c();
        d = a.b("112").c();
        e = a.b("113").c();
    }
}
