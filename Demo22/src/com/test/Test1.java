package com.test;

import java.util.*;

public class Test1 {


    class Table {
    }

    class Room {
    }

    static class House<Q> {
    }

    static class Particle<POSITION, MOMENTUM> {
    }

    //调用代码及输出
    static List<Table> tableList = new ArrayList<Table>();
    static Map<Room, Table> maps = new HashMap<Room, Table>();
    static House<Room> house = new House<Room>();
    static Particle<Long, Double> particle = new Particle<Long, Double>();

    /**
     * [E]
     * [K, V]
     * [Q]
     * [POSITION, MOMENTUM]
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tableList.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(maps.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(house.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
    }


}
