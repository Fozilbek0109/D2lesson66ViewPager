package uz.coder.d2lesson66viewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uz.coder.d2lesson66viewpager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
private List<SherModel> sherModelList;
private  SlipetFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        adapter = new SlipetFragmentAdapter(getSupportFragmentManager(),sherModelList);
        binding.vp.setAdapter(adapter);


    }

    private void loadData() {
        sherModelList =new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            sherModelList.add(new SherModel("jhbdscbcj","hudbhb","https://yuz.uz/imageproxy/1200x/https://yuz.uz/file/news/d5e2359bb5f1b797ec538601b4797f58.jpg"));
        }
    }
}