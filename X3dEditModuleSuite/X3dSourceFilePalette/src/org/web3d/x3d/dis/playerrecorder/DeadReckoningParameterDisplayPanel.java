/*
 * DeadReckoningParameterDisplayPanel.java
 *
 * Created on October 26, 2008, 2:28 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.DeadReckoningParameters;

import java.nio.ByteBuffer;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class DeadReckoningParameterDisplayPanel extends javax.swing.JPanel {

    /** Creates new form DeadReckoningParameterDisplayPanel */
    public DeadReckoningParameterDisplayPanel() {
        initComponents();
    }

  public void setData(DeadReckoningParameters par)
  {
    algoTF.setText       (par.getDeadReckoningAlgorithm().getDescription());
    algoTF.setToolTipText(""+par.getDeadReckoningAlgorithm() + " " + par.getDeadReckoningAlgorithm().getDescription());
    
    StringBuilder sb = new StringBuilder();
    byte[] ba = par.getParameters();
    ByteBuffer bb = ByteBuffer.wrap(ba);
    for(int i=0;i<ba.length;i++) {
      sb.append(bb.get());
      sb.append(' ');
    }
    otherTF.setText(sb.toString().trim());
    angVelPanel.setData(par.getEntityAngularVelocity());
    linVelPanel.setData(par.getEntityLinearAcceleration());
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

        topPan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        algoTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        otherTF = new javax.swing.JTextField();
        bottomPan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        angVelPanel = new org.web3d.x3d.dis.playerrecorder.Vector3FloatDisplayPanel();
        jLabel4 = new javax.swing.JLabel();
        linVelPanel = new org.web3d.x3d.dis.playerrecorder.Vector3FloatDisplayPanel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        topPan.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.jLabel1.text")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(24, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        topPan.add(jLabel1, gridBagConstraints);

        algoTF.setEditable(false);
        algoTF.setForeground(new java.awt.Color(0, 102, 102));
        algoTF.setText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.algoTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        topPan.add(algoTF, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.jLabel2.text")); // NOI18N
        jLabel2.setToolTipText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.jLabel2.toolTipText")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(42, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        topPan.add(jLabel2, gridBagConstraints);

        otherTF.setEditable(false);
        otherTF.setForeground(new java.awt.Color(0, 102, 102));
        otherTF.setToolTipText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.otherTF.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.8;
        topPan.add(otherTF, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(topPan, gridBagConstraints);

        bottomPan.setLayout(new java.awt.GridBagLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.jLabel3.text")); // NOI18N
        jLabel3.setToolTipText(org.openide.util.NbBundle.getMessage(DeadReckoningParameterDisplayPanel.class, "DeadReckoningParameterDisplayPanel.jLabel3.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        bottomPan.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        bottomPan.add(angVelPanel, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.jLabel4.text")); // NOI18N
        jLabel4.setToolTipText(org.openide.util.NbBundle.getMessage(DeadReckoningParameterDisplayPanel.class, "DeadReckoningParameterDisplayPanel.jLabel4.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        bottomPan.add(jLabel4, gridBagConstraints);

        linVelPanel.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        bottomPan.add(linVelPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(bottomPan, gridBagConstraints);

        jLabel5.setText(NbBundle.getMessage(getClass(), "DeadReckoningParameterDisplayPanel.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField algoTF;
    private org.web3d.x3d.dis.playerrecorder.Vector3FloatDisplayPanel angVelPanel;
    private javax.swing.JPanel bottomPan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.web3d.x3d.dis.playerrecorder.Vector3FloatDisplayPanel linVelPanel;
    private javax.swing.JTextField otherTF;
    private javax.swing.JPanel topPan;
    // End of variables declaration//GEN-END:variables

}
