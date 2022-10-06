package org.web3d.x3d.collada;

import java.io.IOException;

import javax.lang.model.SourceVersion;

import org.openide.filesystems.FileObject;

import org.openide.loaders.*;

import org.openide.util.NbBundle;

public class ColladaDataLoader extends UniFileLoader
{

  public static final String REQUIRED_MIME = "application/dae+xml";
  private static final long serialVersionUID = 1L;

  public ColladaDataLoader()
  {
    super("org.web3d.x3d.collada.ColladaDataObject");
  }

  @Override
  protected String defaultDisplayName()
  {
    return NbBundle.getMessage(ColladaDataLoader.class, "LBL_Collada_loader_name");
  }

  @Override
  protected void initialize()
  {
    super.initialize();
    ExtensionList el = getExtensions();
    el.addMimeType(REQUIRED_MIME);
  }

  @Override
  protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException
  {
    return new ColladaDataObject(primaryFile, this);
  }

  @Override
  protected String actionsContext()
  {
    return "Loaders/" + REQUIRED_MIME + "/Actions";
  }

  public SourceVersion getSupportedSourceVersion() {
      return SourceVersion.RELEASE_8;
  }
}
