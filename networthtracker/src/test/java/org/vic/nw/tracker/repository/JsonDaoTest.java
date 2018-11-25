package org.vic.nw.tracker.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.vic.nw.tracker.NwtConfiguration;
import org.vic.nw.tracker.model.Record;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {NwtConfiguration.class})
public class JsonDaoTest {

    @Autowired
    private JsonDao jsonDao;

    @Test
    public void readRecords() {
        String filePath = getClass().getClassLoader().getResource("test.json").getFile();
        List<Record> records = jsonDao.getRecords(filePath);
        System.out.printf("" + records.size());
    }
}