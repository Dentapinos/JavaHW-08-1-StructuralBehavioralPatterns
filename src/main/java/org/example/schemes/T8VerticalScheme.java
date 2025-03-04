package org.example.schemes;

import java.util.List;

public class T8VerticalScheme implements Scheme {

    @Override
    public List<List<Integer>> getScheme(){
        return List.of(
                List.of(0, 1, 0),
                List.of(0, 2, 0)
        );
    }
}
