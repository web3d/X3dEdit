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
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import org.openide.util.HelpCtx;
/**
 * COLORRGBACustomizer.java
 * Created on July 12, 2007, 3:05 PM
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey
 * @version $Id$
 */
public class COLORRGBACustomizer extends BaseCustomizer
{
  private COLORRGBA colorRgba;
  private JTextComponent target;
  
  public COLORRGBACustomizer(COLORRGBA color, JTextComponent target)
  {
    super(color);
    this.colorRgba = color;
    this.target = target;
    
    HelpCtx.setHelpIDString(this, "COLORRGBA_ELEM_HELPID");
    
    initComponents();

    expandableList1.setTitle("color array");
    expandableList1.setColumnTitles  (new String[]{"#","r","g","b","a","color"});
    expandableList1.setColumnToolTips(new String[]{"index","red","green","blue","alpha opacity (1-transparency)","color chooser"});
    expandableList1.setHeaderTooltip ("Color (red green blue) values");
    expandableList1.setNewRowData(new Object[]{"0.8","0.8","0.8","1"});
    expandableList1.doIncludesAlphaColumn(true);
    expandableList1.doIndexInFirstColumn(true);
    expandableList1.setRedColumn(1); // 0 is index
    expandableList1.doTrailingColorChooser();
    expandableList1.setHeaderTooltip("Red, green, blue, alpha values in range [0..1]");

    String[][] saa = color.getColors(); // may be 0-length
    expandableList1.setData(saa);
    expandableList1.setShowAppendCommasLineBreaks(true);
    expandableList1.setInsertCommas    (color.isInsertCommas());
    expandableList1.setInsertLineBreaks(color.isInsertLineBreaks());
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        DEFUSEpanel dEFUSEpanel1 = getDEFUSEpanel();
        expandableList1 = new ExpandableList();
        hintLabel = new JLabel();

        setMinimumSize(new Dimension(640, 260));
        setPreferredSize(new Dimension(700, 640));
        setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(dEFUSEpanel1, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(expandableList1, gridBagConstraints);

        hintLabel.setHorizontalAlignment(SwingConstants.CENTER);
        hintLabel.setText("<html><p align='center'><b>ColorRGBA</b> node contains color values, where <br />\nRGB= red green blue and A=alpha (1-transparency)</p>");
        hintLabel.setToolTipText("RGBA color values are either for sibling Coordinate/CoordinateDouble or parent ElevationGrid node");
        hintLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        hintLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        add(hintLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ExpandableList expandableList1;
    private JLabel hintLabel;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_COLORRGBA";
  }

  @Override
  public void unloadInput() throws IllegalArgumentException
  {
    unLoadDEFUSE();
    
    colorRgba.setColors(expandableList1.getData());
    colorRgba.setInsertCommas    (expandableList1.isInsertCommasSet());
    colorRgba.setInsertLineBreaks(expandableList1.isInsertLineBreaksSet());
  }  
}
