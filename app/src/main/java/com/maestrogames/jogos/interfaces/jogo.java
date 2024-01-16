package com.maestrogames.jogos.interfaces;

import android.util.DisplayMetrics;
import android.webkit.WebView;

public interface jogo {

    void entrarNoJogo(DisplayMetrics d, WebView webView);
    void aumentarAposta(DisplayMetrics dm);
    void diminuirAposta(DisplayMetrics dm);
    void jogar(DisplayMetrics dm);

}
