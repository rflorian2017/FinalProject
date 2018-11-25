package com.udacity.gradle.testing;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

//Test for joke AsyncTask
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception{
        try {
            String joke = null;

            // The object we want to test is main activity
            MainActivity mainActivity = new MainActivity();
            // Create the async task

            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivity);
            endpointsAsyncTask.execute();

            // get response from server
            joke = endpointsAsyncTask.get();

            // Make assertions
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e){
            Log.d("AsyncTaskTest", "no response");
        }
    }
}

