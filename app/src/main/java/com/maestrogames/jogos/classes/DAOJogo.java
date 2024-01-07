package com.maestrogames.jogos.classes;

import com.maestrogames.jogos.impls.FortuneTigerDAO;
import com.maestrogames.jogos.interfaces.jogo;

public class DAOJogo {
    public static jogo createJogo(String jogoSelecionado){
        return new FortuneTigerDAO();
    }
}
