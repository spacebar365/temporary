package org.bouncycastle.p142f.p144b.p145a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: org.bouncycastle.f.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1548c implements InterfaceC1549d {

    /* JADX INFO: renamed from: a */
    private static final List f5502a = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: b */
    private String f5503b;

    /* JADX INFO: renamed from: c */
    private List f5504c;

    /* JADX INFO: renamed from: d */
    private byte[] f5505d;

    private C1548c(String str, List list, byte[] bArr) {
        this.f5503b = str;
        this.f5504c = Collections.unmodifiableList(list);
        this.f5505d = bArr;
    }

    public C1548c(String str, byte[] bArr) {
        this(str, f5502a, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final String m4129a() {
        return this.f5503b;
    }

    /* JADX INFO: renamed from: b */
    public final List m4130b() {
        return this.f5504c;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m4131c() {
        return this.f5505d;
    }

    @Override // org.bouncycastle.p142f.p144b.p145a.InterfaceC1549d
    /* JADX INFO: renamed from: d */
    public final C1548c mo4132d() {
        return this;
    }
}
