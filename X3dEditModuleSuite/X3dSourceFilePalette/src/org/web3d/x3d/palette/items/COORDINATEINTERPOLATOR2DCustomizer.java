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
 * COORDINATEINTERPOLATOR2DCustomizer.java
 * Created on Sep 11, 2007, 3:05 PM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey, Don Brutzman
 * @version $Id$
 */
public class COORDINATEINTERPOLATOR2DCustomizer extends BaseCustomizer
{
  private final COORDINATEINTERPOLATOR2D ci2d;
  private final JTextComponent target;

  private boolean insertCommas, insertLineBreaks = false;

  private final int TUPLE_SIZE = 2;
    
  /** Creates new form COORDINATEINTERPOLATOR2DCustomizer */
  public COORDINATEINTERPOLATOR2DCustomizer(COORDINATEINTERPOLATOR2D ci2d, JTextComponent target)
  {
    super(ci2d);
    this.ci2d = ci2d;
    this.target = target;
    
    HelpCtx.setHelpIDString(this, "COORDINATEINTERPOLATOR2D_ELEM_HELPID");
    
    initComponents();
    
    keyTupleTable.setTitle("CoordinateInterpolator2D keys and corresponding 2D x-y coordinate arrays");
    keyTupleTable.setAddColumnButtonTooltip   ("Add column of coordinate pairs");
    keyTupleTable.setRemoveColumnButtonTooltip("Remove column of coordinate pairs");
    keyTupleTable.setAddRowButtonTooltip      ("Add row of keyed coordinate pairs");
    keyTupleTable.setRemoveRowButtonTooltip   ("Remove row of keyed coordinate pairs");
    keyTupleTable.setColumnsLabelText("columns of coordinate pairs");
    keyTupleTable.setRowsLabelText   ("rows of keyed coordinate pairs");
    keyTupleTable.setDefaultTupleValues(new String[]{"0","0"}); // 2-tuple
    keyTupleTable.setColumnWidthAndResizeStrategy(true, 50);

    String[][] saa = ci2d.getKeysAndValues(); // may be 0-length
    keyTupleTable.setData(TUPLE_SIZE, saa);
    if (saa.length == 0)
    {
        // initialize headers for empty table
        String[][] defaultRow = new String[1][4];
        defaultRow [0] = new String[]{"0","0","0"};
        keyTupleTable.setData(TUPLE_SIZE, defaultRow);
        keyTupleTable.setData(TUPLE_SIZE, saa);
    }
    keyTupleTable.setInsertCommas(ci2d.isInsertCommas());
    keyTupleTable.setInsertLineBreaks(ci2d.isInsertLineBreaks());
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
        keyTupleTable = new org.web3d.x3d.palette.items.ExpandableKeyTupleTable();
        eventHintPanel = new javax.swing.JPanel();
        eventLabel1 = new javax.swing.JLabel();
        eventLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        dEFUSEpanel1.setMinimumSize(new java.awt.Dimension(198, 77));
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(keyTupleTable, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        add(eventHintPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eventHintPanel;
    private javax.swing.JLabel eventLabel1;
    private javax.swing.JLabel eventLabel2;
    private org.web3d.x3d.palette.items.ExpandableKeyTupleTable keyTupleTable;
    // End of variables declaration//GEN-END:variables
  @Override
  public String getNameKey()
  {
    return "NAME_X3D_COORDINATEINTERPOLATOR2D";
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    unLoadDEFUSE();
    
    ci2d.setKeysAndValues(keyTupleTable.getData());

    ci2d.setInsertCommas    (keyTupleTable.isInsertCommasSet());
    ci2d.setInsertLineBreaks(keyTupleTable.isInsertLineBreaksSet());
  }  
  
}
