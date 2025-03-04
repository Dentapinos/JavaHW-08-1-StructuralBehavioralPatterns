package org.example.schemes;

import java.util.List;

public class T5Scheme implements Scheme {

    @Override
    public List<List<Integer>> getScheme(){
        return List.of(
                List.of(1, 2, 3),
                List.of(0, 4, 0)
        );
    }
}
