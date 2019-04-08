package com.gmail.anastasiya.lyakhova;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileRepository {

    String filename = "/lines.txt";
    List<String> list = new ArrayList<>();

    {
        try(Stream<String> stream = Files.lines(Paths.get(filename))) {
            list = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
