package com.maestrogames.jogos;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.maestrogames.jogos.classes.DAOJogo;
import com.maestrogames.jogos.interfaces.jogo;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    private WebView webView;
    private Activity activity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.loadUrl("http://84.247.130.240");
        TextView txt = findViewById(R.id.textView);

        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Exibe um log quando ocorre um toque
                Log.d("TouchTest", "Toque na tela! " + event.getX() + " " + event.getY());
                txt.setText("Toque na tela! " + event.getX() + " " + event.getY());
                // Retorna false para permitir que outros manipuladores de eventos tratem o toque
                return false;
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        jogo jogo = new DAOJogo().createJogo("FortuneTiger");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        TextView txt = findViewById(R.id.textView);
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_R:
                    jogo.entrarNoJogo(dm, webView);
                    return true;
                case KeyEvent.KEYCODE_G:

                    jogo.aumentarAposta(dm);
                    return true;
                case KeyEvent.KEYCODE_N:


                    jogo.diminuirAposta(dm);
                    return true;
                case KeyEvent.KEYCODE_B:

                    jogo.jogar(dm);
                    return true;
            }
        }


        return super.onKeyDown(keyCode, event);
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        jogo jogo = new DAOJogo().createJogo("FortuneTiger");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        TextView txt = findViewById(R.id.textView);


        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_R:
                    jogo.entrarNoJogo(dm, webView);
                    return true;
                case KeyEvent.KEYCODE_G:

                    jogo.aumentarAposta(dm);
                    return true;
                case KeyEvent.KEYCODE_N:


                    jogo.diminuirAposta(dm);
                    return true;
                case KeyEvent.KEYCODE_B:

                    jogo.jogar(dm);
                    return true;
            }
        }

        return super.dispatchKeyEvent(event);
    }
    private int getScreenWidth() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private int getScreenHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}