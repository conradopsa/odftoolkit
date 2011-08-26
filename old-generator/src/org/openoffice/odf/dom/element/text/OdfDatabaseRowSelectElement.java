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

package org.openoffice.odf.dom.element.text;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.text.OdfTableType;
import org.openoffice.odf.dom.type.OdfNonNegativeInteger;


/**
 * ODF DOM Element implementation for element "<text:database-row-select>".
 */
public abstract class OdfDatabaseRowSelectElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "database-row-select" );

    public OdfDatabaseRowSelectElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aTableName)
    {
        setTableName( _aTableName );
    }

    /**
     * Get value of attribute "text:table-name".
     */
    public String getTableName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "table-name" ) );
    }

    /**
     * Set value of attribute "text:table-name".
     */
    public void setTableName( String _aTableName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "table-name" ), _aTableName );
    }

    /**
     * Get value of attribute "text:table-type".
     */
    public OdfTableType getTableType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "table-type" ) );
        return OdfTableType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:table-type".
     */
    public void setTableType( OdfTableType _aTableType )
    {                    
        String aStringVal = OdfTableType.toString( _aTableType );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "table-type" ), aStringVal );
    }

    /**
     * Get value of attribute "text:database-name".
     */
    public String getDatabaseName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "database-name" ) );
    }

    /**
     * Set value of attribute "text:database-name".
     */
    public void setDatabaseName( String _aDatabaseName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "database-name" ), _aDatabaseName );
    }

    /**
     * Get value of attribute "text:condition".
     */
    public String getCondition()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "condition" ) );
    }

    /**
     * Set value of attribute "text:condition".
     */
    public void setCondition( String _aCondition )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "condition" ), _aCondition );
    }

    /**
     * Get value of attribute "text:row-number".
     */
    public Integer getRowNumber()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "row-number" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:row-number".
     */
    public void setRowNumber( Integer _aRowNumber )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aRowNumber );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "row-number" ), aStringVal );
    }

}
