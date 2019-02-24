package com.example.fragmentclase1e2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ListContactActivity extends AppCompatActivity implements ListContactFragment.Callbacks {
    public boolean isDoublePannel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_contact_list);

        this.isDoublePannel = (findViewById(R.id.contact_detail_container)!=null);
    }

    @Override
    public void onContactSelected(Contact contact) {
        if(this.isDoublePannel){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contact_detail_container, DetailContactFragment.newInstance(contact))
                    .commit();
        } else {
            Intent detailIntent = new Intent(this, DetailContactActivity.class);
            detailIntent.putExtra(DetailContactFragment.PHONE, contact.getPhone());
            detailIntent.putExtra(DetailContactFragment.NAME, contact.getName());
            detailIntent.putExtra(DetailContactFragment.LAST_NAME, contact.getLastName());

            startActivity(detailIntent);
        }
    }
}
