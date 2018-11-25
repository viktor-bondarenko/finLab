package org.vic.nw.tracker.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.vic.nw.tracker.model.Record;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonDao {

    public List<Record> getRecords(String pathname){
        
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(pathname), List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<Record>();
    }
}
