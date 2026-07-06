package com.al.dlnaserver.customs;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore$Audio$Media;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.util.Log;
import com.al.dlnaserver.b.n;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MediaObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ContentObserver {
    private Context a;
    private List<String> b;
    private long c;
    private Thread d;

    static /* synthetic */ Context b(k kVar) {
        return kVar.a;
    }

    static /* synthetic */ long a(k kVar) {
        return kVar.c;
    }

    static /* synthetic */ void c(k kVar) {
        kVar.d = null;
    }

    public k(Handler handler, Context context) {
        super(handler);
        this.a = context;
        this.b = n.c(context, "pathsList");
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) throws Throwable {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) throws Throwable {
        if (n.a(this.a, "auto_update")) {
            if (String.valueOf(uri).contains(String.valueOf(MediaStore$Video$Media.EXTERNAL_CONTENT_URI)) || String.valueOf(uri).contains(String.valueOf(MediaStore$Audio$Media.EXTERNAL_CONTENT_URI)) || String.valueOf(uri).contains(String.valueOf(MediaStore$Images$Media.EXTERNAL_CONTENT_URI))) {
                String strA = com.al.dlnaserver.b.b.a(this.a, uri);
                String strValueOf = strA == null ? String.valueOf(uri) : strA;
                Iterator<String> it = this.b.iterator();
                while (it.hasNext()) {
                    if (strValueOf.startsWith(it.next())) {
                        this.c = new Date().getTime();
                        Log.i("MediaObserver", "Updated for ".concat(String.valueOf(strValueOf)));
                        if (this.d == null) {
                            this.d = new l(this);
                            this.d.start();
                        }
                    }
                }
            }
        }
    }
}
