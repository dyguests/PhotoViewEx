#PhotoViewEx

A [PhotoView](https://github.com/chrisbanes/PhotoView) include TOP_CROP and BOTTOM_CROP.also works in VerticalViewPager.

<a href="./graphics/device-2015-11-29-161842.png"><img src="./graphics/device-2015-11-29-161842.png" width="40%"/></a>
<a href="./graphics/device-2015-11-29-161901.png"><img src="./graphics/device-2015-11-29-161901.png" width="40%"/></a>

link to [PhotoView](https://github.com/chrisbanes/PhotoView).

#Useage

##Step 1.

    compile 'com.github.chrisbanes.photoview:library:1.2.4'

##Step 2.

copy PhotoViewAttacherEx.java into your Project.

##Step 3.

    private PhotoViewAttacherEx mAttacher;

    ...

    mAttacher = new PhotoViewAttacherEx(mImageView);

    ...

    mAttacher.setScaleType(PhotoViewAttacherEx.ScaleTypeEx.TOP_CROP);
    mAttacher.setScaleType(PhotoViewAttacherEx.ScaleTypeEx.BOTTOM_CROP);

#License

    This project is licensed under the MIT License.have fun.