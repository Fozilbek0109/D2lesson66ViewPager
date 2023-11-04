package uz.coder.d2lesson66viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

import uz.coder.d2lesson66viewpager.databinding.ItemSimpleBinding;

public class ViewPagerAdapter extends PagerAdapter {
    private List<String> stringList;

    public ViewPagerAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ItemSimpleBinding itemSimpleBinding = ItemSimpleBinding.inflate(LayoutInflater.from(container.getContext()),null,false);
        itemSimpleBinding.txt.setText(stringList.get(position));
        return itemSimpleBinding.getRoot();
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
