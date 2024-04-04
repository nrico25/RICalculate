package com.rico.cobafragment.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rico.cobafragment.R;
import com.rico.cobafragment.adapter.adapterBangunDatar;
import com.rico.cobafragment.calculator.lingkaran;
import com.rico.cobafragment.calculator.persegi;
import com.rico.cobafragment.calculator.persegiPanjang;
import com.rico.cobafragment.calculator.segitiga;
import com.rico.cobafragment.model.modelDatar;

import java.util.ArrayList;

public class fragment1 extends Fragment implements adapterBangunDatar.ItemClickListener {
    ArrayList<modelDatar> ListDataBangun = new ArrayList<>();


    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvBangunDatar = view.findViewById(R.id.rvBangunDatar);
        ListDataBangun= new ArrayList<>();

        ListDataBangun.add(new modelDatar("Segitiga","https://png.pngtree.com/element_our/png/20181226/triangle-line-black-icon-png_281642.jpg"));
        ListDataBangun.add(new modelDatar("Persegi","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Regular_quadrilateral.svg/250px-Regular_quadrilateral.svg.png"));
        ListDataBangun.add(new modelDatar("Persegi Panjang","https://upload.wikimedia.org/wikipedia/commons/7/7f/Rectangle_%28plain%29.svg"));
        ListDataBangun.add(new modelDatar("Lingkaran","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Circle_-_black_simple.svg/640px-Circle_-_black_simple.svg.png"));

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterBangunDatar adapter = new adapterBangunDatar(getContext(), R.layout.layout_bangun, ListDataBangun);
        adapter.setClickListener(this);
        rvBangunDatar.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onItemClick(View view, int position) {
        String selectedBangun = ListDataBangun.get(position).getNamaBangun();


        Intent intent;
        if (selectedBangun.equals("Segitiga")) {
            intent = new Intent(getActivity(), segitiga.class);
            // Tambahkan kode jika perlu mengirimkan data tambahan melalui intent
        } else if (selectedBangun.equals("Persegi")){
            intent = new Intent(getActivity(), persegi.class);
        } else if (selectedBangun.equals("Persegi Panjang")){
            intent = new Intent(getActivity(), persegiPanjang.class);
        } else if (selectedBangun.equals("Lingkaran")){
            intent = new Intent(getActivity(), lingkaran.class);
        } else {
            intent = new Intent(getActivity(), getClass());
        }
        startActivity(intent);
    }
}