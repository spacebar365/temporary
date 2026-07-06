package com.al.dlnaserver.b;

import android.content.Context;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
final class h implements View$OnClickListener {
    final /* synthetic */ e a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ String c;

    h(e eVar, Context context, String str) {
        this.a = eVar;
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // android.view.View$OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r2 = 1
            int r0 = android.os.Build$VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L12
            android.content.Context r0 = r6.b
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2
            boolean r0 = com.al.dlnaserver.b.m.a(r0, r1, r2)
            if (r0 == 0) goto L68
        L12:
            android.content.Context r2 = r6.b
            java.lang.String r3 = r6.c
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            r0.<init>(r4)     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.lang.String r4 = "/dlnaseverlog.txt"
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.lang.String r4 = r0.toString()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            r5.<init>(r4)     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            r0.<init>(r5)     // Catch: java.io.IOException -> L69 java.lang.Throwable -> L7d
            r0.write(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            r3 = 2131165255(0x7f070047, float:1.7944722E38)
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            java.lang.String r3 = " "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            r3 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            r1.show()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            r0.close()     // Catch: java.io.IOException -> L8b
        L68:
            return
        L69:
            r0 = move-exception
            r0 = r1
        L6b:
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Exception "
            r1.println(r2)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L68
            r0.close()     // Catch: java.io.IOException -> L78
            goto L68
        L78:
            r0 = move-exception
            r0.printStackTrace()
            goto L68
        L7d:
            r0 = move-exception
            r2 = r0
            r3 = r1
        L80:
            if (r3 == 0) goto L85
            r3.close()     // Catch: java.io.IOException -> L86
        L85:
            throw r2
        L86:
            r0 = move-exception
            r0.printStackTrace()
            goto L85
        L8b:
            r0 = move-exception
            r0.printStackTrace()
            goto L68
        L90:
            r1 = move-exception
            r2 = r1
            r3 = r0
            goto L80
        L94:
            r1 = move-exception
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.b.h.onClick(android.view.View):void");
    }
}
