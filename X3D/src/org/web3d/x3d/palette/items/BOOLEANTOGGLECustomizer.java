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
import org.openide.util.HelpCtx;

/**
 * BOOLEANTOGGLECustomizer.java
 * Created on Sep 10, 2007, 3:05 PM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey, Don Brutzman
 * @version $Id$
 */
public class BOOLEANTOGGLECustomizer extends BaseCustomizer
{
  private BOOLEANTOGGLE booleanToggle;
  private JTextComponent target;
 
  public BOOLEANTOGGLECustomizer(BOOLEANTOGGLE booleanToggle, JTextComponent target)
  {
    super(booleanToggle);
    this.booleanToggle = booleanToggle;
    this.target = target;
          
    HelpCtx.setHelpIDString(this, "BOOLEANTOGGLE_ELEM_HELPID");
    
    initComponents();
    
    toggleCB.setSelected(booleanToggle.isToggle());
    
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
        toggleCB = new javax.swing.JCheckBox();
        fieldEventDiagramLabel = new javax.swing.JLabel();
        eventHintPanel = new javax.swing.JPanel();
        eventLabel = new javax.swing.JLabel();

        setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);

        toggleCB.setText("toggle ");
        toggleCB.setToolTipText("Persistent state value that gets toggled or reset");
        toggleCB.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        toggleCB.setMargin(new java.awt.Insets(0, 0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(toggleCB, gridBagConstraints);

        fieldEventDiagramLabel.setBackground(new java.awt.Color(255, 255, 255));
        fieldEventDiagramLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fieldEventDiagramLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/web3d/x3d/palette/items/resources/BooleanToggleFieldEvents.png"))); // NOI18N
        fieldEventDiagramLabel.setToolTipText("Create ROUTEs to connect input and output events");
        fieldEventDiagramLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(fieldEventDiagramLabel, gridBagConstraints);

        eventHintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eventHintPanel.setToolTipText("Create ROUTEs to connect input and output events");
        eventHintPanel.setLayout(new java.awt.GridBagLayout());

        eventLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventLabel.setText(org.openide.util.NbBundle.getMessage(BOOLEANTOGGLECustomizer.class, "BOOLEANTOGGLECustomizer.eventLabel1.text")); // NOI18N
        eventLabel.setToolTipText("Create ROUTEs to connect input and output events");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        eventHintPanel.add(eventLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(eventHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eventHintPanel;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JLabel fieldEventDiagramLabel;
    private javax.swing.JCheckBox toggleCB;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_BOOLEANTOGGLE";
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    unLoadDEFUSE();
    
    booleanToggle.setToggle(toggleCB.isSelected());
  }
}
