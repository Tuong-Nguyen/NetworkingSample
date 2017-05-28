package com.example.quanle.networkingsample.robolectric;

import android.widget.TextView;

import com.example.quanle.networkingsample.BuildConfig;
import com.example.quanle.networkingsample.MainActivity;
import com.example.quanle.networkingsample.R;

import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by QuanLe on 5/26/2017.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SandwichTest {
    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        assertThat(((TextView) activity.findViewById(R.id.MessageTextView)).getText(), Matchers.<CharSequence>is("Hello World!"));
    }
}
