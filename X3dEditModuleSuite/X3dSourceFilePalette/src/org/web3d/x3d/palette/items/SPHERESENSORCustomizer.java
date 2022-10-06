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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.HelpCtx;
import static org.web3d.x3d.types.X3DPrimitiveTypes.*;

/**
 * SPHERESENSORCustomizer.java
 * Created on Sep 15, 2007, 2:25 PM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey
 * @version $Id$
 */
public class SPHERESENSORCustomizer extends BaseCustomizer
{
  private SPHERESENSOR sphereSensor;
  private JTextComponent target;
  
  /** Creates new form SPHERESENSORCustomizer */
  public SPHERESENSORCustomizer(SPHERESENSOR sphereSensor, JTextComponent target)
  {
    super(sphereSensor);
    this.sphereSensor = sphereSensor;
    this.target = target;
                               
    HelpCtx.setHelpIDString(this, "SPHERESENSOR_ELEM_HELPID");
    
    initComponents();

    enabledCB.setSelected(sphereSensor.isEnabled());
    descriptionTA.setText(sphereSensor.getDescription());
    offsetXTF.setText(sphereSensor.getOffsetX());
    offsetYTF.setText(sphereSensor.getOffsetY());
    offsetZTF.setText(sphereSensor.getOffsetZ());
    offsetAngleTF.setText(sphereSensor.getOffsetAngle());
    autoOffsetCB.setSelected(sphereSensor.isAutoOffset());

    checkOffsetAngle(false);
 }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        dEFUSEpanel1 = getDEFUSEpanel();
        descriptionLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        descriptionTA = new JTextArea();
        enabledLabel = new JLabel();
        enabledCB = new JCheckBox();
        autoOffsetLabel = new JLabel();
        autoOffsetCB = new JCheckBox();
        offsetLabel = new JLabel();
        offsetXTF = new JTextField();
        offsetYTF = new JTextField();
        offsetZTF = new JTextField();
        offsetAngleTF = new JTextField();
        normalizeOffsetRotationValuesButton = new JButton();
        eventHintPanel = new JPanel();
        eventsLabel = new JLabel();

        setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);

        descriptionLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        descriptionLabel.setText("description");
        descriptionLabel.setToolTipText("User description of sensor action");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(descriptionLabel, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new Dimension(60, 24));
        jScrollPane1.setPreferredSize(new Dimension(80, 24));

        descriptionTA.setColumns(20);
        descriptionTA.setLineWrap(true);
        descriptionTA.setRows(3);
        descriptionTA.setToolTipText("User description of sensor action");
        descriptionTA.setWrapStyleWord(true);
        descriptionTA.setMaximumSize(new Dimension(80, 22));
        descriptionTA.setMinimumSize(new Dimension(80, 22));
        descriptionTA.setPreferredSize(new Dimension(80, 58));
        jScrollPane1.setViewportView(descriptionTA);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(jScrollPane1, gridBagConstraints);

        enabledLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        enabledLabel.setText("enabled");
        enabledLabel.setToolTipText("Enable/disable node operation");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(enabledLabel, gridBagConstraints);

        enabledCB.setToolTipText("Enable/disable node operation");
        enabledCB.setMargin(new Insets(0, 0, 0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(enabledCB, gridBagConstraints);

        autoOffsetLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        autoOffsetLabel.setText("autoOffset");
        autoOffsetLabel.setToolTipText("whether previous offset values are remembered/accumulated");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(autoOffsetLabel, gridBagConstraints);

        autoOffsetCB.setToolTipText("whether previous offset values are remembered/accumulated");
        autoOffsetCB.setMargin(new Insets(0, 0, 0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(autoOffsetCB, gridBagConstraints);

        offsetLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        offsetLabel.setText("offset");
        offsetLabel.setToolTipText("Remembers last rotation value sensed and sends event");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(offsetLabel, gridBagConstraints);

        offsetXTF.setToolTipText("Remembers last rotation value sensed and sends event");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(offsetXTF, gridBagConstraints);

        offsetYTF.setToolTipText("Remembers last rotation value sensed and sends event");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(offsetYTF, gridBagConstraints);

        offsetZTF.setToolTipText("Remembers last rotation value sensed and sends event");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(offsetZTF, gridBagConstraints);

        offsetAngleTF.setToolTipText("Remembers last rotation value sensed and sends event");
        offsetAngleTF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                offsetAngleTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(offsetAngleTF, gridBagConstraints);

        normalizeOffsetRotationValuesButton.setText("normalize offset rotation values");
        normalizeOffsetRotationValuesButton.setToolTipText("reset all angles [0..2pi)");
        normalizeOffsetRotationValuesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                normalizeOffsetRotationValuesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(normalizeOffsetRotationValuesButton, gridBagConstraints);

        eventHintPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        eventHintPanel.setLayout(new GridBagLayout());

        eventsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        eventsLabel.setText("<html>Output events include <b>isActive</b>, <b>isOver</b>, <b>rotation_changed</b>, <b>translation_changed</b>");
        eventsLabel.setToolTipText("Create a ROUTE to connect output events");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        eventHintPanel.add(eventsLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(3, 3, 0, 3);
        add(eventHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void normalizeOffsetRotationValuesButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_normalizeOffsetRotationValuesButtonActionPerformed

        double x = new SFDouble(offsetXTF.getText()).getValue();
        double y = new SFDouble(offsetYTF.getText()).getValue();
        double z = new SFDouble(offsetZTF.getText()).getValue();
        double normalizationFactor = Math.sqrt(x * x + y * y + z * z);
        if (normalizationFactor == 0.0)
        {
            NotifyDescriptor descriptor = new NotifyDescriptor.Message(
                    "Found zero-magnitude axis for offset rotation, reset to 0 1 0", NotifyDescriptor.WARNING_MESSAGE);
            DialogDisplayer.getDefault().notify(descriptor);
            offsetXTF.setText("0");
            offsetYTF.setText("1");
            offsetZTF.setText("0");
        }
        else
        {
            offsetXTF.setText(fiveDigitFormat.format(x / normalizationFactor));
            offsetYTF.setText(fiveDigitFormat.format(y / normalizationFactor));
            offsetZTF.setText(fiveDigitFormat.format(z / normalizationFactor));
        }

        double angle;
        checkOffsetAngle(true);

        angle = new SFDouble(offsetAngleTF.getText()).getValue();
        if (angle == -0.0) {
            angle = 0.0;
        }
        while (angle < 0.0) {
            angle += 2.0 * Math.PI;
        }
        while (angle > 2.0 * Math.PI) {
            angle -= 2.0 * Math.PI;
        }
        offsetAngleTF.setText(radiansFormat.format(angle));
        offsetAngleTF.setToolTipText(radiansFormat.format(angle) + " radians = " + singleDigitFormat.format(angle * 180.0 / Math.PI) + " degrees");
  }

  private void checkOffsetAngle(boolean precedesNormalization)
  {
      // indicate degree values in tooltips
      // usability note:  can enter degree values (-6..+6) as (354..366) to provoke this conversion check
      double angle = new SFDouble(offsetAngleTF.getText()).getValue();
      offsetAngleTF.setToolTipText(radiansFormat.format(angle) + " radians = " + singleDigitFormat.format(angle * 180.0 / Math.PI) + " degrees");
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
              offsetAngleTF.setText(radiansFormat.format(angle));
              offsetAngleTF.setToolTipText(radiansFormat.format(angle) + " radians = " + singleDigitFormat.format(angle * 180.0 / Math.PI) + " degrees");
          }
      }
}//GEN-LAST:event_normalizeOffsetRotationValuesButtonActionPerformed

  private void offsetAngleTFActionPerformed(ActionEvent evt) {//GEN-FIRST:event_offsetAngleTFActionPerformed
      checkOffsetAngle(false);
  }//GEN-LAST:event_offsetAngleTFActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCheckBox autoOffsetCB;
    private JLabel autoOffsetLabel;
    private DEFUSEpanel dEFUSEpanel1;
    private JLabel descriptionLabel;
    private JTextArea descriptionTA;
    private JCheckBox enabledCB;
    private JLabel enabledLabel;
    private JPanel eventHintPanel;
    private JLabel eventsLabel;
    private JScrollPane jScrollPane1;
    private JButton normalizeOffsetRotationValuesButton;
    private JTextField offsetAngleTF;
    private JLabel offsetLabel;
    private JTextField offsetXTF;
    private JTextField offsetYTF;
    private JTextField offsetZTF;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_SPHERESENSOR";
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    checkOffsetAngle(false);
    unLoadDEFUSE();
         
    sphereSensor.setEnabled(enabledCB.isSelected());
    sphereSensor.setDescription(descriptionTA.getText().trim());
    sphereSensor.setOffsetX(offsetXTF.getText().trim());
    sphereSensor.setOffsetY(offsetYTF.getText().trim());
    sphereSensor.setOffsetZ(offsetZTF.getText().trim());
    sphereSensor.setOffsetAngle(offsetAngleTF.getText().trim());
    sphereSensor.setAutoOffset(autoOffsetCB.isSelected());


  }  
}
