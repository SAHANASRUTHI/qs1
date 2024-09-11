package com.kgisl.qs1;
import java.util.*;

class AgeComparator implements Comparator<Stu> {
    public int compare(Stu s1, Stu s2) {
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

