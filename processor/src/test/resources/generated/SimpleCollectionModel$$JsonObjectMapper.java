package com.bluelinelabs.logansquare.processor;

import com.bluelinelabs.logansquare.JsonMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class SimpleCollectionModel$$JsonObjectMapper extends JsonMapper<SimpleCollectionModel> {
    @Override
    public SimpleCollectionModel parse(JsonParser jsonParser) throws IOException {
        return _parse(jsonParser);
    }

    public static SimpleCollectionModel _parse(JsonParser jsonParser) throws IOException {
        SimpleCollectionModel instance = new SimpleCollectionModel();
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            parseField(instance, fieldName, jsonParser);
            jsonParser.skipChildren();
        }
        return instance;
    }

    public static void parseField(SimpleCollectionModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("model_set".equals(fieldName)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                HashSet<SimpleCollectionModel.ModelForCollection> collection = new HashSet<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value = com.bluelinelabs.logansquare.processor.SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value != null) {
                        collection.add(value);
                    }
                }
                instance.ModelForCollectionSet = collection;
            }
        } else if ("model_queue".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayDeque<SimpleCollectionModel.ModelForCollection> collection = new ArrayDeque<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value = com.bluelinelabs.logansquare.processor.SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value != null) {
                        collection.add(value);
                    }
                }
                instance.ModelForCollectionQueue = collection;
            }
        } else if ("model_map".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                HashMap<String, SimpleCollectionModel.ModelForCollection> map = new HashMap<String, SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String key = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        map.put(key, null);
                    } else{
                        map.put(key, com.bluelinelabs.logansquare.processor.SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser));
                    }
                }
                instance.ModelForCollectionMap = map;
            }
        } else if ("model_list".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayList<SimpleCollectionModel.ModelForCollection> collection = new ArrayList<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value = com.bluelinelabs.logansquare.processor.SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value != null) {
                        collection.add(value);
                    }
                }
                instance.ModelForCollectionList = collection;
            }
        } else if ("model_deque".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayDeque<SimpleCollectionModel.ModelForCollection> collection = new ArrayDeque<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value = com.bluelinelabs.logansquare.processor.SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value != null) {
                        collection.add(value);
                    }
                }
                instance.ModelForCollectionDeque = collection;
            }
        }
    }

    @Override
    public void serialize(SimpleCollectionModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        _serialize(object, jsonGenerator, writeStartAndEnd);
    }

    public static void _serialize(SimpleCollectionModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        if (object.ModelForCollectionSet != null) {
            jsonGenerator.writeFieldName("model_set");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element : (Set<SimpleCollectionModel.ModelForCollection>)object.ModelForCollectionSet) {
                if (object.ModelForCollectionSet != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (object.ModelForCollectionQueue != null) {
            jsonGenerator.writeFieldName("model_queue");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element : (Queue<SimpleCollectionModel.ModelForCollection>)object.ModelForCollectionQueue) {
                if (object.ModelForCollectionQueue != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (object.ModelForCollectionMap != null) {
            jsonGenerator.writeFieldName("model_map");
            jsonGenerator.writeStartObject();
            for (Map.Entry<String, SimpleCollectionModel.ModelForCollection> entry : object.ModelForCollectionMap.entrySet()) {
                jsonGenerator.writeFieldName(entry.getKey().toString());
                if (entry.getValue() == null) {
                    jsonGenerator.writeNull();
                } else{
                    if (object.ModelForCollectionMap != null) {
                        SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(entry.getValue(), jsonGenerator, true);
                    }
                }
            }
            jsonGenerator.writeEndObject();
        }
        if (object.ModelForCollectionList != null) {
            jsonGenerator.writeFieldName("model_list");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element : (List<SimpleCollectionModel.ModelForCollection>)object.ModelForCollectionList) {
                if (object.ModelForCollectionList != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (object.ModelForCollectionDeque != null) {
            jsonGenerator.writeFieldName("model_deque");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element : (Queue<SimpleCollectionModel.ModelForCollection>)object.ModelForCollectionDeque) {
                if (object.ModelForCollectionDeque != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}