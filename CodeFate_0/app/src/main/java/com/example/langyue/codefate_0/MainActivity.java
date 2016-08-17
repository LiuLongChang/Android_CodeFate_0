package com.example.langyue.codefate_0;

import android.app.ListActivity;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


//public class MainActivity extends ListActivity {
public class MainActivity extends AppCompatActivity {



    private TextView textView1;
    private Button button1;


    //获取手机屏幕分辨率的类
    private DisplayMetrics dm;




    public TextView mTextView1;
    public RadioGroup mRadioGroup1;
    public RadioButton mRadio1,mRadio2;



    private AutoCompleteTextView actv;
    private static final String[] autoStrs = new String[]{"a","abc","abcd","abcde","ba"};


    static final String[] COUNTRIES = new String[]{"American","Belize","Belize","China","123","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};


    private static  final String[] strs = new String[]{
            "first","second","third","fourth","fifth","first","second","third","fourth","fifth",
            "first","second","third","fourth","fifth","first","second","third","fourth","fifth"
    };//定义一个String数组用来显示ListView的内容private
    private ListView lv;/**Called when the activity is first created.*/






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        //setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,COUNTRIES));





        lv = (ListView)findViewById(R.id.lv);//定义一个动态数组

        ArrayList<HashMap<String,Object>> listItem = new ArrayList<HashMap<String, Object>>();//在数组中存放数据
        for (int i=0;i<100;i++){
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("ItemImage",R.drawable.icon);//加入图片
            map.put("ItemTitle","第"+i+"行");
            map.put("ItemText","这是第"+i+"Row");
            listItem.add(map);


        }



        SimpleAdapter mSimpleAdapter = new SimpleAdapter(this,listItem,R.layout.item,new String[] {"ItemImage",
        "ItemTitle","ItemText"},new int[] {R.id.ItemImage,R.id.ItemTitle,R.id.ItemText});


        lv.setAdapter(mSimpleAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.e("TAG:","你点击了第" + position +"行");

            }
        });














//        Spinner s = (Spinner)findViewById(R.id.spinner);
//        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.plannets,R.layout.support_simple_spinner_dropdown_item);
//        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
//        s.setAdapter(adapter);





//        //通过findViewById()方法提到actv
//        actv = (AutoCompleteTextView)findViewById(R.id.actv);
//        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,autoStrs);
//        actv.setAdapter(adapter);




//        取得TextView 、RadioGroup、RadioButton对象

//        mTextView1 = (TextView)findViewById(R.id.myTextView);
//        mRadioGroup1 = (RadioGroup)findViewById(R.id.myRadioGroup);
//        mRadio1 = (RadioButton)findViewById(R.id.myRadioButton1);
//        mRadio2 = (RadioButton)findViewById(R.id.myRadioButton2);
//        mRadioGroup1.setOnCheckedChangeListener(mChangeRadio);







//        textView1 = (TextView)findViewById(R.id.textView1);
//        button1 = (Button)findViewById(R.id.button1);
//        //增加事件响应
//        button1.setOnClickListener(new Button.OnClickListener(){
//
//            public void onClick(View v){
//
//                Toast.makeText(MainActivity.this,
//                        "TextView里的文字发生了改变,你注意到了吗?",
//                        Toast.LENGTH_LONG).show();
//                //将TextView的文字发生改变
//                textView1.setText("欢迎来到刘哥的博客!");
//
//
//            }
//
//        });


//        //获取布局中TextView,Button对象
//        textView1 = (TextView)findViewById(R.id.textView1);
//        button1 = (Button)findViewById(R.id.button1);
//
//        //增加button事件响应
//        button1.setOnClickListener(new  Button.OnClickListener(){
//
//                public  void onClick(View v){
//
//                    dm = new DisplayMetrics();
//                    getWindowManager().getDefaultDisplay().getMetrics(dm);
//                    //获得手机的宽带和高度像素单位为px
//                    String str = "手机屏幕分辨率为:" + dm.widthPixels + "*" + dm.heightPixels;
//                    textView1.setText(str);
//
//                }
//
//        });




    }



//    private RadioGroup.OnCheckedChangeListener mChangeRadio = new RadioGroup.OnCheckedChangeListener()
//    {
//        @Override
//        public  void onCheckedChanged(RadioGroup group,int checkedId){
//
//            //TODO Auto-generated method stub
//            if (checkedId==mRadio1.getId()){
//
//                /*把mRadio1的内容传到mTextView1**/
//                mTextView1.setText(mRadio1.getText());
//
//
//            }else if (checkedId == mRadio2.getId()){
//
//                /**把mRadio2的内容 传到mTextView1**/
//                mTextView1.setText(mRadio2.getText());
//
//            }
//
//        }
//
//    };





//    //创建菜单
//    public boolean onCreateOptionsMenu(Menu menu){
//
//        menu.add(0,0,0,"关于");
//        menu.add(0,1,1,"退出");
//        return super.onCreateOptionsMenu(menu);
//
//    }
//
//
//
//    //菜单响应
//    public boolean onOptionsItemSelected(MenuItem item){
//
//        super.onOptionsItemSelected(item);
//        switch (item.getItemId()){
//
//            case 0:
//
//                Toast.makeText(MainActivity.this,"欢迎来到刘哥的blog",Toast.LENGTH_LONG).show();
//                break;
//
//            case 1:
//
//                this.finish();
//                break;
//
//        }
//        return true;
//    }





}
