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
import org.openoffice.odf.dom.type.OdfPositiveInteger;
import org.openoffice.odf.dom.type.OdfAnyURI;
import javax.xml.datatype.Duration;
import org.openoffice.odf.dom.type.OdfDuration;


/**
 * ODF DOM Element implementation for element "<table:cell-range-source>".
 */
public abstract class OdfCellRangeSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "cell-range-source" );

    public OdfCellRangeSourceElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName, Integer _aLastColumnSpanned, Integer _aLastRowSpanned)
    {
        setName( _aName );
        setLastColumnSpanned( _aLastColumnSpanned );
        setLastRowSpanned( _aLastRowSpanned );
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
     * Get value of attribute "table:last-column-spanned".
     */
    public Integer getLastColumnSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "last-column-spanned" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:last-column-spanned".
     */
    public void setLastColumnSpanned( Integer _aLastColumnSpanned )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aLastColumnSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "last-column-spanned" ), aStringVal );
    }

    /**
     * Get value of attribute "table:last-row-spanned".
     */
    public Integer getLastRowSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "last-row-spanned" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:last-row-spanned".
     */
    public void setLastRowSpanned( Integer _aLastRowSpanned )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aLastRowSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "last-row-spanned" ), aStringVal );
    }

    /**
     * Get value of attribute "xlink:href".
     */
    public String getHref()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:href".
     */
    public void setHref( String _aHref )
    {                    
        String aStringVal = OdfAnyURI.toString( _aHref );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ), aStringVal );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "type" ), "simple" );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "actuate" ), "onRequest" );
    }

    /**
     * Get value of attribute "table:filter-name".
     */
    public String getFilterName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "filter-name" ) );
    }

    /**
     * Set value of attribute "table:filter-name".
     */
    public void setFilterName( String _aFilterName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "filter-name" ), _aFilterName );
    }

    /**
     * Get value of attribute "table:filter-options".
     */
    public String getFilterOptions()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "filter-options" ) );
    }

    /**
     * Set value of attribute "table:filter-options".
     */
    public void setFilterOptions( String _aFilterOptions )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "filter-options" ), _aFilterOptions );
    }

    /**
     * Get value of attribute "table:refresh-delay".
     */
    public Duration getRefreshDelay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "refresh-delay" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:refresh-delay".
     */
    public void setRefreshDelay( Duration _aRefreshDelay )
    {                    
        String aStringVal = OdfDuration.toString( _aRefreshDelay );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "refresh-delay" ), aStringVal );
    }

}
