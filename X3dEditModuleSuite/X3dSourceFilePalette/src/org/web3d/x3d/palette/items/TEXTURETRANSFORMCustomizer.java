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

import javax.swing.text.JTextComponent;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.HelpCtx;
import org.web3d.x3d.types.X3DPrimitiveTypes.SFDouble;
import static org.web3d.x3d.types.X3DPrimitiveTypes.radiansFormat;
import static org.web3d.x3d.types.X3DPrimitiveTypes.singleDigitFormat;

/**
 * TEXTURETRANSFORMCustomizer.java
 * Created on Sep 10, 2007, 3:05 PM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey
 * @version $Id$
 */
public class TEXTURETRANSFORMCustomizer extends BaseCustomizer
{
  private TEXTURETRANSFORM textureTransform;
  private JTextComponent target;
 
  public TEXTURETRANSFORMCustomizer(TEXTURETRANSFORM textureTransform, JTextComponent target)
  {
    super(textureTransform);
    this.textureTransform = textureTransform;
    this.target = target;
                           
    HelpCtx.setHelpIDString(this, "TEXTURETRANSFORM_ELEM_HELPID");   
    
    initComponents();
    
    center0TF.setText(textureTransform.getCenter0());
    center1TF.setText(textureTransform.getCenter1());
    rotationTF.setText(textureTransform.getRotation());
    translation0TF.setText(textureTransform.getTranslation0());
    translation1TF.setText(textureTransform.getTranslation1());
    scale0TF.setText(textureTransform.getScale0());
    scale1TF.setText(textureTransform.getScale1());
    
    checkAngles (false);
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        org.web3d.x3d.palette.items.DEFUSEpanel dEFUSEpanel1 = getDEFUSEpanel();
        sLabel = new javax.swing.JLabel();
        tLabel = new javax.swing.JLabel();
        centerLabel = new javax.swing.JLabel();
        center0TF = new javax.swing.JTextField();
        center1TF = new javax.swing.JTextField();
        centerNegateButton = new javax.swing.JButton();
        centerCenteredButton = new javax.swing.JButton();
        translationLab = new javax.swing.JLabel();
        translation0TF = new javax.swing.JTextField();
        translation1TF = new javax.swing.JTextField();
        translationNegateButton = new javax.swing.JButton();
        translationInvertSButton = new javax.swing.JButton();
        translationInvertTButton = new javax.swing.JButton();
        scaleLabel = new javax.swing.JLabel();
        scale0TF = new javax.swing.JTextField();
        scale1TF = new javax.swing.JTextField();
        scaleNegateButton = new javax.swing.JButton();
        scaleInvertButton = new javax.swing.JButton();
        rotationLabel = new javax.swing.JLabel();
        normalizeRotationValuesButton = new javax.swing.JButton();
        rotationTF = new javax.swing.JTextField();
        rotationNegateButton = new javax.swing.JButton();
        rotation90degreesButton = new javax.swing.JButton();
        spacerLabel = new javax.swing.JLabel();
        spacerLabel1 = new javax.swing.JLabel();
        nodeHintPanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        dEFUSEpanel1.setMinimumSize(new java.awt.Dimension(198, 77));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);

        sLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel.setText("s");
        sLabel.setToolTipText("s is horizontal coordinate, range [0..1]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(sLabel, gridBagConstraints);

        tLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tLabel.setText("t");
        tLabel.setToolTipText("t is vertical coordinate, range [0..1]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(tLabel, gridBagConstraints);

        centerLabel.setText("center");
        centerLabel.setToolTipText("center point in 2D (s,t) texture coordinates for rotation and ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(centerLabel, gridBagConstraints);

        center0TF.setColumns(5);
        center0TF.setToolTipText("center point in 2D (s,t) texture coordinates for rotation and scaling");
        center0TF.setMinimumSize(new java.awt.Dimension(60, 20));
        center0TF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(center0TF, gridBagConstraints);

        center1TF.setColumns(5);
        center1TF.setToolTipText("center point in 2D (s,t) texture coordinates for rotation and scaling");
        center1TF.setMinimumSize(new java.awt.Dimension(60, 20));
        center1TF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(center1TF, gridBagConstraints);

        centerNegateButton.setText("negate");
        centerNegateButton.setToolTipText("negate center coordinates");
        centerNegateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerNegateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(centerNegateButton, gridBagConstraints);

        centerCenteredButton.setText("center");
        centerCenteredButton.setToolTipText("set center coordinates to (0.5, 0.5)");
        centerCenteredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerCenteredButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(centerCenteredButton, gridBagConstraints);

        translationLab.setText("translation");
        translationLab.setToolTipText("Lateral/vertical shift in 2D (s,t) texture coordinates (opposite effect appears on geometry)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(translationLab, gridBagConstraints);

        translation0TF.setColumns(5);
        translation0TF.setToolTipText("Lateral/vertical shift in 2D (s,t) texture coordinates (opposite effect appears on geometry)");
        translation0TF.setMinimumSize(new java.awt.Dimension(60, 20));
        translation0TF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(translation0TF, gridBagConstraints);

        translation1TF.setColumns(5);
        translation1TF.setToolTipText("Lateral/vertical shift in 2D (s,t) texture coordinates (opposite effect appears on geometry)");
        translation1TF.setMinimumSize(new java.awt.Dimension(60, 20));
        translation1TF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(translation1TF, gridBagConstraints);

        translationNegateButton.setText("negate");
        translationNegateButton.setToolTipText("negate translation offset");
        translationNegateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translationNegateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(translationNegateButton, gridBagConstraints);

        translationInvertSButton.setText("invert s");
        translationInvertSButton.setToolTipText("invert s (horizontal, 1 - value)");
        translationInvertSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translationInvertSButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(translationInvertSButton, gridBagConstraints);

        translationInvertTButton.setText("invert t");
        translationInvertTButton.setToolTipText("invert t (vertical, 1 - value)");
        translationInvertTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translationInvertTButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(translationInvertTButton, gridBagConstraints);

        scaleLabel.setText("scale");
        scaleLabel.setToolTipText("Non-uniform planar scaling of texture about center (opposite effect appears on geometry)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(scaleLabel, gridBagConstraints);

        scale0TF.setColumns(5);
        scale0TF.setToolTipText("Non-uniform planar scaling of texture about center (opposite effect appears on geometry)");
        scale0TF.setMinimumSize(new java.awt.Dimension(60, 20));
        scale0TF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(scale0TF, gridBagConstraints);

        scale1TF.setColumns(5);
        scale1TF.setToolTipText("Non-uniform planar scaling of texture about center (opposite effect appears on geometry)");
        scale1TF.setMinimumSize(new java.awt.Dimension(60, 20));
        scale1TF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(scale1TF, gridBagConstraints);

        scaleNegateButton.setText("negate");
        scaleNegateButton.setToolTipText("negate scale factors");
        scaleNegateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleNegateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(scaleNegateButton, gridBagConstraints);

        scaleInvertButton.setText("invert");
        scaleInvertButton.setToolTipText("invert scale factors to reciprocal values");
        scaleInvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleInvertButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(scaleInvertButton, gridBagConstraints);

        rotationLabel.setText("rotation");
        rotationLabel.setToolTipText("single rotation angle of texture about center (opposite effect appears on geometry)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(rotationLabel, gridBagConstraints);

        normalizeRotationValuesButton.setText("normalize rotation");
        normalizeRotationValuesButton.setToolTipText("reset rotation angle [0..2pi)");
        normalizeRotationValuesButton.setMinimumSize(new java.awt.Dimension(60, 25));
        normalizeRotationValuesButton.setPreferredSize(new java.awt.Dimension(60, 25));
        normalizeRotationValuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalizeRotationValuesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(normalizeRotationValuesButton, gridBagConstraints);

        rotationTF.setColumns(5);
        rotationTF.setToolTipText("single rotation angle of texture about center (opposite effect appears on geometry)");
        rotationTF.setMinimumSize(new java.awt.Dimension(60, 20));
        rotationTF.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(rotationTF, gridBagConstraints);

        rotationNegateButton.setText("negate");
        rotationNegateButton.setToolTipText("negate rotation angle");
        rotationNegateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotationNegateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(rotationNegateButton, gridBagConstraints);

        rotation90degreesButton.setText("<html>rotate&nbsp;90&#176;");
        rotation90degreesButton.setToolTipText("<html>rotate rotation angle by adding &#960;/2 radians");
        rotation90degreesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotation90degreesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(rotation90degreesButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 40);
        add(spacerLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 40);
        add(spacerLabel1, gridBagConstraints);

        nodeHintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nodeHintPanel.setLayout(new java.awt.GridBagLayout());

        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText("<html><p align-\"center\"><b>TextureTransform</b> affects sibling Texture nodes.   Note that resulting <br /> visible effects appear reversed because image changes occur before mapping to geometry.<p>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        nodeHintPanel.add(descriptionLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 3, 3, 3);
        add(nodeHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void normalizeRotationValuesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_normalizeRotationValuesButtonActionPerformed
    {//GEN-HEADEREND:event_normalizeRotationValuesButtonActionPerformed
        checkAngles(true);
        double angle;

        angle = new SFDouble(rotationTF.getText()).getValue();
        if (angle == -0.0)
        {
            angle = 0.0;
        }
        while (angle < 0.0)
        {
            angle += 2.0 * Math.PI;
        }
        while (angle > 2.0 * Math.PI)
        {
            angle -= 2.0 * Math.PI;
        }
        rotationTF.setText(radiansFormat.format(angle));
        rotationTF.setToolTipText(radiansFormat.format(angle) + " radians = " + singleDigitFormat.format(angle * 180.0 / Math.PI) + " degrees");
}//GEN-LAST:event_normalizeRotationValuesButtonActionPerformed

    private void centerNegateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerNegateButtonActionPerformed
        center0TF.setText(center0TF.getText().trim());
        center1TF.setText(center1TF.getText().trim());
        if (center0TF.getText().length() == 0)
            center0TF.setText("0"); // default
        if (center1TF.getText().length() == 0)
            center1TF.setText("0"); // default
        
        if (center0TF.getText().startsWith("-"))
        {
            center0TF.setText("+" + center0TF.getText().substring(1));
        }
        else if (center0TF.getText().startsWith("+"))
        {
            center0TF.setText("-" + center0TF.getText().substring(1));
        }
        else
        {
            center0TF.setText("-" + center0TF.getText());
        }
        
        if (center1TF.getText().startsWith("-"))
        {
            center1TF.setText("+" + center1TF.getText().substring(1));
        }
        else if (center1TF.getText().startsWith("+"))
        {
            center1TF.setText("-" + center1TF.getText().substring(1));
        }
        else
        {
            center1TF.setText("-" + center1TF.getText());
        }
    }//GEN-LAST:event_centerNegateButtonActionPerformed

    private void translationNegateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translationNegateButtonActionPerformed
        translation0TF.setText(translation0TF.getText().trim());
        translation1TF.setText(translation1TF.getText().trim());
        if (translation0TF.getText().length() == 0)
            translation0TF.setText("0"); // default
        if (translation1TF.getText().length() == 0)
            translation1TF.setText("0"); // default
        
        if (translation0TF.getText().startsWith("-"))
        {
            translation0TF.setText("+" + translation0TF.getText().substring(1));
        }
        else if (translation0TF.getText().startsWith("+"))
        {
            translation0TF.setText("-" + translation0TF.getText().substring(1));
        }
        else
        {
            translation0TF.setText("-" + translation0TF.getText());
        }
        
        if (translation1TF.getText().startsWith("-"))
        {
            translation1TF.setText("+" + translation1TF.getText().substring(1));
        }
        else if (translation1TF.getText().startsWith("+"))
        {
            translation1TF.setText("-" + translation1TF.getText().substring(1));
        }
        else
        {
            translation1TF.setText("-" + translation1TF.getText());
        }
    }//GEN-LAST:event_translationNegateButtonActionPerformed

    private void rotationNegateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotationNegateButtonActionPerformed
        rotationTF.setText(rotationTF.getText().trim());
        if (rotationTF.getText().length() == 0)
            rotationTF.setText("0"); // default
        
        if (rotationTF.getText().startsWith("-"))
        {
            rotationTF.setText("+" + rotationTF.getText().substring(1));
        }
        else if (rotationTF.getText().startsWith("+"))
        {
            rotationTF.setText("-" + rotationTF.getText().substring(1));
        }
        else
        {
            rotationTF.setText("-" + rotationTF.getText());
        }
        checkAngles (false);
    }//GEN-LAST:event_rotationNegateButtonActionPerformed

    private void scaleInvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleInvertButtonActionPerformed
        scale0TF.setText(scale0TF.getText().trim());
        if (scale0TF.getText().length() == 0)
            scale0TF.setText("1"); // default
        scale1TF.setText(scale1TF.getText().trim());
        if (scale1TF.getText().length() == 0)
            scale1TF.setText("1"); // default
        
        if (scale0TF.getText().equals( "0") || scale0TF.getText().equals( "0.") || scale0TF.getText().equals( "0.0") ||
            scale0TF.getText().equals("-0") || scale0TF.getText().equals("-0.") || scale0TF.getText().equals("-0.0") ||
            scale0TF.getText().equals("+0") || scale0TF.getText().equals("+0.") || scale0TF.getText().equals("+0.0"))
        {
            scale0TF.setText("0"); // legal value, no action
        }
        else
        {
            Double inverse = (1.0 / Double.parseDouble(scale0TF.getText()));
            scale0TF.setText(inverse.toString());
        }
        
        if (scale1TF.getText().equals( "0") || scale1TF.getText().equals( "0.") || scale1TF.getText().equals( "0.0") ||
            scale1TF.getText().equals("-0") || scale1TF.getText().equals("-0.") || scale1TF.getText().equals("-0.0") ||
            scale1TF.getText().equals("+0") || scale1TF.getText().equals("+0.") || scale1TF.getText().equals("+0.0"))
        {
            scale1TF.setText("0"); // legal value, no action
        }
        else
        {
            Double inverse = (1.0 / Double.parseDouble(scale1TF.getText()));
            scale1TF.setText(inverse.toString());
        }
    }//GEN-LAST:event_scaleInvertButtonActionPerformed

    private void scaleNegateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleNegateButtonActionPerformed
        scale0TF.setText(scale0TF.getText().trim());
        scale1TF.setText(scale1TF.getText().trim());
        if (scale0TF.getText().length() == 0)
            scale0TF.setText("0"); // default
        if (scale1TF.getText().length() == 0)
            scale1TF.setText("0"); // default
        
        if (scale0TF.getText().startsWith("-"))
        {
            scale0TF.setText("+" + scale0TF.getText().substring(1));
        }
        else if (scale0TF.getText().startsWith("+"))
        {
            scale0TF.setText("-" + scale0TF.getText().substring(1));
        }
        else
        {
            scale0TF.setText("-" + scale0TF.getText());
        }
        
        if (scale1TF.getText().startsWith("-"))
        {
            scale1TF.setText("+" + scale1TF.getText().substring(1));
        }
        else if (scale1TF.getText().startsWith("+"))
        {
            scale1TF.setText("-" + scale1TF.getText().substring(1));
        }
        else
        {
            scale1TF.setText("-" + scale1TF.getText());
        }
    }//GEN-LAST:event_scaleNegateButtonActionPerformed

    private void rotation90degreesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotation90degreesButtonActionPerformed
        double rotationRadians = 90.0 * Math.PI / 180.0;
        rotationTF.setText(rotationTF.getText().trim());
        if (rotationTF.getText().length() == 0)
            rotationTF.setText(Double.toString(rotationRadians)); // default + rotation = 0 + 90 degrees
        else
        {
            double rotatedValue = Math.round((Double.parseDouble(rotationTF.getText()) + rotationRadians) * 1.0E6) / 1.0E6;
            
            rotationTF.setText(Double.toString(rotatedValue));
        }
        checkAngles (false);
    }//GEN-LAST:event_rotation90degreesButtonActionPerformed

    private void translationInvertSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translationInvertSButtonActionPerformed
        translation0TF.setText(translation0TF.getText().trim());
        translation1TF.setText(translation1TF.getText().trim());
        if (translation0TF.getText().length() == 0)
            translation0TF.setText("0"); // default
        if (translation1TF.getText().length() == 0)
            translation1TF.setText("0"); // default
        
        double value0 = Math.round((Double.parseDouble(translation0TF.getText())) * 1.0E6) / 1.0E6;
        // normalize [-1..1]
        while (value0 > 1.0)
        {
            value0 -= 1.0;
        }
        while (value0 < -1.0)
        {
            value0 += 1.0;
        }
        
        if (value0 >= 0.0)
        {
            translation0TF.setText(Double.toString( 1.0 - value0));
        }
        else // negative, so invert wrt -1
        {
            translation0TF.setText(Double.toString(-1.0 + value0));
        }
    }//GEN-LAST:event_translationInvertSButtonActionPerformed

    private void centerCenteredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerCenteredButtonActionPerformed
        center0TF.setText("0.5");
        center1TF.setText("0.5");
    }//GEN-LAST:event_centerCenteredButtonActionPerformed

    private void translationInvertTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translationInvertTButtonActionPerformed
        double value1 = Math.round((Double.parseDouble(translation1TF.getText())) * 1.0E6) / 1.0E6;
        // normalize [-1..1]
        while (value1 > 1.0)
        {
            value1 -= 1.0;
        }
        while (value1 < -1.0)
        {
            value1 += 1.0;
        }
        
        if (value1 >= 0.0)
        {
            translation1TF.setText(Double.toString( 1.0 - value1));
        }
        else // negative, so invert wrt -1
        {
            translation1TF.setText(Double.toString(-1.0 - value1));
        }
    }//GEN-LAST:event_translationInvertTButtonActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField center0TF;
    private javax.swing.JTextField center1TF;
    private javax.swing.JButton centerCenteredButton;
    private javax.swing.JLabel centerLabel;
    private javax.swing.JButton centerNegateButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel nodeHintPanel;
    private javax.swing.JButton normalizeRotationValuesButton;
    private javax.swing.JButton rotation90degreesButton;
    private javax.swing.JLabel rotationLabel;
    private javax.swing.JButton rotationNegateButton;
    private javax.swing.JTextField rotationTF;
    private javax.swing.JLabel sLabel;
    private javax.swing.JTextField scale0TF;
    private javax.swing.JTextField scale1TF;
    private javax.swing.JButton scaleInvertButton;
    private javax.swing.JLabel scaleLabel;
    private javax.swing.JButton scaleNegateButton;
    private javax.swing.JLabel spacerLabel;
    private javax.swing.JLabel spacerLabel1;
    private javax.swing.JLabel tLabel;
    private javax.swing.JTextField translation0TF;
    private javax.swing.JTextField translation1TF;
    private javax.swing.JButton translationInvertSButton;
    private javax.swing.JButton translationInvertTButton;
    private javax.swing.JLabel translationLab;
    private javax.swing.JButton translationNegateButton;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_TEXTURETRANSFORM";
  }

    public final void checkAngles(boolean precedesNormalization)
  {
      // indicate degree values in tooltips
      // usability note:  can enter degree values (-6..+6) as (354..366) to provoke this conversion check
      double angle = new SFDouble(rotationTF.getText()).getValue();
      rotationTF.setToolTipText(radiansFormat.format(angle) + " radians = " + singleDigitFormat.format(angle * 180.0 / Math.PI) + " degrees");
      if (Math.abs(angle) > 2.0 * Math.PI)
      {
            String message;
            message = "<html><center>Large value provided for <b>rotation</b> angle, which is a radians value.<br/><br/>Convert <b>" + angle + " degrees</b> to <b>" +
                    radiansFormat.format((angle % 360.0) * Math.PI / 180.0) + " radians</b>";
            if (precedesNormalization)
                 message += " before normalization?";
            else message += "?";
          NotifyDescriptor descriptor = new NotifyDescriptor.Confirmation(
                  message, "X3D angles are in radians", NotifyDescriptor.YES_NO_OPTION);
          if (DialogDisplayer.getDefault().notify(descriptor) == NotifyDescriptor.YES_OPTION)
          {
              angle = (angle % 360.0) * Math.PI / 180.0;
              rotationTF.setText(radiansFormat.format(angle));
              rotationTF.setToolTipText(radiansFormat.format(angle) + " radians = " + singleDigitFormat.format(angle * 180.0 / Math.PI) + " degrees");
          }
      }
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    checkAngles (false);
    unLoadDEFUSE();
    
    if (center0TF.getText().equals("-0") || center0TF.getText().equals("-0.") || center0TF.getText().equals("-0.0") ||
        center0TF.getText().equals("+0") || center0TF.getText().equals("+0.") || center0TF.getText().equals("+0.0"))
        center0TF.setText("0");
    if (center1TF.getText().equals("-0") || center1TF.getText().equals("-0.") || center1TF.getText().equals("-0.0") ||
        center1TF.getText().equals("+0") || center1TF.getText().equals("+0.") || center1TF.getText().equals("+0.0"))
        center1TF.setText("0");
    if (translation0TF.getText().equals("-0") || translation0TF.getText().equals("-0.") || translation0TF.getText().equals("-0.0") ||
        translation0TF.getText().equals("+0") || translation0TF.getText().equals("+0.") || translation0TF.getText().equals("+0.0"))
        translation0TF.setText("0");
    if (translation1TF.getText().equals("-0") || translation1TF.getText().equals("-0.") || translation1TF.getText().equals("-0.0") ||
        translation1TF.getText().equals("+0") || translation1TF.getText().equals("+0.") || translation1TF.getText().equals("+0.0"))
        translation1TF.setText("0");
    if (scale0TF.getText().equals( "1") || scale0TF.getText().equals( "1.") || scale0TF.getText().equals( "1.0") ||
        scale0TF.getText().equals("+1") || scale0TF.getText().equals("+1.") || scale0TF.getText().equals("+1.0"))
        scale0TF.setText("1");
    if (scale1TF.getText().equals( "1") || scale1TF.getText().equals( "1.") || scale1TF.getText().equals( "1.0") ||
        scale1TF.getText().equals("+1") || scale1TF.getText().equals("+1.") || scale1TF.getText().equals("+1.0"))
        scale1TF.setText("1");
    if (rotationTF.getText().equals("-0") || rotationTF.getText().equals("-0.") || rotationTF.getText().equals("-0.0") ||
        rotationTF.getText().equals("+0") || rotationTF.getText().equals("+0.") || rotationTF.getText().equals("+0.0"))
        rotationTF.setText("0");
    
    textureTransform.setCenter0(center0TF.getText().trim());
    textureTransform.setCenter1(center1TF.getText().trim());
    textureTransform.setTranslation0(translation0TF.getText().trim());
    textureTransform.setTranslation1(translation1TF.getText().trim());
    textureTransform.setScale0(scale0TF.getText().trim());
    textureTransform.setScale1(scale1TF.getText().trim());
    textureTransform.setRotation(rotationTF.getText().trim());   
  }  
}
