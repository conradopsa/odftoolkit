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

package org.openoffice.odf.dom.element.number;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfStyleName;
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.number.OdfTransliterationStyleType;
import org.openoffice.odf.dom.type.number.OdfFormatSourceType;


/**
 * ODF DOM Element implementation for element "<number:date-style>".
 */
public abstract class OdfDateStyleElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.NUMBER, "date-style" );

    public OdfDateStyleElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "number:language".
     */
    public String getLanguage()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "language" ) );
    }

    /**
     * Set value of attribute "number:language".
     */
    public void setLanguage( String _aLanguage )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "language" ), _aLanguage );
    }

    /**
     * Get value of attribute "number:country".
     */
    public String getCountry()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "country" ) );
    }

    /**
     * Set value of attribute "number:country".
     */
    public void setCountry( String _aCountry )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "country" ), _aCountry );
    }

    /**
     * Get value of attribute "number:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "title" ) );
    }

    /**
     * Set value of attribute "number:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "style:volatile".
     */
    public Boolean getVolatile()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "volatile" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:volatile".
     */
    public void setVolatile( Boolean _aVolatile )
    {                    
        String aStringVal = OdfBoolean.toString( _aVolatile );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "volatile" ), aStringVal );
    }

    /**
     * Get value of attribute "number:transliteration-format".
     */
    public String getTransliterationFormat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-format" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:transliteration-format".
     */
    public void setTransliterationFormat( String _aTransliterationFormat )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-format" ), _aTransliterationFormat );
    }

    /**
     * Get value of attribute "number:transliteration-language".
     */
    public String getTransliterationLanguage()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-language" ) );
    }

    /**
     * Set value of attribute "number:transliteration-language".
     */
    public void setTransliterationLanguage( String _aTransliterationLanguage )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-language" ), _aTransliterationLanguage );
    }

    /**
     * Get value of attribute "number:transliteration-country".
     */
    public String getTransliterationCountry()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-country" ) );
    }

    /**
     * Set value of attribute "number:transliteration-country".
     */
    public void setTransliterationCountry( String _aTransliterationCountry )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-country" ), _aTransliterationCountry );
    }

    /**
     * Get value of attribute "number:transliteration-style".
     */
    public OdfTransliterationStyleType getTransliterationStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-style" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "short";
        }

        return OdfTransliterationStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:transliteration-style".
     */
    public void setTransliterationStyle( OdfTransliterationStyleType _aTransliterationStyle )
    {                    
        String aStringVal = OdfTransliterationStyleType.toString( _aTransliterationStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "transliteration-style" ), aStringVal );
    }

    /**
     * Get value of attribute "number:automatic-order".
     */
    public Boolean getAutomaticOrder()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "automatic-order" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:automatic-order".
     */
    public void setAutomaticOrder( Boolean _aAutomaticOrder )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutomaticOrder );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "automatic-order" ), aStringVal );
    }

    /**
     * Get value of attribute "number:format-source".
     */
    public OdfFormatSourceType getFormatSource()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "format-source" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "fixed";
        }

        return OdfFormatSourceType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:format-source".
     */
    public void setFormatSource( OdfFormatSourceType _aFormatSource )
    {                    
        String aStringVal = OdfFormatSourceType.toString( _aFormatSource );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "format-source" ), aStringVal );
    }

}
