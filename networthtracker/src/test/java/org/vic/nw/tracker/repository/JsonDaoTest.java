package org.vic.nw.tracker.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.vic.nw.tracker.NwtConfiguration;
import org.vic.nw.tracker.model.Record;
import org.vic.nw.tracker.model.RecordItem;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {NwtConfiguration.class})
public class JsonDaoTest {

    @Autowired
    private JsonDao jsonDao;

    @Test
    public void readRecords() {
        String filePath = getClass().getClassLoader().getResource("test.json").getFile();
        List<Record> records = jsonDao.getRecords(filePath);
        assertEquals(2, records.size());
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.OCTOBER, 1, 0, 0, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2018, Calendar.NOVEMBER, 1, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar2.set(Calendar.MILLISECOND, 0);

        assertThat(records, containsInAnyOrder(
                hasProperty("date", is(calendar.getTime())),
                hasProperty("date", is(calendar2.getTime()))
        ));
        Record record1 = records.stream().filter(p -> p.getDate().equals(calendar.getTime())).collect(Collectors.toList()).get(0);
        assertEquals(2, record1.getAssets().size());
        assertThat(record1.getAssets(), hasItem(new RecordItem().setName("401K").setValue(20301.32).setContribution(1000.0)));
        assertThat(record1.getAssets(), hasItem(new RecordItem().setName("money chart").setValue(720.0)));
        assertEquals(0, record1.getLiabilities().size());

        Record record2 = records.stream().filter(p -> p.getDate().equals(calendar2.getTime())).collect(Collectors.toList()).get(0);
        assertEquals(2, record1.getAssets().size());
        assertThat(record2.getAssets(), hasItem(new RecordItem().setName("401K").setValue(21401.32).setContribution(1000.0)));
        assertThat(record2.getAssets(), hasItem(new RecordItem().setName("money chart").setValue(800.0)));
        assertEquals(1, record2.getLiabilities().size());
        assertThat(record2.getLiabilities().get(0), is(new RecordItem().setName("car").setValue(10000.0)));
        System.out.println("" + records.size());
    }
}