package uz.coder.d2lesson66viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlipetFragmentAdapter extends FragmentStatePagerAdapter {
    List<SherModel> sherModelList;

    public SlipetFragmentAdapter(@NonNull FragmentManager fm, List<SherModel> sherModelList) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.sherModelList = sherModelList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return BlankFragment.newInstance(sherModelList.get(position));
    }

    @Override
    public int getCount() {
        return sherModelList.size();
    }
}
