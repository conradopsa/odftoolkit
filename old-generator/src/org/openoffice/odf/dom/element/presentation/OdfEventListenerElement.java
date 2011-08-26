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

package org.openoffice.odf.dom.element.presentation;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.presentation.OdfActionType;
import org.openoffice.odf.dom.type.presentation.OdfEffectType;
import org.openoffice.odf.dom.type.presentation.OdfDirectionType;
import org.openoffice.odf.dom.type.presentation.OdfSpeedType;
import org.openoffice.odf.dom.type.OdfPercent;
import org.openoffice.odf.dom.type.OdfAnyURI;
import org.openoffice.odf.dom.type.OdfNonNegativeInteger;


/**
 * ODF DOM Element implementation for element "<presentation:event-listener>".
 */
public abstract class OdfEventListenerElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.PRESENTATION, "event-listener" );

    public OdfEventListenerElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aEventName, OdfActionType _aAction)
    {
        setEventName( _aEventName );
        setAction( _aAction );
    }

    /**
     * Get value of attribute "script:event-name".
     */
    public String getEventName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SCRIPT, "event-name" ) );
    }

    /**
     * Set value of attribute "script:event-name".
     */
    public void setEventName( String _aEventName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SCRIPT, "event-name" ), _aEventName );
    }

    /**
     * Get value of attribute "presentation:action".
     */
    public OdfActionType getAction()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "action" ) );
        return OdfActionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:action".
     */
    public void setAction( OdfActionType _aAction )
    {                    
        String aStringVal = OdfActionType.toString( _aAction );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "action" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:effect".
     */
    public OdfEffectType getEffect()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "effect" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "none";
        }

        return OdfEffectType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:effect".
     */
    public void setEffect( OdfEffectType _aEffect )
    {                    
        String aStringVal = OdfEffectType.toString( _aEffect );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "effect" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:direction".
     */
    public OdfDirectionType getDirection()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "direction" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "none";
        }

        return OdfDirectionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:direction".
     */
    public void setDirection( OdfDirectionType _aDirection )
    {                    
        String aStringVal = OdfDirectionType.toString( _aDirection );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "direction" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:speed".
     */
    public OdfSpeedType getSpeed()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "speed" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "medium";
        }

        return OdfSpeedType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:speed".
     */
    public void setSpeed( OdfSpeedType _aSpeed )
    {                    
        String aStringVal = OdfSpeedType.toString( _aSpeed );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "speed" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:start-scale".
     */
    public Double getStartScale()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "start-scale" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "100%";
        }

        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:start-scale".
     */
    public void setStartScale( Double _aStartScale )
    {                    
        String aStringVal = OdfPercent.toString( _aStartScale );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "start-scale" ), aStringVal );
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
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "show" ), "embed" );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "actuate" ), "onRequest" );
    }

    /**
     * Get value of attribute "presentation:verb".
     */
    public Integer getVerb()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "verb" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:verb".
     */
    public void setVerb( Integer _aVerb )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aVerb );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "verb" ), aStringVal );
    }

}
