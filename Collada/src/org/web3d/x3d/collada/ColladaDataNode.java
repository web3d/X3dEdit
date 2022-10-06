package org.web3d.x3d.collada;

import org.openide.loaders.DataNode;

import org.openide.nodes.Children;

import org.openide.util.Lookup;

public class ColladaDataNode extends DataNode
{

  private static final String IMAGE_ICON_BASE = "org/web3d/x3d/collada/collada16.png";

  public ColladaDataNode(ColladaDataObject obj)
  {
    super(obj, Children.LEAF);
    setIconBaseWithExtension(IMAGE_ICON_BASE);
  }

  ColladaDataNode(ColladaDataObject obj, Lookup lookup)
  {
    super(obj, Children.LEAF, lookup);
    setIconBaseWithExtension(IMAGE_ICON_BASE);
  }
}
