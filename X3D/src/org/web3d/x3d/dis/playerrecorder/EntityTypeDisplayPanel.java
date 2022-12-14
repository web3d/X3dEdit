/*
 * EntityTypeDisplayPanel.java
 *
 * Created on October 26, 2008, 2:34 PM
 */
package org.web3d.x3d.dis.playerrecorder;

import edu.nps.moves.dis7.enumerations.*;

import edu.nps.moves.dis7.pdus.Domain;
import edu.nps.moves.dis7.pdus.EntityType;

import org.openide.util.NbBundle;

/**
 *
 * @author  mike
 */
public class EntityTypeDisplayPanel extends javax.swing.JPanel {

    /** Creates new form EntityTypeDisplayPanel */
    public EntityTypeDisplayPanel() {
        initComponents();
    }

  public void setData(EntityType pdu)
  {
    // apply DIS enumerations lookups to display string names for clarity
    //todo this is a temporary fix.  pdu.getSpecific was coming in == three...there's no enum defined for that so
    // the indexing into lookup was producing an ArrayIndexOutOfBounds exception.
    // The final fix should avoid doing a direct index...should use a method in the Enum if there, else write a wrapper class that is
    // used everywhere we're using the lookup array.
    // Update: fix the rest of the panels like this one.

    categoryTF.setText       (DisEnumerationsUtility.getEnumerationDescription(Byte.class, pdu.getCategory()));
    categoryTF.setToolTipText(DisEnumerationsUtility.getEnumerationToolTip    (Byte.class, pdu.getCategory()));

    countryTF.setText        (DisEnumerationsUtility.getEnumerationDescription(Country.class, pdu.getCountry().getValue()));
    countryTF.setToolTipText (DisEnumerationsUtility.getEnumerationToolTip    (Country.class, pdu.getCountry().getValue()));

    domainTF.setText         (DisEnumerationsUtility.getEnumerationDescription(Domain.class, pdu.getDomain().getValue()));
    domainTF.setToolTipText  (DisEnumerationsUtility.getEnumerationToolTip    (Domain.class, pdu.getDomain().getValue()));

    // TODO no special type for Extra?
    extraTF.setText          (""+                             pdu.getExtra());
    extraTF.setToolTipText   (""+pdu.getExtra() + " "     );

    kindTF.setText           (DisEnumerationsUtility.getEnumerationDescription(EntityKind.class, pdu.getEntityKind().getValue()));
    kindTF.setToolTipText    (DisEnumerationsUtility.getEnumerationToolTip    (EntityKind.class, pdu.getEntityKind().getValue()));

    specificTF.setText       (DisEnumerationsUtility.getEnumerationDescription(Byte.class, pdu.getSpecific()));
    specificTF.setToolTipText(DisEnumerationsUtility.getEnumerationToolTip    (Byte.class, pdu.getSpecific()));

    subcategoryTF.setText       (DisEnumerationsUtility.getEnumerationDescription(Byte.class, pdu.getSubCategory()));
    subcategoryTF.setToolTipText(DisEnumerationsUtility.getEnumerationToolTip    (Byte.class, pdu.getSubCategory()));
  }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        kindLabel = new javax.swing.JLabel();
        domainLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        subcategoryLabel = new javax.swing.JLabel();
        specificLabel = new javax.swing.JLabel();
        extraLabel = new javax.swing.JLabel();
        kindTF = new javax.swing.JTextField();
        domainTF = new javax.swing.JTextField();
        countryTF = new javax.swing.JTextField();
        categoryTF = new javax.swing.JTextField();
        subcategoryTF = new javax.swing.JTextField();
        specificTF = new javax.swing.JTextField();
        extraTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        kindLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kindLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.kindLabel.text")); // NOI18N
        kindLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.142;
        add(kindLabel, gridBagConstraints);

        domainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        domainLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.domainLabel.text")); // NOI18N
        domainLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(domainLabel, gridBagConstraints);

        countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countryLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.countryLabel.text")); // NOI18N
        countryLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(countryLabel, gridBagConstraints);

        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.categoryLabel.text")); // NOI18N
        categoryLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(categoryLabel, gridBagConstraints);

        subcategoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subcategoryLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.subcategoryLabel.text")); // NOI18N
        subcategoryLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(subcategoryLabel, gridBagConstraints);

        specificLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        specificLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.specificLabel.text")); // NOI18N
        specificLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(specificLabel, gridBagConstraints);

        extraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extraLabel.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.extraLabel.text")); // NOI18N
        extraLabel.setPreferredSize(new java.awt.Dimension(8, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(extraLabel, gridBagConstraints);

        kindTF.setEditable(false);
        kindTF.setForeground(new java.awt.Color(0, 102, 102));
        kindTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kindTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.kindTF.text")); // NOI18N
        kindTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kindTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.142;
        add(kindTF, gridBagConstraints);

        domainTF.setEditable(false);
        domainTF.setForeground(new java.awt.Color(0, 102, 102));
        domainTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        domainTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.domainTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(domainTF, gridBagConstraints);

        countryTF.setEditable(false);
        countryTF.setForeground(new java.awt.Color(0, 102, 102));
        countryTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countryTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.countryTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(countryTF, gridBagConstraints);

        categoryTF.setEditable(false);
        categoryTF.setForeground(new java.awt.Color(0, 102, 102));
        categoryTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoryTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.categoryTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(categoryTF, gridBagConstraints);

        subcategoryTF.setEditable(false);
        subcategoryTF.setForeground(new java.awt.Color(0, 102, 102));
        subcategoryTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subcategoryTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.subcategoryTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(subcategoryTF, gridBagConstraints);

        specificTF.setEditable(false);
        specificTF.setForeground(new java.awt.Color(0, 102, 102));
        specificTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        specificTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.specificTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(specificTF, gridBagConstraints);

        extraTF.setEditable(false);
        extraTF.setForeground(new java.awt.Color(0, 102, 102));
        extraTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        extraTF.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.extraTF.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.143;
        add(extraTF, gridBagConstraints);

        jLabel1.setText(NbBundle.getMessage(getClass(), "EntityTypeDisplayPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void kindTFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kindTFActionPerformed
    {//GEN-HEADEREND:event_kindTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kindTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTF;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTF;
    private javax.swing.JLabel domainLabel;
    private javax.swing.JTextField domainTF;
    private javax.swing.JLabel extraLabel;
    private javax.swing.JTextField extraTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kindLabel;
    private javax.swing.JTextField kindTF;
    private javax.swing.JLabel specificLabel;
    private javax.swing.JTextField specificTF;
    private javax.swing.JLabel subcategoryLabel;
    private javax.swing.JTextField subcategoryTF;
    // End of variables declaration//GEN-END:variables

}
