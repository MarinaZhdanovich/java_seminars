package oop_homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentGroupService {
    private List<Stream> streams;

    public StudentGroupService() {
        streams = new ArrayList<>();
    }

    public void addStream(Stream stream) {
        streams.add(stream);
    }

    public List<Stream> getStreams() {
        return streams;
    }
}

