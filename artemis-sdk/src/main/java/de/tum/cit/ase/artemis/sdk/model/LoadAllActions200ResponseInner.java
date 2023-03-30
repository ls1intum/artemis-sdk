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
import de.tum.cit.ase.artemis.sdk.model.ConnectionUpdatedAction;
import de.tum.cit.ase.artemis.sdk.model.ContinuedAfterHandedInEarlyAction;
import de.tum.cit.ase.artemis.sdk.model.EndedExamAction;
import de.tum.cit.ase.artemis.sdk.model.ExamAction;
import de.tum.cit.ase.artemis.sdk.model.HandedInEarlyAction;
import de.tum.cit.ase.artemis.sdk.model.SavedExerciseAction;
import de.tum.cit.ase.artemis.sdk.model.StartedExamAction;
import de.tum.cit.ase.artemis.sdk.model.SwitchedExerciseAction;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
@JsonDeserialize(using = LoadAllActions200ResponseInner.LoadAllActions200ResponseInnerDeserializer.class)
@JsonSerialize(using = LoadAllActions200ResponseInner.LoadAllActions200ResponseInnerSerializer.class)
public class LoadAllActions200ResponseInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LoadAllActions200ResponseInner.class.getName());

    public static class LoadAllActions200ResponseInnerSerializer extends StdSerializer<LoadAllActions200ResponseInner> {
        public LoadAllActions200ResponseInnerSerializer(Class<LoadAllActions200ResponseInner> t) {
            super(t);
        }

        public LoadAllActions200ResponseInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(LoadAllActions200ResponseInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class LoadAllActions200ResponseInnerDeserializer extends StdDeserializer<LoadAllActions200ResponseInner> {
        public LoadAllActions200ResponseInnerDeserializer() {
            this(LoadAllActions200ResponseInner.class);
        }

        public LoadAllActions200ResponseInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public LoadAllActions200ResponseInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ConnectionUpdatedAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConnectionUpdatedAction.class.equals(Integer.class) || ConnectionUpdatedAction.class.equals(Long.class) || ConnectionUpdatedAction.class.equals(Float.class) || ConnectionUpdatedAction.class.equals(Double.class) || ConnectionUpdatedAction.class.equals(Boolean.class) || ConnectionUpdatedAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConnectionUpdatedAction.class.equals(Integer.class) || ConnectionUpdatedAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConnectionUpdatedAction.class.equals(Float.class) || ConnectionUpdatedAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConnectionUpdatedAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConnectionUpdatedAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConnectionUpdatedAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConnectionUpdatedAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConnectionUpdatedAction'", e);
            }

            // deserialize ContinuedAfterHandedInEarlyAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ContinuedAfterHandedInEarlyAction.class.equals(Integer.class) || ContinuedAfterHandedInEarlyAction.class.equals(Long.class) || ContinuedAfterHandedInEarlyAction.class.equals(Float.class) || ContinuedAfterHandedInEarlyAction.class.equals(Double.class) || ContinuedAfterHandedInEarlyAction.class.equals(Boolean.class) || ContinuedAfterHandedInEarlyAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ContinuedAfterHandedInEarlyAction.class.equals(Integer.class) || ContinuedAfterHandedInEarlyAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ContinuedAfterHandedInEarlyAction.class.equals(Float.class) || ContinuedAfterHandedInEarlyAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ContinuedAfterHandedInEarlyAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ContinuedAfterHandedInEarlyAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ContinuedAfterHandedInEarlyAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ContinuedAfterHandedInEarlyAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ContinuedAfterHandedInEarlyAction'", e);
            }

            // deserialize EndedExamAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EndedExamAction.class.equals(Integer.class) || EndedExamAction.class.equals(Long.class) || EndedExamAction.class.equals(Float.class) || EndedExamAction.class.equals(Double.class) || EndedExamAction.class.equals(Boolean.class) || EndedExamAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EndedExamAction.class.equals(Integer.class) || EndedExamAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EndedExamAction.class.equals(Float.class) || EndedExamAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EndedExamAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EndedExamAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndedExamAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EndedExamAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EndedExamAction'", e);
            }

            // deserialize ExamAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ExamAction.class.equals(Integer.class) || ExamAction.class.equals(Long.class) || ExamAction.class.equals(Float.class) || ExamAction.class.equals(Double.class) || ExamAction.class.equals(Boolean.class) || ExamAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ExamAction.class.equals(Integer.class) || ExamAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ExamAction.class.equals(Float.class) || ExamAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ExamAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ExamAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ExamAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ExamAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ExamAction'", e);
            }

            // deserialize HandedInEarlyAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (HandedInEarlyAction.class.equals(Integer.class) || HandedInEarlyAction.class.equals(Long.class) || HandedInEarlyAction.class.equals(Float.class) || HandedInEarlyAction.class.equals(Double.class) || HandedInEarlyAction.class.equals(Boolean.class) || HandedInEarlyAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((HandedInEarlyAction.class.equals(Integer.class) || HandedInEarlyAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((HandedInEarlyAction.class.equals(Float.class) || HandedInEarlyAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (HandedInEarlyAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (HandedInEarlyAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(HandedInEarlyAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'HandedInEarlyAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'HandedInEarlyAction'", e);
            }

            // deserialize SavedExerciseAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SavedExerciseAction.class.equals(Integer.class) || SavedExerciseAction.class.equals(Long.class) || SavedExerciseAction.class.equals(Float.class) || SavedExerciseAction.class.equals(Double.class) || SavedExerciseAction.class.equals(Boolean.class) || SavedExerciseAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SavedExerciseAction.class.equals(Integer.class) || SavedExerciseAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SavedExerciseAction.class.equals(Float.class) || SavedExerciseAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SavedExerciseAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SavedExerciseAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SavedExerciseAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SavedExerciseAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SavedExerciseAction'", e);
            }

            // deserialize StartedExamAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (StartedExamAction.class.equals(Integer.class) || StartedExamAction.class.equals(Long.class) || StartedExamAction.class.equals(Float.class) || StartedExamAction.class.equals(Double.class) || StartedExamAction.class.equals(Boolean.class) || StartedExamAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((StartedExamAction.class.equals(Integer.class) || StartedExamAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((StartedExamAction.class.equals(Float.class) || StartedExamAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (StartedExamAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (StartedExamAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(StartedExamAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'StartedExamAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'StartedExamAction'", e);
            }

            // deserialize SwitchedExerciseAction
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SwitchedExerciseAction.class.equals(Integer.class) || SwitchedExerciseAction.class.equals(Long.class) || SwitchedExerciseAction.class.equals(Float.class) || SwitchedExerciseAction.class.equals(Double.class) || SwitchedExerciseAction.class.equals(Boolean.class) || SwitchedExerciseAction.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SwitchedExerciseAction.class.equals(Integer.class) || SwitchedExerciseAction.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SwitchedExerciseAction.class.equals(Float.class) || SwitchedExerciseAction.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SwitchedExerciseAction.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SwitchedExerciseAction.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SwitchedExerciseAction.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SwitchedExerciseAction'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SwitchedExerciseAction'", e);
            }

            if (match == 1) {
                LoadAllActions200ResponseInner ret = new LoadAllActions200ResponseInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for LoadAllActions200ResponseInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public LoadAllActions200ResponseInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "LoadAllActions200ResponseInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public LoadAllActions200ResponseInner() {
        super("oneOf", Boolean.FALSE);
    }

    public LoadAllActions200ResponseInner(ConnectionUpdatedAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(ContinuedAfterHandedInEarlyAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(EndedExamAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(ExamAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(HandedInEarlyAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(SavedExerciseAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(StartedExamAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoadAllActions200ResponseInner(SwitchedExerciseAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConnectionUpdatedAction", new GenericType<ConnectionUpdatedAction>() {
        });
        schemas.put("ContinuedAfterHandedInEarlyAction", new GenericType<ContinuedAfterHandedInEarlyAction>() {
        });
        schemas.put("EndedExamAction", new GenericType<EndedExamAction>() {
        });
        schemas.put("ExamAction", new GenericType<ExamAction>() {
        });
        schemas.put("HandedInEarlyAction", new GenericType<HandedInEarlyAction>() {
        });
        schemas.put("SavedExerciseAction", new GenericType<SavedExerciseAction>() {
        });
        schemas.put("StartedExamAction", new GenericType<StartedExamAction>() {
        });
        schemas.put("SwitchedExerciseAction", new GenericType<SwitchedExerciseAction>() {
        });
        JSON.registerDescendants(LoadAllActions200ResponseInner.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("ConnectionUpdatedAction", ConnectionUpdatedAction.class);
        mappings.put("ContinuedAfterHandedInEarlyAction", ContinuedAfterHandedInEarlyAction.class);
        mappings.put("EndedExamAction", EndedExamAction.class);
        mappings.put("ExamAction", ExamAction.class);
        mappings.put("HandedInEarlyAction", HandedInEarlyAction.class);
        mappings.put("SavedExerciseAction", SavedExerciseAction.class);
        mappings.put("StartedExamAction", StartedExamAction.class);
        mappings.put("SwitchedExerciseAction", SwitchedExerciseAction.class);
        mappings.put("loadAllActions_200_response_inner", LoadAllActions200ResponseInner.class);
        JSON.registerDiscriminator(LoadAllActions200ResponseInner.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return LoadAllActions200ResponseInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ConnectionUpdatedAction, ContinuedAfterHandedInEarlyAction, EndedExamAction, ExamAction, HandedInEarlyAction, SavedExerciseAction, StartedExamAction, SwitchedExerciseAction
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ConnectionUpdatedAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ContinuedAfterHandedInEarlyAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EndedExamAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ExamAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(HandedInEarlyAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SavedExerciseAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(StartedExamAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SwitchedExerciseAction.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ConnectionUpdatedAction, ContinuedAfterHandedInEarlyAction, EndedExamAction, ExamAction, HandedInEarlyAction, SavedExerciseAction, StartedExamAction, SwitchedExerciseAction");
    }

    /**
     * Get the actual instance, which can be the following:
     * ConnectionUpdatedAction, ContinuedAfterHandedInEarlyAction, EndedExamAction, ExamAction, HandedInEarlyAction, SavedExerciseAction, StartedExamAction, SwitchedExerciseAction
     *
     * @return The actual instance (ConnectionUpdatedAction, ContinuedAfterHandedInEarlyAction, EndedExamAction, ExamAction, HandedInEarlyAction, SavedExerciseAction, StartedExamAction, SwitchedExerciseAction)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConnectionUpdatedAction`. If the actual instance is not `ConnectionUpdatedAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConnectionUpdatedAction`
     * @throws ClassCastException if the instance is not `ConnectionUpdatedAction`
     */
    public ConnectionUpdatedAction getConnectionUpdatedAction() throws ClassCastException {
        return (ConnectionUpdatedAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContinuedAfterHandedInEarlyAction`. If the actual instance is not `ContinuedAfterHandedInEarlyAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContinuedAfterHandedInEarlyAction`
     * @throws ClassCastException if the instance is not `ContinuedAfterHandedInEarlyAction`
     */
    public ContinuedAfterHandedInEarlyAction getContinuedAfterHandedInEarlyAction() throws ClassCastException {
        return (ContinuedAfterHandedInEarlyAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndedExamAction`. If the actual instance is not `EndedExamAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndedExamAction`
     * @throws ClassCastException if the instance is not `EndedExamAction`
     */
    public EndedExamAction getEndedExamAction() throws ClassCastException {
        return (EndedExamAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ExamAction`. If the actual instance is not `ExamAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExamAction`
     * @throws ClassCastException if the instance is not `ExamAction`
     */
    public ExamAction getExamAction() throws ClassCastException {
        return (ExamAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HandedInEarlyAction`. If the actual instance is not `HandedInEarlyAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HandedInEarlyAction`
     * @throws ClassCastException if the instance is not `HandedInEarlyAction`
     */
    public HandedInEarlyAction getHandedInEarlyAction() throws ClassCastException {
        return (HandedInEarlyAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SavedExerciseAction`. If the actual instance is not `SavedExerciseAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SavedExerciseAction`
     * @throws ClassCastException if the instance is not `SavedExerciseAction`
     */
    public SavedExerciseAction getSavedExerciseAction() throws ClassCastException {
        return (SavedExerciseAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StartedExamAction`. If the actual instance is not `StartedExamAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StartedExamAction`
     * @throws ClassCastException if the instance is not `StartedExamAction`
     */
    public StartedExamAction getStartedExamAction() throws ClassCastException {
        return (StartedExamAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SwitchedExerciseAction`. If the actual instance is not `SwitchedExerciseAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SwitchedExerciseAction`
     * @throws ClassCastException if the instance is not `SwitchedExerciseAction`
     */
    public SwitchedExerciseAction getSwitchedExerciseAction() throws ClassCastException {
        return (SwitchedExerciseAction)super.getActualInstance();
    }

}

