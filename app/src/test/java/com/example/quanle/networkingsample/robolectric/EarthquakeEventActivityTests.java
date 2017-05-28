package com.example.quanle.networkingsample.robolectric;

import android.widget.TextView;

import com.example.quanle.networkingsample.BuildConfig;
import com.example.quanle.networkingsample.EarthquakeEventActivity;
import com.example.quanle.networkingsample.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by QuanLe on 5/28/2017.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class EarthquakeEventActivityTests {
    @Test
    public void earthquakeEventActivity_Loaded_ShowEarthquakeStrengthAndPeople(){
        EarthquakeEventActivity activity = Robolectric.setupActivity(EarthquakeEventActivity.class);

        assertThat(((TextView) activity.findViewById(R.id.title)).getText().toString(), is("M 7.8 - 27km SSE of Muisne, Ecuador"));
        assertThat(((TextView) activity.findViewById(R.id.number_of_people)).getText().toString(), containsString("192"));
        assertThat(((TextView) activity.findViewById(R.id.perceived_magnitude)).getText().toString(), containsString("9.1"));
    }
}
