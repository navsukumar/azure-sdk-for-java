// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes how the service is partitioned.
 */
@Immutable
public class Partition implements JsonSerializable<Partition> {
    /*
     * Specifies how the service is partitioned.
     */
    private PartitionScheme partitionScheme = PartitionScheme.fromString("Partition");

    /**
     * Creates an instance of Partition class.
     */
    public Partition() {
    }

    /**
     * Get the partitionScheme property: Specifies how the service is partitioned.
     * 
     * @return the partitionScheme value.
     */
    public PartitionScheme partitionScheme() {
        return this.partitionScheme;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("partitionScheme",
            this.partitionScheme == null ? null : this.partitionScheme.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Partition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Partition if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Partition.
     */
    public static Partition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("partitionScheme".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Named".equals(discriminatorValue)) {
                    return NamedPartitionScheme.fromJson(readerToUse.reset());
                } else if ("Singleton".equals(discriminatorValue)) {
                    return SingletonPartitionScheme.fromJson(readerToUse.reset());
                } else if ("UniformInt64Range".equals(discriminatorValue)) {
                    return UniformInt64RangePartitionScheme.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static Partition fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Partition deserializedPartition = new Partition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("partitionScheme".equals(fieldName)) {
                    deserializedPartition.partitionScheme = PartitionScheme.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPartition;
        });
    }
}
