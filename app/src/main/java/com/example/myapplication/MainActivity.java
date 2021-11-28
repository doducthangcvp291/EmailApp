package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {
    ArrayList<data> arrayList;
    DataAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);
        arrayList =new ArrayList<>();
        arrayList.add(new data("Infoq", "20/11/2021", "I", "Thể lệ chương trình"));
        arrayList.add(new data("Đỗ Đức Thắng", "20/10/2021", "Đ", "Ê mày bao h thi học kỳ thế"));
        arrayList.add(new data("Lỗ Ngọc Tú", "21/8/2021", "L", "Làm xong bài tập tuần này chưa"));
        arrayList.add(new data("Codeforces", "22/7/2021", "C", "Hello, 6940034411VuPN.\n" +
                "Welcome to the regular Codeforces round."));
        arrayList.add(new data("Ronando", "11/6/2021", "R", "Hi!"));
        arrayList.add(new data("Joker", "20/5/2021", "J", "This is joker"));
        arrayList.add(new data("Trần Phú Quân", "20/4/2021", "T", "Chủ nhận tuần này họp lớp"));
        arrayList.add(new data("Facebook", "20/3/2021", "F", "Có 1 thiết bị mới đăng nhập vào tk của bạn"));
        arrayList.add(new data("Facebook", "19/3/2021", "F", "Bạn có 1 lời mời kết bạn"));
        arrayList.add(new data("Facebook", "18/3/2021", "F", "Bạn có 1 lời mời kết bạn"));
        arrayList.add(new data("Facebook", "15/3/2021", "F", "Bạn có 1 lời mời kết bạn"));
        arrayList.add(new data("Facebook", "14/3/2021", "F", "Ronando đã gửi lời mời kết bạn đến bạn"));
        arrayList.add(new data("Facebook", "19/2/2021", "F", "Chào mừng bạn đến với facebook"));


        adapter = new DataAdapter(this, R.layout.simple_item_layout, arrayList);
        listView.setAdapter(adapter);


        }

}