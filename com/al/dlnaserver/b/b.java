package com.al.dlnaserver.b;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore$Audio$Media;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: FilePicker.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static String a = "FilePicker";

    @TargetApi(19)
    public static String a(Context context, Uri uri) throws Throwable {
        boolean z;
        String str;
        boolean z2 = Build$VERSION.SDK_INT >= 19;
        Log.i(a, "uri=" + uri.toString());
        if (z2 && DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str2 = strArrSplit[0];
                if ("primary".equalsIgnoreCase(str2)) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
                StorageManager storageManager = (StorageManager) context.getSystemService("storage");
                try {
                    Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                    Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                    Method method2 = cls.getMethod("getUuid", new Class[0]);
                    Method method3 = cls.getMethod("getState", new Class[0]);
                    Method method4 = cls.getMethod("getPath", new Class[0]);
                    Method method5 = cls.getMethod("isPrimary", new Class[0]);
                    Method method6 = cls.getMethod("isEmulated", new Class[0]);
                    Object objInvoke = method.invoke(storageManager, new Object[0]);
                    int length = Array.getLength(objInvoke);
                    for (int i = 0; i < length; i++) {
                        Object obj = Array.get(objInvoke, i);
                        if (("mounted".equals(method3.invoke(obj, new Object[0])) || "mounted_ro".equals(method3.invoke(obj, new Object[0]))) && ((!((Boolean) method5.invoke(obj, new Object[0])).booleanValue() || !((Boolean) method6.invoke(obj, new Object[0])).booleanValue()) && (str = (String) method2.invoke(obj, new Object[0])) != null && str.equals(str2))) {
                            return method4.invoke(obj, new Object[0]) + "/" + strArrSplit[1];
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    try {
                        return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e2) {
                        if (documentId == null || documentId.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && documentId.startsWith("raw:")) {
                            return documentId.replaceFirst("raw:", "");
                        }
                        Log.e(a, "Long.valueOf(id), id=".concat(String.valueOf(documentId)), e2);
                        return null;
                    }
                }
                if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str3 = strArrSplit2[0];
                    if ("image".equals(str3)) {
                        uri = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str3)) {
                        uri = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str3)) {
                        uri = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
                    }
                    return a(context, uri, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                String strA = a(context, uri, null, null);
                if (strA == null) {
                    return null;
                }
                return strA;
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) throws java.lang.Throwable {
        /*
            r6 = 0
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r1 = "_data"
            r2[r0] = r1
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3d
            r5 = 0
            r1 = r8
            r3 = r9
            r4 = r10
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3d
            if (r1 == 0) goto L45
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r0 == 0) goto L45
            java.lang.String r0 = "_data"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            return r0
        L2d:
            r0 = move-exception
            r1 = r6
        L2f:
            java.lang.String r2 = com.al.dlnaserver.b.b.a     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "getDataColumn()"
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L3b
            r1.close()
        L3b:
            r0 = r6
            goto L2c
        L3d:
            r0 = move-exception
            r1 = r6
        L3f:
            if (r1 == 0) goto L44
            r1.close()
        L44:
            throw r0
        L45:
            if (r1 == 0) goto L3b
            r1.close()
            goto L3b
        L4b:
            r0 = move-exception
            goto L3f
        L4d:
            r0 = move-exception
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.b.b.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
