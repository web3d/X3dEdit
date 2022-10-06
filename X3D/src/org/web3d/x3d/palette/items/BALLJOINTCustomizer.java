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

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import org.openide.util.HelpCtx;

/**
 * BALLJOINTCustomizer.java
 * Created on August 16, 2007, 10:49 AM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey
 * @version $Id$
 */
public class BALLJOINTCustomizer extends BaseCustomizer
{
  private BALLJOINT ballJoint;
  private JTextComponent target;
  
  /** Creates new form BALLJOINTCustomizer */
  public BALLJOINTCustomizer(BALLJOINT ballJoint, JTextComponent target)
  {
    super(ballJoint);
    this.ballJoint = ballJoint;
    this.target = target;
                              
    HelpCtx.setHelpIDString(this, "BALLJOINT_ELEM_HELPID");   
    
    initComponents();
    
    String textValue = ballJoint.getUnformattedForceOutput();
    if (textValue.startsWith("'") && textValue.endsWith("'") && (textValue.length() > 1))
         forceOutputTA.setText(textValue.substring(1, textValue.length()-2));
    else forceOutputTA.setText(textValue);
    
    anchorPointXTF.setText(ballJoint.getAnchorPointX());
    anchorPointYTF.setText(ballJoint.getAnchorPointY());
    anchorPointZTF.setText(ballJoint.getAnchorPointZ());
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
    jLabel1 = new JLabel();
    jScrollPane1 = new JScrollPane();
    forceOutputTA = new JTextArea();
    jLabel2 = new JLabel();
    anchorPointXTF = new JTextField();
    anchorPointYTF = new JTextField();
    anchorPointZTF = new JTextField();

    setLayout(new GridBagLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(dEFUSEpanel1, gridBagConstraints);

    jLabel1.setHorizontalAlignment(SwingConstants.TRAILING);
    jLabel1.setText("forceOutput");
    jLabel1.setToolTipText("output fields generated for next frame: ALL, NONE, or exact names of output fields");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = GridBagConstraints.EAST;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(jLabel1, gridBagConstraints);

    jScrollPane1.setToolTipText("output fields generated for next frame: ALL, NONE, or exact names of output fields");

    forceOutputTA.setColumns(20);
    forceOutputTA.setRows(4);
    forceOutputTA.setToolTipText("output fields generated for next frame: ALL, NONE, or exact names of output fields");
    jScrollPane1.setViewportView(forceOutputTA);

    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(jScrollPane1, gridBagConstraints);

    jLabel2.setHorizontalAlignment(SwingConstants.TRAILING);
    jLabel2.setText("anchorPoint");
    jLabel2.setToolTipText("joint center, specified in world coordinates");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = GridBagConstraints.EAST;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(jLabel2, gridBagConstraints);

    anchorPointXTF.setToolTipText("joint center, specified in world coordinates");
    anchorPointXTF.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        anchorPointXTFActionPerformed(evt);
      }
    });
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 0.3333;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(anchorPointXTF, gridBagConstraints);

    anchorPointYTF.setToolTipText("joint center, specified in world coordinates");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 0.3333;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(anchorPointYTF, gridBagConstraints);

    anchorPointZTF.setToolTipText("joint center, specified in world coordinates");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 0.3333;
    gridBagConstraints.insets = new Insets(3, 3, 3, 3);
    add(anchorPointZTF, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

private void anchorPointXTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anchorPointXTFActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_anchorPointXTFActionPerformed
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private JTextField anchorPointXTF;
  private JTextField anchorPointYTF;
  private JTextField anchorPointZTF;
  private DEFUSEpanel dEFUSEpanel1;
  private JTextArea forceOutputTA;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
 
  public String getNameKey()
  {
    return "NAME_X3D_BALLJOINT";
  }

  public void unloadInput() throws IllegalArgumentException
  {
    ballJoint.setForceOutput(forceOutputTA.getText().trim()); // TODO handle array
    
    ballJoint.setAnchorPointX(anchorPointXTF.getText().trim());
    ballJoint.setAnchorPointY(anchorPointYTF.getText().trim());
    ballJoint.setAnchorPointZ(anchorPointZTF.getText().trim());
  }
  
 
}
