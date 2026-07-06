package com.al.dlnaserver.b;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;
import com.al.dlnaserver.R$drawable;
import com.al.dlnaserver.R$id;
import com.al.dlnaserver.R$layout;
import com.al.dlnaserver.customs.AppWidget;

/* JADX INFO: compiled from: WidgetUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class bm {
    public static void a(Context context, boolean z) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.app_widget);
        if (z) {
            remoteViews.setInt(R$id.widgetLayout, "setBackgroundResource", R$drawable.widget_background_enabled);
            remoteViews.setImageViewResource(R$id.widgetIcon, R$drawable.ic_play_network);
        } else {
            remoteViews.setInt(R$id.widgetLayout, "setBackgroundResource", R$drawable.widget_background_disabled);
            remoteViews.setImageViewResource(R$id.widgetIcon, R$drawable.ic_close_network);
        }
        AppWidgetManager.getInstance(context).updateAppWidget(new ComponentName(context, (Class<?>) AppWidget.class), remoteViews);
    }
}
