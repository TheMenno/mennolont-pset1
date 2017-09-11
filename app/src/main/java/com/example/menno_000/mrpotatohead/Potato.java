package com.example.menno_000.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class Potato extends AppCompatActivity {

    ImageView hat;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView nose;
    ImageView mustache;
    ImageView mouth;
    ImageView ears;
    ImageView arms;
    ImageView shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);

        hat = (ImageView) findViewById(R.id.imageViewHat);
        eyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);
        eyes = (ImageView) findViewById(R.id.imageViewEyes);
        glasses = (ImageView) findViewById(R.id.imageViewGlasses);
        nose = (ImageView) findViewById(R.id.imageViewNose);
        mustache = (ImageView) findViewById(R.id.imageViewMustache);
        mouth = (ImageView) findViewById(R.id.imageViewMouth);
        ears = (ImageView) findViewById(R.id.imageViewEars);
        arms = (ImageView) findViewById(R.id.imageViewArms);
        shoes = (ImageView) findViewById(R.id.imageViewShoes);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Integer visibilityValueHat = hat.getVisibility();
        Integer visibilityValueEyebrows = eyebrows.getVisibility();
        Integer visibilityValueEyes = eyes.getVisibility();
        Integer visibilityValueGlasses = glasses.getVisibility();
        Integer visibilityValueNose = nose.getVisibility();
        Integer visibilityValueMustache = mustache.getVisibility();
        Integer visibilityValueMouth = mouth.getVisibility();
        Integer visibilityValueEars = ears.getVisibility();
        Integer visibilityValueArms = arms.getVisibility();
        Integer visibilityValueShoes = shoes.getVisibility();

        outState.putInt("VisibilityHat", visibilityValueHat);
        outState.putInt("VisibilityEyebrows", visibilityValueEyebrows);
        outState.putInt("VisibilityEyes", visibilityValueEyes);
        outState.putInt("VisibilityGlasses", visibilityValueGlasses);
        outState.putInt("VisibilityNose", visibilityValueNose);
        outState.putInt("VisibilityMustache", visibilityValueMustache);
        outState.putInt("VisibilityMouth", visibilityValueMouth);
        outState.putInt("VisibilityEars", visibilityValueEars);
        outState.putInt("VisibilityArms", visibilityValueArms);
        outState.putInt("VisibilityShoes", visibilityValueShoes);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Integer visibilityValueRestoredHat = inState.getInt("VisibilityHat");
        Integer visibilityValueRestoredEyebrows = inState.getInt("VisibilityEyebrows");
        Integer visibilityValueRestoredEyes = inState.getInt("VisibilityEyes");
        Integer visibilityValueRestoredGlasses = inState.getInt("VisibilityGlasses");
        Integer visibilityValueRestoredNose = inState.getInt("VisibilityNose");
        Integer visibilityValueRestoredMustache = inState.getInt("VisibilityMustache");
        Integer visibilityValueRestoredMouth = inState.getInt("VisibilityMouth");
        Integer visibilityValueRestoredEars = inState.getInt("VisibilityEars");
        Integer visibilityValueRestoredArms = inState.getInt("VisibilityArms");
        Integer visibilityValueRestoredShoes = inState.getInt("VisibilityShoes");

        hat.setVisibility(visibilityValueRestoredHat);
        eyebrows.setVisibility(visibilityValueRestoredEyebrows);
        eyes.setVisibility(visibilityValueRestoredEyes);
        glasses.setVisibility(visibilityValueRestoredGlasses);
        nose.setVisibility(visibilityValueRestoredNose);
        mustache.setVisibility(visibilityValueRestoredMustache);
        mouth.setVisibility(visibilityValueRestoredMouth);
        ears.setVisibility(visibilityValueRestoredEars);
        arms.setVisibility(visibilityValueRestoredArms);
        shoes.setVisibility(visibilityValueRestoredShoes);

    }


    public void showArms(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView arms = (ImageView) findViewById(R.id.imageViewArms);

        switch (view.getId()) {
            case R.id.checkBoxArms:
                if (checkbox) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showEyes(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView eyes = (ImageView) findViewById(R.id.imageViewEyes);

        switch (view.getId()) {
            case R.id.checkBoxEyes:
                if (checkbox) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showMouth(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView mouth = (ImageView) findViewById(R.id.imageViewMouth);

        switch (view.getId()) {
            case R.id.checkBoxMouth:
                if (checkbox) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showMustache(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView mustache = (ImageView) findViewById(R.id.imageViewMustache);

        switch (view.getId()) {
            case R.id.checkBoxMustache:
                if (checkbox) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showGlasses(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView glasses = (ImageView) findViewById(R.id.imageViewGlasses);

        switch (view.getId()) {
            case R.id.checkBoxGlasses:
                if (checkbox) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showNose(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView nose = (ImageView) findViewById(R.id.imageViewNose);

        switch (view.getId()) {
            case R.id.checkBoxNose:
                if (checkbox) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showEyebrows(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView eyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);

        switch (view.getId()) {
            case R.id.checkBoxEyebrows:
                if (checkbox) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showHat(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView hat = (ImageView) findViewById(R.id.imageViewHat);

        switch (view.getId()) {
            case R.id.checkBoxHat:
                if (checkbox) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showEars(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView ears = (ImageView) findViewById(R.id.imageViewEars);

        switch (view.getId()) {
            case R.id.checkBoxEars:
                if (checkbox) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void showShoes(View view) {
        boolean checkbox = ((CheckBox) view).isChecked();
        ImageView shoes = (ImageView) findViewById(R.id.imageViewShoes);

        switch (view.getId()) {
            case R.id.checkBoxShoes:
                if (checkbox) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
