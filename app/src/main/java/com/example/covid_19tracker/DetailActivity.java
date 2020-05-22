package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry , tvCases, tvRecovered , tvCritical , tvActive , tvTodayCases , tvTotalDeaths , tvTodayDeaths;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );
        Intent intent = getIntent();
        positionCountry = intent.getIntExtra( "position" , 0 );


        getSupportActionBar().setTitle( "Details of: "  + AffectedCountries.countryModelsList.get( positionCountry ).getCountry() );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );



        tvCountry = findViewById( R.id.tv_country );
        tvCases = findViewById( R.id.tv_cases );
        tvRecovered = findViewById( R.id.tv_recovered );
        tvCritical = findViewById( R.id.tv_critical );
        tvActive = findViewById( R.id.tv_active );
        tvTodayCases = findViewById( R.id.tv_today_cases );
        tvTotalDeaths = findViewById( R.id.tv_deaths );
        tvTodayDeaths = findViewById( R.id.tv_today_deaths );


        tvCountry.setText( AffectedCountries.countryModelsList.get( positionCountry ).getCountry());
        tvCases.setText( AffectedCountries.countryModelsList.get( positionCountry ).getCases());
        tvRecovered .setText( AffectedCountries.countryModelsList.get( positionCountry ).getRecovered());
        tvCritical.setText( AffectedCountries.countryModelsList.get( positionCountry ).getCritical());
        tvActive.setText( AffectedCountries.countryModelsList.get( positionCountry ).getActive());
        tvTodayCases.setText( AffectedCountries.countryModelsList.get( positionCountry ).getTodayCases());
        tvTotalDeaths.setText( AffectedCountries.countryModelsList.get( positionCountry ).getDeaths());
        tvTodayDeaths.setText( AffectedCountries.countryModelsList.get( positionCountry ).getTodayDeaths());









    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected( item );
    }
}
