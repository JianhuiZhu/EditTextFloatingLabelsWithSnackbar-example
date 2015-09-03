# EditTextFloatingLabelsWithSnackbar-example
EditText Floating Labels with Snack bar --Super Simple Example    
![alt tag](https://github.com/JianhuiZhu/EditTextFloatingLabelsWithSnackbar-example/blob/master/edittext_floating_label_with_snackbar.gif)    
    
#Library    
      compile 'com.android.support:design:22.2.0'
      compile 'com.jakewharton:butterknife:7.0.1'
  Compile in gradle, enjoy :smile:
#Layout XML file
      <?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/container"
    style="@style/Theme.AppCompat.Light.NoActionBar"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:paddingBottom="@dimen/activity_vertical_margin"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin">

        <android.support.design.widget.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <EditText
                android:id="@+id/email"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Your email here"
                android:inputType="textEmailAddress" />
        </android.support.design.widget.TextInputLayout>

        <android.support.design.widget.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <EditText
                android:id="@+id/email2"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Your email agess"
                android:inputType="textEmailAddress" />
        </android.support.design.widget.TextInputLayout>
    </LinearLayout>
</android.support.design.widget.CoordinatorLayout>
#Please notice
One EditText Surround by One TextInputLayout
