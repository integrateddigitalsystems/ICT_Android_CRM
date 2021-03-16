package com.ids.ict.custom;

import android.content.Context;
import android.util.AttributeSet;


public class CustomTextViewBold extends androidx.appcompat.widget.AppCompatTextView {
    public CustomTextViewBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextViewBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode())
            setTypeface(AppHelper.getTypeFaceBold(getContext()));
    }
}