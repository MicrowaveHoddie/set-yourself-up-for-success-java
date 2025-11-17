package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Cleaner {
    public static <T> ArrayList<T> clean(ArrayList<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
