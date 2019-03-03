package com.example.fragmentclase1e2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public class DetailContactFragment extends Fragment {
    public static final String PHONE = "phone";
    public static final String NAME = "name";
    public static final String LAST_NAME = "lastName";

    private Contact contact;

    public static DetailContactFragment newInstance(Contact contact){
        DetailContactFragment frag = new DetailContactFragment();

        Bundle args = new Bundle();
        args.putInt(PHONE, contact.getPhone());
        args.putString(NAME, contact.getName());
        args.putString(LAST_NAME, contact.getLastName());

        frag.setArguments(args);

        return  frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments().containsKey(PHONE)){
            contact = new Contact(
                    getArguments().getInt(PHONE),
                    getArguments().getString(NAME),
                    getArguments().getString(LAST_NAME)
            );
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail_contact, container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView phone = (TextView)getView().findViewById(R.id.tv_phone);
        phone.setText(String.valueOf(contact.getPhone()));

        TextView name = (TextView)getView().findViewById(R.id.tv_name);
        name.setText(contact.getName());

        TextView lastname = (TextView)getView().findViewById(R.id.tv_last_name);
        lastname.setText(contact.getLastName());
    }
}
