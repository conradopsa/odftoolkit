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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;

;

/**
 * ODF DOM Element implementation for element "<text:user-index-mark>".
 */
public abstract class OdfUserIndexMarkElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "user-index-mark" );

    public OdfUserIndexMarkElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aStringValue, String _aIndexName)
    {
        setStringValue( _aStringValue );
        setIndexName( _aIndexName );
    }

    /**
     * Get value of attribute "text:string-value".
     */
    public String getStringValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "string-value" ) );
    }

    /**
     * Set value of attribute "text:string-value".
     */
    public void setStringValue( String _aStringValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "string-value" ), _aStringValue );
    }

    /**
     * Get value of attribute "text:outline-level".
     */
    public Integer getOutlineLevel()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:outline-level".
     */
    public void setOutlineLevel( Integer _aOutlineLevel )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aOutlineLevel );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ), aStringVal );
    }

    /**
     * Get value of attribute "text:index-name".
     */
    public String getIndexName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-name" ) );
    }

    /**
     * Set value of attribute "text:index-name".
     */
    public void setIndexName( String _aIndexName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-name" ), _aIndexName );
    }

}
