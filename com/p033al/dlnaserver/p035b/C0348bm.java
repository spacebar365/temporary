package com.p033al.dlnaserver.p035b;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;
import com.p033al.dlnaserver.C0303R;
import com.p033al.dlnaserver.customs.AppWidget;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bm */
/* JADX INFO: compiled from: WidgetUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0348bm {
    /* JADX INFO: renamed from: a */
    public static void m1016a(Context context, boolean z) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0303R.layout.app_widget);
        if (z) {
            remoteViews.setInt(C0303R.id.widgetLayout, "setBackgroundResource", C0303R.drawable.widget_background_enabled);
            remoteViews.setImageViewResource(C0303R.id.widgetIcon, C0303R.drawable.ic_play_network);
        } else {
            remoteViews.setInt(C0303R.id.widgetLayout, "setBackgroundResource", C0303R.drawable.widget_background_disabled);
            remoteViews.setImageViewResource(C0303R.id.widgetIcon, C0303R.drawable.ic_close_network);
        }
        AppWidgetManager.getInstance(context).updateAppWidget(new ComponentName(context, (Class<?>) AppWidget.class), remoteViews);
    }
}
