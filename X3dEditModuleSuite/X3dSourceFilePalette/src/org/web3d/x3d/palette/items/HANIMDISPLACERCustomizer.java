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
import org.openide.util.NbBundle;
import static org.web3d.x3d.types.X3DSchemaData.*;

/**
 * HANIMDISPLACERCustomizer.java
 * Created on 2 May 2008
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey and Don Brutzman
 * @version $Id$
 */
public class HANIMDISPLACERCustomizer extends BaseCustomizer
{
  private HANIMDISPLACER hAnimDisplacer;
  private JTextComponent target;
  
  /** Creates new form HANIMDISPLACERCustomizer
     * @param displacer data of interest
     * @param target Swing component of interest */
  public HANIMDISPLACERCustomizer(HANIMDISPLACER displacer, JTextComponent target)
  {
    super(displacer);
    hAnimDisplacer = displacer;
    this.target = target;
    
    HelpCtx.setHelpIDString(this, "HANIMDISPLACER_ELEM_HELPID");
    
    initComponents();
    
    super.getDEFUSEpanel().setContainerFieldChoices(HANIMDISPLACER_CONTAINERFIELD_CHOICES, HANIMDISPLACER_CONTAINERFIELD_TOOLTIPS);
    // DEFUSEpanel initialization must NOT be repeated or else array of choices will be overwritten
    
    nameComboBox.setSelectedItem(hAnimDisplacer.getName());
    coordIndexTF.setText    (hAnimDisplacer.getCoordIndex());
    displacementsTF.setText (hAnimDisplacer.getDisplacements());
    weightTF.setText        (hAnimDisplacer.getWeight());

    setDefaultDEFname ();
  }
  private void setDefaultDEFname ()
  {
    super.getDEFUSEpanel().setDefaultDEFname(NbBundle.getMessage(getClass(),getNameKey()) + nameComboBox.getSelectedItem().toString());

  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        nameComboBox = new javax.swing.JComboBox<>();
        coordIndexTF = new javax.swing.JTextField();
        displacementsTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        org.web3d.x3d.palette.items.DEFUSEpanel dEFUSEpanel1 = getDEFUSEpanel();
        weightTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nodeHintPanel = new javax.swing.JPanel();
        hintLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(620, 258));
        setPreferredSize(new java.awt.Dimension(660, 270));
        setLayout(new java.awt.GridBagLayout());

        nameComboBox.setEditable(true);
        nameComboBox.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        nameComboBox.setModel(new DefaultComboBoxModel<String>(HANIMDISPLACER_NAME_FEATUREPOINT_CHOICES));
        nameComboBox.setToolTipText("select HAminDisplacer name");
        nameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(nameComboBox, gridBagConstraints);

        coordIndexTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordIndexTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(coordIndexTF, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(displacementsTF, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("name");
        jLabel1.setToolTipText("Unique name attribute must be defined so that HAnimDisplacer node can be identified at runtime for animation purposes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jLabel1, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("coordIndex");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("displacements");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(weightTF, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("weight");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jLabel4, gridBagConstraints);

        nodeHintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nodeHintPanel.setLayout(new java.awt.GridBagLayout());

        hintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintLabel.setText("<html><b>HAnimDisplacer</b>  provides animation values to alter the shape of individual HAnimSegment nodes. ");
        hintLabel.setToolTipText("HAnimDisplacer can be used for a variety of animation techniques");
        hintLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        nodeHintPanel.add(hintLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(nodeHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void coordIndexTFActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_coordIndexTFActionPerformed
    {//GEN-HEADEREND:event_coordIndexTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_coordIndexTFActionPerformed

    private void nameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameComboBoxActionPerformed
        setDefaultDEFname ();
    }//GEN-LAST:event_nameComboBoxActionPerformed

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_HANIMDISPLACER";
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    unLoadDEFUSE();
    String enumerationName;
    if (nameComboBox.getSelectedIndex() >= 0) // chosen from combo box
    {
         enumerationName = nameComboBox.getSelectedItem().toString().substring(3).trim(); // omit index
         enumerationName = enumerationName.substring(0,enumerationName.indexOf(" ")).trim();     // omit full name
    }
    else enumerationName = nameComboBox.getSelectedItem().toString().trim(); // user provided
    
    hAnimDisplacer.setName(enumerationName);
    hAnimDisplacer.setCoordIndex(coordIndexTF.getText().trim());
    hAnimDisplacer.setDisplacements(displacementsTF.getText().trim());
    if (HANIMDISPLACER_ATTR_WEIGHT_REQD || 
            !((weightTF.getText().trim().compareTo("0") == 0) || (weightTF.getText().trim().compareTo("0.0") == 0)))
        hAnimDisplacer.setWeight(weightTF.getText().trim());
  }
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField coordIndexTF;
    private javax.swing.JTextField displacementsTF;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> nameComboBox;
    private javax.swing.JPanel nodeHintPanel;
    private javax.swing.JTextField weightTF;
    // End of variables declaration//GEN-END:variables
  
}
