package com.dzzxjl.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        AbstractCollection coll = new AbstractCollection() {
//            Object[] elementdata = new Object[100];
//            int size;
//            @Override
//            public Iterator iterator() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//
//        };
//        coll.add(1);
//        coll.add(2);
//        System.out.println(coll.size());
//        Class
        System.out.println(new Integer(1).getClass().getPackage());
    }
}
