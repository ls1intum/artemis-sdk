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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.CodeHint;
import de.tum.cit.ase.artemis.sdk.model.ExerciseHint;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseSolutionEntry;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTask;
import java.util.LinkedHashSet;
import java.util.Set;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonDeserialize(using = GetExerciseHint200Response.GetExerciseHint200ResponseDeserializer.class)
@JsonSerialize(using = GetExerciseHint200Response.GetExerciseHint200ResponseSerializer.class)
public class GetExerciseHint200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetExerciseHint200Response.class.getName());

    public static class GetExerciseHint200ResponseSerializer extends StdSerializer<GetExerciseHint200Response> {
        public GetExerciseHint200ResponseSerializer(Class<GetExerciseHint200Response> t) {
            super(t);
        }

        public GetExerciseHint200ResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(GetExerciseHint200Response value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GetExerciseHint200ResponseDeserializer extends StdDeserializer<GetExerciseHint200Response> {
        public GetExerciseHint200ResponseDeserializer() {
            this(GetExerciseHint200Response.class);
        }

        public GetExerciseHint200ResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GetExerciseHint200Response deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CodeHint
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CodeHint.class.equals(Integer.class) || CodeHint.class.equals(Long.class) || CodeHint.class.equals(Float.class) || CodeHint.class.equals(Double.class) || CodeHint.class.equals(Boolean.class) || CodeHint.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CodeHint.class.equals(Integer.class) || CodeHint.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CodeHint.class.equals(Float.class) || CodeHint.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CodeHint.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CodeHint.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CodeHint.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CodeHint'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CodeHint'", e);
            }

            // deserialize ExerciseHint
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ExerciseHint.class.equals(Integer.class) || ExerciseHint.class.equals(Long.class) || ExerciseHint.class.equals(Float.class) || ExerciseHint.class.equals(Double.class) || ExerciseHint.class.equals(Boolean.class) || ExerciseHint.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ExerciseHint.class.equals(Integer.class) || ExerciseHint.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ExerciseHint.class.equals(Float.class) || ExerciseHint.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ExerciseHint.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ExerciseHint.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ExerciseHint.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ExerciseHint'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ExerciseHint'", e);
            }

            if (match == 1) {
                GetExerciseHint200Response ret = new GetExerciseHint200Response();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GetExerciseHint200Response: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GetExerciseHint200Response getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GetExerciseHint200Response cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetExerciseHint200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetExerciseHint200Response(CodeHint o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExerciseHint200Response(ExerciseHint o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CodeHint", new GenericType<CodeHint>() {
        });
        schemas.put("ExerciseHint", new GenericType<ExerciseHint>() {
        });
        JSON.registerDescendants(GetExerciseHint200Response.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("CodeHint", CodeHint.class);
        mappings.put("ExerciseHint", ExerciseHint.class);
        mappings.put("getExerciseHint_200_response", GetExerciseHint200Response.class);
        JSON.registerDiscriminator(GetExerciseHint200Response.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetExerciseHint200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CodeHint, ExerciseHint
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CodeHint.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ExerciseHint.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CodeHint, ExerciseHint");
    }

    /**
     * Get the actual instance, which can be the following:
     * CodeHint, ExerciseHint
     *
     * @return The actual instance (CodeHint, ExerciseHint)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CodeHint`. If the actual instance is not `CodeHint`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CodeHint`
     * @throws ClassCastException if the instance is not `CodeHint`
     */
    public CodeHint getCodeHint() throws ClassCastException {
        return (CodeHint)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ExerciseHint`. If the actual instance is not `ExerciseHint`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExerciseHint`
     * @throws ClassCastException if the instance is not `ExerciseHint`
     */
    public ExerciseHint getExerciseHint() throws ClassCastException {
        return (ExerciseHint)super.getActualInstance();
    }

}

