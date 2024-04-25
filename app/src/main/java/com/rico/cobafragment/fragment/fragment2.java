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

        ListDataBangunRuang.add(new modelDatar("Kubus","https://m.media-amazon.com/images/I/61fB-s4DPVS._AC_UF1000,1000_QL80_.jpg"));
        ListDataBangunRuang.add(new modelDatar("Balok","https://www.mickgeorge.co.uk/content/uploads/2023/08/215mm-Hollow-7N-Concrete-Block.jpg"));
        ListDataBangunRuang.add(new modelDatar("Tabung","https://www.argex.co.uk/wp-content/uploads/2020/10/Large-Tube-1-1.jpg"));
        ListDataBangunRuang.add(new modelDatar("Kerucut","https://dishub.kulonprogokab.go.id/files/news/normal/80c9bf33ebbb2e282917a3555f7b5ce9.jpg"));

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