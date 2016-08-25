package com.test.table.table;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtility {
  public static List<Object> list() {
    return new LinkedList<Object>();
  }

  public static <T> List<T> list(T... objects) {
    List<T> list = new ArrayList<T>();
    for (T object : objects) {
      list.add(object);
    }
    return list;
  }

  public static List<String> list(String... strings) {
    List<String> list = new ArrayList<String>();
    for (String string : strings) {
      list.add(string);
    }
    return list;
  }

  @SuppressWarnings("unchecked")
  public static <T> List<T> uncheckedCast(Class<?> destType, Object sourceList) {
    return (List<T>) sourceList;
  }
}
