package org.p037a.p038a.p039a;

import java.util.EventObject;

/* JADX INFO: renamed from: org.a.a.a.b */
/* JADX INFO: compiled from: ProtocolCommandEvent.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0466b extends EventObject {

    /* JADX INFO: renamed from: a */
    private final int f1718a;

    /* JADX INFO: renamed from: b */
    private final boolean f1719b;

    /* JADX INFO: renamed from: c */
    private final String f1720c;

    /* JADX INFO: renamed from: d */
    private final String f1721d;

    public C0466b(Object obj, String str, String str2) {
        super(obj);
        this.f1718a = 0;
        this.f1720c = str2;
        this.f1719b = true;
        this.f1721d = str;
    }

    public C0466b(Object obj, int i, String str) {
        super(obj);
        this.f1718a = i;
        this.f1720c = str;
        this.f1719b = false;
        this.f1721d = null;
    }
}
