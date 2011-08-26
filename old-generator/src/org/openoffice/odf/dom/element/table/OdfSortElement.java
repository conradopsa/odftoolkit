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
import org.openoffice.odf.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<table:sort>".
 */
public abstract class OdfSortElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "sort" );

    public OdfSortElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:bind-styles-to-content".
     */
    public Boolean getBindStylesToContent()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "bind-styles-to-content" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:bind-styles-to-content".
     */
    public void setBindStylesToContent( Boolean _aBindStylesToContent )
    {                    
        String aStringVal = OdfBoolean.toString( _aBindStylesToContent );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "bind-styles-to-content" ), aStringVal );
    }

    /**
     * Get value of attribute "table:target-range-address".
     */
    public String getTargetRangeAddress()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-range-address" ) );
    }

    /**
     * Set value of attribute "table:target-range-address".
     */
    public void setTargetRangeAddress( String _aTargetRangeAddress )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-range-address" ), _aTargetRangeAddress );
    }

    /**
     * Get value of attribute "table:case-sensitive".
     */
    public Boolean getCaseSensitive()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "case-sensitive" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:case-sensitive".
     */
    public void setCaseSensitive( Boolean _aCaseSensitive )
    {                    
        String aStringVal = OdfBoolean.toString( _aCaseSensitive );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "case-sensitive" ), aStringVal );
    }

    /**
     * Get value of attribute "table:language".
     */
    public String getLanguage()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "language" ) );
    }

    /**
     * Set value of attribute "table:language".
     */
    public void setLanguage( String _aLanguage )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "language" ), _aLanguage );
    }

    /**
     * Get value of attribute "table:country".
     */
    public String getCountry()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "country" ) );
    }

    /**
     * Set value of attribute "table:country".
     */
    public void setCountry( String _aCountry )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "country" ), _aCountry );
    }

    /**
     * Get value of attribute "table:algorithm".
     */
    public String getAlgorithm()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "algorithm" ) );
    }

    /**
     * Set value of attribute "table:algorithm".
     */
    public void setAlgorithm( String _aAlgorithm )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "algorithm" ), _aAlgorithm );
    }

}
