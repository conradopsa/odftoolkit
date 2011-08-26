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
import org.openoffice.odf.dom.type.table.OdfSheetObjectType;
import org.openoffice.odf.dom.type.OdfPositiveInteger;
import org.openoffice.odf.dom.type.table.OdfAcceptanceStateType;


/**
 * ODF DOM Element implementation for element "<table:insertion>".
 */
public abstract class OdfInsertionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "insertion" );

    public OdfInsertionElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfSheetObjectType _aType, Integer _aPosition, String _aId)
    {
        setType( _aType );
        setPosition( _aPosition );
        setId( _aId );
    }

    /**
     * Get value of attribute "table:type".
     */
    public OdfSheetObjectType getType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "type" ) );
        return OdfSheetObjectType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:type".
     */
    public void setType( OdfSheetObjectType _aType )
    {                    
        String aStringVal = OdfSheetObjectType.toString( _aType );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "type" ), aStringVal );
    }

    /**
     * Get value of attribute "table:position".
     */
    public Integer getPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "position" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:position".
     */
    public void setPosition( Integer _aPosition )
    {                    
        String aStringVal = Integer.toString( _aPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "position" ), aStringVal );
    }

    /**
     * Get value of attribute "table:count".
     */
    public Integer getCount()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "count" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:count".
     */
    public void setCount( Integer _aCount )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aCount );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "count" ), aStringVal );
    }

    /**
     * Get value of attribute "table:table".
     */
    public Integer getTable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:table".
     */
    public void setTable( Integer _aTable )
    {                    
        String aStringVal = Integer.toString( _aTable );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table" ), aStringVal );
    }

    /**
     * Get value of attribute "table:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "id" ) );
    }

    /**
     * Set value of attribute "table:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "id" ), _aId );
    }

    /**
     * Get value of attribute "table:acceptance-state".
     */
    public OdfAcceptanceStateType getAcceptanceState()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "acceptance-state" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "pending";
        }

        return OdfAcceptanceStateType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:acceptance-state".
     */
    public void setAcceptanceState( OdfAcceptanceStateType _aAcceptanceState )
    {                    
        String aStringVal = OdfAcceptanceStateType.toString( _aAcceptanceState );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "acceptance-state" ), aStringVal );
    }

    /**
     * Get value of attribute "table:rejecting-change-id".
     */
    public String getRejectingChangeId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "rejecting-change-id" ) );
    }

    /**
     * Set value of attribute "table:rejecting-change-id".
     */
    public void setRejectingChangeId( String _aRejectingChangeId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "rejecting-change-id" ), _aRejectingChangeId );
    }

}
