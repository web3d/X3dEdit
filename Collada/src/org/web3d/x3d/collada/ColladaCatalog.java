/*
 * Copyright (c) 1995-2021 held by the author(s) .  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer
 *       in the documentation and/or other materials provided with the
 *       distribution.
 *  * Neither the names of the Naval Postgraduate School (NPS)
 *       Modeling Virtual Environments and Simulation (MOVES) Institute
 *       (http://www.nps.edu and https://MovesInstitute.nps.edu)
 *       nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific
 *       prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.web3d.x3d.collada;

import org.netbeans.modules.xml.catalog.spi.*;

import org.openide.util.NbBundle;

import org.xml.sax.InputSource;

/**
 * ColladaCatalog.java
 * Created on June 4, 2008
 *
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 *
 * @author Mike Bailey
 * @version $Id$
 *
 * Catalog for X3d DTDs and Schemas...based on:
 *  org.netbeans.modules.j2ee.ddloaders.web.DDCatalog.java
 *  Catalog for web app DTDs that enables completion support in editor.
 *
 * @author Milan Kuchtiak
 */
public class ColladaCatalog implements CatalogReader, CatalogDescriptor2, org.xml.sax.EntityResolver
{
  private static final String SCHEMA_110_LOC = "http://www.collada.org/2004/COLLADASchema";
  private static final String SCHEMA_131_LOC = "http://www.collada.org/2005/COLLADASchema";
  private static final String SCHEMA_141_LOC = "http://www.collada.org/2005/11/COLLADASchema";
  
  private static final String SCHEMA_110_PUBID = "SCHEMA:"+SCHEMA_110_LOC;
  private static final String SCHEMA_131_PUBID = "SCHEMA:"+SCHEMA_131_LOC;
  private static final String SCHEMA_141_PUBID = "SCHEMA:"+SCHEMA_141_LOC;
  
  private static final String SCHEMA_110_FN = "COLLADASchema1.1.0.xsd";
  private static final String SCHEMA_131_FN = "COLLADASchema1.3.1.xsd";
  private static final String SCHEMA_141_FN = "COLLADASchema1.4.1.xsd";
  private static final String SCHEMA_FN     = SCHEMA_141_FN;
  
  private static final String SCHEMA_LOCAL_BASE = "nbres:/org/web3d/x3d/collada/schema/";
  private static final String SCHEMA_110_LOCAL  = SCHEMA_LOCAL_BASE+SCHEMA_110_FN;
  private static final String SCHEMA_131_LOCAL  = SCHEMA_LOCAL_BASE+SCHEMA_131_FN;
  private static final String SCHEMA_141_LOCAL  = SCHEMA_LOCAL_BASE+SCHEMA_141_FN;
  private static final String SCHEMA_LOCAL      = SCHEMA_LOCAL_BASE+SCHEMA_FN;
  
  public ColladaCatalog()
  {
  }

  /**
   * Get String iterator representing all public IDs registered in catalog.
   * @return null if cannot proceed, try later.
   */
  @Override
  public java.util.Iterator<String> getPublicIDs()
  {
    java.util.List<String> list = new java.util.ArrayList<>();    
    list.add(SCHEMA_110_PUBID);
    list.add(SCHEMA_131_PUBID);
    list.add(SCHEMA_141_PUBID);
    return list.listIterator();
  }

  /**
   * Get registered systemid for given public Id or null if not registered.
   * @return null if not registered
   */
  @Override
  public String getSystemID(String publicId)
  {
    if(SCHEMA_110_PUBID.equals(publicId))
      return SCHEMA_110_LOCAL;
    if(SCHEMA_131_PUBID.equals(publicId))
      return SCHEMA_131_LOCAL;
    if(SCHEMA_141_PUBID.equals(publicId))
      return SCHEMA_141_LOCAL;
    return null;
  }

  /**
   * Refresh content according to content of mounted catalog.
   */
  @Override
  public void refresh()
  {
  }

  /**
   * Optional operation allowing to listen at catalog for changes.
   * @throws UnsupportedOpertaionException if not supported by the implementation.
   */
  @Override
  public void addCatalogListener(CatalogListener l)
  {
  }

  /**
   * Optional operation coupled with addCatalogListener.
   * @throws UnsupportedOpertaionException if not supported by the implementation.
   */
  @Override
  public void removeCatalogListener(CatalogListener l)
  {
  }

  /** Registers new listener.  */
  @Override
  public void addPropertyChangeListener(java.beans.PropertyChangeListener l)
  {
  }

  /**
   * @return I18N display name
   */
  @Override
  public String getDisplayName()
  {
    return NbBundle.getMessage(ColladaCatalog.class, "LBL_DDCatalog"); //"Web Deployment Descriptors Catalog
  }

  /**
   * Return visualized state of given catalog.
   * @param type of icon defined by JavaBeans specs
   * @return icon representing current state or null
   */
  @Override
  public String getIconResource(int type)
  {
    return "org/netbeans/modules/j2ee/ddloaders/web/resources/DDCatalog.gif"; // NOI18N
  }

  /**
   * @return I18N short description
   */
  @Override
  public String getShortDescription()
  {
    return NbBundle.getMessage(ColladaCatalog.class, "DESC_DDCatalog"); //XML Catalog for web deployment descriptor DTD and XML schema files.
  }

  /** Unregister the listener.  */
  @Override
  public void removePropertyChangeListener(java.beans.PropertyChangeListener l)
  {
  }

  /**
   * Resolves schema definition file for deployment descriptor (spec.2_4 and spec. 2_5)
   * @param publicId publicId for resolved entity (null in our case)
   * @param systemId systemId for resolved entity
   * @return InputSource for
   */
  @Override
  public org.xml.sax.InputSource resolveEntity(String publicId, String systemId) throws org.xml.sax.SAXException, java.io.IOException
  {
    if (systemId == null)
      return null;
    
    if (SCHEMA_110_LOC.equals(systemId))
      return new InputSource(SCHEMA_110_LOCAL);
    if (SCHEMA_131_LOC.equals(systemId))
      return new InputSource(SCHEMA_131_LOCAL);
    if (SCHEMA_141_LOC.equals(systemId))
      return new InputSource(SCHEMA_141_LOCAL);
    
    if (systemId.endsWith(SCHEMA_FN))
      return new InputSource(SCHEMA_LOCAL);
    return null;
  }

  /**
   * Get registered URI for the given name or null if not registered.
   * @return null if not registered
   */
  @Override
  public String resolveURI(String name)
  {
    //if (name.endsWith("xslt"))
    //  return "nbres:/org/web3d/x3d/externals/stylesheets/" + name;
    return null;
  }

  /**
   * Get registered URI for the given publicId or null if not registered.
   * @return null if not registered
   */
  @Override
  public String resolvePublic(String publicId)
  {
    return null;
  }
}