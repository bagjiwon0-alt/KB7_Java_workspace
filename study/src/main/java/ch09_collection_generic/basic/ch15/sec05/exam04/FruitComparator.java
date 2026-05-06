package ch09_collection_generic.basic.ch15.sec05.exam04;

import ch09_collection_generic.basic.ch15.sec05.exam03.Person;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price == o2.price) {
            return 0;
        } else if (o1.price < o2.price) {
            return -1;
        } else {
            return 1;
        }
    }
}
