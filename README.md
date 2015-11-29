#PhotoViewEx

A [PhotoView](https://github.com/chrisbanes/PhotoView) include TOP_CROP and BOTTOM_CROP.also works in VerticalViewPager.

<a href="./graphics/device-2015-11-29-161842.png"><img src="./graphics/device-2015-11-29-161842.png" width="40%"/></a>
<a href="./graphics/device-2015-11-29-161901.png"><img src="./graphics/device-2015-11-29-161901.png" width="40%"/></a>

link to [PhotoView](https://github.com/chrisbanes/PhotoView).

#Useage

How to use CROP_TOP and CROP_BOTTOM.

##Step 1.

    compile 'com.github.chrisbanes.photoview:library:1.2.4'

##Step 2.

copy PhotoViewAttacherEx.java into your Project.

##Step 3.

    private PhotoViewAttacherEx mAttacher;

    ...

    mAttacher = new PhotoViewAttacherEx(mImageView);

    ...

    mAttacher.setScaleType(PhotoViewAttacherEx.ScaleTypeEx.CROP_TOP);
    mAttacher.setScaleType(PhotoViewAttacherEx.ScaleTypeEx.CROP_BOTTOM);

How to work in VerticalViewPager.

    mAttacher.setParentIsVertical(true);

#License

    This project is licensed under the MIT License.have fun.