/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.tum.cit.ase.artemis.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.GroupNotification;
import de.tum.cit.ase.artemis.sdk.model.NotificationTarget;
import de.tum.cit.ase.artemis.sdk.model.SingleUserNotification;
import de.tum.cit.ase.artemis.sdk.model.SystemNotification;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.tum.cit.ase.artemis.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonDeserialize(using = GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerDeserializer.class)
@JsonSerialize(using = GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerSerializer.class)
public class GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.class.getName());

    public static class GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerSerializer extends StdSerializer<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> {
        public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerSerializer(Class<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> t) {
            super(t);
        }

        public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerDeserializer extends StdDeserializer<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> {
        public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerDeserializer() {
            this(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.class);
        }

        public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize GroupNotification
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GroupNotification.class.equals(Integer.class) || GroupNotification.class.equals(Long.class) || GroupNotification.class.equals(Float.class) || GroupNotification.class.equals(Double.class) || GroupNotification.class.equals(Boolean.class) || GroupNotification.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GroupNotification.class.equals(Integer.class) || GroupNotification.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GroupNotification.class.equals(Float.class) || GroupNotification.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (GroupNotification.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GroupNotification.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GroupNotification.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GroupNotification'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GroupNotification'", e);
            }

            // deserialize SingleUserNotification
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SingleUserNotification.class.equals(Integer.class) || SingleUserNotification.class.equals(Long.class) || SingleUserNotification.class.equals(Float.class) || SingleUserNotification.class.equals(Double.class) || SingleUserNotification.class.equals(Boolean.class) || SingleUserNotification.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SingleUserNotification.class.equals(Integer.class) || SingleUserNotification.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SingleUserNotification.class.equals(Float.class) || SingleUserNotification.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SingleUserNotification.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SingleUserNotification.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SingleUserNotification.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SingleUserNotification'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SingleUserNotification'", e);
            }

            // deserialize SystemNotification
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SystemNotification.class.equals(Integer.class) || SystemNotification.class.equals(Long.class) || SystemNotification.class.equals(Float.class) || SystemNotification.class.equals(Double.class) || SystemNotification.class.equals(Boolean.class) || SystemNotification.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SystemNotification.class.equals(Integer.class) || SystemNotification.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SystemNotification.class.equals(Float.class) || SystemNotification.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SystemNotification.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SystemNotification.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SystemNotification.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SystemNotification'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SystemNotification'", e);
            }

            if (match == 1) {
                GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner ret = new GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner() {
        super("oneOf", Boolean.FALSE);
    }

    public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner(GroupNotification o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner(SingleUserNotification o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner(SystemNotification o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GroupNotification", new GenericType<GroupNotification>() {
        });
        schemas.put("SingleUserNotification", new GenericType<SingleUserNotification>() {
        });
        schemas.put("SystemNotification", new GenericType<SystemNotification>() {
        });
        JSON.registerDescendants(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("GroupNotification", GroupNotification.class);
        mappings.put("SingleUserNotification", SingleUserNotification.class);
        mappings.put("SystemNotification", SystemNotification.class);
        mappings.put("getAllNotificationsForCurrentUserFilteredBySettings_200_response_inner", GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.class);
        JSON.registerDiscriminator(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.class, "notificationType", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GroupNotification, SingleUserNotification, SystemNotification
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(GroupNotification.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SingleUserNotification.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SystemNotification.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GroupNotification, SingleUserNotification, SystemNotification");
    }

    /**
     * Get the actual instance, which can be the following:
     * GroupNotification, SingleUserNotification, SystemNotification
     *
     * @return The actual instance (GroupNotification, SingleUserNotification, SystemNotification)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GroupNotification`. If the actual instance is not `GroupNotification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GroupNotification`
     * @throws ClassCastException if the instance is not `GroupNotification`
     */
    public GroupNotification getGroupNotification() throws ClassCastException {
        return (GroupNotification)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SingleUserNotification`. If the actual instance is not `SingleUserNotification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SingleUserNotification`
     * @throws ClassCastException if the instance is not `SingleUserNotification`
     */
    public SingleUserNotification getSingleUserNotification() throws ClassCastException {
        return (SingleUserNotification)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SystemNotification`. If the actual instance is not `SystemNotification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SystemNotification`
     * @throws ClassCastException if the instance is not `SystemNotification`
     */
    public SystemNotification getSystemNotification() throws ClassCastException {
        return (SystemNotification)super.getActualInstance();
    }

}
