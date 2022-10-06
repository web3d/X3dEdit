/*
 * BurstDescriptorDisplayPanel.java
 *
 * Created on October 26, 2008, 3:49 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.MunitionDescriptor;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class BurstDescriptorDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form BurstDescriptorDisplayPanel */
  public BurstDescriptorDisplayPanel()
  {
    initComponents();
  }

  public void setData(MunitionDescriptor desc)
  {
    munitionRecordPanel.setData(desc.getMunitionType());
    warheadTF.setText(desc.getWarhead().getDescription());
    fuseTF.setText(desc.getFuse().getDescription());
    quantityTF.setText("" + desc.getQuantity());
    rateTF.setText("" + desc.getRate());
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

        munitionRecordPanel = new org.web3d.x3d.dis.playerrecorder.EntityTypeDisplayPanel();
        jLabel1 = new javax.swing.JLabel();
        warheadTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fuseTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantityTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rateTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        munitionRecordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Munition Record"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(munitionRecordPanel, gridBagConstraints);

        jLabel1.setText(NbBundle.getMessage(getClass(), "BurstDescriptorDisplayPanel.jLabel1.text_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        add(jLabel1, gridBagConstraints);

        warheadTF.setEditable(false);
        warheadTF.setForeground(new java.awt.Color(0, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 3);
        add(warheadTF, gridBagConstraints);

        jLabel2.setText(NbBundle.getMessage(getClass(), "BurstDescriptorDisplayPanel.jLabel2.text_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 2, 0, 3);
        add(jLabel2, gridBagConstraints);

        fuseTF.setEditable(false);
        fuseTF.setForeground(new java.awt.Color(0, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 3);
        add(fuseTF, gridBagConstraints);

        jLabel4.setText(NbBundle.getMessage(getClass(), "BurstDescriptorDisplayPanel.jLabel4.text_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 2, 0, 3);
        add(jLabel4, gridBagConstraints);

        quantityTF.setEditable(false);
        quantityTF.setForeground(new java.awt.Color(0, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 3);
        add(quantityTF, gridBagConstraints);

        jLabel6.setText(NbBundle.getMessage(getClass(), "BurstDescriptorDisplayPanel.jLabel6.text_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 2, 0, 3);
        add(jLabel6, gridBagConstraints);

        rateTF.setEditable(false);
        rateTF.setForeground(new java.awt.Color(0, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 3);
        add(rateTF, gridBagConstraints);

        jLabel3.setText(NbBundle.getMessage(getClass(), "BurstDescriptorDisplayPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fuseTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private org.web3d.x3d.dis.playerrecorder.EntityTypeDisplayPanel munitionRecordPanel;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JTextField rateTF;
    private javax.swing.JTextField warheadTF;
    // End of variables declaration//GEN-END:variables
}
