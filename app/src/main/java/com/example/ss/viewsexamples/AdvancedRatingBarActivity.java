package com.example.ss.viewsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.Toast;

public class AdvancedRatingBarActivity extends Activity {

    /*
    setNumStart(int)    - устанавливает число звездочек
    getRating()         - возвращает значение рейтинга
    setRating(float)    - устанавливает значение рейтинга
    isIndicator()       - устанавливает в режим для чтения без возможности установить рейтинг пользователем
    setStepSize(float)  - устанавливает шаг приращения рейтинга
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_rating_bar);

        final RatingBar ratingBar_Small = (RatingBar)findViewById(R.id.ratingbar_Small);
        final RatingBar ratingBar_Indicator = (RatingBar)findViewById(R.id.ratingbar_Indicator);
        final RatingBar ratingBar_default = (RatingBar)findViewById(R.id.ratingbar_default);

        ratingBar_default.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub
                ratingBar_Small.setRating(rating);
                ratingBar_Indicator.setRating(rating);

                Toast.makeText(AdvancedRatingBarActivity.this, "Рейтинг: "+String.valueOf(rating) + " From user: " + fromUser, Toast.LENGTH_LONG).show();
            }});
    }
}
