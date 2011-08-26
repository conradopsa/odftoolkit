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
import org.openoffice.odf.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<number:fraction>".
 */
public abstract class OdfFractionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.NUMBER, "fraction" );

    public OdfFractionElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "number:min-numerator-digits".
     */
    public Integer getMinNumeratorDigits()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-numerator-digits" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:min-numerator-digits".
     */
    public void setMinNumeratorDigits( Integer _aMinNumeratorDigits )
    {                    
        String aStringVal = Integer.toString( _aMinNumeratorDigits );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-numerator-digits" ), aStringVal );
    }

    /**
     * Get value of attribute "number:min-denominator-digits".
     */
    public Integer getMinDenominatorDigits()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-denominator-digits" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:min-denominator-digits".
     */
    public void setMinDenominatorDigits( Integer _aMinDenominatorDigits )
    {                    
        String aStringVal = Integer.toString( _aMinDenominatorDigits );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-denominator-digits" ), aStringVal );
    }

    /**
     * Get value of attribute "number:denominator-value".
     */
    public Integer getDenominatorValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "denominator-value" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:denominator-value".
     */
    public void setDenominatorValue( Integer _aDenominatorValue )
    {                    
        String aStringVal = Integer.toString( _aDenominatorValue );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "denominator-value" ), aStringVal );
    }

    /**
     * Get value of attribute "number:min-integer-digits".
     */
    public Integer getMinIntegerDigits()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-integer-digits" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:min-integer-digits".
     */
    public void setMinIntegerDigits( Integer _aMinIntegerDigits )
    {                    
        String aStringVal = Integer.toString( _aMinIntegerDigits );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-integer-digits" ), aStringVal );
    }

    /**
     * Get value of attribute "number:grouping".
     */
    public Boolean getGrouping()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "grouping" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:grouping".
     */
    public void setGrouping( Boolean _aGrouping )
    {                    
        String aStringVal = OdfBoolean.toString( _aGrouping );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "grouping" ), aStringVal );
    }

}
