package org.web3d.x3d.collada;

import java.awt.Image;

import java.beans.*;

import org.openide.loaders.UniFileLoader;

import org.openide.util.ImageUtilities;

public class ColladaDataLoaderBeanInfo extends SimpleBeanInfo
{

  @Override
  public BeanInfo[] getAdditionalBeanInfo()
  {
    try {
      return new BeanInfo[]{Introspector.getBeanInfo(UniFileLoader.class)};
    }
    catch (IntrospectionException e) {
      throw new AssertionError(e);
    }
  }

  @Override
  public Image getIcon(int type)
  {
    if (type == BeanInfo.ICON_COLOR_16x16 || type == BeanInfo.ICON_MONO_16x16) {
      return ImageUtilities.loadImage("org/web3d/x3d/collada/collada16.png");
      // obs return Utilities.loadImage("org/web3d/x3d/collada/collada16.png");
    }
    else {
      return null;
    }

  }
}
