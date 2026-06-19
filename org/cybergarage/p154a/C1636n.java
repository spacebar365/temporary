package org.cybergarage.p154a;

import java.util.Vector;

/* JADX INFO: renamed from: org.cybergarage.a.n */
/* JADX INFO: compiled from: ParameterList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1636n extends Vector {
    /* JADX INFO: renamed from: a */
    public final String m4701a(String str) {
        C1635m c1635m;
        int size = size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1635m = null;
                break;
            }
            c1635m = (C1635m) get(i);
            if (str.compareTo(c1635m.m4699a()) == 0) {
                break;
            }
            i++;
        }
        if (c1635m == null) {
            return "";
        }
        return c1635m.m4700b();
    }
}
