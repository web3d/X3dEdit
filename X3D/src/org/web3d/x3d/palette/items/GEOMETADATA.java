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

import javax.swing.text.JTextComponent;
import static org.web3d.x3d.palette.X3DPaletteUtilities.escapeXmlCharacters;

import org.web3d.x3d.types.X3DInfoNode;
import static org.web3d.x3d.types.X3DSchemaData.*;

/**
 * GEOORIGIN.java
 * Created on 23 Apr 2008
 * 
 * MOVES Institute
 * Naval Postgraduate School, Monterey, CA, USA
 * www.nps.edu
 * 
 * @author Mike Bailey
 * @version $Id$
 */
public class GEOMETADATA extends X3DInfoNode
{ 
  private String[] url;
  private String[][] summary;
  
  public GEOMETADATA()
  {
  }

  @Override
  public String getElementName()
  {
    return GEOMETADATA_ELNAME;
  }
  
  @Override
  public void initialize()
  {
    if(GEOMETADATA_ATTR_URL_DFLT == null || GEOMETADATA_ATTR_URL_DFLT.length()<=0)
      url = new String[] {""}; // empty
    else
      url = new String[]{GEOMETADATA_ATTR_URL_DFLT};
    
    if(GEOMETADATA_ATTR_SUMMARY_DFLT == null || GEOMETADATA_ATTR_SUMMARY_DFLT.length()<=0)
      summary = new String[][] {{"",""}}; // empty
    else
      summary = new String[][]{{GEOMETADATA_ATTR_SUMMARY_DFLT}};  //problematic
  }

  @Override
  public void initializeFromJdom(org.jdom.Element root, JTextComponent comp)
  {
    super.initializeFromJdom(root, comp);
    org.jdom.Attribute attr;
    attr = root.getAttribute(GEOMETADATA_ATTR_URL_NAME);
    if(attr != null) {
      url = parseMFStringIntoStringArray(attr.getValue(),true);
    }
    attr = root.getAttribute(GEOMETADATA_ATTR_SUMMARY_NAME);
    if(attr != null && attr.getValue().length()>0) {
      String[] sa = parseSentences(attr.getValue());     
      summary = make2DArray(sa);
    }
  }

  private String[][] make2DArray(String[] sa)
  {
    String[] stAr = sa;
    if(sa.length % 2 != 0) {
      stAr = new String[sa.length+1];
      stAr[sa.length] = "";
    }
    String[][] saa = new String[stAr.length/2][2];

    int i=0;
    while(i < stAr.length)
      saa[i/2][i%2] = stAr[i++];
    return saa;
  }
  
  @Override
  public String createAttributes()
  {
    StringBuilder sb = new StringBuilder();
    if(GEOMETADATA_ATTR_SUMMARY_REQD || checkForLegitData(summary) ) {
      sb.append(" ");
      sb.append(GEOMETADATA_ATTR_SUMMARY_NAME);
      sb.append("='");
      for(int r=0;r<summary.length;r++) {
        for(int c=0;c<summary[r].length;c++) {
          sb.append("\"");
          sb.append(escapeXmlCharacters(summary[r][c]));
          sb.append("\" ");
        }
      }
      int sblen = sb.length();
      if(sb.charAt(sblen-1) == ' ')
        sb.setLength(sblen-1);
      sb.append("'");
    }

    if(GEOMETADATA_ATTR_URL_REQD || checkForLegitData(url) ) {
      sb.append(" ");
      sb.append(GEOMETADATA_ATTR_URL_NAME);
      sb.append("='");
      for(int r=0;r<url.length;r++) {
          sb.append("\"");
          sb.append(url[r]);
          sb.append("\" ");
      }
      int sblen = sb.length();
      if(sb.charAt(sblen-1) == ' ')
        sb.setLength(sblen-1);
      sb.append("'");
    }
    return sb.toString();
  }
  
  private boolean checkForLegitData(String[][] saa)
  {
    if(saa.length > 0)
      if(saa[0].length> 0)
        if(saa[0][0] != null)
          if(saa[0][0].length()>0)
            return true;
    return false;
  }
  
  private boolean checkForLegitData(String[] sa)
  {
    if(sa.length > 0)
      if(sa[0] != null)
        if(sa[0].length()>0)
        return true;
    return false;        
  }
  
  public String[] getUrl()
  {
    return url;
  }
  public void setUrl(String[]sa)
  {
    url = sa;
  }
  public String[][] getSummary()
  {
    return summary;
  }
  public void setSummary(String[][]saa)
  {
    summary = saa;
  }
}