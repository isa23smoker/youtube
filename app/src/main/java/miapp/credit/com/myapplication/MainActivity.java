package miapp.credit.com.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActi","onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActi","onStop()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActi","onPause()");
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.reyleon;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        System.out.println("oncreate()");
        Log.d("MainActi","hola como estas");



    }
}


