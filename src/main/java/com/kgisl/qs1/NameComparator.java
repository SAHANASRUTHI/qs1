
package com.kgisl.qs1;

import java.util.*;

class NameComparator implements Comparator<Stu> {
    public int compare(Stu s1, Stu s2) {
        return s1.name.compareTo(s2.name);
    }
}