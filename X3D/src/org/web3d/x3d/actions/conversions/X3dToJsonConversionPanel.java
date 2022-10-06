/*
Copyright (c) 1995-2021 held by the author(s) .  All rights reserved.
 
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
 
 * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
 * Neither the names of the Naval Postgraduate School (NPS)
      Modeling Virtual Environments and Simulation (MOVES) Institute
      (http://www.nps.edu and https://MovesInstitute.nps.edu)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.
 
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */

package org.web3d.x3d.actions.conversions;

/**
 *
 * @author brutzman
 */

public class X3dToJsonConversionPanel extends javax.swing.JPanel {

    private final X3dToJsonConversionAction x3dToJsonConversionAction;
    /**
     * Creates new form X3dToJsonConversionPanel
     */
    public X3dToJsonConversionPanel(X3dToJsonConversionAction x3dToJsonConversionAction) {
        
        this.x3dToJsonConversionAction = x3dToJsonConversionAction;
        
        initComponents();
        
        loadValuesInPanel (); // must follow componenent intialization
    }
    
    protected final void loadValuesInPanel ()
    {
                 indentEnabledCheckBox.setSelected(Boolean.valueOf(x3dToJsonConversionAction.getIndentEnabled()));
        stripDefaultAttributesCheckBox.setSelected(Boolean.valueOf(x3dToJsonConversionAction.getStripDefaultAttributes()));
                 stripCommentsCheckBox.setSelected(Boolean.valueOf(x3dToJsonConversionAction.getStripComments()));
                    sourceTextComboBox.setSelectedItem((x3dToJsonConversionAction.getSourceText()));
//                traceEnabledCheckBox.setSelected(Boolean.valueOf(x3dToJsonConversionAction.getTraceEnabled()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        stripCommentsCheckBox = new javax.swing.JCheckBox();
        stripDefaultAttributesCheckBox = new javax.swing.JCheckBox();
        indentEnabledCheckBox = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        sourceTextLabel = new javax.swing.JLabel();
        sourceTextComboBox = new javax.swing.JComboBox();
        sourceTextDescriptionLabel = new javax.swing.JLabel();
        stripCommentsLabel = new javax.swing.JLabel();
        stripDefaultAttributesLabel = new javax.swing.JLabel();
        indentEnabledLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.border.title"))); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(stripCommentsCheckBox, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.stripCommentsCheckBox.text")); // NOI18N
        stripCommentsCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stripCommentsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stripCommentsCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(stripCommentsCheckBox, gridBagConstraints);

        stripDefaultAttributesCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(stripDefaultAttributesCheckBox, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.stripDefaultAttributesCheckBox.text")); // NOI18N
        stripDefaultAttributesCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stripDefaultAttributesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stripDefaultAttributesCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(stripDefaultAttributesCheckBox, gridBagConstraints);

        indentEnabledCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(indentEnabledCheckBox, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.indentEnabledCheckBox.text")); // NOI18N
        indentEnabledCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        indentEnabledCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indentEnabledCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(indentEnabledCheckBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(jSeparator1, gridBagConstraints);

        sourceTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(sourceTextLabel, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.sourceTextLabel.text")); // NOI18N
        sourceTextLabel.setToolTipText(org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.sourceTextLabel.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(sourceTextLabel, gridBagConstraints);

        sourceTextComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "escaped", "strings", "plaintext" }));
        sourceTextComboBox.setSelectedIndex(1);
        sourceTextComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTextComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(sourceTextComboBox, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(sourceTextDescriptionLabel, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.sourceTextDescriptionLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(sourceTextDescriptionLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(stripCommentsLabel, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.stripCommentsLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(stripCommentsLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(stripDefaultAttributesLabel, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.stripDefaultAttributesLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(stripDefaultAttributesLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(indentEnabledLabel, org.openide.util.NbBundle.getMessage(X3dToJsonConversionPanel.class, "X3dToJsonConversionPanel.indentEnabledLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(indentEnabledLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    private void stripCommentsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stripCommentsCheckBoxActionPerformed
        x3dToJsonConversionAction.setStripComments(Boolean.toString(stripCommentsCheckBox.isSelected()));
    }//GEN-LAST:event_stripCommentsCheckBoxActionPerformed

    private void sourceTextComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTextComboBoxActionPerformed
        x3dToJsonConversionAction.setSourceText(sourceTextComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_sourceTextComboBoxActionPerformed

    private void stripDefaultAttributesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stripDefaultAttributesCheckBoxActionPerformed
        x3dToJsonConversionAction.setStripDefaultAttributes(Boolean.toString(stripDefaultAttributesCheckBox.isSelected()));
    }//GEN-LAST:event_stripDefaultAttributesCheckBoxActionPerformed

    private void indentEnabledCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indentEnabledCheckBoxActionPerformed
        x3dToJsonConversionAction.setIndentEnabled(Boolean.toString(indentEnabledCheckBox.isSelected()));
    }//GEN-LAST:event_indentEnabledCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox indentEnabledCheckBox;
    private javax.swing.JLabel indentEnabledLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox sourceTextComboBox;
    private javax.swing.JLabel sourceTextDescriptionLabel;
    private javax.swing.JLabel sourceTextLabel;
    private javax.swing.JCheckBox stripCommentsCheckBox;
    private javax.swing.JLabel stripCommentsLabel;
    private javax.swing.JCheckBox stripDefaultAttributesCheckBox;
    private javax.swing.JLabel stripDefaultAttributesLabel;
    // End of variables declaration//GEN-END:variables

}
