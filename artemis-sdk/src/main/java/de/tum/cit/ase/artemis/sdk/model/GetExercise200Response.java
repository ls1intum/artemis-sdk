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
import de.tum.cit.ase.artemis.sdk.model.Attachment;
import de.tum.cit.ase.artemis.sdk.model.AuxiliaryRepository;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.DueDateStat;
import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;
import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;
import de.tum.cit.ase.artemis.sdk.model.ExerciseHint;
import de.tum.cit.ase.artemis.sdk.model.FileUploadExercise;
import de.tum.cit.ase.artemis.sdk.model.GradingCriterion;
import de.tum.cit.ase.artemis.sdk.model.ModelingExercise;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismCase;
import de.tum.cit.ase.artemis.sdk.model.Post;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTask;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTestCase;
import de.tum.cit.ase.artemis.sdk.model.QuizBatch;
import de.tum.cit.ase.artemis.sdk.model.QuizExercise;
import de.tum.cit.ase.artemis.sdk.model.QuizPointStatistic;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestion;
import de.tum.cit.ase.artemis.sdk.model.SolutionProgrammingExerciseParticipation;
import de.tum.cit.ase.artemis.sdk.model.StaticCodeAnalysisCategory;
import de.tum.cit.ase.artemis.sdk.model.StudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.SubmissionPolicy;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.TeamAssignmentConfig;
import de.tum.cit.ase.artemis.sdk.model.TemplateProgrammingExerciseParticipation;
import de.tum.cit.ase.artemis.sdk.model.TextExercise;
import de.tum.cit.ase.artemis.sdk.model.TutorParticipation;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonDeserialize(using = GetExercise200Response.GetExercise200ResponseDeserializer.class)
@JsonSerialize(using = GetExercise200Response.GetExercise200ResponseSerializer.class)
public class GetExercise200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetExercise200Response.class.getName());

    public static class GetExercise200ResponseSerializer extends StdSerializer<GetExercise200Response> {
        public GetExercise200ResponseSerializer(Class<GetExercise200Response> t) {
            super(t);
        }

        public GetExercise200ResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(GetExercise200Response value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GetExercise200ResponseDeserializer extends StdDeserializer<GetExercise200Response> {
        public GetExercise200ResponseDeserializer() {
            this(GetExercise200Response.class);
        }

        public GetExercise200ResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GetExercise200Response deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize FileUploadExercise
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FileUploadExercise.class.equals(Integer.class) || FileUploadExercise.class.equals(Long.class) || FileUploadExercise.class.equals(Float.class) || FileUploadExercise.class.equals(Double.class) || FileUploadExercise.class.equals(Boolean.class) || FileUploadExercise.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FileUploadExercise.class.equals(Integer.class) || FileUploadExercise.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FileUploadExercise.class.equals(Float.class) || FileUploadExercise.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FileUploadExercise.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FileUploadExercise.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FileUploadExercise.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FileUploadExercise'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FileUploadExercise'", e);
            }

            // deserialize ModelingExercise
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ModelingExercise.class.equals(Integer.class) || ModelingExercise.class.equals(Long.class) || ModelingExercise.class.equals(Float.class) || ModelingExercise.class.equals(Double.class) || ModelingExercise.class.equals(Boolean.class) || ModelingExercise.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ModelingExercise.class.equals(Integer.class) || ModelingExercise.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ModelingExercise.class.equals(Float.class) || ModelingExercise.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ModelingExercise.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ModelingExercise.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ModelingExercise.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ModelingExercise'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ModelingExercise'", e);
            }

            // deserialize ProgrammingExercise
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ProgrammingExercise.class.equals(Integer.class) || ProgrammingExercise.class.equals(Long.class) || ProgrammingExercise.class.equals(Float.class) || ProgrammingExercise.class.equals(Double.class) || ProgrammingExercise.class.equals(Boolean.class) || ProgrammingExercise.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ProgrammingExercise.class.equals(Integer.class) || ProgrammingExercise.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ProgrammingExercise.class.equals(Float.class) || ProgrammingExercise.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ProgrammingExercise.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ProgrammingExercise.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ProgrammingExercise.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ProgrammingExercise'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ProgrammingExercise'", e);
            }

            // deserialize QuizExercise
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (QuizExercise.class.equals(Integer.class) || QuizExercise.class.equals(Long.class) || QuizExercise.class.equals(Float.class) || QuizExercise.class.equals(Double.class) || QuizExercise.class.equals(Boolean.class) || QuizExercise.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((QuizExercise.class.equals(Integer.class) || QuizExercise.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((QuizExercise.class.equals(Float.class) || QuizExercise.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (QuizExercise.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (QuizExercise.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(QuizExercise.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'QuizExercise'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'QuizExercise'", e);
            }

            // deserialize TextExercise
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TextExercise.class.equals(Integer.class) || TextExercise.class.equals(Long.class) || TextExercise.class.equals(Float.class) || TextExercise.class.equals(Double.class) || TextExercise.class.equals(Boolean.class) || TextExercise.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TextExercise.class.equals(Integer.class) || TextExercise.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TextExercise.class.equals(Float.class) || TextExercise.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TextExercise.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TextExercise.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TextExercise.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TextExercise'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TextExercise'", e);
            }

            if (match == 1) {
                GetExercise200Response ret = new GetExercise200Response();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GetExercise200Response: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GetExercise200Response getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GetExercise200Response cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetExercise200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetExercise200Response(FileUploadExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(ModelingExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(ProgrammingExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(QuizExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(TextExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FileUploadExercise", new GenericType<FileUploadExercise>() {
        });
        schemas.put("ModelingExercise", new GenericType<ModelingExercise>() {
        });
        schemas.put("ProgrammingExercise", new GenericType<ProgrammingExercise>() {
        });
        schemas.put("QuizExercise", new GenericType<QuizExercise>() {
        });
        schemas.put("TextExercise", new GenericType<TextExercise>() {
        });
        JSON.registerDescendants(GetExercise200Response.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("FileUploadExercise", FileUploadExercise.class);
        mappings.put("ModelingExercise", ModelingExercise.class);
        mappings.put("ProgrammingExercise", ProgrammingExercise.class);
        mappings.put("QuizExercise", QuizExercise.class);
        mappings.put("TextExercise", TextExercise.class);
        mappings.put("file-upload", FileUploadExercise.class);
        mappings.put("modeling", ModelingExercise.class);
        mappings.put("programming", ProgrammingExercise.class);
        mappings.put("quiz", QuizExercise.class);
        mappings.put("text", TextExercise.class);
        mappings.put("getExercise_200_response", GetExercise200Response.class);
        JSON.registerDiscriminator(GetExercise200Response.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetExercise200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(FileUploadExercise.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ModelingExercise.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ProgrammingExercise.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(QuizExercise.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TextExercise.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise");
    }

    /**
     * Get the actual instance, which can be the following:
     * FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise
     *
     * @return The actual instance (FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FileUploadExercise`. If the actual instance is not `FileUploadExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FileUploadExercise`
     * @throws ClassCastException if the instance is not `FileUploadExercise`
     */
    public FileUploadExercise getFileUploadExercise() throws ClassCastException {
        return (FileUploadExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ModelingExercise`. If the actual instance is not `ModelingExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ModelingExercise`
     * @throws ClassCastException if the instance is not `ModelingExercise`
     */
    public ModelingExercise getModelingExercise() throws ClassCastException {
        return (ModelingExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProgrammingExercise`. If the actual instance is not `ProgrammingExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProgrammingExercise`
     * @throws ClassCastException if the instance is not `ProgrammingExercise`
     */
    public ProgrammingExercise getProgrammingExercise() throws ClassCastException {
        return (ProgrammingExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QuizExercise`. If the actual instance is not `QuizExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QuizExercise`
     * @throws ClassCastException if the instance is not `QuizExercise`
     */
    public QuizExercise getQuizExercise() throws ClassCastException {
        return (QuizExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TextExercise`. If the actual instance is not `TextExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TextExercise`
     * @throws ClassCastException if the instance is not `TextExercise`
     */
    public TextExercise getTextExercise() throws ClassCastException {
        return (TextExercise)super.getActualInstance();
    }

}

