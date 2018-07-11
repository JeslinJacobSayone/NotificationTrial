package com.example.sayone.notificationtrial;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    //simple notification
//    public void click(View view){
//        NotificationCompat.Builder mBuilder =
//                new NotificationCompat.Builder(this)
//                        .setSmallIcon(R.drawable.ic_launcher_foreground)
//                        .setContentTitle("My notification")
//                        .setContentText("Hello World!");
//
//        NotificationManager mNotificationManager =(NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
//        mNotificationManager.notify(001, mBuilder.build());
//    }

    // performing actions on intent click
//        public void click(View view){
//        NotificationCompat.Builder mBuilder =
//                new NotificationCompat.Builder(this)
//                        .setSmallIcon(R.drawable.ic_launcher_foreground)
//                        .setContentTitle("My notification")
//                        .setContentText(getString(R.string.longtxt));
//
//            Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
//            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//
//            mBuilder.setContentIntent(pendingIntent);
//
//
//            NotificationManager mNotificationManager =(NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
//        mNotificationManager.notify(001, mBuilder.build());
//    }

    //expanding and reading notification
//    public void click(View view){
//        NotificationCompat.Builder mBuilder =
//                new NotificationCompat.Builder(this)
//                        .setSmallIcon(R.drawable.ic_launcher_foreground)
//                        .setContentTitle("My notification")
//                        .setContentText("Much longer text that cannot fit one line...")
//                        .setStyle(new NotificationCompat.BigTextStyle()
//                                .bigText(getString(R.string.longtxt)))
//                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);
//
//        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//
//        mBuilder.setContentIntent(pendingIntent);
//
//
//        NotificationManager mNotificationManager =(NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
//        mNotificationManager.notify(001, mBuilder.build());
//    }

    //clickable action button
    public void click(View view){

        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("My notification")
                        .setContentText("Much longer text that cannot fit one line...")
                        .setStyle(new NotificationCompat.BigTextStyle()
                                .bigText(getString(R.string.longtxt)))
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .addAction(R.drawable.ic_snooze_black_24dp,"Snooze",
                                pendingIntent);



//        mBuilder.setContentIntent(pendingIntent);


        NotificationManager mNotificationManager =(NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
        mNotificationManager.notify(001, mBuilder.build());
    }
}
