package com.michellelimfacebook.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.michellelimfacebook.simpletodo.MainActivity.ITEM_POSITION;
import static com.michellelimfacebook.simpletodo.MainActivity.ITEM_TEXT;

public class EditItemActivity extends AppCompatActivity {

    EditText etItemText;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etItemText = (EditText) findViewById(R.id.etItemText);
        etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        i = getIntent().getIntExtra(ITEM_POSITION,0);
        getSupportActionBar().setTitle("Edit Item");
    }

    public void onSaveItem(View v){
        Intent intent = new Intent();
        intent.putExtra(ITEM_TEXT, etItemText.getText().toString());
        intent.putExtra(ITEM_POSITION, i);
        setResult(RESULT_OK, intent);
        finish();

    }
}
