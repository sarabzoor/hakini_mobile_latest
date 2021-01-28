package com.yehyaayash99.hakini;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.jaredrummler.materialspinner.MaterialSpinner;
public class RegisterContinueActivity extends AppCompatActivity {
        private static final String[] ANDROID_VERSIONS = {
                "Male",
                "Female"
        };
    private static final String[] ANDROID_VERSIONS2 = {
            " Aruba", "Afghanistan"," Angola"," Anguilla"," Ã…land Islands"," Albania"," Andorra","  United Arab Emirates"," Argentina",
            " Armenia"," American Samoa"," Antigua and Barbuda", " Australia"," Austria"," Azerbaijan"," Burundi"
    };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register_continue);

            MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);
            spinner.setItems(ANDROID_VERSIONS);
            MaterialSpinner spinner2 = (MaterialSpinner) findViewById(R.id.spinner2);
            spinner2.setItems(ANDROID_VERSIONS2);


        }


}






