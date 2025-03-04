package org.example.schemes;

import java.util.List;

public class T1HorizontalScheme implements Scheme {

    @Override
    public List<List<Integer>> getScheme(){
        return List.of(
                List.of(1, 2, 3)
        );
    }
}
