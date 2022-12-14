/*
 * RepairCompletePduDisplayPanel.java
 *
 * Created on October 26, 2008, 2:49 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.RepairCompletePdu;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class RepairCompletePduDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form RepairCompletePduDisplayPanel */
  public RepairCompletePduDisplayPanel()
  {
    initComponents();
  }

  public void setData(RepairCompletePdu pdu)
  {
    pduHeaderDisplayPanel1.setData(pdu);
    receivingEntityIDDisplayPanel.setData(pdu.getReceivingEntityID());
    repairingEntityIDDisplayPanel.setData(pdu.getRepairingEntityID());
    repairTF.setText("" + pdu.getRepair());
    paddingTF.setText("" + pdu.getPadding());
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

    pduHeaderDisplayPanel1 = new org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel();
    receivingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    repairingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    repairTF = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    paddingTF = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    pduHeaderDisplayPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PDU Header"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(pduHeaderDisplayPanel1, gridBagConstraints);

    receivingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Receiving Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(receivingEntityIDDisplayPanel, gridBagConstraints);

    repairingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Repairing Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(repairingEntityIDDisplayPanel, gridBagConstraints);

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jLabel2.setText(NbBundle.getMessage(getClass(), "RepairCompletePduDisplayPanel.jLabel2.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
    jPanel1.add(jLabel2, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(repairTF, gridBagConstraints);

    jLabel3.setText(NbBundle.getMessage(getClass(), "RepairCompletePduDisplayPanel.jLabel3.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
    jPanel1.add(jLabel3, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(paddingTF, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    add(jPanel1, gridBagConstraints);

    jLabel1.setText(NbBundle.getMessage(getClass(), "RepairCompletePduDisplayPanel.jLabel1.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(jLabel1, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField paddingTF;
  private org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel pduHeaderDisplayPanel1;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel receivingEntityIDDisplayPanel;
  private javax.swing.JTextField repairTF;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel repairingEntityIDDisplayPanel;
  // End of variables declaration//GEN-END:variables
}
