// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * Groups settings regarding specific field of an arrow schema.
 */
@Fluent
public final class ArrowField implements XmlSerializable<ArrowField> {
    /*
     * The Type property.
     */
    private String type;

    /*
     * The Name property.
     */
    private String name;

    /*
     * The Precision property.
     */
    private Integer precision;

    /*
     * The Scale property.
     */
    private Integer scale;

    /**
     * Creates an instance of ArrowField class.
     */
    public ArrowField() {
    }

    /**
     * Get the type property: The Type property.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The Type property.
     * 
     * @param type the type value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The Name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     * 
     * @param name the name value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the precision property: The Precision property.
     * 
     * @return the precision value.
     */
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Set the precision property: The Precision property.
     * 
     * @param precision the precision value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Get the scale property: The Scale property.
     * 
     * @return the scale value.
     */
    public Integer getScale() {
        return this.scale;
    }

    /**
     * Set the scale property: The Scale property.
     * 
     * @param scale the scale value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Field" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Type", this.type);
        xmlWriter.writeStringElement("Name", this.name);
        xmlWriter.writeNumberElement("Precision", this.precision);
        xmlWriter.writeNumberElement("Scale", this.scale);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ArrowField from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of ArrowField if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the ArrowField.
     */
    public static ArrowField fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ArrowField from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of ArrowField if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the ArrowField.
     */
    public static ArrowField fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Field" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            ArrowField deserializedArrowField = new ArrowField();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Type".equals(elementName.getLocalPart())) {
                    deserializedArrowField.type = reader.getStringElement();
                } else if ("Name".equals(elementName.getLocalPart())) {
                    deserializedArrowField.name = reader.getStringElement();
                } else if ("Precision".equals(elementName.getLocalPart())) {
                    deserializedArrowField.precision = reader.getNullableElement(Integer::parseInt);
                } else if ("Scale".equals(elementName.getLocalPart())) {
                    deserializedArrowField.scale = reader.getNullableElement(Integer::parseInt);
                } else {
                    reader.skipElement();
                }
            }

            return deserializedArrowField;
        });
    }
}
