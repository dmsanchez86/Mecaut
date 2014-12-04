/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author mao
 */
public class progress implements ActionListener{
    private Timer timer;

    public void actionPerformed(ActionEvent e,JProgressBar j) {
        int  n = j.getValue();
        if (n < 100) {
            n++;
        }
        else{
            timer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
