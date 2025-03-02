package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        //-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        //-c name1 sex1 bd1 name2 sex2 bd2 ...
        Person person = null;
        switch (args[0]) {
            case ("-c"): {
                synchronized (allPeople) {
                    for (int i = 2; i < args.length; i += 3) {
                        if (args[i].equalsIgnoreCase("м")) {
                            person = Person.createMale(args[i - 1], input.parse(args[i + 1]));
                        } else if (args[i].equalsIgnoreCase("ж")) {
                            person = Person.createFemale(args[i - 1], input.parse(args[i + 1]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            }

            //-u - обновляет соответствующие данные людей с заданными id
            //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
            case ("-u"): {
                synchronized (allPeople) {
                    for (int i = 3; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i - 2]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(args[i - 1]);
                            if (args[i].equalsIgnoreCase("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i].equalsIgnoreCase("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(input.parse(args[i + 1]));
                        }
                    }
                }
                break;
            }

            case ("-d"): {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            }

            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < args.length) {
//                            String male = null;
                            person = allPeople.get(id);
//                            if (person.getSex().equals(Sex.MALE)) {
//                                male = "м";
//                            } else if (person.getSex().equals(Sex.FEMALE)) {
//                                male = "ж";
//                            }
                            System.out.println(person.getName() + " " +
                                    (person.getSex().equals(Sex.MALE) ? "м " : "ж ") + formatter.format(person.getBirthDate()));
                        }
                    }
                }
                break;
            }
        }
    }
}