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

package org.web3d.x3d.palette.items;

import javax.swing.DefaultComboBoxModel;
import javax.swing.text.JTextComponent;
import org.openide.util.HelpCtx;
import static org.web3d.x3d.types.X3DSchemaData.*;

/**
 * BLENDEDVOLUMESTYLECustomizer.java
 * Created on 16 November 2011
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey and Don Brutzman
 * @version $Id$
 */
public class BLENDEDVOLUMESTYLECustomizer extends BaseCustomizer
{
  private BLENDEDVOLUMESTYLE blendedVolumeStyle;
  private JTextComponent target;
  
  /** Creates new form BLENDEDVOLUMESTYLECustomizer
   * @param blendedVolumeStyle
   * @param target  
   */
  public BLENDEDVOLUMESTYLECustomizer(BLENDEDVOLUMESTYLE blendedVolumeStyle, JTextComponent target)
  {
    super(blendedVolumeStyle);
    this.blendedVolumeStyle = blendedVolumeStyle;
    this.target = target;
    
    HelpCtx.setHelpIDString(this, "BLENDEDVOLUMESTYLE_ELEM_HELPID");
    
    initComponents();
    
    bboxCenterXTF.setText(blendedVolumeStyle.getBboxCenterX());
    bboxCenterYTF.setText(blendedVolumeStyle.getBboxCenterY());
    bboxCenterZTF.setText(blendedVolumeStyle.getBboxCenterZ());
    bboxSizeXTF.setText(blendedVolumeStyle.getBboxSizeX());
    bboxSizeYTF.setText(blendedVolumeStyle.getBboxSizeY());
    bboxSizeZTF.setText(blendedVolumeStyle.getBboxSizeZ());
    
        enabledCB.setSelected(blendedVolumeStyle.isEnabled());
    weightConstant1TF.setText(blendedVolumeStyle.getWeightConstant1());
    weightConstant2TF.setText(blendedVolumeStyle.getWeightConstant2());
    weightFunction1ComboBox.setSelectedItem(blendedVolumeStyle.getWeightFunction1());
    weightFunction2ComboBox.setSelectedItem(blendedVolumeStyle.getWeightFunction2());
    weightFunction1ComboBox.setToolTipText(BLENDEDVOLUMESTYLE_ATTR_WEIGHTFUNCTION_TOOLTIPS[weightFunction1ComboBox.getSelectedIndex()]);
    weightFunction2ComboBox.setToolTipText(BLENDEDVOLUMESTYLE_ATTR_WEIGHTFUNCTION_TOOLTIPS[weightFunction2ComboBox.getSelectedIndex()]);
  }
 
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dEFUSEpanel1 = getDEFUSEpanel();
        enabledLabel = new javax.swing.JLabel();
        enabledCB = new javax.swing.JCheckBox();
        weightConstant1Label = new javax.swing.JLabel();
        weightConstant1TF = new javax.swing.JTextField();
        weightConstant2Label = new javax.swing.JLabel();
        weightConstant2TF = new javax.swing.JTextField();
        weightFunction1Label = new javax.swing.JLabel();
        weightFunction1ComboBox = new javax.swing.JComboBox<String>();
        weightFunction2Label = new javax.swing.JLabel();
        weightFunction2ComboBox = new javax.swing.JComboBox<String>();
        bboxCenterLabel = new javax.swing.JLabel();
        bboxSeparator = new javax.swing.JSeparator();
        bboxCenterXTF = new javax.swing.JTextField();
        bboxCenterYTF = new javax.swing.JTextField();
        bboxCenterZTF = new javax.swing.JTextField();
        bboxSizeLabel = new javax.swing.JLabel();
        bboxSizeXTF = new javax.swing.JTextField();
        bboxSizeYTF = new javax.swing.JTextField();
        bboxSizeZTF = new javax.swing.JTextField();
        nodeHintPanel = new javax.swing.JPanel();
        hintLabel1 = new javax.swing.JLabel();

        setToolTipText("");
        setLayout(new java.awt.GridBagLayout());

        dEFUSEpanel1.setMinimumSize(new java.awt.Dimension(198, 77));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);

        enabledLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enabledLabel.setText("enabled");
        enabledLabel.setToolTipText("Enables/disables node operation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(enabledLabel, gridBagConstraints);

        enabledCB.setToolTipText("Enables/disables node operation");
        enabledCB.setMargin(new java.awt.Insets(0, 0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(enabledCB, gridBagConstraints);

        weightConstant1Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        weightConstant1Label.setText("weightConstant1");
        weightConstant1Label.setToolTipText("weightConstant1 is used when weightFunction1=CONSTANT ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 40, 3, 3);
        add(weightConstant1Label, gridBagConstraints);

        weightConstant1TF.setToolTipText("weightConstant1 is used when weightFunction1=CONSTANT ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(weightConstant1TF, gridBagConstraints);

        weightConstant2Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        weightConstant2Label.setText("weightConstant2");
        weightConstant2Label.setToolTipText("weightConstant2 is used when weightFunction2=CONSTANT ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 40, 3, 3);
        add(weightConstant2Label, gridBagConstraints);

        weightConstant2TF.setToolTipText("weightConstant2 is used when weightFunction2=CONSTANT ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(weightConstant2TF, gridBagConstraints);

        weightFunction1Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        weightFunction1Label.setText("weightFunction1");
        weightFunction1Label.setToolTipText("see Table 41.3 — Weight function types");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 3, 3);
        add(weightFunction1Label, gridBagConstraints);

        weightFunction1ComboBox.setModel(new DefaultComboBoxModel<String>(BLENDEDVOLUMESTYLE_ATTR_WEIGHTFUNCTION_CHOICES));
        weightFunction1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFunction1ComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 60);
        add(weightFunction1ComboBox, gridBagConstraints);

        weightFunction2Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        weightFunction2Label.setText("weightFunction2");
        weightFunction2Label.setToolTipText("see Table 41.3 — Weight function types");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 3, 3);
        add(weightFunction2Label, gridBagConstraints);

        weightFunction2ComboBox.setModel(new DefaultComboBoxModel<String>(BLENDEDVOLUMESTYLE_ATTR_WEIGHTFUNCTION_CHOICES));
        weightFunction2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFunction2ComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 60);
        add(weightFunction2ComboBox, gridBagConstraints);

        bboxCenterLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        bboxCenterLabel.setText("bboxCenter");
        bboxCenterLabel.setToolTipText("position offset from origin of local coordinate system");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 50, 3, 3);
        add(bboxCenterLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(bboxSeparator, gridBagConstraints);

        bboxCenterXTF.setToolTipText("position offset from origin of local coordinate system");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(bboxCenterXTF, gridBagConstraints);

        bboxCenterYTF.setToolTipText("position offset from origin of local coordinate system");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(bboxCenterYTF, gridBagConstraints);

        bboxCenterZTF.setToolTipText("position offset from origin of local coordinate system");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(bboxCenterZTF, gridBagConstraints);

        bboxSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        bboxSizeLabel.setText("bboxSize");
        bboxSizeLabel.setToolTipText("automatically calculated, can be specified as an optimization or constraint");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 50, 3, 3);
        add(bboxSizeLabel, gridBagConstraints);

        bboxSizeXTF.setToolTipText("automatically calculated, can be specified as an optimization or constraint");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(bboxSizeXTF, gridBagConstraints);

        bboxSizeYTF.setToolTipText("automatically calculated, can be specified as an optimization or constraint");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(bboxSizeYTF, gridBagConstraints);

        bboxSizeZTF.setToolTipText("automatically calculated, can be specified as an optimization or constraint");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(bboxSizeZTF, gridBagConstraints);

        nodeHintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nodeHintPanel.setLayout(new java.awt.GridBagLayout());

        hintLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintLabel1.setText("<html><p align='center'><b>BlendedVolumeStyle</b> BlendedVolumeStyle combines rendering of two voxel data sets into one by blending values.<br/>Also contains an <i>X3DVolumeRenderStyleNode</i> node, plus an <i>X3DTexture3DNode</i> nodes to contain voxels, plus<br/> two <i>X3DTexture2DNodes</i> as weightTransferFunction1 and weightTransferFunction2.</p>");
        hintLabel1.setToolTipText("multiple style nodes can be applied to volume data");
        hintLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        nodeHintPanel.add(hintLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(nodeHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void weightFunction1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFunction1ComboBoxActionPerformed
        weightFunction1ComboBox.setToolTipText(BLENDEDVOLUMESTYLE_ATTR_WEIGHTFUNCTION_TOOLTIPS[weightFunction1ComboBox.getSelectedIndex()]);
    }//GEN-LAST:event_weightFunction1ComboBoxActionPerformed

    private void weightFunction2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFunction2ComboBoxActionPerformed
        weightFunction2ComboBox.setToolTipText(BLENDEDVOLUMESTYLE_ATTR_WEIGHTFUNCTION_TOOLTIPS[weightFunction2ComboBox.getSelectedIndex()]);
    }//GEN-LAST:event_weightFunction2ComboBoxActionPerformed
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bboxCenterLabel;
    private javax.swing.JTextField bboxCenterXTF;
    private javax.swing.JTextField bboxCenterYTF;
    private javax.swing.JTextField bboxCenterZTF;
    private javax.swing.JSeparator bboxSeparator;
    private javax.swing.JLabel bboxSizeLabel;
    private javax.swing.JTextField bboxSizeXTF;
    private javax.swing.JTextField bboxSizeYTF;
    private javax.swing.JTextField bboxSizeZTF;
    private org.web3d.x3d.palette.items.DEFUSEpanel dEFUSEpanel1;
    private javax.swing.JCheckBox enabledCB;
    private javax.swing.JLabel enabledLabel;
    private javax.swing.JLabel hintLabel1;
    private javax.swing.JPanel nodeHintPanel;
    private javax.swing.JLabel weightConstant1Label;
    private javax.swing.JTextField weightConstant1TF;
    private javax.swing.JLabel weightConstant2Label;
    private javax.swing.JTextField weightConstant2TF;
    private javax.swing.JComboBox<String> weightFunction1ComboBox;
    private javax.swing.JLabel weightFunction1Label;
    private javax.swing.JComboBox<String> weightFunction2ComboBox;
    private javax.swing.JLabel weightFunction2Label;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_BLENDEDVOLUMESTYLE";
  }

  @Override
  public void unloadInput()
  {
    unLoadDEFUSE();
    
    blendedVolumeStyle.setBboxCenterX(bboxCenterXTF.getText().trim());
    blendedVolumeStyle.setBboxCenterY(bboxCenterYTF.getText().trim());
    blendedVolumeStyle.setBboxCenterZ(bboxCenterZTF.getText().trim());
    blendedVolumeStyle.setBboxSizeX(bboxSizeXTF.getText().trim());
    blendedVolumeStyle.setBboxSizeY(bboxSizeYTF.getText().trim());
    blendedVolumeStyle.setBboxSizeZ(bboxSizeZTF.getText().trim());
    
    blendedVolumeStyle.setEnabled(Boolean.valueOf(enabledCB.isSelected()));
    blendedVolumeStyle.setWeightConstant1(weightConstant1TF.getText().trim());
    blendedVolumeStyle.setWeightConstant2(weightConstant2TF.getText().trim());
    blendedVolumeStyle.setWeightFunction1(weightFunction1ComboBox.getSelectedItem().toString().trim());
    blendedVolumeStyle.setWeightFunction2(weightFunction2ComboBox.getSelectedItem().toString().trim());
  }   
}
