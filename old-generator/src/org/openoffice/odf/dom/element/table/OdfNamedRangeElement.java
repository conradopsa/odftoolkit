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

package org.openoffice.odf.dom.element.table;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfCellAddress;
import org.openoffice.odf.dom.type.table.OdfRangeUsableAsType;


/**
 * ODF DOM Element implementation for element "<table:named-range>".
 */
public abstract class OdfNamedRangeElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "named-range" );

    public OdfNamedRangeElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName, String _aCellRangeAddress)
    {
        setName( _aName );
        setCellRangeAddress( _aCellRangeAddress );
    }

    /**
     * Get value of attribute "table:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ) );
    }

    /**
     * Set value of attribute "table:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ), _aName );
    }

    /**
     * Get value of attribute "table:cell-range-address".
     */
    public String getCellRangeAddress()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "cell-range-address" ) );
    }

    /**
     * Set value of attribute "table:cell-range-address".
     */
    public void setCellRangeAddress( String _aCellRangeAddress )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "cell-range-address" ), _aCellRangeAddress );
    }

    /**
     * Get value of attribute "table:base-cell-address".
     */
    public String getBaseCellAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "base-cell-address" ) );
        return OdfCellAddress.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:base-cell-address".
     */
    public void setBaseCellAddress( String _aBaseCellAddress )
    {                    
        String aStringVal = OdfCellAddress.toString( _aBaseCellAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "base-cell-address" ), aStringVal );
    }

    /**
     * Get value of attribute "table:range-usable-as".
     */
    public OdfRangeUsableAsType getRangeUsableAs()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "range-usable-as" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "none";
        }

        return OdfRangeUsableAsType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:range-usable-as".
     */
    public void setRangeUsableAs( OdfRangeUsableAsType _aRangeUsableAs )
    {                    
        String aStringVal = OdfRangeUsableAsType.toString( _aRangeUsableAs );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "range-usable-as" ), aStringVal );
    }

}
