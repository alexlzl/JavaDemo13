package com.test;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Test {

    static AtomicIntegerFieldUpdater<User> ai = AtomicIntegerFieldUpdater
            .newUpdater(User.class, "age");

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("ggr");
        user1.setPassword("3621");
        user1.age = 24;
        ai.getAndIncrement(user1);

        System.out.println(user1.toString());

    }

    static class User {
        volatile String name;
        private volatile String password;
        volatile int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "User [name=" + name + ", age=" + age + "]";
        }

    }

}
