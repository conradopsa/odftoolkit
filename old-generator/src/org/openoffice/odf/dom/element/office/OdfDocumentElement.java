/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 * 
 * Use is subject to license terms.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.openoffice.odf.dom.element.office;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;


/**
 * ODF DOM Element implementation for element "<office:document>".
 */
public abstract class OdfDocumentElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.OFFICE, "document" );

    public OdfDocumentElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialite mandatory attributes.
     */
    public void init(String _aMimetype)
    {
        setMimetype( _aMimetype );
    }

    /**
     * Get value of attribute "office:mimetype".
     */
    public String getMimetype()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "mimetype" ) );
    }

    /**
     * Set value of attribute "office:mimetype".
     */
    public void setMimetype( String _aMimetype )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "mimetype" ), _aMimetype );
    }

    /**
     * Get value of attribute "office:version".
     */
    public String getVersion()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "version" ) );
    }

    /**
     * Set value of attribute "office:version".
     */
    public void setVersion( String _aVersion )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "version" ), _aVersion );
    }

}
