package com.fanhl.photoviewex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.fanhl.photoview.PhotoViewAttacherEx;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private Button    topCrop;
    private Button    bottomCrop;
    private Button    fixStart;
    private Button    fixEnd;
    private Button    fixXY;
    private Button    fitCenter;
    private Button    center;
    private Button    centerCrop;
    private Button    centerInside;

    PhotoViewAttacherEx mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mImageView = (ImageView) findViewById(R.id.imageView);
        this.topCrop = (Button) findViewById(R.id.topCrop);
        this.bottomCrop = (Button) findViewById(R.id.bottomCrop);
        this.fixStart = (Button) findViewById(R.id.fixStart);
        this.fixEnd = (Button) findViewById(R.id.fixEnd);
        this.fixXY = (Button) findViewById(R.id.fixXY);
        this.fitCenter = (Button) findViewById(R.id.fitCenter);
        this.center = (Button) findViewById(R.id.center);
        this.centerInside = (Button) findViewById(R.id.centerInside);
        this.centerCrop = (Button) findViewById(R.id.centerCrop);

        mAttacher = new PhotoViewAttacherEx(mImageView);

        // except PhotoViewAttacherEx.ScaleTypeEx.CROP_TOP/CROP_BOTTOM,
        // you can use PhotoViewAttacherEx.ScaleTypeEx.XXX or ImageView.ScaleType.XXX

        setButtonAction(topCrop, PhotoViewAttacherEx.ScaleTypeEx.CROP_TOP);
        setButtonAction(bottomCrop, PhotoViewAttacherEx.ScaleTypeEx.CROP_BOTTOM);
        setButtonAction(fixStart, ImageView.ScaleType.FIT_START);
        setButtonAction(fixEnd, ImageView.ScaleType.FIT_END);
        setButtonAction(fixXY, ImageView.ScaleType.FIT_XY);
        setButtonAction(fitCenter, ImageView.ScaleType.FIT_CENTER);
        setButtonAction(center, ImageView.ScaleType.CENTER);
        setButtonAction(centerInside, ImageView.ScaleType.CENTER_INSIDE);
        setButtonAction(centerCrop, ImageView.ScaleType.CENTER_CROP);
    }

    private void setButtonAction(Button topCrop, final PhotoViewAttacherEx.ScaleTypeEx type) {
        topCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAttacher.setScaleType(type);
            }
        });
    }

    private void setButtonAction(Button topCrop, final ImageView.ScaleType type) {
        topCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAttacher.setScaleType(type);
            }
        });
    }
}
