package com.al.dlnaserver;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog$Builder;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.al.dlnaserver.b.bl;
import com.al.dlnaserver.b.l;
import com.al.dlnaserver.b.m;
import com.al.dlnaserver.b.n;
import com.al.dlnaserver.b.p;
import com.al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity {
    private Menu a;
    private TextView b;
    private ListView c;
    private ArrayAdapter<String> d;
    private ArrayList<String> e;
    private BroadcastReceiver f;

    static /* synthetic */ ListView c(MainActivity mainActivity) {
        return mainActivity.c;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        App.e = true;
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bl.a(this)) {
            finish();
            Intent intent = new Intent(this, (Class<?>) MainActivityTV.class);
            intent.setFlags(268435456);
            intent.setFlags(67108864);
            intent.setAction("android.intent.action.MAIN");
            startActivity(intent);
        }
        com.al.dlnaserver.b.d.a(this);
        setContentView(R$layout.activity_main);
        this.b = (TextView) findViewById(R$id.info);
        this.e = n.c(this, "pathsList");
        d();
        g();
        this.c = (ListView) findViewById(R$id.listPaths);
        this.d = new com.al.dlnaserver.customs.c(this, this.e, false);
        this.c.setAdapter((ListAdapter) this.d);
        if (bundle == null && !this.e.isEmpty() && (Build$VERSION.SDK_INT < 23 || m.a(this, 1, true))) {
            if (l.a(this)) {
                if (!App.a) {
                    Intent intent2 = new Intent(this, (Class<?>) DlnaMediaServer.class);
                    intent2.putStringArrayListExtra("pathsList", this.e);
                    startService(intent2);
                    b(true);
                }
            } else {
                Toast.makeText(this, R$string.no_conn, 0).show();
            }
        }
        if (App.a) {
            c();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".UIupdate");
        this.f = new a(this);
        registerReceiver(this.f, intentFilter);
        if (Build$VERSION.SDK_INT < 23) {
            return;
        }
        PowerManager powerManager = (PowerManager) getSystemService("power");
        BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
        if (n.a(this, "do_not_show_batt_warning") || powerManager.isIgnoringBatteryOptimizations(getPackageName()) || batteryManager.getIntProperty(4) == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.setTitle(R$string.title_batt_settings);
        alertDialog$Builder.setMessage(R$string.msg_batt_settings);
        alertDialog$Builder.setNegativeButton(getString(R$string.negative_button), new c(this));
        alertDialog$Builder.setNeutralButton(getString(R$string.neutral_button_doze), new d(this));
        alertDialog$Builder.setPositiveButton(getString(R$string.positive_button), new e(this));
        alertDialog$Builder.create().show();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.menu, menu);
        this.a = menu;
        a();
        c();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131361855) {
            if (App.a) {
                if (!App.a) {
                    App.a = false;
                    return true;
                }
                stopService(new Intent(this, (Class<?>) DlnaMediaServer.class));
                a(true);
                b();
                b(false);
                return true;
            }
            if (Build$VERSION.SDK_INT >= 23 && !m.a(this, 1, true)) {
                return true;
            }
            e();
            return true;
        }
        if (itemId == 2131361854) {
            this.e.add("");
            d();
            this.d.notifyDataSetChanged();
            this.c.post(new b(this));
            n.a(this, "pathsList", this.e);
            return true;
        }
        if (itemId == 2131361856) {
            new p().a(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        int i3 = 0;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 12345) {
                String stringExtra = intent.getStringExtra("RESULT_PATH");
                String[] stringArrayExtra = intent.getStringArrayExtra("RESULT_PATHS_LIST");
                int iMin = Math.min(intent.getIntExtra("LIST_ITEM", -1), this.e.size() - 1);
                if (stringArrayExtra != null) {
                    int length = stringArrayExtra.length;
                    int i4 = 1;
                    while (i3 < length) {
                        String str = stringArrayExtra[i3];
                        if (i4 == 1 && iMin >= 0) {
                            this.e.set(iMin, str);
                        } else {
                            this.e.add(str);
                        }
                        i4++;
                        i3++;
                    }
                } else if (iMin >= 0) {
                    this.e.set(iMin, stringExtra);
                }
                this.d.notifyDataSetChanged();
                n.a(this, "pathsList", this.e);
                return;
            }
            if (i == 12346) {
                ClipData clipData = Build$VERSION.SDK_INT >= 16 ? intent.getClipData() : null;
                Uri data = intent.getData();
                if (clipData != null) {
                    while (true) {
                        int i5 = i3;
                        if (i5 >= clipData.getItemCount()) {
                            break;
                        }
                        Uri uri = clipData.getItemAt(i5).getUri();
                        String strA = com.al.dlnaserver.b.b.a(this, uri);
                        if (strA == null) {
                            strA = b(uri, intent);
                        }
                        int iMin2 = Math.min(App.q, this.e.size() - 1);
                        if (i5 == 0 && iMin2 >= 0) {
                            this.e.set(iMin2, strA);
                        } else {
                            this.e.add(strA);
                        }
                        i3 = i5 + 1;
                    }
                } else if (data != null) {
                    String strA2 = com.al.dlnaserver.b.b.a(this, data);
                    if (strA2 == null) {
                        strA2 = b(data, intent);
                    }
                    int iMin3 = Math.min(App.q, this.e.size() - 1);
                    if (iMin3 >= 0) {
                        this.e.set(iMin3, strA2);
                    }
                } else {
                    return;
                }
                this.d.notifyDataSetChanged();
                n.a(this, "pathsList", this.e);
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    e();
                } else {
                    Toast.makeText(this, R$string.permission_access_denined, 0).show();
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        App.e = true;
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        App.e = false;
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        unregisterReceiver(this.f);
        App.e = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("info", this.b.getText().toString());
        bundle.putStringArray("pathsList", (String[]) this.e.toArray(new String[0]));
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.b.setText(bundle.getString("info"));
        String[] stringArray = bundle.getStringArray("pathsList");
        if (stringArray != null && stringArray.length > 0) {
            if (this.e == null || this.e.isEmpty()) {
                this.e = new ArrayList<>(Arrays.asList(stringArray));
            }
        }
    }

    private void a(boolean z) {
        if (this.a != null) {
            MenuItem menuItemFindItem = this.a.findItem(R$id.action_run);
            if (z) {
                menuItemFindItem.setIcon(R$drawable.ic_play_normal);
            } else {
                menuItemFindItem.setIcon(R$drawable.ic_pause_normal);
            }
        }
    }

    static /* synthetic */ void a(MainActivity mainActivity) {
        mainActivity.a();
    }

    private void a() {
        if (this.a != null) {
            MenuItem menuItemFindItem = this.a.findItem(R$id.action_run);
            if (!App.a) {
                menuItemFindItem.setIcon(R$drawable.ic_play_normal);
            } else {
                menuItemFindItem.setIcon(R$drawable.ic_pause_normal);
            }
        }
    }

    private void b() {
        this.b.setText(getString(R$string.info_msg_stopped));
    }

    static /* synthetic */ void b(MainActivity mainActivity) {
        mainActivity.c();
    }

    private void c() {
        if (App.b) {
            this.b.setText(getString(R$string.info_msg_starting));
            return;
        }
        if (App.a) {
            String strA = org.cybergarage.b.a.a();
            String str = "[" + org.cybergarage.b.a.b() + "]";
            this.b.setText(String.valueOf(getString(R$string.info_msg)) + " " + strA + ":" + App.l + " " + str + " " + (" (" + App.m + (App.d ? "… " : " ") + getString(R$string.info_msg_objects) + ")") + (App.c ? "\n" + getString(R$string.some_errors) : ""));
            return;
        }
        b();
    }

    private void d() {
        TextView textView = (TextView) findViewById(R$id.list_empty_warning);
        if (this.e.isEmpty()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    private void e() {
        if (l.a(this)) {
            if (!App.a) {
                this.b.setText(getString(R$string.info_msg_starting));
                Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
                intent.putStringArrayListExtra("pathsList", this.e);
                startService(intent);
                b(true);
            }
            a(false);
            return;
        }
        Toast.makeText(this, R$string.no_conn, 0).show();
    }

    private void f() {
        Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
        stopService(intent);
        try {
            Thread.sleep(200L);
        } catch (Exception e) {
        }
        intent.putStringArrayListExtra("pathsList", this.e);
        startService(intent);
    }

    private String a(Uri uri, Intent intent) {
        String strA = "";
        if (uri != null && (strA = com.al.dlnaserver.b.b.a(this, uri)) == null) {
            strA = uri.toString();
            if (Build$VERSION.SDK_INT >= 19) {
                try {
                    getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        }
        return strA;
    }

    private void g() {
        String action;
        ArrayList parcelableArrayListExtra;
        Intent intent = getIntent();
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.intent.action.SEND")) {
                String strA = a((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"), intent);
                if (!strA.contains("content://")) {
                    strA = "*".concat(String.valueOf(strA));
                }
                if (!strA.equals("*") && !this.e.contains(strA)) {
                    this.e.add(strA);
                    n.a(this, "pathsList", this.e);
                    if (App.a) {
                        f();
                        return;
                    }
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.SEND_MULTIPLE") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM")) != null) {
                boolean z = false;
                for (int i = 0; i < parcelableArrayListExtra.size(); i++) {
                    String strA2 = a((Uri) parcelableArrayListExtra.get(i), intent);
                    if (!strA2.contains("content://")) {
                        strA2 = "*".concat(String.valueOf(strA2));
                    }
                    if (!strA2.equals("*") && !this.e.contains(strA2)) {
                        this.e.add(strA2);
                        z = true;
                    }
                }
                if (z) {
                    n.a(this, "pathsList", this.e);
                    if (App.a) {
                        f();
                    }
                }
            }
        }
    }

    private String b(Uri uri, Intent intent) {
        String string = uri.toString();
        if (Build$VERSION.SDK_INT >= 19) {
            try {
                getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
            } catch (SecurityException e) {
                e.printStackTrace();
                Toast.makeText(this, R$string.some_errors_content, 1).show();
            }
        }
        return string;
    }

    @SuppressLint({"Wakelock"})
    private void b(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }
}
