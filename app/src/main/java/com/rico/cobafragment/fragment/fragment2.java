package com.rico.cobafragment.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rico.cobafragment.R;
import com.rico.cobafragment.adapter.adapterBangunDatar;
import com.rico.cobafragment.calculator.balok;
import com.rico.cobafragment.calculator.kerucut;
import com.rico.cobafragment.calculator.kubus;
import com.rico.cobafragment.calculator.tabung;
import com.rico.cobafragment.model.modelDatar;

import java.util.ArrayList;

public class fragment2 extends Fragment implements adapterBangunDatar.ItemClickListener {
    ArrayList<modelDatar> ListDataBangunRuang = new ArrayList<>();

    public fragment2(){

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvBangunRuang = view.findViewById(R.id.rvBangunRuang);
        ListDataBangunRuang= new ArrayList<>();

        ListDataBangunRuang.add(new modelDatar("Kubus","https://i.pinimg.com/564x/12/51/ab/1251ab1a9a8d45c3ea7d09d517e9189e.jpg"));
        ListDataBangunRuang.add(new modelDatar("Balok",""));
        ListDataBangunRuang.add(new modelDatar("Tabung",""));
        ListDataBangunRuang.add(new modelDatar("Kerucut",""));

        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterBangunDatar adapter = new adapterBangunDatar(getContext(), R.layout.layout_bangun, ListDataBangunRuang);
        adapter.setClickListener(this);
        rvBangunRuang.setAdapter(adapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }
    @Override
    public void onItemClick(View view, int position) {
        String selectedBangun = ListDataBangunRuang.get(position).getNamaBangun();


        Intent intent;
        if (selectedBangun.equals("Kubus")) {
            intent = new Intent(getActivity(), kubus.class);
            // Tambahkan kode jika perlu mengirimkan data tambahan melalui intent
        } else if (selectedBangun.equals("Balok")){
            intent = new Intent(getActivity(), balok.class);
        } else if (selectedBangun.equals("Tabung")){
            intent = new Intent(getActivity(), tabung.class);
        } else if (selectedBangun.equals("Kerucut")){
            intent = new Intent(getActivity(), kerucut.class);
        } else {
            intent = new Intent(getActivity(), getClass());
        }
        startActivity(intent);
    }
}