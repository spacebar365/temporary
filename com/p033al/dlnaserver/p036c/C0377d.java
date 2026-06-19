package com.p033al.dlnaserver.p036c;

import com.p033al.dlnaserver.p035b.C0349c;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import p000a.p001a.C0002b;
import p000a.p002b.C0012b;
import p000a.p029g.C0215ae;
import p000a.p029g.C0259s;

/* JADX INFO: renamed from: com.al.dlnaserver.c.d */
/* JADX INFO: compiled from: SMBFileTreeWalker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0377d {
    /* JADX INFO: renamed from: a */
    public final void m1073a(List<C0215ae> list, Map<C0215ae, C0215ae> map, String str) {
        String str2;
        String strSubstring;
        Properties properties = new Properties();
        properties.setProperty("jcifs.smb.client.enableSMB2", "true");
        properties.setProperty("jcifs.smb.client.disableSMB1", "false");
        properties.setProperty("jcifs.traceResources", "true");
        properties.setProperty("jcifs.smb.client.soTimeout", "5000");
        properties.setProperty("jcifs.smb.client.responseTimeout", "7000");
        properties.setProperty("jcifs.smb.client.connTimeout", "5000");
        int iLastIndexOf = str.replace("smb://", "").lastIndexOf("@");
        String strSubstring2 = iLastIndexOf == -1 ? null : str.replace("smb://", "").substring(0, iLastIndexOf);
        if (strSubstring2 != null) {
            if (strSubstring2.contains("\\")) {
                strSubstring = strSubstring2.substring(0, strSubstring2.indexOf("\\"));
            } else {
                strSubstring = strSubstring2.contains("+") ? strSubstring2.substring(0, strSubstring2.indexOf("+")) : null;
            }
            if (strSubstring2.contains(":") && strSubstring2.indexOf(":") < strSubstring2.length()) {
                String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(":") + 1, strSubstring2.length());
                strSubstring2 = strSubstring2.replace(":".concat(String.valueOf(strSubstring3)), "");
                if (strSubstring != null) {
                    strSubstring2 = strSubstring2.replace(String.valueOf(strSubstring) + "\\", "").replace(String.valueOf(strSubstring) + "+", "");
                    str2 = strSubstring3;
                } else {
                    str2 = strSubstring3;
                }
            } else if (strSubstring != null) {
                strSubstring2 = strSubstring2.replace(String.valueOf(strSubstring) + "\\", "").replace(String.valueOf(strSubstring) + "+", "");
                str2 = null;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
            strSubstring2 = null;
            strSubstring = null;
        }
        m1072a(new C0215ae(str, new C0012b(new C0002b(properties)).mo107a(new C0259s(strSubstring, strSubstring2, str2))), list, map);
    }

    /* JADX INFO: renamed from: a */
    private void m1072a(C0215ae c0215ae, List<C0215ae> list, Map<C0215ae, C0215ae> map) {
        if (c0215ae.m634k()) {
            C0215ae[] c0215aeArrM637n = c0215ae.m637n();
            for (C0215ae c0215ae2 : c0215aeArrM637n) {
                if (c0215ae2.m634k()) {
                    m1072a(c0215ae2, list, map);
                } else if (c0215ae2.m635l() && C0349c.m1024d(c0215ae2.m631h())) {
                    list.add(c0215ae2);
                    if (C0349c.m1025e(c0215ae2.m631h())) {
                        for (C0215ae c0215ae3 : c0215aeArrM637n) {
                            if (C0349c.m1028h(c0215ae3.m631h()) && c0215ae3.m631h().startsWith(C0349c.m1022c(c0215ae2.m631h()))) {
                                map.put(c0215ae2, c0215ae3);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (c0215ae.m635l() && C0349c.m1024d(c0215ae.m631h())) {
            list.add(c0215ae);
        }
    }
}
