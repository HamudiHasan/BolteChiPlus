package com.amislab.boltechiplus.adapter;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amislab.boltechiplus.R;
import com.amislab.boltechiplus.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by  Hasan Sonet on 11/24/2018
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<Category> arrayList = new ArrayList<>();
    private List<Integer> backList = new ArrayList<>();

    private Context context;
    private int lastPosition = -1;

    public CategoryAdapter(Context context, List<Category> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);

        backList.add(R.drawable.grad_blue);
        backList.add(R.drawable.grad_red);
        backList.add(R.drawable.grad_purple);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.gradack.setBackground(context.getDrawable(backList.get(ThreadLocalRandom.current().nextInt(0, 3))));
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        View container;
        View gradack;


        public ViewHolder(View itemView) {
            super(itemView);

            container = itemView.findViewById(R.id.container_item_card);
            gradack = itemView.findViewById(R.id.layout_color_grad_item_card);


        }
    }

/*    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_up);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }*/
}
