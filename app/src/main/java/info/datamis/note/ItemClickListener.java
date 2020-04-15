package info.datamis.note;

import android.support.v7.widget.RecyclerView;

/**
 * Created by rop on 8/21/19.
 */


public interface ItemClickListener {

    void onItemClicked(RecyclerView.ViewHolder vh, Object item, int pos);
}

