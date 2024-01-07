package com.maestrogames.jogos.impls;

import android.app.Instrumentation;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;

import com.maestrogames.jogos.classes.DAOJogo;
import com.maestrogames.jogos.interfaces.jogo;

public class FortuneTigerDAO implements jogo {
    @Override
    public void entrarNoJogo() {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 972;
                int y = 836;
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
    public void aumentarAposta() {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 1095;
                int y = 964;
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
    public void diminuirAposta() {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 805;
                int y = 957;
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
    public void jogar() {
        Thread minhaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 959;
                int y = 953;
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
