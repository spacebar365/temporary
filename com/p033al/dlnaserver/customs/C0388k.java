package com.p033al.dlnaserver.customs;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import com.p033al.dlnaserver.p035b.C0335b;
import com.p033al.dlnaserver.p035b.C0360n;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.k */
/* JADX INFO: compiled from: MediaObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0388k extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private Context f1468a;

    /* JADX INFO: renamed from: b */
    private List<String> f1469b;

    /* JADX INFO: renamed from: c */
    private long f1470c;

    /* JADX INFO: renamed from: d */
    private Thread f1471d;

    public C0388k(Handler handler, Context context) {
        super(handler);
        this.f1468a = context;
        this.f1469b = C0360n.m1052c(context, "pathsList");
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (C0360n.m1050a(this.f1468a, "auto_update")) {
            if (String.valueOf(uri).contains(String.valueOf(MediaStore.Video.Media.EXTERNAL_CONTENT_URI)) || String.valueOf(uri).contains(String.valueOf(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI)) || String.valueOf(uri).contains(String.valueOf(MediaStore.Images.Media.EXTERNAL_CONTENT_URI))) {
                String strM1010a = C0335b.m1010a(this.f1468a, uri);
                String strValueOf = strM1010a == null ? String.valueOf(uri) : strM1010a;
                Iterator<String> it = this.f1469b.iterator();
                while (it.hasNext()) {
                    if (strValueOf.startsWith(it.next())) {
                        this.f1470c = new Date().getTime();
                        Log.i("MediaObserver", "Updated for ".concat(String.valueOf(strValueOf)));
                        if (this.f1471d == null) {
                            this.f1471d = new C0389l(this);
                            this.f1471d.start();
                        }
                    }
                }
            }
        }
    }
}
