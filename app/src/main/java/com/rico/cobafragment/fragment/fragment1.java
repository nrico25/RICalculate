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

        ListDataBangun.add(new modelDatar("Segitiga","https://img.freepik.com/premium-vector/3d-watermelon-slice-with-seeds-cartoon-vector-illustration-isolated-watermelon-triangle-slice_668332-47.jpgx"));
        ListDataBangun.add(new modelDatar("Persegi","https://illustoon.com/photo/7257.png"));
        ListDataBangun.add(new modelDatar("Persegi Panjang","https://cahayamustika.com/image/cache/catalog/A%20WHITEBOARD/WHITEBOARD-500x500.png"));
        ListDataBangun.add(new modelDatar("Lingkaran","https://m.media-amazon.com/images/I/61taOJJ7-sS._AC_UF894,1000_QL80_DpWeblab_.jpg"));

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