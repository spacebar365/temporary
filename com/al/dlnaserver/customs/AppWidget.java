package com.al.dlnaserver.customs;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.al.dlnaserver.R$id;
import com.al.dlnaserver.R$layout;
import com.al.dlnaserver.b.o;

/* JADX INFO: loaded from: classes.dex */
public class AppWidget extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("DLNAServiceWidget")) {
            o.b(context);
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i : iArr) {
            Intent intent = new Intent(context, (Class<?>) AppWidget.class);
            intent.setAction("DLNAServiceWidget");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 0);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.app_widget);
            remoteViews.setOnClickPendingIntent(R$id.widgetLayout, broadcast);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }
}
