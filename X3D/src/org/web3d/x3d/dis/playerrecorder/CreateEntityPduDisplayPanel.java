/*
 * CreateEntityPduDisplayPanel.java
 *
 * Created on October 26, 2008, 2:24 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.CreateEntityPdu;
import edu.nps.moves.dis7.pdus.EntityID;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class CreateEntityPduDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form CreateEntityPduDisplayPanel */
  public CreateEntityPduDisplayPanel()
  {
    initComponents();
  }

  public void setData(CreateEntityPdu pdu)
  {
    pduHeaderDisplayPanel1.setData(pdu);
    
    EntityID eid = new EntityID();
    eid.setApplicationID(pdu.getOriginatingID().getSimulationAddress().getApplication());
    eid.setSiteID(pdu.getOriginatingID().getSimulationAddress().getSite());
    eid.setEntityID(pdu.getOriginatingID().getReferenceNumber());
    originatingEntityIDDisplayPanel.setData(eid);
    
    eid = new EntityID();
    eid.setApplicationID(pdu.getReceivingID().getSimulationAddress().getApplication());
    eid.setSiteID(pdu.getReceivingID().getSimulationAddress().getSite());
    eid.setEntityID(pdu.getReceivingID().getReferenceNumber());
    receivingEntityIDDisplayPanel.setData(eid);

    requestIDTF.setText("" + pdu.getRequestID());
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
    originatingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    receivingEntityIDDisplayPanel = new org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel();
    jLabel1 = new javax.swing.JLabel();
    requestIDTF = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    pduHeaderDisplayPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PDU HEader"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    add(pduHeaderDisplayPanel1, gridBagConstraints);

    originatingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Originating Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    add(originatingEntityIDDisplayPanel, gridBagConstraints);

    receivingEntityIDDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Receiving Entity"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(receivingEntityIDDisplayPanel, gridBagConstraints);

    jLabel1.setText(NbBundle.getMessage(getClass(), "CreateEntityPduDisplayPanel.jLabel1.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    add(jLabel1, gridBagConstraints);

    requestIDTF.setMinimumSize(new java.awt.Dimension(46, 22));
    requestIDTF.setPreferredSize(new java.awt.Dimension(46, 22));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 3, 0, 0);
    add(requestIDTF, gridBagConstraints);

    jLabel2.setText(NbBundle.getMessage(getClass(), "CreateEntityPduDisplayPanel.jLabel2.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(jLabel2, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel originatingEntityIDDisplayPanel;
  private org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel pduHeaderDisplayPanel1;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel receivingEntityIDDisplayPanel;
  private javax.swing.JTextField requestIDTF;
  // End of variables declaration//GEN-END:variables
}
