package org.web3d.x3d.collada;

import java.io.IOException;

import org.netbeans.spi.xml.cookies.*;

import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;

import org.openide.loaders.*;

import org.openide.nodes.*;

import org.openide.text.DataEditorSupport;

import org.openide.util.Lookup;

@MIMEResolver.Registration(displayName="#Services/MIMEResolver/ColladaResolver.xml",
    resource = "/org/web3d/x3d/collada/ColladaResolver.xml",
    position = 1000)

public class ColladaDataObject extends MultiDataObject
{
  public ColladaDataObject(FileObject pf, ColladaDataLoader loader) throws DataObjectExistsException, IOException
  {
    super(pf, loader);
    CookieSet theCookies = getCookieSet();
    org.xml.sax.InputSource theInputSource = DataObjectAdapters.inputSource(ColladaDataObject.this);
    theCookies.add(new CheckXMLSupport(theInputSource));
    theCookies.add(new ValidateXMLSupport(theInputSource));
    theCookies.add((Node.Cookie) DataEditorSupport.create(ColladaDataObject.this, getPrimaryEntry(), theCookies));
  }

  @Override
  protected Node createNodeDelegate()
  {
    return new ColladaDataNode(this, getLookup());
  }

  @Override
  public Lookup getLookup()
  {
    return getCookieSet().getLookup();
  }
}
