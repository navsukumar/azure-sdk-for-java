// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User Info of Informatica Organization resource.
 */
@Fluent
public final class UserDetails implements JsonSerializable<UserDetails> {
    /*
     * User first name.
     */
    private String firstName;

    /*
     * User last name.
     */
    private String lastName;

    /*
     * User email address.
     */
    private String emailAddress;

    /*
     * UPN of user
     */
    private String upn;

    /*
     * Phone number of the user used by for contacting them if needed
     */
    private String phoneNumber;

    /**
     * Creates an instance of UserDetails class.
     */
    public UserDetails() {
    }

    /**
     * Get the firstName property: User first name.
     * 
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: User first name.
     * 
     * @param firstName the firstName value to set.
     * @return the UserDetails object itself.
     */
    public UserDetails withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: User last name.
     * 
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: User last name.
     * 
     * @param lastName the lastName value to set.
     * @return the UserDetails object itself.
     */
    public UserDetails withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the emailAddress property: User email address.
     * 
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: User email address.
     * 
     * @param emailAddress the emailAddress value to set.
     * @return the UserDetails object itself.
     */
    public UserDetails withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the upn property: UPN of user.
     * 
     * @return the upn value.
     */
    public String upn() {
        return this.upn;
    }

    /**
     * Set the upn property: UPN of user.
     * 
     * @param upn the upn value to set.
     * @return the UserDetails object itself.
     */
    public UserDetails withUpn(String upn) {
        this.upn = upn;
        return this;
    }

    /**
     * Get the phoneNumber property: Phone number of the user used by for contacting them if needed.
     * 
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: Phone number of the user used by for contacting them if needed.
     * 
     * @param phoneNumber the phoneNumber value to set.
     * @return the UserDetails object itself.
     */
    public UserDetails withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
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
        jsonWriter.writeStringField("firstName", this.firstName);
        jsonWriter.writeStringField("lastName", this.lastName);
        jsonWriter.writeStringField("emailAddress", this.emailAddress);
        jsonWriter.writeStringField("upn", this.upn);
        jsonWriter.writeStringField("phoneNumber", this.phoneNumber);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserDetails.
     */
    public static UserDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserDetails deserializedUserDetails = new UserDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("firstName".equals(fieldName)) {
                    deserializedUserDetails.firstName = reader.getString();
                } else if ("lastName".equals(fieldName)) {
                    deserializedUserDetails.lastName = reader.getString();
                } else if ("emailAddress".equals(fieldName)) {
                    deserializedUserDetails.emailAddress = reader.getString();
                } else if ("upn".equals(fieldName)) {
                    deserializedUserDetails.upn = reader.getString();
                } else if ("phoneNumber".equals(fieldName)) {
                    deserializedUserDetails.phoneNumber = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserDetails;
        });
    }
}
