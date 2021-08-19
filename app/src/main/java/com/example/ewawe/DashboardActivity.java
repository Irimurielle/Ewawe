package com.example.ewawe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity {

    @BindView(R.id.properties)
    CardView Properties;
    @BindView(R.id.tenants)
    CardView Tenants;
    @BindView(R.id.services)
    CardView Services;
    @BindView(R.id.finances)
    CardView Finances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
        ButterKnife.bind(this);

        Properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Tenants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, TenantsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, ServicesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Finances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, FinancesActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}