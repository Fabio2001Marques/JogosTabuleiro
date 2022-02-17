package pt.ipg.jogostabuleiro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo_galo);
    }

    public void tab1_1(View v) {
            System.out.print("xxx");
    }
}