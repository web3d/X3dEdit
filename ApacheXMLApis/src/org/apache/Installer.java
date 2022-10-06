package org.apache;

import java.security.Security;

import org.apache.xml.security.Init;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import org.openide.modules.OnStart;

/**
 * Set stuff up so that X3D-Edit can do it's thing
 * <p>
 * Installer.java
 * Created on Jun 9, 2008
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 * </p>
 * @author Mike Bailey
 * @version $Id: Installer.java 31862 2021-05-13 14:20:52Z tnorbraten $
 */
@OnStart
public class Installer implements Runnable
{
  public Installer() {}
    
  @Override
  public void run()
  {
    // Enter Bouncy castle as a crypto provider
    Security.addProvider(new BouncyCastleProvider());
    Init.init();
  }
}
