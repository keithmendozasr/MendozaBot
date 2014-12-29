/*
 * Copyright 2014 Keith Mendoza Sr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package info.homepluspower.arduino.duinomote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.EditText;

public class MainActivity extends Activity {
    private final static String LogTag = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    //Handle "Connect" being switched
    public void onActivateClicked(View v)
    {
        GridLayout controls = (GridLayout) findViewById(R.id.controlLayout);

        Switch s = (Switch)v;
        if(s.isChecked()) {
            controls.setVisibility(View.VISIBLE);
            ((EditText)findViewById(R.id.robotIPText)).setEnabled(false);
        }
        else
        {
            controls.setVisibility(View.INVISIBLE);
            ((EditText)findViewById(R.id.robotIPText)).setEnabled(true);
        }
    }
}
