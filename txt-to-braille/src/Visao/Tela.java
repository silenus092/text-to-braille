/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tela.java
 *
 * Created on 30/03/2011, 08:40:55
 */
package Visao;

import Controle.Controler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author Heitor
 */
public class Tela extends javax.swing.JFrame {

    public int CONTADOR = 0;
    public String txt, saida;

    /** Creates new form Tela */
    public Tela() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areadetexto1 = new javax.swing.JTextArea();
        jbProximo = new javax.swing.JButton();
        jbLimpa = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jbFala = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMabrir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areadetexto1.setColumns(20);
        areadetexto1.setRows(5);
        jScrollPane1.setViewportView(areadetexto1);

        jbProximo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbProximo.setText("Enviar Próximo");
        jbProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximoActionPerformed(evt);
            }
        });

        jbLimpa.setFont(new java.awt.Font("Tahoma", 1, 24));
        jbLimpa.setText("Limpar");
        jbLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpaActionPerformed(evt);
            }
        });

        jbAnterior.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAnterior.setText("Enviar Anterior");

        jbFala.setFont(new java.awt.Font("Tahoma", 1, 24));
        jbFala.setText("Falar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbFala, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jbProximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jbLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jbAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbFala, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jbLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");

        JMabrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        JMabrir.setText("Abrir Texto");
        JMabrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMabrirMouseClicked(evt);
            }
        });
        JMabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMabrirActionPerformed(evt);
            }
        });
        jMenu1.add(JMabrir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpaActionPerformed
        areadetexto1.setText(null);
    }//GEN-LAST:event_jbLimpaActionPerformed

    private void JMabrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMabrirMouseClicked
        System.out.println("fuuuuuuuuuu");
    }//GEN-LAST:event_JMabrirMouseClicked

        private void JMabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMabrirActionPerformed
            // TODO add your handling code here:
            JFileChooser fc = new JFileChooser();
            StringBuffer cont = new StringBuffer();

            int res = fc.showOpenDialog(null);

            if (res == JFileChooser.APPROVE_OPTION) {
                File arquivo = fc.getSelectedFile();
                areadetexto1.setText("");

                try {
                    BufferedReader in = new BufferedReader(new FileReader(arquivo));
                    String str, texto = "";
                    while ((str = in.readLine()) != null) {
                        texto += str + "\n";
                    }
                    areadetexto1.setText(texto);
                    in.close();
                } catch (IOException ioe) {
                    JOptionPane.showMessageDialog(null, "ERRO");
                }
            }
        }//GEN-LAST:event_JMabrirActionPerformed

        private void jbProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximoActionPerformed
            if (areadetexto1.getText().equals("")) {
                //Teste para ver se existe algum texto escrito na área de texto.
                JOptionPane.showMessageDialog(rootPane, "Adicione um texto para ser convertido e depois clique em próximo");
            } else {
                
                txt = areadetexto1.getText();
                Controler vai = new Controler(txt);
                //    saida = txt.substring(0, 20);
                System.out.println(saida);

                try {
                    //Aqui convertemos a string de entrada que vem da áread e
                    //texto em um vertor de palavras. com o .trim e o split().
                    String tica[] = txt.trim().split(" ");
                    System.out.println("   primeira palavra:  " + tica[0]);
                    System.out.println(tica.length);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Erro. Seu texto não pode instanciado para a conversão.");
                }
                //for (int i=0;i<tica.length;i++)
        }//GEN-LAST:event_jbProximoActionPerformed
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMabrir;
    private javax.swing.JTextArea areadetexto1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbFala;
    private javax.swing.JButton jbLimpa;
    private javax.swing.JButton jbProximo;
    // End of variables declaration//GEN-END:variables
}