package com.example.arpit.final_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecycle;
    private ExampleAdaptor madap;
    private RecyclerView.LayoutManager mlayout;
    ArrayList<exampleitem> exampleitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItems();
        buildRecycle();



    }
    public void addItems()
    {
        exampleitems=new ArrayList<>();
        exampleitems.add(new exampleitem(R.drawable.aquatone,R.drawable.ic_add_circle,R.drawable.ic_remove_circle,"ABC","50gm","Rs 500","0"));
        exampleitems.add(new exampleitem(R.drawable.aquatone,R.drawable.add,R.drawable.minus,"ABC","50gm","Rs 500","0"));
        exampleitems.add(new exampleitem(R.drawable.aquatone,R.drawable.add,R.drawable.minus,"ABC","50gm","Rs 500","0"));
        exampleitems.add(new exampleitem(R.drawable.aquatone,R.drawable.add,R.drawable.minus,"ABC","50gm","Rs 500","0"));
        exampleitems.add(new exampleitem(R.drawable.aquatone,R.drawable.add,R.drawable.minus,"ABC","50gm","Rs 500","0"));
        exampleitems.add(new exampleitem(R.drawable.aquatone,R.drawable.add,R.drawable.minus,"ABC","50gm","Rs 500","0"));
    }
    public void buildRecycle()
    {
        mrecycle=findViewById(R.id.recycle);
        mrecycle.setHasFixedSize(true);
        mlayout=new LinearLayoutManager(this);
        madap=new ExampleAdaptor(exampleitems);
        mrecycle.setLayoutManager(mlayout);
        mrecycle.setAdapter(madap);
        madap.setOnItemClickListener(new ExampleAdaptor.OnItemClickListener() {
            @Override
            public void onItemClick(int i) {
                startActivity(new Intent(MainActivity.this,proDetail.class));

            }

            @Override
            public void onIncrease(int i) {
               exampleitems.get(i).change();
               madap.notifyItemChanged(i);

            }

            @Override
            public void onDecrease(int i) {
                exampleitems.get(i).changeDecrease();
                madap.notifyItemChanged(i);

            }
        });

    }
}
