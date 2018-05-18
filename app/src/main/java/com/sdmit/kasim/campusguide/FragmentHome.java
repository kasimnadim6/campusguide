package com.sdmit.kasim.campusguide;

import android.app.Dialog;
import android.app.Fragment;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    private MyAdapter adapter;
    private List<Card> list;

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_home, container, false);


        RecyclerView recyclerView = myView.findViewById(R.id.recycler_view);

        list = new ArrayList<>();
        adapter = new MyAdapter(getActivity(), list);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareAlbums();

      try {
            Glide.with(this).load(R.drawable.cover).into((ImageView) myView.findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return myView;
    }


    private void prepareAlbums() {
        int[] covers = new int[]{

                R.drawable.mainbuildingcover,
                R.drawable.ccfbuilding,
                R.drawable.librarycover,
                R.drawable.canteencover,
                R.drawable.playgroundcover,
                R.drawable.parkingcover,
                R.drawable.staffquaters,
                R.drawable.hostelcover
                };
        Card a = new Card("Main Building",covers[0]);
        list.add(a);

        a = new Card("CCF Building",covers[1]);
        list.add(a);

        a = new Card("Library",covers[2]);
        list.add(a);

        a = new Card("Canteen",covers[3]);
        list.add(a);

        a = new Card("PlayGround",  covers[4]);
        list.add(a);

        a = new Card("Parking", covers[5]);
        list.add(a);

        a = new Card("Staff Quaters", covers[6]);
        list.add(a);

        a = new Card("Hostel", covers[7]);
        list.add(a);

        adapter.notifyDataSetChanged();
    }

    // RecyclerView item decoration - give equal margin around grid item
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        private GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }
    //Converting dp to pixel
    private int dpToPx() {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, r.getDisplayMetrics()));
    }
}
