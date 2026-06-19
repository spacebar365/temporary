package org.bouncycastle.p054a;

import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.ai */
/* JADX INFO: loaded from: classes.dex */
final class C0546ai implements Enumeration {

    /* JADX INFO: renamed from: a */
    int f2007a = 0;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0545ah f2008b;

    C0546ai(C0545ah c0545ah) {
        this.f2008b = c0545ah;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f2007a < this.f2008b.f2006c.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        AbstractC0655q[] abstractC0655qArr = this.f2008b.f2006c;
        int i = this.f2007a;
        this.f2007a = i + 1;
        return abstractC0655qArr[i];
    }
}
