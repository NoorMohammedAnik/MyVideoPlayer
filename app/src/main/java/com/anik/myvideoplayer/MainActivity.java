package com.anik.myvideoplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {


    /*

    For full screen video view
    *Remove extends Appcompact and use extends activity
    * Add this line in android manifest
     android:theme="@android:style/Theme.NoTitleBar.Fullscreen"

     */

    VideoView videoView;
    MediaController controller;//for control video

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=findViewById(R.id.videoView);

        controller=new MediaController(this);
        //set controller to videoView
        videoView.setMediaController(controller);

        //provide url of the video which have extention and not use youtube video link
        videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.start();


    }
}
