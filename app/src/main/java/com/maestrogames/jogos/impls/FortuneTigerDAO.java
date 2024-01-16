package com.maestrogames.jogos.impls;

import android.app.Instrumentation;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.TextView;

import com.maestrogames.jogos.R;
import com.maestrogames.jogos.classes.DAOJogo;
import com.maestrogames.jogos.interfaces.jogo;

public class FortuneTigerDAO implements jogo {
    @Override
    public void entrarNoJogo(DisplayMetrics dm, WebView webview) {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                float x = (float) 640.97656 * dm.density;
                float y = (float) 563.97217 * dm.density;

                if(dm.densityDpi == 160){
                   x = (float) 640.97656 * dm.density;
                    y = (float) 563.97217 * dm.density;
                }


                Instrumentation inst = new Instrumentation();
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_DOWN, x,  y, 0));
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_UP, x, y, 0));
            }
        });
        minhaThread.start();

    }

    @Override
    public void aumentarAposta(DisplayMetrics dm) {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                float x = (float) 547.50 * dm.density;
                float y = (float) 482.00 * dm.density;
                if(dm.densityDpi == 160){
                    x = (float) 739.5 * dm.density;
                    y = (float) 639.5 * dm.density;
                }
                Instrumentation inst = new Instrumentation();
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_DOWN, x, y, 0));
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_UP, x, y, 0));
            }
        });
        minhaThread.start();
    }

    @Override
    public void diminuirAposta(DisplayMetrics dm) {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {


                float x = (float) 402.50 * dm.density;
                float y = (float) 478.50 * dm.density;
                if(dm.densityDpi == 160){
                    x = (float) 559.639 * dm.density;
                    y = (float) 639.5 * dm.density;
                }
                Instrumentation inst = new Instrumentation();
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_DOWN, x, y, 0));
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_UP, x, y, 0));
            }
        });
        minhaThread.start();
    }

    @Override
    public void jogar(DisplayMetrics dm) {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                float x = (float) 479.50 * dm.density;
                float y = (float) 476.50 * dm.density;
                if(dm.densityDpi == 160){
                    x = (float) 639.5 * dm.density;
                    y = (float) 639.5 * dm.density;
                }
                Instrumentation inst = new Instrumentation();
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_DOWN, x, y, 0));
                inst.sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(),
                        MotionEvent.ACTION_UP, x, y, 0));
            }
        });
        minhaThread.start();
    }
}
