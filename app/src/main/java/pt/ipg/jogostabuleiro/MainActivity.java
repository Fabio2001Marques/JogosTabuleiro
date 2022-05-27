package pt.ipg.jogostabuleiro;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity<i> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo_galo);
    }


    int[][] board = {{0,0,0},{0,0,0},{0,0,0}};
    int jogada = 0;
    boolean ganhou = false;

    private boolean ganhou(){



        return ganhou;
    }



    public void tab1_1(View v) {

        Drawable image=(Drawable)getResources().getDrawable(R.drawable.cross);
        v.setBackground(image);
        board[1][1] = 1;

    }
    public void tab1_2(View v) {
        board[1][2] = 1;

    }
    public void tab1_3(View v) {
        board[1][3] = 1;

    }
    public void tab2_1(View v) {
        board[2][1] = 1;

    }
    public void tab2_2(View v) {
        board[2][2] = 1;
    }
    public void tab2_3(View v) {
        board[2][3] = 1;
    }
    public void tab3_1(View v) {
        board[3][1] = 1;
    }
    public void tab3_2(View v) {
        board[3][2] = 1;
    }
    public void tab3_3(View v) {
        board[3][3] = 1;
    }

}
