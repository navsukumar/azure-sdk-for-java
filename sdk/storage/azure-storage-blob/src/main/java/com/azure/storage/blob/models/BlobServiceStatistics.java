// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * Stats for the storage service.
 */
@Fluent
public final class BlobServiceStatistics implements XmlSerializable<BlobServiceStatistics> {
    /*
     * Geo-Replication information for the Secondary Storage Service
     */
    private GeoReplication geoReplication;

    /**
     * Creates an instance of BlobServiceStatistics class.
     */
    public BlobServiceStatistics() {
    }

    /**
     * Get the geoReplication property: Geo-Replication information for the Secondary Storage Service.
     * 
     * @return the geoReplication value.
     */
    public GeoReplication getGeoReplication() {
        return this.geoReplication;
    }

    /**
     * Set the geoReplication property: Geo-Replication information for the Secondary Storage Service.
     * 
     * @param geoReplication the geoReplication value to set.
     * @return the BlobServiceStatistics object itself.
     */
    public BlobServiceStatistics setGeoReplication(GeoReplication geoReplication) {
        this.geoReplication = geoReplication;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "StorageServiceStats" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeXml(this.geoReplication, "GeoReplication");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of BlobServiceStatistics from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of BlobServiceStatistics if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobServiceStatistics.
     */
    public static BlobServiceStatistics fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of BlobServiceStatistics from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of BlobServiceStatistics if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the BlobServiceStatistics.
     */
    public static BlobServiceStatistics fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName
            = CoreUtils.isNullOrEmpty(rootElementName) ? "StorageServiceStats" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            BlobServiceStatistics deserializedBlobServiceStatistics = new BlobServiceStatistics();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("GeoReplication".equals(elementName.getLocalPart())) {
                    deserializedBlobServiceStatistics.geoReplication = GeoReplication.fromXml(reader, "GeoReplication");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedBlobServiceStatistics;
        });
    }
}
