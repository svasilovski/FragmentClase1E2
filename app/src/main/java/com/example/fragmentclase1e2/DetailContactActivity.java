package com.example.fragmentclase1e2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class DetailContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail_contact);

        if(savedInstanceState == null){
            Contact contact = new Contact(
                    getIntent().getIntExtra(DetailContactFragment.PHONE, 0),
                    getIntent().getStringExtra(DetailContactFragment.NAME),
                    getIntent().getStringExtra(DetailContactFragment.LAST_NAME)
            );

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contact_detail_container, DetailContactFragment.newInstance(contact))
                    .commit();
        }
    }
}
