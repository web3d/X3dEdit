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
import javax.swing.text.JTextComponent;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.HelpCtx;
import static org.web3d.x3d.types.X3DPrimitiveTypes.*;

/**
 * CLIPPLANECustomizer.java
 * Created on March 14, 2007, 9:57 AM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey
 * @version $Id$
 */
public class CLIPPLANECustomizer extends BaseCustomizer
{
  private CLIPPLANE clipPlane;
  private JTextComponent target;
  
  /** Creates new form CLIPPLANECustomizer */
  public CLIPPLANECustomizer(CLIPPLANE collision, JTextComponent target)
  {
    super(collision);
    this.clipPlane = collision;
    this.target = target;
    
    HelpCtx.setHelpIDString(CLIPPLANECustomizer.this, "CLIPPLANE_ELEM_HELPID");

    collision.setVisualizationSelectionAvailable(true); // must precede initComponents() interface initialization
    collision.setVisualizationTooltip("Add wireframe to show ClipPlane (if defined)");
    
    initComponents();
    
    enabledCB.setSelected(collision.isEnabled());
    plane0TF.setText(collision.getPlane0()); // TODO trim decimal places?
    plane1TF.setText(collision.getPlane1());
    plane2TF.setText(collision.getPlane2());
    plane3TF.setText(collision.getPlane3());
    normalize (false); // only check for zero vector

    checkVisualizable ();
  }

    private void checkVisualizable ()
    {
      enableAppendVisualizationCB(true); // TODO add visualization
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
        enabledLabel = new javax.swing.JLabel();
        enabledCB = new javax.swing.JCheckBox();
        planeLabel = new javax.swing.JLabel();
        plane0TF = new javax.swing.JTextField();
        plane1TF = new javax.swing.JTextField();
        plane2TF = new javax.swing.JTextField();
        plane3TF = new javax.swing.JTextField();
        normalizePlaneVectorButton = new javax.swing.JButton();
        negatePlaneVectorButton = new javax.swing.JButton();
        hintLabel = new javax.swing.JLabel();

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
        enabledLabel.setToolTipText("enables/disables collision detection for children and all descendants");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 3, 3);
        add(enabledLabel, gridBagConstraints);

        enabledCB.setToolTipText("enables/disables collision detection for children and all descendants");
        enabledCB.setMargin(new java.awt.Insets(0, 0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(enabledCB, gridBagConstraints);

        planeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        planeLabel.setText("plane");
        planeLabel.setToolTipText("four-component plane equation that describes both inside and outside half space");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 3, 3);
        add(planeLabel, gridBagConstraints);

        plane0TF.setToolTipText("a for normal vector, distance (a b c d)");
        plane0TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plane0TFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(plane0TF, gridBagConstraints);

        plane1TF.setToolTipText("b for normal vector, distance (a b c d)");
        plane1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plane1TFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(plane1TF, gridBagConstraints);

        plane2TF.setToolTipText("c for normal vector, distance (a b c d)");
        plane2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plane2TFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(plane2TF, gridBagConstraints);

        plane3TF.setToolTipText("d for normal vector, distance (a b c d)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(plane3TF, gridBagConstraints);

        normalizePlaneVectorButton.setText("normalize plane vector");
        normalizePlaneVectorButton.setToolTipText("scale (a,b,c) values to unit vector");
        normalizePlaneVectorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalizePlaneVectorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(normalizePlaneVectorButton, gridBagConstraints);

        negatePlaneVectorButton.setText("negate");
        negatePlaneVectorButton.setToolTipText("negate all plane values (a,b,c,d) to reverse which side of plane has visibility clipped");
        negatePlaneVectorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negatePlaneVectorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(negatePlaneVectorButton, gridBagConstraints);

        hintLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        hintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintLabel.setText("<html>  <p align=\"center\"><b>ClipPlane</b> defines a single plane equation used to clip (meaning cull or hide) displayed peer/child geometry.</p>  <p align=\"center\">The single-sided half-plane is defined by an offset (a,b,c) vector with offset distance d from origin.</p>  <p align=\"center\">Hint: negate all plane values to reverse which side of the plane has visibility and which side is clipped.</p>");
        hintLabel.setToolTipText("ClipPlane has no child nodes");
        hintLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(hintLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void normalizePlaneVectorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalizePlaneVectorButtonActionPerformed
        normalize (true);
    }//GEN-LAST:event_normalizePlaneVectorButtonActionPerformed

    private void plane0TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plane0TFActionPerformed
        normalize (false);
    }//GEN-LAST:event_plane0TFActionPerformed

    private void plane1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plane1TFActionPerformed
        normalize (false);
    }//GEN-LAST:event_plane1TFActionPerformed

    private void plane2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plane2TFActionPerformed
        normalize (false);
    }//GEN-LAST:event_plane2TFActionPerformed

    private void negatePlaneVectorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negatePlaneVectorButtonActionPerformed
        float a, b, c, d;

        a = new SFFloat( plane0TF.getText()).getValue();
        b = new SFFloat( plane1TF.getText()).getValue();
        c = new SFFloat( plane2TF.getText()).getValue();
        d = new SFFloat( plane3TF.getText()).getValue();
        if (a != 0.0) plane0TF.setText(Float.toString(-a));
        if (b != 0.0) plane1TF.setText(Float.toString(-b));
        if (c != 0.0) plane2TF.setText(Float.toString(-c));
        if (d != 0.0) plane3TF.setText(Float.toString(-d));
    }//GEN-LAST:event_negatePlaneVectorButtonActionPerformed
  
    /**
     * Normalize plane vector a b c
     * @param changeValues if false then only check to fix zero vector and avoid changing a b c values; otherwise OK to change
     */
    private void normalize (boolean changeValues)
    {
        double normalizationFactor, x, y, z;

        x = new SFFloat( plane0TF.getText()).getValue();
        y = new SFFloat( plane1TF.getText()).getValue();
        z = new SFFloat( plane2TF.getText()).getValue();
        normalizationFactor = Math.sqrt(x * x + y * y + z * z);
        if (normalizationFactor == 0.0)
        {
             NotifyDescriptor descriptor = new NotifyDescriptor.Message(
                "Found zero-magnitude axis for plane vector, reset to 0 1 0", NotifyDescriptor.WARNING_MESSAGE);
             DialogDisplayer.getDefault().notify(descriptor);
             plane0TF.setText("0");
             plane1TF.setText("1");
             plane2TF.setText("0");
             normalizationFactor = 1.0;
        }
        else if (changeValues && (normalizationFactor != 1.0))
        {
             plane0TF.setText(fiveDigitFormat.format(x / normalizationFactor));
             plane1TF.setText(fiveDigitFormat.format(y / normalizationFactor));
             plane2TF.setText(fiveDigitFormat.format(z / normalizationFactor));
             normalizationFactor = 1.0;
        }
        if (normalizationFactor != 1.0)
        {
             normalizePlaneVectorButton.setForeground(Color.red);
//             normalizePlaneVectorButton.repaint();
        }
        else if ((normalizePlaneVectorButton.getForeground().getRed()   != 0) ||
                 (normalizePlaneVectorButton.getForeground().getGreen() != 0) ||
                 (normalizePlaneVectorButton.getForeground().getBlue()  != 0))
        {
             normalizePlaneVectorButton.setForeground(Color.black);
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox enabledCB;
    private javax.swing.JLabel enabledLabel;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JButton negatePlaneVectorButton;
    private javax.swing.JButton normalizePlaneVectorButton;
    private javax.swing.JTextField plane0TF;
    private javax.swing.JTextField plane1TF;
    private javax.swing.JTextField plane2TF;
    private javax.swing.JTextField plane3TF;
    private javax.swing.JLabel planeLabel;
    // End of variables declaration//GEN-END:variables
 
  @Override
  public String getNameKey()
  {
    return "NAME_X3D_CLIPPLANE";
  }

  @Override
  public void unloadInput()
  {
    unLoadDEFUSE();
    normalize (false); // only check for zero vector
    
    clipPlane.setEnabled(enabledCB.isSelected());
    clipPlane.setPlane(plane0TF.getText().trim(), plane1TF.getText().trim(), plane2TF.getText().trim(), plane3TF.getText().trim());
  }
  
}
