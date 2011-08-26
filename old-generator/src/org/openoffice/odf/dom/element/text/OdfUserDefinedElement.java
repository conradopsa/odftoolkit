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
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.OdfStyleName;
import javax.xml.datatype.XMLGregorianCalendar;
import org.openoffice.odf.dom.type.OdfDate;
import javax.xml.datatype.Duration;
import org.openoffice.odf.dom.type.OdfDuration;


/**
 * ODF DOM Element implementation for element "<text:user-defined>".
 */
public abstract class OdfUserDefinedElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "user-defined" );

    public OdfUserDefinedElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "text:fixed".
     */
    public Boolean getFixed()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "fixed" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:fixed".
     */
    public void setFixed( Boolean _aFixed )
    {                    
        String aStringVal = OdfBoolean.toString( _aFixed );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "fixed" ), aStringVal );
    }

    /**
     * Get value of attribute "text:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ) );
    }

    /**
     * Set value of attribute "text:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ), _aName );
    }

    /**
     * Get value of attribute "style:data-style-name".
     */
    public String getDataStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "data-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:data-style-name".
     */
    public void setDataStyleName( String _aDataStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDataStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "data-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "office:value".
     */
    public Double getValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:value".
     */
    public void setValue( Double _aValue )
    {                    
        String aStringVal = Double.toString( _aValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:date-value".
     */
    public XMLGregorianCalendar getDateValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "date-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:date-value".
     */
    public void setDateValue( XMLGregorianCalendar _aDateValue )
    {                    
        String aStringVal = OdfDate.toString( _aDateValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "date-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:time-value".
     */
    public Duration getTimeValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "time-value" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:time-value".
     */
    public void setTimeValue( Duration _aTimeValue )
    {                    
        String aStringVal = OdfDuration.toString( _aTimeValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "time-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:boolean-value".
     */
    public Boolean getBooleanValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "boolean-value" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:boolean-value".
     */
    public void setBooleanValue( Boolean _aBooleanValue )
    {                    
        String aStringVal = OdfBoolean.toString( _aBooleanValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "boolean-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:string-value".
     */
    public String getStringValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "string-value" ) );
    }

    /**
     * Set value of attribute "office:string-value".
     */
    public void setStringValue( String _aStringValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "string-value" ), _aStringValue );
    }

}
