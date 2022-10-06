/*
 * AcknowledgePduDisplayPanel.java
 *
 * Created on October 26, 2008, 3:21 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.AcknowledgePdu;
import edu.nps.moves.dis7.pdus.EntityID;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class AcknowledgePduDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form AcknowledgePduDisplayPanel */
  public AcknowledgePduDisplayPanel()
  {
    initComponents();
  }

  public void setData(AcknowledgePdu pdu)
  {
    pduHeaderDisplayPanel1.setData(pdu);
    
    EntityID eid = new EntityID();
    eid.setApplicationID(pdu.getOriginatingID().getSimulationAddress().getApplication());
    eid.setSiteID(pdu.getOriginatingID().getSimulationAddress().getSite());
    eid.setEntityID(pdu.getOriginatingID().getReferenceNumber());
    this.origEntityIDDisplayPanel.setData(eid);
    
    eid = new EntityID();
    eid.setApplicationID(pdu.getReceivingID().getSimulationAddress().getApplication());
    eid.setSiteID(pdu.getReceivingID().getSimulationAddress().getSite());
    eid.setEntityID(pdu.getReceivingID().getReferenceNumber());
    this.ReceivingEntityIDDisplayPanel.setData(eid);

    acknowledgeTF.setText(pdu.getAcknowledgeFlag().getDescription());
    requestIDTF.setText("" + pdu.getRequestID());
    responseTF.setText(pdu.getResponseFlag().getDescription());
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
    origEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    ReceivingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    acknowledgeTF = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    responseTF = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    requestIDTF = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    pduHeaderDisplayPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PDU Header"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(pduHeaderDisplayPanel1, gridBagConstraints);

    origEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Originating Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(origEntityIDDisplayPanel, gridBagConstraints);

    ReceivingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Receiving Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    add(ReceivingEntityIDDisplayPanel, gridBagConstraints);

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jLabel2.setText(NbBundle.getMessage(getClass(), "AcknowledgePduDisplayPanel.jLabel2.text_1")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(jLabel2, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.25;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
    jPanel1.add(acknowledgeTF, gridBagConstraints);

    jLabel3.setText(NbBundle.getMessage(getClass(), "AcknowledgePduDisplayPanel.jLabel3.text_1")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(jLabel3, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.25;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
    jPanel1.add(responseTF, gridBagConstraints);

    jLabel4.setText(NbBundle.getMessage(getClass(), "AcknowledgePduDisplayPanel.jLabel4.text_1")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(jLabel4, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(requestIDTF, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    add(jPanel1, gridBagConstraints);

    jLabel1.setText(NbBundle.getMessage(getClass(), "AcknowledgePduDisplayPanel.jLabel1.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(jLabel1, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel ReceivingEntityIDDisplayPanel;
  private javax.swing.JTextField acknowledgeTF;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel origEntityIDDisplayPanel;
  private org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel pduHeaderDisplayPanel1;
  private javax.swing.JTextField requestIDTF;
  private javax.swing.JTextField responseTF;
  // End of variables declaration//GEN-END:variables
}
