package ch09_collection_generic.basic.ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Coin {
    private int value;

    @Override
    public String toString() {
        return ""+ value ;
    }
}
