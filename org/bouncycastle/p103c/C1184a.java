package org.bouncycastle.p103c;

import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.C0620b;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p106c.C1206c;

/* JADX INFO: renamed from: org.bouncycastle.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1184a {
    /* JADX INFO: renamed from: a */
    public static C1206c m2826a(String str) {
        C1122y c1122yM1503a = C0620b.m1503a(str);
        if (c1122yM1503a == null) {
            try {
                c1122yM1503a = C0620b.m1504a(new C0653p(str));
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
        if (c1122yM1503a == null) {
            return null;
        }
        return new C1206c(str, c1122yM1503a.m2699a(), c1122yM1503a.m2700b(), c1122yM1503a.m2701c(), c1122yM1503a.m2702d(), c1122yM1503a.m2704f());
    }
}
