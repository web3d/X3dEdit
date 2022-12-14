/*
 * ResupplyOfferPduDisplayPanel.java
 *
 * Created on October 26, 2008, 2:53 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.ResupplyOfferPdu;
import edu.nps.moves.dis7.pdus.SupplyQuantity;

import java.util.List;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class ResupplyOfferPduDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form ResupplyOfferPduDisplayPanel */
  public ResupplyOfferPduDisplayPanel()
  {
    initComponents();
  }

  public void setData(ResupplyOfferPdu pdu)
  {
    pduHeaderDisplayPanel1.setData(pdu);
    receivingEntityIDDisplayPanel.setData(pdu.getReceivingEntityID());
    supplyingEntityIDDisplayPanel.setData(pdu.getSupplyingEntityID());
    numSupplyTypesTF.setText("" + pdu.getSupplies().size());
    paddingTF.setText("" + pdu.getPadding1() + " " + pdu.getPadding2());

    List<SupplyQuantity> lis = pdu.getSupplies();
    suppliesPanel.removeAll();
    for (SupplyQuantity sq : lis) {
      SupplyQuantityRecordDisplayPanel pan = new SupplyQuantityRecordDisplayPanel();
      pan.setData(sq);
      suppliesPanel.add(pan);
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

    pduHeaderDisplayPanel1 = new org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel();
    receivingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    supplyingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    jLabel2 = new javax.swing.JLabel();
    numSupplyTypesTF = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    paddingTF = new javax.swing.JTextField();
    suppliesPanel = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    pduHeaderDisplayPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PDU Header"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(pduHeaderDisplayPanel1, gridBagConstraints);

    receivingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Receiving Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(receivingEntityIDDisplayPanel, gridBagConstraints);

    supplyingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplying Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
    add(supplyingEntityIDDisplayPanel, gridBagConstraints);

    jLabel2.setText(NbBundle.getMessage(getClass(), "ResupplyOfferPduDisplayPanel.jLabel2.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
    add(jLabel2, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
    add(numSupplyTypesTF, gridBagConstraints);

    jLabel3.setText(NbBundle.getMessage(getClass(), "ResupplyOfferPduDisplayPanel.jLabel3.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
    add(jLabel3, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
    add(paddingTF, gridBagConstraints);

    suppliesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplies"));
    suppliesPanel.setLayout(new javax.swing.BoxLayout(suppliesPanel, javax.swing.BoxLayout.PAGE_AXIS));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    add(suppliesPanel, gridBagConstraints);

    jLabel1.setText(NbBundle.getMessage(getClass(), "ResupplyOfferPduDisplayPanel.jLabel1.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(jLabel1, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JTextField numSupplyTypesTF;
  private javax.swing.JTextField paddingTF;
  private org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel pduHeaderDisplayPanel1;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel receivingEntityIDDisplayPanel;
  private javax.swing.JPanel suppliesPanel;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel supplyingEntityIDDisplayPanel;
  // End of variables declaration//GEN-END:variables
}
