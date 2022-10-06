/*
 * ExampleArchivesDownloadPanel.java
 *
 * Created on January 10, 2008, 4:09 PM
 */
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

package org.web3d.x3d;

import java.io.File;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Vector;
import javax.swing.JFileChooser;
import org.apache.tools.ant.module.api.support.ActionUtils;
import org.openide.execution.ExecutorTask;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.HelpCtx;
import org.openide.util.Task;
import org.openide.util.TaskListener;
import org.web3d.x3d.actions.LocalExamplesFinder;

/**
 *
 * @author  Mike Bailey <jmbailey@nps.edu>
 */
public class ExampleArchivesDownloadPanel extends javax.swing.JPanel
{
  private final String BASICEXAMPLESTARGET     = "Basic";
  private final String CONFORMANCENISTTARGET   = "ConformanceNist";
  private final String HUMANOIDANIMATIONTARGET = "HumanoidAnimation";
  private final String VRML20SOURCEBOOKTARGET  = "Vrml2.0Sourcebook";
  private final String SAVAGETARGET            = "Savage";
  private final String SAVAGEDEFENSETARGET     = "SavageDefense";
  private final String X3D4WA_EXAMPLESTARGET   = "X3dForWebAuthors";
  private final String X3D4AM_EXAMPLESTARGET   = "X3dForAdvancedModeling";
  
  private final String DEFAULTROOTDIR = "/";
  private final String targetPath     = "www.web3d.org/x3d/content/examples/";
  private final String antScriptPath  = "X3dAntScripts/examplesDownloaderAntScript.xml";
  
  private JFileChooser fileChooser;
  private ExecutorTask task;
  
  /** Creates new form ExampleArchivesDownloadPanel */
  public ExampleArchivesDownloadPanel()
  {
    initComponents();
    HelpCtx.setHelpIDString(this, "helpExampleDownloads");
    
    downloadDirectoryLabelUpdate (); // initialize
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        x3d4waExamplesCB = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        x3dForWebAuthorsTA = new javax.swing.JTextArea();
        x3d4amExamplesCB = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        x3dForAdvancedModelingTA = new javax.swing.JTextArea();
        basicExamplesCB = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        basicExamplesTA = new javax.swing.JTextArea();
        conformanceCB = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        conformanceTA = new javax.swing.JTextArea();
        vrmlSourcebookCB = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        vrmlTA = new javax.swing.JTextArea();
        savageCB = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        savageTA = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        downLoadLab = new javax.swing.JLabel();
        rootDirectoryChooserButton = new javax.swing.JButton();
        rootDirectoryTF = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        downloadButton = new javax.swing.JButton();
        downloadDirectoryNoteLabel = new javax.swing.JLabel();
        downloadDirectoryLabel = new javax.swing.JLabel();
        conformanceCB1 = new javax.swing.JCheckBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        conformanceTA1 = new javax.swing.JTextArea();
        humanoidAnimationCB = new javax.swing.JCheckBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        hanimTextArea = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.GridBagLayout());

        x3d4waExamplesCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.x3d4waExamplesCB.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(x3d4waExamplesCB, gridBagConstraints);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(120, 24));

        x3dForWebAuthorsTA.setEditable(false);
        x3dForWebAuthorsTA.setColumns(20);
        x3dForWebAuthorsTA.setLineWrap(true);
        x3dForWebAuthorsTA.setRows(2);
        x3dForWebAuthorsTA.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.x3dForWebAuthorsTA.text")); // NOI18N
        x3dForWebAuthorsTA.setWrapStyleWord(true);
        x3dForWebAuthorsTA.setAutoscrolls(false);
        x3dForWebAuthorsTA.setMaximumSize(new java.awt.Dimension(80, 400));
        x3dForWebAuthorsTA.setMinimumSize(new java.awt.Dimension(80, 400));
        x3dForWebAuthorsTA.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane1.setViewportView(x3dForWebAuthorsTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane1, gridBagConstraints);

        x3d4amExamplesCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.x3d4amExamplesCB.text")); // NOI18N
        x3d4amExamplesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3d4amExamplesCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(x3d4amExamplesCB, gridBagConstraints);

        jScrollPane6.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(120, 24));

        x3dForAdvancedModelingTA.setEditable(false);
        x3dForAdvancedModelingTA.setColumns(20);
        x3dForAdvancedModelingTA.setLineWrap(true);
        x3dForAdvancedModelingTA.setRows(2);
        x3dForAdvancedModelingTA.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.x3dForAdvancedModelingTA.text")); // NOI18N
        x3dForAdvancedModelingTA.setWrapStyleWord(true);
        x3dForAdvancedModelingTA.setAutoscrolls(false);
        x3dForAdvancedModelingTA.setMaximumSize(new java.awt.Dimension(80, 400));
        x3dForAdvancedModelingTA.setMinimumSize(new java.awt.Dimension(80, 400));
        x3dForAdvancedModelingTA.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane6.setViewportView(x3dForAdvancedModelingTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane6, gridBagConstraints);

        basicExamplesCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.basicExamplesCB.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(basicExamplesCB, gridBagConstraints);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(120, 24));

        basicExamplesTA.setEditable(false);
        basicExamplesTA.setColumns(20);
        basicExamplesTA.setLineWrap(true);
        basicExamplesTA.setRows(2);
        basicExamplesTA.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.basicExamplesTA.text")); // NOI18N
        basicExamplesTA.setWrapStyleWord(true);
        basicExamplesTA.setAutoscrolls(false);
        basicExamplesTA.setMaximumSize(new java.awt.Dimension(80, 400));
        basicExamplesTA.setMinimumSize(new java.awt.Dimension(80, 400));
        basicExamplesTA.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane2.setViewportView(basicExamplesTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane2, gridBagConstraints);

        conformanceCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.conformanceCB.text")); // NOI18N
        conformanceCB.setMaximumSize(new java.awt.Dimension(250, 23));
        conformanceCB.setMinimumSize(new java.awt.Dimension(250, 23));
        conformanceCB.setPreferredSize(new java.awt.Dimension(250, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(conformanceCB, gridBagConstraints);

        jScrollPane3.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(120, 24));

        conformanceTA.setEditable(false);
        conformanceTA.setColumns(20);
        conformanceTA.setLineWrap(true);
        conformanceTA.setRows(4);
        conformanceTA.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.conformanceTA.text")); // NOI18N
        conformanceTA.setWrapStyleWord(true);
        conformanceTA.setAutoscrolls(false);
        conformanceTA.setMaximumSize(new java.awt.Dimension(80, 400));
        conformanceTA.setMinimumSize(new java.awt.Dimension(80, 400));
        conformanceTA.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane3.setViewportView(conformanceTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane3, gridBagConstraints);

        vrmlSourcebookCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.vrmlSourcebookCB.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(vrmlSourcebookCB, gridBagConstraints);

        jScrollPane4.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(120, 24));

        vrmlTA.setEditable(false);
        vrmlTA.setColumns(20);
        vrmlTA.setLineWrap(true);
        vrmlTA.setRows(2);
        vrmlTA.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.vrmlTA.text")); // NOI18N
        vrmlTA.setWrapStyleWord(true);
        vrmlTA.setAutoscrolls(false);
        vrmlTA.setMaximumSize(new java.awt.Dimension(80, 400));
        vrmlTA.setMinimumSize(new java.awt.Dimension(80, 400));
        vrmlTA.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane4.setViewportView(vrmlTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane4, gridBagConstraints);

        savageCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.savageCB.text")); // NOI18N
        savageCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savageCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(savageCB, gridBagConstraints);

        jScrollPane5.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane5.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(120, 24));

        savageTA.setEditable(false);
        savageTA.setColumns(20);
        savageTA.setLineWrap(true);
        savageTA.setRows(3);
        savageTA.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.savageTA.text")); // NOI18N
        savageTA.setWrapStyleWord(true);
        savageTA.setAutoscrolls(false);
        savageTA.setMaximumSize(new java.awt.Dimension(80, 400));
        savageTA.setMinimumSize(new java.awt.Dimension(80, 400));
        savageTA.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane5.setViewportView(savageTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 3, 6, 3);
        add(jSeparator1, gridBagConstraints);

        downLoadLab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        downLoadLab.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.downLoadLab.text")); // NOI18N
        downLoadLab.setToolTipText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.downLoadLab.toolTipText")); // NOI18N
        downLoadLab.setMaximumSize(new java.awt.Dimension(120, 24));
        downLoadLab.setMinimumSize(new java.awt.Dimension(120, 24));
        downLoadLab.setPreferredSize(new java.awt.Dimension(120, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 2);
        add(downLoadLab, gridBagConstraints);

        rootDirectoryChooserButton.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.rootDirectoryChooserButton.text")); // NOI18N
        rootDirectoryChooserButton.setMargin(null);
        rootDirectoryChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootDirectoryChooserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(rootDirectoryChooserButton, gridBagConstraints);

        rootDirectoryTF.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.rootDirectoryTF.text")); // NOI18N
        try{
            rootDirectoryTF.setText(new File(DEFAULTROOTDIR).getCanonicalPath());
        }
        catch(IOException ex) {}
        rootDirectoryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootDirectoryTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(rootDirectoryTF, gridBagConstraints);

        cancelButton.setForeground(new java.awt.Color(153, 0, 0));
        cancelButton.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.cancelButton.text")); // NOI18N
        cancelButton.setEnabled(false);
        cancelButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(cancelButton, gridBagConstraints);

        downloadButton.setForeground(new java.awt.Color(0, 102, 51));
        downloadButton.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.downloadButton.text")); // NOI18N
        downloadButton.setMaximumSize(new java.awt.Dimension(120, 24));
        downloadButton.setMinimumSize(new java.awt.Dimension(120, 24));
        downloadButton.setPreferredSize(new java.awt.Dimension(120, 24));
        downloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(downloadButton, gridBagConstraints);

        downloadDirectoryNoteLabel.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.downloadDirectoryNoteLabel.text")); // NOI18N
        downloadDirectoryNoteLabel.setToolTipText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.downloadDirectoryNoteLabel.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 2);
        add(downloadDirectoryNoteLabel, gridBagConstraints);

        downloadDirectoryLabel.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.downloadDirectoryLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(downloadDirectoryLabel, gridBagConstraints);

        conformanceCB1.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.conformanceCB1.text")); // NOI18N
        conformanceCB1.setMaximumSize(new java.awt.Dimension(250, 23));
        conformanceCB1.setMinimumSize(new java.awt.Dimension(250, 23));
        conformanceCB1.setPreferredSize(new java.awt.Dimension(250, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(conformanceCB1, gridBagConstraints);

        jScrollPane7.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane7.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane7.setPreferredSize(new java.awt.Dimension(120, 24));

        conformanceTA1.setEditable(false);
        conformanceTA1.setColumns(20);
        conformanceTA1.setLineWrap(true);
        conformanceTA1.setRows(4);
        conformanceTA1.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.conformanceTA1.text")); // NOI18N
        conformanceTA1.setWrapStyleWord(true);
        conformanceTA1.setAutoscrolls(false);
        conformanceTA1.setMaximumSize(new java.awt.Dimension(80, 400));
        conformanceTA1.setMinimumSize(new java.awt.Dimension(80, 400));
        conformanceTA1.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane7.setViewportView(conformanceTA1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane7, gridBagConstraints);

        humanoidAnimationCB.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.humanoidAnimationCB.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(humanoidAnimationCB, gridBagConstraints);

        jScrollPane8.setMaximumSize(new java.awt.Dimension(120, 24));
        jScrollPane8.setMinimumSize(new java.awt.Dimension(120, 24));
        jScrollPane8.setPreferredSize(new java.awt.Dimension(120, 24));

        hanimTextArea.setEditable(false);
        hanimTextArea.setColumns(20);
        hanimTextArea.setLineWrap(true);
        hanimTextArea.setRows(4);
        hanimTextArea.setText(org.openide.util.NbBundle.getMessage(ExampleArchivesDownloadPanel.class, "ExampleArchivesDownloadPanel.hanimTextArea.text")); // NOI18N
        hanimTextArea.setWrapStyleWord(true);
        hanimTextArea.setAutoscrolls(false);
        hanimTextArea.setMaximumSize(new java.awt.Dimension(80, 400));
        hanimTextArea.setMinimumSize(new java.awt.Dimension(80, 400));
        hanimTextArea.setPreferredSize(new java.awt.Dimension(80, 400));
        jScrollPane8.setViewportView(hanimTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jScrollPane8, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
  private void rootDirectoryChooserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rootDirectoryChooserButtonActionPerformed
  {//GEN-HEADEREND:event_rootDirectoryChooserButtonActionPerformed
    if(fileChooser == null) {
      fileChooser = new JFileChooser();
      fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      fileChooser.setDialogTitle("Select archive root directory");
      fileChooser.setToolTipText("Archives will extract to "+targetPath);
      fileChooser.setCurrentDirectory(new File("/"));
      fileChooser.setMultiSelectionEnabled(false);
    }
    
    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue != JFileChooser.APPROVE_OPTION)
        return;
    
    rootDirectoryTF.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_rootDirectoryChooserButtonActionPerformed

  private void downloadButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_downloadButtonActionPerformed
  {//GEN-HEADEREND:event_downloadButtonActionPerformed
    Vector<String> targets = new Vector<String>();

    if (x3d4waExamplesCB.isSelected())
        targets.add(X3D4WA_EXAMPLESTARGET);
    if (x3d4amExamplesCB.isSelected())
        targets.add(X3D4AM_EXAMPLESTARGET);
    if (basicExamplesCB.isSelected())
        targets.add(BASICEXAMPLESTARGET);
    if (conformanceCB.isSelected())
        targets.add(CONFORMANCENISTTARGET);
    if (humanoidAnimationCB.isSelected())
        targets.add(HUMANOIDANIMATIONTARGET);
    if (vrmlSourcebookCB.isSelected())
        targets.add(VRML20SOURCEBOOKTARGET);
    if (savageCB.isSelected())
        targets.add(SAVAGETARGET);

    if (targets.size() <= 0)
      return;
    
    String[] targetsArray = targets.toArray(new String[0]);

    Properties props = null;
    String targetDir = rootDirectoryTF.getText().trim();
    if (targetDir.length() > 0) {
      props = new Properties();
      props.put("examplesRootDirectory", targetDir);
    }

    try {
      FileObject buildFile = FileUtil.getConfigRoot()/*Repository.getDefault().getDefaultFileSystem()*/.getFileSystem().findResource(antScriptPath);
      // Can only execute ant tasks residing on disk, so get this out of the jar into a temp directory
      final File tmp = File.createTempFile(buildFile.getName(), buildFile.getExt());
      tmp.deleteOnExit();
      FileObject tmpFO = FileUtil.createData(tmp);
      FileLock lock = tmpFO.lock();
      OutputStream os = tmpFO.getOutputStream(lock);     
      FileUtil.copy(buildFile.getInputStream(), os);
      os.close();
      lock.releaseLock();

      task = ActionUtils.runTarget(tmpFO, targetsArray, props);
      task.addTaskListener(new taskListener());
      task.getInputOutput().select();
      downloadButton.setEnabled(false);
        cancelButton.setEnabled(true);

      // Save the locations for the View menu
      File interimParentDirectory = new File(targetDir,targetPath);
      if (x3d4waExamplesCB.isSelected())
        LocalExamplesFinder.instance().setX3d4waExamplesDirectory           (new File(interimParentDirectory,X3D4WA_EXAMPLESTARGET).getAbsolutePath());
      if (x3d4waExamplesCB.isSelected())          
        LocalExamplesFinder.instance().setX3d4amExamplesDirectory           (new File(interimParentDirectory,X3D4AM_EXAMPLESTARGET).getAbsolutePath());
      if (basicExamplesCB.isSelected())          
        LocalExamplesFinder.instance().setBasicExamplesDirectory            (new File(interimParentDirectory,BASICEXAMPLESTARGET).getAbsolutePath());
      if (conformanceCB.isSelected())          
        LocalExamplesFinder.instance().setConformExamplesDirectory          (new File(interimParentDirectory,CONFORMANCENISTTARGET).getAbsolutePath());
      if (humanoidAnimationCB.isSelected())
        LocalExamplesFinder.instance().setHumanoidAnimationExamplesDirectory(new File(interimParentDirectory,HUMANOIDANIMATIONTARGET).getAbsolutePath());
      if (vrmlSourcebookCB.isSelected())
        LocalExamplesFinder.instance().setVrmlExamplesDirectory             (new File(interimParentDirectory,VRML20SOURCEBOOKTARGET).getAbsolutePath());
      if (savageCB.isSelected())          
        LocalExamplesFinder.instance().setSavageExamplesDirectory           (new File(interimParentDirectory,SAVAGETARGET).getAbsolutePath());
    }//GEN-LAST:event_downloadButtonActionPerformed
    catch (IOException | IllegalArgumentException ex) {
      task.getInputOutput().select();
      task.getInputOutput().getErr().append(ex.getMessage());
    }
  }
  
  public boolean isRunning()
  {
    return task != null;
  }
  
  class taskListener implements TaskListener
  {
    @Override
    public void taskFinished(Task task)
    {
      task = null;
      killTask(); // just for the buttons
    }    
  }
  public void killTask()
  {
    if(task != null) {
      task.stop();
      task = null;
    }
    downloadButton.setEnabled(true);
    cancelButton.setEnabled(false);
  }
  private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
  {//GEN-HEADEREND:event_cancelButtonActionPerformed
    killTask();
  }//GEN-LAST:event_cancelButtonActionPerformed

  private void savageCBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_savageCBActionPerformed
  {//GEN-HEADEREND:event_savageCBActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_savageCBActionPerformed

    private void x3d4amExamplesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3d4amExamplesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x3d4amExamplesCBActionPerformed

    private void rootDirectoryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootDirectoryTFActionPerformed
        downloadDirectoryLabelUpdate ();
    }//GEN-LAST:event_rootDirectoryTFActionPerformed

    final void downloadDirectoryLabelUpdate ()
    {
        String   archiveDirectory = rootDirectoryTF.getText();
        if      (archiveDirectory.endsWith("\\"))
                 archiveDirectory = archiveDirectory +   "www.web3d.org\\x3d\\content\\examples"; // Windows path
        else if (archiveDirectory.contains("\\") || archiveDirectory.contains(":"))
                 archiveDirectory = archiveDirectory + "\\www.web3d.org\\x3d\\content\\examples"; // Windows path
        else if (archiveDirectory.endsWith("/"))
                 archiveDirectory = archiveDirectory +   "www.web3d.org/x3d/content/examples";    // Unix path
        else     archiveDirectory = archiveDirectory +  "/www.web3d.org/x3d/content/examples";    // Unix path
        downloadDirectoryLabel.setText("<html><b><code><a href='file:/" + archiveDirectory + "' target='_blank'>" + archiveDirectory + "</a></code></b>"); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox basicExamplesCB;
    private javax.swing.JTextArea basicExamplesTA;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox conformanceCB;
    private javax.swing.JCheckBox conformanceCB1;
    private javax.swing.JTextArea conformanceTA;
    private javax.swing.JTextArea conformanceTA1;
    private javax.swing.JLabel downLoadLab;
    private javax.swing.JButton downloadButton;
    private javax.swing.JLabel downloadDirectoryLabel;
    private javax.swing.JLabel downloadDirectoryNoteLabel;
    private javax.swing.JTextArea hanimTextArea;
    private javax.swing.JCheckBox humanoidAnimationCB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton rootDirectoryChooserButton;
    private javax.swing.JTextField rootDirectoryTF;
    private javax.swing.JCheckBox savageCB;
    private javax.swing.JTextArea savageTA;
    private javax.swing.JCheckBox vrmlSourcebookCB;
    private javax.swing.JTextArea vrmlTA;
    private javax.swing.JCheckBox x3d4amExamplesCB;
    private javax.swing.JCheckBox x3d4waExamplesCB;
    private javax.swing.JTextArea x3dForAdvancedModelingTA;
    private javax.swing.JTextArea x3dForWebAuthorsTA;
    // End of variables declaration//GEN-END:variables
}
