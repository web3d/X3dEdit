/*
 * MarkingRecordDisplayPanel.java
 *
 * Created on October 26, 2008, 2:43 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.pdus.EntityMarking;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class MarkingRecordDisplayPanel extends javax.swing.JPanel
{
  /** Creates new form MarkingRecordDisplayPanel */
  public MarkingRecordDisplayPanel()
  {
    initComponents();
  }

  public void setData(EntityMarking rec)
  {
    characterSetTF.setText("" + rec.getCharacterSet());
    StringBuilder sb = new StringBuilder();
    byte[] ba = rec.getCharacters();
    for(byte b : ba) {
      char[] ca = ByteArrayDisplayPanel.byteToHex(b);
      sb.append(ca);
      sb.append(' ');
    }
    String markingString = new String(rec.getCharacters());
    markingStringTF.setText(markingString.trim());
    markingHexTF.setText(sb.toString().trim());

    markingHexLabel.setVisible(false); // hide
    markingHexTF.setVisible(false);    // hide
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

        stringTF1 = new javax.swing.JTextField();
        charSetLabel = new javax.swing.JLabel();
        characterSetTF = new javax.swing.JTextField();
        markingStringLabel = new javax.swing.JLabel();
        markingHexTF = new javax.swing.JTextField();
        markingHexLabel = new javax.swing.JLabel();
        markingStringTF = new javax.swing.JTextField();

        stringTF1.setEditable(false);

        setLayout(new java.awt.GridBagLayout());

        charSetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        charSetLabel.setText(NbBundle.getMessage(getClass(), "MarkingRecordDisplayPanel.charSetLabel.text")); // NOI18N
        charSetLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 2, 2);
        add(charSetLabel, gridBagConstraints);

        characterSetTF.setColumns(4);
        characterSetTF.setEditable(false);
        characterSetTF.setForeground(new java.awt.Color(0, 102, 102));
        characterSetTF.setText(NbBundle.getMessage(getClass(), "MarkingRecordDisplayPanel.characterSetTF.text")); // NOI18N
        characterSetTF.setMinimumSize(new java.awt.Dimension(4, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(characterSetTF, gridBagConstraints);

        markingStringLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        markingStringLabel.setText(NbBundle.getMessage(getClass(), "MarkingRecordDisplayPanel.markingStringLabel.text")); // NOI18N
        markingStringLabel.setToolTipText(org.openide.util.NbBundle.getMessage(MarkingRecordDisplayPanel.class, "MarkingRecordDisplayPanel.markingStringLabel.toolTipText")); // NOI18N
        markingStringLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 2, 2);
        add(markingStringLabel, gridBagConstraints);

        markingHexTF.setEditable(false);
        markingHexTF.setForeground(new java.awt.Color(0, 102, 102));
        markingHexTF.setText(org.openide.util.NbBundle.getMessage(MarkingRecordDisplayPanel.class, "MarkingRecordDisplayPanel.markingHexTF.text")); // NOI18N
        markingHexTF.setToolTipText(org.openide.util.NbBundle.getMessage(MarkingRecordDisplayPanel.class, "MarkingRecordDisplayPanel.markingHexTF.toolTipText")); // NOI18N
        markingHexTF.setMinimumSize(new java.awt.Dimension(130, 20));
        markingHexTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markingHexTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(markingHexTF, gridBagConstraints);

        markingHexLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        markingHexLabel.setText(NbBundle.getMessage(getClass(), "MarkingRecordDisplayPanel.markingHexLabel.text")); // NOI18N
        markingHexLabel.setToolTipText(org.openide.util.NbBundle.getMessage(MarkingRecordDisplayPanel.class, "MarkingRecordDisplayPanel.markingHexLabel.toolTipText")); // NOI18N
        markingHexLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 2, 2);
        add(markingHexLabel, gridBagConstraints);

        markingStringTF.setEditable(false);
        markingStringTF.setForeground(new java.awt.Color(0, 102, 102));
        markingStringTF.setText(org.openide.util.NbBundle.getMessage(MarkingRecordDisplayPanel.class, "MarkingRecordDisplayPanel.markingStringTF.text")); // NOI18N
        markingStringTF.setToolTipText(org.openide.util.NbBundle.getMessage(MarkingRecordDisplayPanel.class, "MarkingRecordDisplayPanel.markingStringTF.toolTipText")); // NOI18N
        markingStringTF.setMaximumSize(new java.awt.Dimension(11, 20));
        markingStringTF.setMinimumSize(new java.awt.Dimension(11, 20));
        markingStringTF.setPreferredSize(new java.awt.Dimension(11, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(markingStringTF, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

  private void markingHexTFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_markingHexTFActionPerformed
  {//GEN-HEADEREND:event_markingHexTFActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_markingHexTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel charSetLabel;
    private javax.swing.JTextField characterSetTF;
    private javax.swing.JLabel markingHexLabel;
    private javax.swing.JTextField markingHexTF;
    private javax.swing.JLabel markingStringLabel;
    private javax.swing.JTextField markingStringTF;
    private javax.swing.JTextField stringTF1;
    // End of variables declaration//GEN-END:variables
}
