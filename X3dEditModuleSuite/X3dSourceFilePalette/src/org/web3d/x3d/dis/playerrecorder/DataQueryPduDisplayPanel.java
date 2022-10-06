/*
 * DataQueryPduDisplayPanel.java
 *
 * Created on October 26, 2008, 2:27 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.DataQueryPdu;
import edu.nps.moves.dis7.pdus.EntityID;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class DataQueryPduDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form DataQueryPduDisplayPanel */
  public DataQueryPduDisplayPanel()
  {
    initComponents();
  }

  public void setData(DataQueryPdu pdu)
  {
    pduHeaderDisplayPanel1.setData(pdu);
    
    EntityID eid = new EntityID();
    eid.setApplicationID(pdu.getOriginatingID().getSimulationAddress().getApplication());
    eid.setSiteID(pdu.getOriginatingID().getSimulationAddress().getSite());
    eid.setEntityID(pdu.getOriginatingID().getReferenceNumber());
    origEntityIDDisplayPanel.setData(eid);
    
    eid = new EntityID();
    eid.setApplicationID(pdu.getReceivingID().getSimulationAddress().getApplication());
    eid.setSiteID(pdu.getReceivingID().getSimulationAddress().getSite());
    eid.setEntityID(pdu.getReceivingID().getReferenceNumber());
    ReceivingEntityIDDisplayPanel.setData(eid);

    requestIDTF.setText("" + pdu.getRequestID());
    timeIntervalTF.setText("" + pdu.getTimeInterval());
    numFixedTF.setText("" + pdu.getFixedDatums().size());
    numVariableTF.setText("" + pdu.getVariableDatums().size());

    varDatumTA.setText(pdu.getVariableDatums().toString());  //test
    fixedDataTA.setText(pdu.getFixedDatums().toString());  // test
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
    numFixedLab = new javax.swing.JLabel();
    numFixedTF = new javax.swing.JTextField();
    numVariableLab = new javax.swing.JLabel();
    numVariableTF = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    varDatumTA = new javax.swing.JTextArea();
    requestIDLab = new javax.swing.JLabel();
    requestIDTF = new javax.swing.JTextField();
    timeIntervalLab = new javax.swing.JLabel();
    timeIntervalTF = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    fixedDataTA = new javax.swing.JTextArea();

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

    numFixedLab.setText(NbBundle.getMessage(getClass(), "DataQueryPduDisplayPanel.numFixedLab.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(numFixedLab, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
    jPanel1.add(numFixedTF, gridBagConstraints);

    numVariableLab.setText(NbBundle.getMessage(getClass(), "DataQueryPduDisplayPanel.numVariableLab.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(numVariableLab, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
    jPanel1.add(numVariableTF, gridBagConstraints);

    jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Variable Datum"));

    varDatumTA.setColumns(20);
    varDatumTA.setRows(1);
    jScrollPane1.setViewportView(varDatumTA);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 0.5;
    jPanel1.add(jScrollPane1, gridBagConstraints);

    requestIDLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    requestIDLab.setText(NbBundle.getMessage(getClass(), "DataQueryPduDisplayPanel.requestIDLab.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 3);
    jPanel1.add(requestIDLab, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 5);
    jPanel1.add(requestIDTF, gridBagConstraints);

    timeIntervalLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    timeIntervalLab.setText(NbBundle.getMessage(getClass(), "DataQueryPduDisplayPanel.timeIntervalLab.text")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 3);
    jPanel1.add(timeIntervalLab, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 3);
    jPanel1.add(timeIntervalTF, gridBagConstraints);

    jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fixed Datum"));

    fixedDataTA.setColumns(20);
    fixedDataTA.setRows(1);
    jScrollPane2.setViewportView(fixedDataTA);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    jPanel1.add(jScrollPane2, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    add(jPanel1, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel ReceivingEntityIDDisplayPanel;
  private javax.swing.JTextArea fixedDataTA;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel numFixedLab;
  private javax.swing.JTextField numFixedTF;
  private javax.swing.JLabel numVariableLab;
  private javax.swing.JTextField numVariableTF;
  private org.web3d.x3d.dis.playerrecorder.EntityIDDisplayPanel origEntityIDDisplayPanel;
  private org.web3d.x3d.dis.playerrecorder.PduHeaderDisplayPanel pduHeaderDisplayPanel1;
  private javax.swing.JLabel requestIDLab;
  private javax.swing.JTextField requestIDTF;
  private javax.swing.JLabel timeIntervalLab;
  private javax.swing.JTextField timeIntervalTF;
  private javax.swing.JTextArea varDatumTA;
  // End of variables declaration//GEN-END:variables
}
