package org.vic.nw.tracker.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vic.nw.tracker.model.Record;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonDao {

    @Autowired
    ObjectMapper objectMapper;

    public List<Record> getRecords(String pathname) {

        try {
            return objectMapper.readValue(new File(pathname), new TypeReference<List<Record>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
