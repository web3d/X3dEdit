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

import static org.web3d.x3d.types.X3DSchemaData.*;
/**
 * POSITIONINTERPOLATOR2DCustomizer.java
 * Created on Sep 11, 2007, 3:05 PM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey, Don Brutzman
 * @version $Id$
 */
public class POSITIONINTERPOLATOR2DCustomizer extends BaseCustomizer
{
  private POSITIONINTERPOLATOR2D pi2D;
  private JTextComponent target;
  
  public POSITIONINTERPOLATOR2DCustomizer(POSITIONINTERPOLATOR2D pi2D, JTextComponent target)
  {
    super(pi2D);
    this.pi2D = pi2D;
    this.target = target;
                   
    HelpCtx.setHelpIDString(this, "POSITIONINTERPOLATOR2D_ELEM_HELPID");
    
    initComponents();

    expandableList1.setTitle("key, keyValue arrays");
    expandableList1.setColumnTitles  (new String[]{"#","key","x","y"});
    expandableList1.setColumnToolTips(new String[]{"index","key fraction input","keyValue output x","keyValue output y"});
    expandableList1.setHeaderTooltip ("Interpolator key/keyValue pairs define the output function");
    expandableList1.setNewRowData(new Object[]{"0","0","0"});  //  key=0, values 0
    expandableList1.doIndexInFirstColumn(true);
    expandableList1.setBoldColumn(1);

    expandableList1.setShowAppendCommasLineBreaks(true);
    expandableList1.setKeyColumnIncluded(true);
    expandableList1.setInsertCommas    (pi2D.isInsertCommas());
    expandableList1.setInsertLineBreaks(pi2D.isInsertLineBreaks());
    expandableList1.setColumnWidthAndResizeStrategy(false, 75);
    
    String[][] saa = pi2D.getKeysAndValues(); // may be 0-length
    expandableList1.setData(saa);
    
    expandableList1.setGeneratePointsDescriptions(COORDINATE2D_ATTR_POINT_DESCRIPTIONS);
    expandableList1.setGeneratePointsChoices(COORDINATE2D_ATTR_POINT_CHOICES); // provide choice labels for appending
    expandableList1.setGeneratePointsEnumerationValues(COORDINATE2D_ATTR_POINT_VALUES);
    expandableList1.setEnumerationValueLoopClosed(true);
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
        expandableList1 = new org.web3d.x3d.palette.items.ExpandableList();
        eventHintPanel = new javax.swing.JPanel();
        eventLabel1 = new javax.swing.JLabel();
        eventLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(expandableList1, gridBagConstraints);

        eventHintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eventHintPanel.setLayout(new java.awt.GridBagLayout());

        eventLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventLabel1.setText("<html>Primary input event is <b>set_fraction</b>");
        eventLabel1.setToolTipText("Create a ROUTE to connect input and output events");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        eventHintPanel.add(eventLabel1, gridBagConstraints);

        eventLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventLabel2.setText("<html>Primary output event is <b>value_changed</b>");
        eventLabel2.setToolTipText("Create a ROUTE to connect input and output events");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        eventHintPanel.add(eventLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        add(eventHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eventHintPanel;
    private javax.swing.JLabel eventLabel1;
    private javax.swing.JLabel eventLabel2;
    private org.web3d.x3d.palette.items.ExpandableList expandableList1;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_POSITIONINTERPOLATOR2D";
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    unLoadDEFUSE();
    
    pi2D.setKeysAndValues   (expandableList1.getData());
    pi2D.setInsertCommas    (expandableList1.isInsertCommasSet());
    pi2D.setInsertLineBreaks(expandableList1.isInsertLineBreaksSet());
  }  
}
