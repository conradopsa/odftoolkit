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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.text.OdfIndexScopeType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;

;

/**
 * ODF DOM Element implementation for element "<text:object-index-source>".
 */
public abstract class OdfObjectIndexSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "object-index-source" );

    public OdfObjectIndexSourceElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "text:use-spreadsheet-objects".
     */
    public Boolean getUseSpreadsheetObjects()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-spreadsheet-objects" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-spreadsheet-objects".
     */
    public void setUseSpreadsheetObjects( Boolean _aUseSpreadsheetObjects )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseSpreadsheetObjects );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-spreadsheet-objects" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-math-objects".
     */
    public Boolean getUseMathObjects()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-math-objects" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-math-objects".
     */
    public void setUseMathObjects( Boolean _aUseMathObjects )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseMathObjects );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-math-objects" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-draw-objects".
     */
    public Boolean getUseDrawObjects()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-draw-objects" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-draw-objects".
     */
    public void setUseDrawObjects( Boolean _aUseDrawObjects )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseDrawObjects );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-draw-objects" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-chart-objects".
     */
    public Boolean getUseChartObjects()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-chart-objects" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-chart-objects".
     */
    public void setUseChartObjects( Boolean _aUseChartObjects )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseChartObjects );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-chart-objects" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-other-objects".
     */
    public Boolean getUseOtherObjects()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-other-objects" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-other-objects".
     */
    public void setUseOtherObjects( Boolean _aUseOtherObjects )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseOtherObjects );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-other-objects" ), aStringVal );
    }

    /**
    * Create child element "text:index-title-template".
    */
    public OdfIndexTitleTemplateElement createIndexTitleTemplateElement()
    {
        OdfIndexTitleTemplateElement  _nIndexTitleTemplate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfIndexTitleTemplateElement.class);
        this.appendChild( _nIndexTitleTemplate);
        return  _nIndexTitleTemplate;
    }                   
               
    /**
    * Create child element "text:object-index-entry-template".
    */
    public OdfObjectIndexEntryTemplateElement createObjectIndexEntryTemplateElement(String   _aStyleName)
    {
        OdfObjectIndexEntryTemplateElement  _nObjectIndexEntryTemplate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfObjectIndexEntryTemplateElement.class);
        _nObjectIndexEntryTemplate.setStyleName( _aStyleName);
        this.appendChild( _nObjectIndexEntryTemplate);
        return  _nObjectIndexEntryTemplate;      
    }
    
}
