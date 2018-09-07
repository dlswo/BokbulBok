package org.aram;

import java.util.Arrays;
import java.util.Collections;

public class BokbulBok {

    String[] arr = {"꽝", "꽝", "꽝", "당첨"};

    int idx = 0;

    public BokbulBok() {
        Collections.shuffle(Arrays.asList(arr));
    }

    public String selectOne(){

        String result = arr[idx];

        idx++;

        return result;
    }
}
