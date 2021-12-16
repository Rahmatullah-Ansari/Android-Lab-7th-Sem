package com.android.exp_7;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class exp_7 extends AppCompatActivity {
    EditText editText;
    ListView listView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp7);
        //AIM = Create an application to show list view.
        editText=findViewById(R.id.edittext);
        listView=findViewById(R.id.listview);
        button=findViewById(R.id.add);
        ArrayList<String> arrayList=new ArrayList<>();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(exp_7.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        button.setOnClickListener(view -> {
            String data=editText.getText().toString();
            if (data.length() > 0){
                arrayList.add(data);
                adapter.notifyDataSetChanged();
                editText.setText("");
            }else {
                Toast.makeText(exp_7.this, "Type something to add", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener((adapterView, view, position, l) -> {
            AlertDialog.Builder dialog=new AlertDialog.Builder(this);
            dialog.setTitle("Delete");
            dialog.setCancelable(false);
            dialog.setMessage("Do you want to remove ?");
            dialog.setPositiveButton("Yes", (dialogInterface, i) -> {
                arrayList.remove(adapter.getItem(position));
                adapter.notifyDataSetChanged();
            });
            dialog.setNegativeButton("No", (dialogInterface, i1) -> dialogInterface.dismiss());
            dialog.show();
            return false;
        });
    }

}