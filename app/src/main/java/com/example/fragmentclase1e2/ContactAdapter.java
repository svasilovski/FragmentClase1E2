package com.example.fragmentclase1e2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<Contact> lstContact;

    public ContactAdapter(List<Contact> lstContact) {
        this.lstContact = lstContact;
    }

    @Override
    public int getCount() {
        return lstContact.size();
    }

    @Override
    public Object getItem(int position) {
        return lstContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lstContact.get(position).getPhone();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item_contact , parent, false);
        } else {
            view = convertView;
        }

        Contact contact = (Contact)getItem(position);

        TextView phone = (TextView)view.findViewById(R.id.tv_phone);
        phone.setText(String.valueOf(contact.getPhone()));


        return view;
    }
}
