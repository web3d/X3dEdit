package org.web3d.x3d.x3dedit.config;

import java.net.URL;
import javax.help.JHelpContentViewer;
import javax.help.plaf.basic.BasicContentViewerUI;
import javax.swing.JComponent;
import javax.swing.event.HyperlinkEvent;

/**
 * ExternalLinkContentViewerUI.java
 * Created on Dec 21, 2007
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey <jmbailey@nps.edu>
 * @version $Id$
 */
public class ExternalLinkContentViewerUI extends BasicContentViewerUI
{
  public ExternalLinkContentViewerUI(JHelpContentViewer cv)
  {
    super(cv);
  }
  
  public static javax.swing.plaf.ComponentUI createUI(JComponent x)
  {
    return new ExternalLinkContentViewerUI((JHelpContentViewer) x);
  }

  @Override
  public void hyperlinkUpdate(HyperlinkEvent he)
  {
    if (he.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
      try {
        URL u = he.getURL();
        if (u.getProtocol().equalsIgnoreCase("mailto") || u.getProtocol().equalsIgnoreCase("http") || u.getProtocol().equalsIgnoreCase("ftp")) {
   //       Desktop.getDesktop().browse(u.toURI());
          return;
        }
      }
      catch (Throwable t) {
      }
    }
    super.hyperlinkUpdate(he);
  }
}
