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
import de.tum.cit.ase.artemis.sdk.model.BuildLogEntry;
import de.tum.cit.ase.artemis.sdk.model.FileUploadSubmission;
import de.tum.cit.ase.artemis.sdk.model.ModelingSubmission;
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import de.tum.cit.ase.artemis.sdk.model.QuizSubmission;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.SimilarElementCount;
import de.tum.cit.ase.artemis.sdk.model.SubmittedAnswer;
import de.tum.cit.ase.artemis.sdk.model.TextBlock;
import de.tum.cit.ase.artemis.sdk.model.TextSubmission;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
@JsonDeserialize(using = GetAllTextSubmissions200ResponseInner.GetAllTextSubmissions200ResponseInnerDeserializer.class)
@JsonSerialize(using = GetAllTextSubmissions200ResponseInner.GetAllTextSubmissions200ResponseInnerSerializer.class)
public class GetAllTextSubmissions200ResponseInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetAllTextSubmissions200ResponseInner.class.getName());

    public static class GetAllTextSubmissions200ResponseInnerSerializer extends StdSerializer<GetAllTextSubmissions200ResponseInner> {
        public GetAllTextSubmissions200ResponseInnerSerializer(Class<GetAllTextSubmissions200ResponseInner> t) {
            super(t);
        }

        public GetAllTextSubmissions200ResponseInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(GetAllTextSubmissions200ResponseInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GetAllTextSubmissions200ResponseInnerDeserializer extends StdDeserializer<GetAllTextSubmissions200ResponseInner> {
        public GetAllTextSubmissions200ResponseInnerDeserializer() {
            this(GetAllTextSubmissions200ResponseInner.class);
        }

        public GetAllTextSubmissions200ResponseInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GetAllTextSubmissions200ResponseInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize FileUploadSubmission
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FileUploadSubmission.class.equals(Integer.class) || FileUploadSubmission.class.equals(Long.class) || FileUploadSubmission.class.equals(Float.class) || FileUploadSubmission.class.equals(Double.class) || FileUploadSubmission.class.equals(Boolean.class) || FileUploadSubmission.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FileUploadSubmission.class.equals(Integer.class) || FileUploadSubmission.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FileUploadSubmission.class.equals(Float.class) || FileUploadSubmission.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FileUploadSubmission.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FileUploadSubmission.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FileUploadSubmission.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FileUploadSubmission'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FileUploadSubmission'", e);
            }

            // deserialize ModelingSubmission
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ModelingSubmission.class.equals(Integer.class) || ModelingSubmission.class.equals(Long.class) || ModelingSubmission.class.equals(Float.class) || ModelingSubmission.class.equals(Double.class) || ModelingSubmission.class.equals(Boolean.class) || ModelingSubmission.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ModelingSubmission.class.equals(Integer.class) || ModelingSubmission.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ModelingSubmission.class.equals(Float.class) || ModelingSubmission.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ModelingSubmission.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ModelingSubmission.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ModelingSubmission.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ModelingSubmission'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ModelingSubmission'", e);
            }

            // deserialize ProgrammingSubmission
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ProgrammingSubmission.class.equals(Integer.class) || ProgrammingSubmission.class.equals(Long.class) || ProgrammingSubmission.class.equals(Float.class) || ProgrammingSubmission.class.equals(Double.class) || ProgrammingSubmission.class.equals(Boolean.class) || ProgrammingSubmission.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ProgrammingSubmission.class.equals(Integer.class) || ProgrammingSubmission.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ProgrammingSubmission.class.equals(Float.class) || ProgrammingSubmission.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ProgrammingSubmission.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ProgrammingSubmission.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ProgrammingSubmission.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ProgrammingSubmission'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ProgrammingSubmission'", e);
            }

            // deserialize QuizSubmission
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (QuizSubmission.class.equals(Integer.class) || QuizSubmission.class.equals(Long.class) || QuizSubmission.class.equals(Float.class) || QuizSubmission.class.equals(Double.class) || QuizSubmission.class.equals(Boolean.class) || QuizSubmission.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((QuizSubmission.class.equals(Integer.class) || QuizSubmission.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((QuizSubmission.class.equals(Float.class) || QuizSubmission.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (QuizSubmission.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (QuizSubmission.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(QuizSubmission.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'QuizSubmission'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'QuizSubmission'", e);
            }

            // deserialize TextSubmission
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TextSubmission.class.equals(Integer.class) || TextSubmission.class.equals(Long.class) || TextSubmission.class.equals(Float.class) || TextSubmission.class.equals(Double.class) || TextSubmission.class.equals(Boolean.class) || TextSubmission.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TextSubmission.class.equals(Integer.class) || TextSubmission.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TextSubmission.class.equals(Float.class) || TextSubmission.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TextSubmission.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TextSubmission.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TextSubmission.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TextSubmission'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TextSubmission'", e);
            }

            if (match == 1) {
                GetAllTextSubmissions200ResponseInner ret = new GetAllTextSubmissions200ResponseInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GetAllTextSubmissions200ResponseInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GetAllTextSubmissions200ResponseInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GetAllTextSubmissions200ResponseInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public GetAllTextSubmissions200ResponseInner() {
        super("oneOf", Boolean.FALSE);
    }

    public GetAllTextSubmissions200ResponseInner(FileUploadSubmission o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAllTextSubmissions200ResponseInner(ModelingSubmission o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAllTextSubmissions200ResponseInner(ProgrammingSubmission o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAllTextSubmissions200ResponseInner(QuizSubmission o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAllTextSubmissions200ResponseInner(TextSubmission o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FileUploadSubmission", new GenericType<FileUploadSubmission>() {
        });
        schemas.put("ModelingSubmission", new GenericType<ModelingSubmission>() {
        });
        schemas.put("ProgrammingSubmission", new GenericType<ProgrammingSubmission>() {
        });
        schemas.put("QuizSubmission", new GenericType<QuizSubmission>() {
        });
        schemas.put("TextSubmission", new GenericType<TextSubmission>() {
        });
        JSON.registerDescendants(GetAllTextSubmissions200ResponseInner.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<>();
        mappings.put("FileUploadSubmission", FileUploadSubmission.class);
        mappings.put("ModelingSubmission", ModelingSubmission.class);
        mappings.put("ProgrammingSubmission", ProgrammingSubmission.class);
        mappings.put("QuizSubmission", QuizSubmission.class);
        mappings.put("TextSubmission", TextSubmission.class);
        mappings.put("getAllTextSubmissions_200_response_inner", GetAllTextSubmissions200ResponseInner.class);
        JSON.registerDiscriminator(GetAllTextSubmissions200ResponseInner.class, "submissionExerciseType", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetAllTextSubmissions200ResponseInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FileUploadSubmission, ModelingSubmission, ProgrammingSubmission, QuizSubmission, TextSubmission
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(FileUploadSubmission.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ModelingSubmission.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ProgrammingSubmission.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(QuizSubmission.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TextSubmission.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FileUploadSubmission, ModelingSubmission, ProgrammingSubmission, QuizSubmission, TextSubmission");
    }

    /**
     * Get the actual instance, which can be the following:
     * FileUploadSubmission, ModelingSubmission, ProgrammingSubmission, QuizSubmission, TextSubmission
     *
     * @return The actual instance (FileUploadSubmission, ModelingSubmission, ProgrammingSubmission, QuizSubmission, TextSubmission)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FileUploadSubmission`. If the actual instance is not `FileUploadSubmission`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FileUploadSubmission`
     * @throws ClassCastException if the instance is not `FileUploadSubmission`
     */
    public FileUploadSubmission getFileUploadSubmission() throws ClassCastException {
        return (FileUploadSubmission)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ModelingSubmission`. If the actual instance is not `ModelingSubmission`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ModelingSubmission`
     * @throws ClassCastException if the instance is not `ModelingSubmission`
     */
    public ModelingSubmission getModelingSubmission() throws ClassCastException {
        return (ModelingSubmission)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProgrammingSubmission`. If the actual instance is not `ProgrammingSubmission`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProgrammingSubmission`
     * @throws ClassCastException if the instance is not `ProgrammingSubmission`
     */
    public ProgrammingSubmission getProgrammingSubmission() throws ClassCastException {
        return (ProgrammingSubmission)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QuizSubmission`. If the actual instance is not `QuizSubmission`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QuizSubmission`
     * @throws ClassCastException if the instance is not `QuizSubmission`
     */
    public QuizSubmission getQuizSubmission() throws ClassCastException {
        return (QuizSubmission)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TextSubmission`. If the actual instance is not `TextSubmission`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TextSubmission`
     * @throws ClassCastException if the instance is not `TextSubmission`
     */
    public TextSubmission getTextSubmission() throws ClassCastException {
        return (TextSubmission)super.getActualInstance();
    }

}

