package com.maestrogames.jogos;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.FragmentActivity;

import com.maestrogames.jogos.classes.DAOJogo;
import com.maestrogames.jogos.interfaces.jogo;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    private WebView webView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://a3a3-2804-1054-4011-fee0-6c24-77c0-599d-ddf0.ngrok-free.app");
    }


    @SuppressLint("RestrictedApi")
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        jogo jogo = new DAOJogo().createJogo("FortuneTiger");

        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_ENTER:
                    jogo.entrarNoJogo();
                    return true;
                case KeyEvent.KEYCODE_B:
                    jogo.aumentarAposta();
                    return true;
                case KeyEvent.KEYCODE_F:
                    jogo.diminuirAposta();
                    return true;
                case KeyEvent.KEYCODE_SPACE:
                    jogo.jogar();
                    return true;
            }
        }

        return super.dispatchKeyEvent(event);
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