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

import org.odftoolkit.odfdom.dom.type.text.OdfBibliographyType;

/**
 * ODF DOM Element implementation for element "<text:bibliography-source>".
 */
public abstract class OdfBibliographySourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "bibliography-source" );

    public OdfBibliographySourceElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
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
    * Create child element "text:bibliography-entry-template".
    */
    public OdfBibliographyEntryTemplateElement createBibliographyEntryTemplateElement(OdfBibliographyType   _aBibliographyType, String   _aStyleName)
    {
        OdfBibliographyEntryTemplateElement  _nBibliographyEntryTemplate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfBibliographyEntryTemplateElement.class);
        _nBibliographyEntryTemplate.setBibliographyType( _aBibliographyType);
        _nBibliographyEntryTemplate.setStyleName( _aStyleName);
        this.appendChild( _nBibliographyEntryTemplate);
        return  _nBibliographyEntryTemplate;      
    }
    
}
