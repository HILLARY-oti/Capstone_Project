package com.hillary.quote;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class QuoteActivity extends AppCompatActivity {
    private Button quoteButton;
    private TextView quoteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        quoteButton = (Button) findViewById(R.id.quoteBtn);
        quoteText =  (TextView) findViewById(R.id.TextView);

        quoteButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Quote quotes = new Quote();
                quoteText.setText(quotes.getRandomQuotes());
            }
        });
    }
}
