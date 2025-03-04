package org.example.schemes;

import java.util.List;

public class T10Scheme implements Scheme {

    @Override
    public List<List<Integer>> getScheme(){
        return List.of(
                List.of(0, 1, 0)
        );
    }
}
