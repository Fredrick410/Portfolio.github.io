package com.example.appppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;

public class ReservationActivity extends AppCompatActivity {
    private EditText editTextText_dateReservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        this.editTextText_dateReservation=(EditText) findViewById(R.id.editTextText_dateReservation);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String dateReservation=editTextText_dateReservation.getText().toString();

        String insert = "insert into reservation (id, dateReseravtion, datePrevueStockage, nbJoursDeStockagePrevu,quantite,etat, numClient "
                + "values"
                + "("+dateReservation+"),";

    }

}