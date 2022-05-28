package pt.ipg.jogostabuleiro;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity<i> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo_galo);
    }


    int[][] board = {{0,0,0},{0,0,0},{0,0,0}};
    int jogada = 1;
    TextView textView_jogador;


    private int ganhou(){
        int soma;
        int diagonal1;
        int diagonal2;

        //Check linhas
        for (int i= 0; i<3; i++){
            soma = board[i][0] + board[i][1] + board[i][2];
            if ((soma == 3) || (soma == -3)) return 1;
        }

        //Check colunas
        for (int i= 0; i<3; i++){
            soma = board[0][i] + board[1][i] + board[2][i];
            if ((soma == 3) || (soma == -3)) return 1;
        }

        //Check diagonais
        diagonal1 = board[0][0] + board[1][1] + board[2][2];
        diagonal2 = board[0][2] + board[1][1] + board[2][0];

        if((diagonal1 == 3)||(diagonal1 == -3)||(diagonal2 == 3)||(diagonal2 == -3)) return 1;

        return 0;
    }

    private boolean jogo(int linha, int coluna){


        textView_jogador =  findViewById(R.id.textView_jogador);
        textView_jogador.setText("Jogador"+(jogada % 2 + 1)+" é a tua vez");
        if (ganhou() == 0){

            if (board[linha][coluna] == 0) {
                System.out.println("x");
                if ((jogada % 2 + 1) ==1) {
                    board[linha][coluna] = 1;
                }else{
                    board[linha][coluna] = -1;
                }
            }else{
                System.out.println("x");
                System.out.println("Nao esta vazio");
                jogada -= 1;

            }
            jogada += 1;
        }
        if (ganhou() == 1) {
            System.out.println("Jogador " + (jogada % 2+1) + " ganhou apos " + (jogada-1) + " rodadas");
        }


      return true;
    }



    public void tab1_1(View v) {
        if (jogo(0,0)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }

        }




    }
    public void tab1_2(View v) {

        if (jogo(0,1)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }

        }


    }
    public void tab1_3(View v) {
        if (jogo(0,2)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(0,2);
        }


    }
    public void tab2_1(View v) {
        if (jogo(1,0)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(0,0);
        }

    }
    public void tab2_2(View v) {
        if (jogo(1,1)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(0,0);
        }



    }
    public void tab2_3(View v) {
        if (jogo(1,2)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(1,2);
        }


    }
    public void tab3_1(View v) {
        if (jogo(2,0)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(2,0);
        }

    }
    public void tab3_2(View v) {
        if (jogo(2,1)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(2,1);
        }



    }
    public void tab3_3(View v) {
        if (jogo(2,2)) {
            if ((jogada % 2 + 1) == 1) {
                v.setBackground(getResources().getDrawable(R.drawable.cross));
            } else {
                v.setBackground(getResources().getDrawable(R.drawable.circle));
            }
            //jogo(2,2);
        }


    }

}
