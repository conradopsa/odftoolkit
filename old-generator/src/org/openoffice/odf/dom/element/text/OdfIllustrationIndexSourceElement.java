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
import org.openoffice.odf.dom.type.text.OdfIndexScopeType;
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.text.OdfCaptionSequenceFormatType;


/**
 * ODF DOM Element implementation for element "<text:illustration-index-source>".
 */
public abstract class OdfIllustrationIndexSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "illustration-index-source" );

    public OdfIllustrationIndexSourceElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "text:index-scope".
     */
    public OdfIndexScopeType getIndexScope()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-scope" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "document";
        }

        return OdfIndexScopeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:index-scope".
     */
    public void setIndexScope( OdfIndexScopeType _aIndexScope )
    {                    
        String aStringVal = OdfIndexScopeType.toString( _aIndexScope );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-scope" ), aStringVal );
    }

    /**
     * Get value of attribute "text:relative-tab-stop-position".
     */
    public Boolean getRelativeTabStopPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "relative-tab-stop-position" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:relative-tab-stop-position".
     */
    public void setRelativeTabStopPosition( Boolean _aRelativeTabStopPosition )
    {                    
        String aStringVal = OdfBoolean.toString( _aRelativeTabStopPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "relative-tab-stop-position" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-caption".
     */
    public Boolean getUseCaption()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-caption" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-caption".
     */
    public void setUseCaption( Boolean _aUseCaption )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseCaption );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-caption" ), aStringVal );
    }

    /**
     * Get value of attribute "text:caption-sequence-name".
     */
    public String getCaptionSequenceName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "caption-sequence-name" ) );
    }

    /**
     * Set value of attribute "text:caption-sequence-name".
     */
    public void setCaptionSequenceName( String _aCaptionSequenceName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "caption-sequence-name" ), _aCaptionSequenceName );
    }

    /**
     * Get value of attribute "text:caption-sequence-format".
     */
    public OdfCaptionSequenceFormatType getCaptionSequenceFormat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "caption-sequence-format" ) );
        return OdfCaptionSequenceFormatType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:caption-sequence-format".
     */
    public void setCaptionSequenceFormat( OdfCaptionSequenceFormatType _aCaptionSequenceFormat )
    {                    
        String aStringVal = OdfCaptionSequenceFormatType.toString( _aCaptionSequenceFormat );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "caption-sequence-format" ), aStringVal );
    }

}
