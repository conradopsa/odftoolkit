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

package org.openoffice.odf.dom.element.style;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfStyleBase;
import org.openoffice.odf.dom.type.OdfStyleName;
import org.openoffice.odf.dom.type.style.OdfPageUsageType;


/**
 * ODF DOM Element implementation for element "<style:page-layout>".
 */
public abstract class OdfPageLayoutElement extends OdfStyleBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "page-layout" );

    public OdfPageLayoutElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "style:name".
     */
    public String getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:name".
     */
    public void setName( String _aName )
    {                    
        String aStringVal = OdfStyleName.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "style:page-usage".
     */
    public OdfPageUsageType getPageUsage()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "page-usage" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "all";
        }

        return OdfPageUsageType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:page-usage".
     */
    public void setPageUsage( OdfPageUsageType _aPageUsage )
    {                    
        String aStringVal = OdfPageUsageType.toString( _aPageUsage );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "page-usage" ), aStringVal );
    }

}
