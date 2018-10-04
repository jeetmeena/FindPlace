package com.example.jeetmeena.findplace;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.

 */
@SuppressLint("ValidFragment")
public class SearchlistFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
   public Context contextf;
    @SuppressLint("ValidFragment")
    public SearchlistFragment(Context context, String s) {

        mParam1=s;
        this.contextf=context;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_searchlist, container, false);
        recyclerView=view.findViewById(R.id.search_recyclerView);
      //  linearLayoutManager=new LinearLayoutManager();
        List<Address> list = null;

         String[] lsdd={"Sdf","sdfd","sfsddfsdf","gdsggsd"};


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new SimpleRVAdapters(contextf,lsdd));



        return view;
    }

    public class SimpleRVAdapters extends RecyclerView.Adapter<SimpleViewHolders> {
        public String[] listDataa;
        Context contexts;
        public SimpleRVAdapters(Context context, String[] listData){
            listDataa = listData;
            contexts=context;
        }

        @Override
        public SimpleViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = null;// = new TextView(parent.getContext());
            try {
                // LayoutInflater inflater = LayoutInflater.from(contexts);
                view = LayoutInflater.from(contexts).inflate(R.layout.commen , parent , false);


            }catch (Exception e){}
            SimpleViewHolders viewHolder = new SimpleViewHolders(view,contexts);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final SimpleViewHolders holder, final int position) {

            //holder.textStar.setText( listDataa.get(position).getRating());
          //  holder.textComment.setText(listDataa.get(position).getComment());
           // holder.textDaTe.setText(listDataa.get(position).getTimestamp());
            //  holder.city.setText(listDataa.get(position).getAddressLocat());



        }



        @Override
        public int getItemCount() {
            return listDataa.length;
        }
    }



    public class SimpleViewHolders extends RecyclerView.ViewHolder  {
        public TextView textView;
        ImageView imageView;
        TextView textComment,textStar,textDaTe;

        public Context contexts;




        public SimpleViewHolders(View itemView,Context context) {
            super(itemView);
            contexts=context;
            textComment=itemView.findViewById(R.id.textCommen);
            textStar=itemView.findViewById(R.id.textView6);
            textDaTe=itemView.findViewById(R.id.textTimesta);


        }

    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */


}

