package org.cybergarage.a;

import java.util.Vector;

/* JADX INFO: compiled from: ParameterList.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Vector {
    public final String a(String str) {
        m mVar;
        int size = size();
        int i = 0;
        while (true) {
            if (i >= size) {
                mVar = null;
                break;
            }
            mVar = (m) get(i);
            if (str.compareTo(mVar.a()) == 0) {
                break;
            }
            i++;
        }
        if (mVar == null) {
            return "";
        }
        return mVar.b();
    }
}
