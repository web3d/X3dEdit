/*
 * XmlDisplayPanel.java
 *
 * Created on Jan 12, 2009, 5:23:17 PM
 */

package org.web3d.x3d.dis.playerrecorder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mike
 */
public class XmlDisplayPanel extends javax.swing.JPanel {

    /** Creates new form XmlDisplayPanel */
    public XmlDisplayPanel() {
        initComponents();
    }
    public void setString(String s)
    {
      jTextArea1.setText(s);
    }
    public void setData(File f)
    {
      jTextArea1.setText("");
      try {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String s;
        while((s=br.readLine()) != null)
          jTextArea1.append(s);
      }
      catch(FileNotFoundException ex) {
        jTextArea1.setText("Data file ("+f.getAbsolutePath()+") not found.");
      }
      catch(IOException ioex) {
        jTextArea1.setText("IO error ("+ioex.getLocalizedMessage()+") reading from "+f.getAbsolutePath()+".");
      }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setForeground(new java.awt.Color(0, 102, 102));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
