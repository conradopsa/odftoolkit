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

package org.openoffice.odf.dom.element.svg;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.svg.OdfSpreadmethodType;
import org.openoffice.odf.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<svg:radialGradient>".
 */
public abstract class OdfRadialgradientElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.SVG, "radialGradient" );

    public OdfRadialgradientElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "svg:gradientUnits".
     */
    public String getGradientunits()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "gradientUnits" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "objectBoundingBox";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:gradientUnits".
     */
    public void setGradientunits( String _aGradientunits )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "gradientUnits" ), _aGradientunits );
    }

    /**
     * Get value of attribute "svg:gradientTransform".
     */
    public String getGradienttransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "gradientTransform" ) );
    }

    /**
     * Set value of attribute "svg:gradientTransform".
     */
    public void setGradienttransform( String _aGradienttransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "gradientTransform" ), _aGradienttransform );
    }

    /**
     * Get value of attribute "svg:spreadMethod".
     */
    public OdfSpreadmethodType getSpreadmethod()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "spreadMethod" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "pad";
        }

        return OdfSpreadmethodType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:spreadMethod".
     */
    public void setSpreadmethod( OdfSpreadmethodType _aSpreadmethod )
    {                    
        String aStringVal = OdfSpreadmethodType.toString( _aSpreadmethod );
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "spreadMethod" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:name".
     */
    public String getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:name".
     */
    public void setName( String _aName )
    {                    
        String aStringVal = OdfStyleName.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:display-name".
     */
    public String getDisplayName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ) );
    }

    /**
     * Set value of attribute "draw:display-name".
     */
    public void setDisplayName( String _aDisplayName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ), _aDisplayName );
    }

    /**
     * Get value of attribute "svg:cx".
     */
    public String getCx()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "cx" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "50%";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:cx".
     */
    public void setCx( String _aCx )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "cx" ), _aCx );
    }

    /**
     * Get value of attribute "svg:cy".
     */
    public String getCy()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "cy" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "50%";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:cy".
     */
    public void setCy( String _aCy )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "cy" ), _aCy );
    }

    /**
     * Get value of attribute "svg:r".
     */
    public String getR()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "r" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "50%";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:r".
     */
    public void setR( String _aR )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "r" ), _aR );
    }

    /**
     * Get value of attribute "svg:fx".
     */
    public String getFx()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "fx" ) );
    }

    /**
     * Set value of attribute "svg:fx".
     */
    public void setFx( String _aFx )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "fx" ), _aFx );
    }

    /**
     * Get value of attribute "svg:fy".
     */
    public String getFy()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "fy" ) );
    }

    /**
     * Set value of attribute "svg:fy".
     */
    public void setFy( String _aFy )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "fy" ), _aFy );
    }

}
