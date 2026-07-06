package com.al.dlnaserver.c;

import a.g.ae;
import a.g.s;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: SMBFileTreeWalker.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final void a(List<ae> list, Map<ae, ae> map, String str) {
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
        a(new ae(str, new a.b.b(new a.a.b(properties)).a(new s(strSubstring, strSubstring2, str2))), list, map);
    }

    private void a(ae aeVar, List<ae> list, Map<ae, ae> map) {
        if (aeVar.k()) {
            ae[] aeVarArrN = aeVar.n();
            for (ae aeVar2 : aeVarArrN) {
                if (aeVar2.k()) {
                    a(aeVar2, list, map);
                } else if (aeVar2.l() && com.al.dlnaserver.b.c.d(aeVar2.h())) {
                    list.add(aeVar2);
                    if (com.al.dlnaserver.b.c.e(aeVar2.h())) {
                        for (ae aeVar3 : aeVarArrN) {
                            if (com.al.dlnaserver.b.c.h(aeVar3.h()) && aeVar3.h().startsWith(com.al.dlnaserver.b.c.c(aeVar2.h()))) {
                                map.put(aeVar2, aeVar3);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (aeVar.l() && com.al.dlnaserver.b.c.d(aeVar.h())) {
            list.add(aeVar);
        }
    }
}
