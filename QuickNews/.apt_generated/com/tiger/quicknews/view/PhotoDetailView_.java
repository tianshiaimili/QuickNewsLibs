//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.tiger.quicknews.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.tiger.quicknews.R.id;
import com.tiger.quicknews.R.layout;
import com.tiger.quicknews.wedget.ProgressButton;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class PhotoDetailView_
    extends PhotoDetailView
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public PhotoDetailView_(Context context) {
        super(context);
        init_();
    }

    public static PhotoDetailView build(Context context) {
        PhotoDetailView_ instance = new PhotoDetailView_(context);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.item_detail_photo, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        photoContent = ((TextView) hasViews.findViewById(id.photo_content));
        progressButton = ((ProgressButton) hasViews.findViewById(id.progressButton));
        currentImage = ((ImageView) hasViews.findViewById(id.current_image));
        photoCount = ((TextView) hasViews.findViewById(id.photo_count));
        photoTitle = ((TextView) hasViews.findViewById(id.photo_title));
        initView();
    }

}
