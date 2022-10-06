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

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import static org.web3d.x3d.types.X3DSchemaData.METADATA_CONTAINERFIELD_CHOICES;
import static org.web3d.x3d.types.X3DSchemaData.METADATA_CONTAINERFIELD_TOOLTIPS;

/**
 * METADATASTRINGCustomizer.java
 * Created on March 8, 2008
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey, Don Brutzman
 * @version $Id$
 */
public class METADATASTRINGCustomizer extends BaseCustomizer
{
  private METADATASTRING metadataString;
  private JTextComponent target;

  public METADATASTRINGCustomizer(METADATASTRING metadataString, JTextComponent target)
  {
    super(metadataString);
    this.metadataString = metadataString;
    this.target = target;
   
    HelpCtx.setHelpIDString(this, "METADATASTRING_ELEM_HELPID");
    
    initComponents();
    
    super.getDEFUSEpanel().setContainerFieldChoices(METADATA_CONTAINERFIELD_CHOICES, METADATA_CONTAINERFIELD_TOOLTIPS);
    // DEFUSEpanel initialization must NOT be repeated or else array of choices will be overwritten
    
	super.getDEFUSEpanel().setContainerField(metadataString.getContainerField()); // TODO why is this needed??
	if (super.getDEFUSEpanel().getContainerField().equals("metadata"))
        super.getDEFUSEpanel().setUseContainerField(false);
    
         nameTextField.setText(metadataString.getName());
    referenceTextField.setText(metadataString.getReference());

    initializeValueTable();

    setDefaultDEFname ();
  }
  private void setDefaultDEFname ()
  {
    super.getDEFUSEpanel().setDefaultDEFname(NbBundle.getMessage(getClass(),getNameKey()) + nameTextField.getText());
  }

    private void initializeValueTable()
    {
        valueTable.setTitle("value array");
        valueTable.setColumnTitles(new String[]
        {
            "#","Individual SFString values"
        });
        valueTable.setNewRowData(new Object[]
        {
            "","" // second value used to add new row
        });
        valueTable.setHeaderTooltip("Array of single or multiple string values");
        valueTable.setColumnToolTips(new String[]{"index","quoted SFString value"});
        valueTable.setTextAlignment(JLabel.TRAILING);
        valueTable.getTable().setRowHeight(16);
        valueTable.doIndexInFirstColumn(true);
        valueTable.setBoldColumn(1);
        valueTable.setDataStringBased(true);

        valueTable.setShowAppendCommasLineBreaks(true);
        valueTable.setInsertCommas    (metadataString.isInsertCommas());
        valueTable.setInsertLineBreaks(metadataString.isInsertLineBreaks());
        valueTable.setData(metadataString.getValueArray());

        // apparently the following has to come after setting data
        valueTable.getTable().getColumnModel().getColumn(0).setPreferredWidth(500);
    }

  private void newRow(String value)
  {
    JTable tab = valueTable.getTable();
    DefaultTableModel mod = (DefaultTableModel)tab.getModel();
    mod.addRow(new String[]{value});
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
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        referenceTextLabel = new javax.swing.JLabel();
        referenceTextField = new javax.swing.JTextField();
        valueTable = new org.web3d.x3d.palette.items.ExpandableList();

        setLayout(new java.awt.GridBagLayout());

        dEFUSEpanel1.setMinimumSize(new java.awt.Dimension(198, 77));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(dEFUSEpanel1, gridBagConstraints);

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("name");
        nameLabel.setToolTipText("metadata attribute name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(nameLabel, gridBagConstraints);

        nameTextField.setToolTipText("metadata attribute name");
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(nameTextField, gridBagConstraints);

        referenceTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        referenceTextLabel.setText("reference");
        referenceTextLabel.setToolTipText("reference to metadata standard or definition for this particular metadata value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(referenceTextLabel, gridBagConstraints);

        referenceTextField.setToolTipText("reference to metadata standard or definition for this particular metadata value");
        referenceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenceTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(referenceTextField, gridBagConstraints);

        valueTable.setToolTipText("Single or multiple string values");
        valueTable.setColumnTitles(new String[] {"string values"});
        valueTable.setMinimumSize(new java.awt.Dimension(170, 200));
        valueTable.setPreferredSize(new java.awt.Dimension(170, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(valueTable, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void referenceTextFieldActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_referenceTextFieldActionPerformed
    {//GEN-HEADEREND:event_referenceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenceTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nameTextFieldActionPerformed
    {//GEN-HEADEREND:event_nameTextFieldActionPerformed
        setDefaultDEFname ();
    }//GEN-LAST:event_nameTextFieldActionPerformed
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField referenceTextField;
    private javax.swing.JLabel referenceTextLabel;
    private org.web3d.x3d.palette.items.ExpandableList valueTable;
    // End of variables declaration//GEN-END:variables

  @Override
  public String getNameKey()
  {
    return "NAME_X3D_METADATASTRING";
  }

  String[] buildValueArray()
  {
      int numberRows = valueTable.getTable().getModel().getRowCount();
      String[] valueArray = new String[numberRows];
      for (int row=0; row < numberRows; row++)
      {
          String newValue = new String();
          if            (valueTable.getTable().getModel().getValueAt(row, 1) != null)
              newValue = valueTable.getTable().getModel().getValueAt(row, 1).toString();
          if (checkStringValue (row, newValue))
          {
               valueArray[row] = newValue;
          }
          else valueArray[row] = ""; // empty strings are legal values, nulls are not
      }
      return valueArray;
  }

  @Override
  public void unloadInput()
  {
     unLoadDEFUSE(); 
     
     metadataString.setName(nameTextField.getText().trim());
     metadataString.setValueArray(buildValueArray());
     metadataString.setReference(referenceTextField.getText().trim());

     metadataString.setInsertCommas    (valueTable.isInsertCommasSet());
     metadataString.setInsertLineBreaks(valueTable.isInsertLineBreaksSet());
  }  
}
